package com.jiabian.sale;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.UserCapitalInfo;
import com.jiabian.usercapitalinfo.request.UserCapitalInfoReq;
import com.jiabian.usercapitalinfo.response.UserCapitalInfoRes;
import com.jiabian.util.Result;

public interface IUserCapitalInfoServiceBiz {

	
	/**
	 * 
	 * 根据Id查找系统平台用户的账户信息
	 * com.jiabian.sale 
	 * 方法名：selectAccountById
	 * 创建人：李文凯
	 * 时间：2017年1月10日-下午4:05:55 
	 * @param pagesModel
	 * @return PagesModel<UserCapitalInfoReq,UserCapitalInfoRes>
	 * @exception 
	 * @since  1.0.0
	 */
	PagesModel<UserCapitalInfoReq, UserCapitalInfoRes> selectAccountById(PagesModel<UserCapitalInfoReq, UserCapitalInfoRes> pagesModel);

	
	/**
	 * 
	 * 添加账户
	 * com.jiabian.sale 
	 * 方法名：addCapitalInfo
	 * 创建人：李文凯
	 * 时间：2017年1月11日-上午10:53:54 
	 * @param userCapitalInfo
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer addCapitalInfo(UserCapitalInfo userCapitalInfo);


	/**
	 * 
	 * 删除个人账户
	 * com.jiabian.sale 
	 * 方法名：deleteAccountBy
	 * 创建人：李文凯
	 * 时间：2017年1月11日-下午1:45:20 
	 * @param id
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer deleteAccountById(Long id);


	/**
	 * 
	 * 查询用户提现账户
	 * com.jiabian.sale 
	 * 方法名：selectAccount
	 * 创建人：李文凯
	 * 时间：2017年1月11日-下午2:58:03 
	 * @param suserId
	 * @return Result<List<UserCapitalInfo>>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<List<UserCapitalInfo>> selectAccount(Long suserId);

	/**
	 * 
	 * 跳转修改页
	 * com.jiabian.sale 
	 * 方法名：toupdateAccount
	 * 创建人：李文凯
	 * 时间：2017年1月17日-上午10:04:45 
	 * @param id
	 * @return UserCapitalInfo
	 * @exception 
	 * @since  1.0.0
	 */
	UserCapitalInfo toUpdateAccount(Long id);


	/**
	 * 
	 * 修改账户
	 * com.jiabian.sale 
	 * 方法名：updateAccount
	 * 创建人：李文凯
	 * 时间：2017年1月17日-上午10:28:14 
	 * @param userCapitalInfo
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer updateAccount(UserCapitalInfo userCapitalInfo);


	Result<List<UserCapitalInfo>> selectBusinessAccount(Long id);

}
