package com.jiabian.service.basic.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.appication.request.SysApplicationReq;
import com.jiabian.appication.response.SysApplicationRes;
import com.jiabian.base.BaseEnum.sexEnum;
import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysApplication;
import com.jiabian.beans.basic.SysApplicationQueryHelper;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.beans.basic.SysUserQueryHelper;
import com.jiabian.dao.basic.SysApplicationMapper;
import com.jiabian.dao.basic.SysUserMapper;
import com.jiabian.service.basic.IsysAppicationService;
import com.jiabian.sys.sysrole.helper.SysRoleEnum;
import com.jiabian.sys.sysuser.response.SysUserResp;
import com.jiabian.util.MD5;
import com.jiabian.util.SpringBeanUtils;
import com.jiabian.util.StrTools;

/**
 * 
 * 
 * SysAppicationServiceImpl
 * 创建人:黄世平
 * 时间：2016年12月7日-下午3:18:31 
 * @version 1.0.0
 *
 */

@Service
public class SysAppicationServiceImpl implements IsysAppicationService {

	@Autowired
	SysApplicationMapper sysApplicationMapper;
	@Autowired
	SysUserMapper sysUserMapper;

	/**
	 * 
	 * 验证是否有改身份证
	 * com.jiabian.service.basic.impl 
	 * 方法名：countAppication4CarId
	 * 创建人：黄世平
	 * 时间：2016年12月7日-下午5:42:14 
	 * @param cardNo
	 * @return
	 * @see com.jiabian.service.basic.IsysAppicationService#countAppication4CarId(java.lang.String)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public int countAppication4CarId(String cardNo) {

		if(cardNo == null){return 0;}
		SysApplicationQueryHelper example = new SysApplicationQueryHelper();
		example.createCriteria().andCardNoEqualTo(cardNo);
		return sysApplicationMapper.countByExample(example);
	}

	/**
	 * 
	 * 保存信息
	 * com.jiabian.service.basic.impl 
	 * 方法名：saveAppication
	 * 创建人：黄世平
	 * 时间：2016年12月7日-下午5:42:42 
	 * @param sysApplication
	 * @return
	 * @see com.jiabian.service.basic.IsysAppicationService#saveAppication(com.jiabian.beans.basic.SysApplication)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer saveAppication(SysApplication sysApplication) {
		// TODO Auto-generated method stub
		try {
			return sysApplicationMapper.insertSelective(sysApplication);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer countSysApplication4PagesModel(PagesModel<SysApplicationReq, SysApplicationRes> pagesModel) {
		// TODO Auto-generated method stub
		return sysApplicationMapper.countSysApplication4PagesModel(pagesModel);
	}

	@Override
	public List<SysApplicationRes> selectSysApplication4PagesModel(
			PagesModel<SysApplicationReq, SysApplicationRes> pagesModel) {
		// TODO Auto-generated method stub
		return sysApplicationMapper.selectSysApplication4PagesModel(pagesModel);
	}

	@Override
	public SysApplicationRes getSysApplication4Id(Long id) {
		SysApplication sysApplication=sysApplicationMapper.selectByPrimaryKey(id);
		SysApplicationRes sysApplicationRes=new SysApplicationRes();
		SpringBeanUtils.copyProperties(sysApplication, sysApplicationRes);
		SysUser sysUser = sysUserMapper.selectByPrimaryKey(sysApplication.getReviewer());
		if (sysUser!=null) {
			String reviewerName=sysUser.getRealName();
			sysApplicationRes.setReviewName(reviewerName);
		}
		return sysApplicationRes;
	}

	@Override
	public Integer updateApplictionStatus(Long id,Long reviewer, Byte status,Byte type) {
		Integer result=0;
		SysApplication sysApplication = new SysApplication();
		if (status==(byte)2) {
			sysApplication=sysApplicationMapper.selectByPrimaryKey(id);
			SysUser sysUser=new SysUser();
			sysUser.setRealName(sysApplication.getName());
			sysUser.setLoginName(sysApplication.getMobile());
			sysUser.setLoginPwd(MD5.encryptionStr("jiabian"));
			sysUser.setSex(sexEnum.BOY.getValue());
			sysUser.setEmail(sysApplication.getEmail());
			if (type.toString().equals("1")) {
				sysUser.setRoleId(SysRoleEnum.roleIdEnum.regionalManager.getValue());
			}else if (type.toString().equals("2")) {
				sysUser.setRoleId(SysRoleEnum.roleIdEnum.agency.getValue());
			}else if (type.toString().equals("3")) {
				sysUser.setRoleId(SysRoleEnum.roleIdEnum.saller.getValue());
			}
			String invitationCode="";
			int count = 0;
			do {
				invitationCode= StrTools.getInvitationCode();
				SysUserQueryHelper example=new SysUserQueryHelper();
				example.createCriteria().andInvitationCodeEqualTo(invitationCode);
				count = sysUserMapper.countByExample(example);
			} while (count>0);
			
			sysUser.setInvitationCode(invitationCode);
			if (sysApplication.getProvince()!=null) {
				sysUser.setProvince(Long.valueOf(String.valueOf(sysApplication.getProvince())));
			}
			if (sysApplication.getCity()!=null) {
				sysUser.setCity(Long.valueOf(String.valueOf(sysApplication.getCity())));
			}
			if (sysApplication.getArea()!=null) {
				sysUser.setArea(Long.valueOf(String.valueOf(sysApplication.getArea())));
			}
			sysUser.setCreateTime(new Date());
			sysUser.setUpdateTime(new Date());
			sysUser.setIsDel((byte)1);
			result = sysUserMapper.insertSelective(sysUser);
			if (result>0) {
				Long suserId=sysUser.getSuserId();
				sysApplication.setSuserId(suserId);
				sysApplication.setReviewer(reviewer);
				sysApplication.setStatus(status);
				sysApplication.setUpdateTime(new Date());
				sysApplication.setReviewTime(new Date());
				result=sysApplicationMapper.updateByPrimaryKeySelective(sysApplication);
			}
		}else{
			sysApplication.setId(id);
			sysApplication.setReviewer(reviewer);
			sysApplication.setStatus(status);
			sysApplication.setUpdateTime(new Date());
			sysApplication.setReviewTime(new Date());
			result=sysApplicationMapper.updateByPrimaryKeySelective(sysApplication);
		}
		return result;
	}

	@Override
	public SysUserResp selectApplicationSysUserInfo(Long id) {
		// TODO Auto-generated method stub
		return sysApplicationMapper.selectApplicationSysUserInfo(id);
	}
	
	
}
