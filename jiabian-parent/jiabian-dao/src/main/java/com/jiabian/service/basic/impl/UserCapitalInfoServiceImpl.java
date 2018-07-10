package com.jiabian.service.basic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.UserCapitalInfo;
import com.jiabian.beans.basic.UserCapitalInfoQueryHelper;
import com.jiabian.dao.basic.UserCapitalInfoMapper;
import com.jiabian.service.basic.IUserCapitalInfoService;
import com.jiabian.usercapitalinfo.request.UserCapitalInfoReq;
import com.jiabian.usercapitalinfo.response.UserCapitalInfoRes;
import com.jiabian.util.Result;


@Service
public class UserCapitalInfoServiceImpl implements IUserCapitalInfoService {

	@Autowired
	private UserCapitalInfoMapper userCapitalInfoMapper;

	
	/**
	 * 
	 * 根据Id查找系统平台用户的账户信息
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectAccountById
	 * 创建人：李文凯
	 * 时间：2017年1月10日-下午4:09:48 
	 * @param pagesModel
	 * @return
	 * @see com.jiabian.service.basic.IUserCapitalInfoService#selectAccountById(com.jiabian.base.PagesModel)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public List<UserCapitalInfoRes> selectAccountById(PagesModel<UserCapitalInfoReq, UserCapitalInfoRes> pagesModel) {	
		return userCapitalInfoMapper.selectAccountById(pagesModel);
	}
	
	@Override
	public Integer countAccount(PagesModel<UserCapitalInfoReq, UserCapitalInfoRes> pagesModel) {	
		return userCapitalInfoMapper.countAccount(pagesModel);
	}

	
	/**
	 * 
	 * 添加账户
	 * com.jiabian.service.basic.impl 
	 * 方法名：addCapitalInfo
	 * 创建人：李文凯
	 * 时间：2017年1月11日-上午10:55:45 
	 * @param userCapitalInfo
	 * @return
	 * @see com.jiabian.service.basic.IUserCapitalInfoService#addCapitalInfo(com.jiabian.beans.basic.UserCapitalInfo)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer addCapitalInfo(UserCapitalInfo userCapitalInfo) {		
		return userCapitalInfoMapper.insertSelective(userCapitalInfo);
	}

	
	/**
	 * 
	 * 删除个人账户
	 * com.jiabian.service.basic.impl 
	 * 方法名：deleteAccountBy
	 * 创建人：李文凯
	 * 时间：2017年1月11日-下午1:46:38 
	 * @param id
	 * @return
	 * @see com.jiabian.service.basic.IUserCapitalInfoService#deleteAccountBy(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer deleteAccountById(Long id) {				
		return userCapitalInfoMapper.deleteAccountById(id);
	}

	
	/**
	 * 
	 * 查询用户提现账户
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectAccount
	 * 创建人：李文凯
	 * 时间：2017年1月11日-下午3:02:18 
	 * @param suserId
	 * @return
	 * @see com.jiabian.service.basic.IUserCapitalInfoService#selectAccount(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Result<List<UserCapitalInfo>> selectAccount(Long suserId) {	
		Result<List<UserCapitalInfo>> result =new Result<>();
		UserCapitalInfoQueryHelper example =new UserCapitalInfoQueryHelper();
		example.createCriteria().andUserIdEqualTo(suserId).andIsDelEqualTo((byte)1).andUserTypeEqualTo((byte)2);
		List<UserCapitalInfo> list=userCapitalInfoMapper.selectByExample(example);
		if (list.size()>0) {
			result.setStatus(true);
			result.setData(list);
		}else{
			result.setStatus(false);
			result.setData(null);
		}
		return result;
	}

	
	/**
	 * 
	 * 跳转修改页
	 * com.jiabian.service.basic.impl 
	 * 方法名：toUpdateAccount
	 * 创建人：李文凯
	 * 时间：2017年1月17日-上午10:07:41 
	 * @param id
	 * @return
	 * @see com.jiabian.service.basic.IUserCapitalInfoService#toUpdateAccount(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public UserCapitalInfo toUpdateAccount(Long id) {	
		return userCapitalInfoMapper.selectByPrimaryKey(id);
	}

	
	/**
	 * 
	 * 修改账户
	 * com.jiabian.service.basic.impl 
	 * 方法名：updateAccount
	 * 创建人：李文凯
	 * 时间：2017年1月17日-上午10:29:15 
	 * @param userCapitalInfo
	 * @return
	 * @see com.jiabian.service.basic.IUserCapitalInfoService#updateAccount(com.jiabian.beans.basic.UserCapitalInfo)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer updateAccount(UserCapitalInfo userCapitalInfo) {
		return userCapitalInfoMapper.updateByPrimaryKeySelective(userCapitalInfo);
	}

	@Override
	public Result<List<UserCapitalInfo>> selectBusinessAccount(Long id) {
		Result<List<UserCapitalInfo>> result =new Result<>();
		UserCapitalInfoQueryHelper example =new UserCapitalInfoQueryHelper();
		example.createCriteria().andUserIdEqualTo(id).andIsDelEqualTo((byte)1).andUserTypeEqualTo((byte)1);
		List<UserCapitalInfo> list=userCapitalInfoMapper.selectByExample(example);
		if (list.size()>0) {
			result.setStatus(true);
			result.setData(list);
		}else{
			result.setStatus(false);
			result.setData(null);
		}
		return result;
	}
	
}
