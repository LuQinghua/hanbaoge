package com.jiabian.sys.sys;

import com.jiabian.appication.request.SysApplicationReq;
import com.jiabian.appication.response.SysApplicationRes;
import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysApplication;
import com.jiabian.sys.sysuser.response.SysUserResp;

public interface  IsysAppicationServiceBiz {

	/**
	 * 
	 * 查询是否身份证被使用
	 * com.jiabian.sys.sys 
	 * 方法名：countAppication4CarId
	 * 创建人：黄世平
	 * 时间：2016年12月8日-下午1:41:22 
	 * @param cardNo
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int countAppication4CarId(String cardNo);

	/**
	 * 
	 * 保存招募信息
	 * com.jiabian.sys.sys 
	 * 方法名：saveAppication
	 * 创建人：某某某
	 * 时间：2016年12月8日-下午1:41:07 
	 * @param sysApplication
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer saveAppication(SysApplication sysApplication);

	/**
	 * 
	 * 分页获取招募信息
	 * com.jiabian.sys.sys 
	 * 方法名：selectSysApplicationPage
	 * 创建人：黄世平
	 * 时间：2016年12月8日-下午1:40:35 
	 * @param pagesModel void
	 * @exception 
	 * @since  1.0.0
	 */
	void selectSysApplicationPage(PagesModel<SysApplicationReq, SysApplicationRes> pagesModel);

	/**
	 * 根据Id查询详情
	 * (这里用一句话描述这个方法的作用)
	 * com.jiabian.sys.sys 
	 * 方法名：getSysApplication4Id
	 * 创建人：黄世平
	 * 时间：2016年12月8日-下午5:31:11 
	 * @param id
	 * @return SysApplication
	 * @exception 
	 * @since  1.0.0
	 */
	SysApplicationRes getSysApplication4Id(Long id);

	/**
	 * 
	 * 更新审核状态
	 * com.jiabian.sys.sys 
	 * 方法名：updateApplictionStatus
	 * 创建人：黄世平
	 * 时间：2016年12月8日-下午7:20:37 
	 * @param id
	 * @param status
	 * @param type
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer updateApplictionStatus(Long id,Long reviewer, Byte status,Byte type);

	/**
	 * 根据Id查询系统用户信息
	 * com.jiabian.sys.sys 
	 * 方法名：selectApplicationSysUserInfo
	 * 创建人：方玉明
	 * 时间：2016年12月21日-下午3:53:10 
	 * @param id
	 * @return SysUserResp
	 * @exception 
	 * @since  1.0.0
	*/
	SysUserResp selectApplicationSysUserInfo(Long id);
}

