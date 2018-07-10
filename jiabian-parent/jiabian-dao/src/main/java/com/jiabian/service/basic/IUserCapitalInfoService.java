package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.UserCapitalInfo;
import com.jiabian.usercapitalinfo.request.UserCapitalInfoReq;
import com.jiabian.usercapitalinfo.response.UserCapitalInfoRes;
import com.jiabian.util.Result;

public interface IUserCapitalInfoService {

	
	/**
	 * 
	 * 根据Id查找系统平台用户的账户信息
	 * com.jiabian.service.basic 
	 * 方法名：selectAccountById
	 * 创建人：李文凯
	 * 时间：2017年1月10日-下午4:09:34 
	 * @param pagesModel
	 * @return List<UserCapitalInfoRes>
	 * @exception 
	 * @since  1.0.0
	 */
	List<UserCapitalInfoRes> selectAccountById(PagesModel<UserCapitalInfoReq, UserCapitalInfoRes> pagesModel);

	Integer countAccount(PagesModel<UserCapitalInfoReq, UserCapitalInfoRes> pagesModel);

	
	/**
	 * 
	 * 添加账户
	 * com.jiabian.service.basic 
	 * 方法名：addCapitalInfo
	 * 创建人：李文凯
	 * 时间：2017年1月11日-上午10:55:15 
	 * @param userCapitalInfo
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer addCapitalInfo(UserCapitalInfo userCapitalInfo);

	
	/**
	 * 
	 * 删除个人账户
	 * com.jiabian.service.basic 
	 * 方法名：deleteAccountBy
	 * 创建人：李文凯
	 * 时间：2017年1月11日-下午1:46:13 
	 * @param id
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer deleteAccountById(Long id);

	/**
	 * 
	 * 查询用户提现账户
	 * com.jiabian.service.basic 
	 * 方法名：selectAccount
	 * 创建人：李文凯
	 * 时间：2017年1月11日-下午3:01:44 
	 * @param suserId
	 * @return Result<List<UserCapitalInfo>>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<List<UserCapitalInfo>> selectAccount(Long suserId);

	
	/**
	 * 
	 * 跳转修改页
	 * com.jiabian.service.basic 
	 * 方法名：toUpdateAccount
	 * 创建人：李文凯
	 * 时间：2017年1月17日-上午10:06:31 
	 * @param id
	 * @return UserCapitalInfo
	 * @exception 
	 * @since  1.0.0
	 */
	UserCapitalInfo toUpdateAccount(Long id);

	/**
	 * 
	 * 修改账户
	 * com.jiabian.service.basic 
	 * 方法名：updateAccount
	 * 创建人：李文凯
	 * 时间：2017年1月17日-上午10:28:57 
	 * @param userCapitalInfo
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer updateAccount(UserCapitalInfo userCapitalInfo);

	Result<List<UserCapitalInfo>> selectBusinessAccount(Long id);

}
