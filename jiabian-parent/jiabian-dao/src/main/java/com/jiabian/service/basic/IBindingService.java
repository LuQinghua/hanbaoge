/**
 * 家边网络科技有限公司
 * jiabian-dao
 * com.jiabian.service.basic
 * IBindingService.java
 * 创建人:潇洒
 * 时间：2016-11-8-下午1:19:09 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.beans.basic.UserDetail;
import com.jiabian.beans.basic.Users;

/**
 * IBindingService
 * 创建人:潇洒
 * 时间：2016-11-8-下午1:19:09 
 */
public interface IBindingService {

	/**
	 * 绑定QQ
	 * com.jiabian.service.basic 
	 * 方法名：userBindingQQ
	 * 创建人：潇洒
	 * 时间：2016-11-8-下午1:40:16 
	*/
	int userBindingQQ(String qqopenId);

	/**
	 * 绑定微信
	 * com.jiabian.service.basic 
	 * 方法名：userBindingWeixin
	 * 创建人：潇洒
	 * 时间：2016-11-8-下午2:30:43 
	*/
	int userBindingWeixin(String weixinopenId);

	/**
	 * 绑定微博
	 * com.jiabian.service.basic 
	 * 方法名：userBindingWeibo
	 * 创建人：潇洒
	 * 时间：2016-11-8-下午2:34:15 
	*/
	int userBindingWeibo(String weiboopenId);

	/**
	 * 绑定手机号
	 * com.jiabian.service.basic 
	 * 方法名：userBindingPhone
	 * 创建人：潇洒
	 * 时间：2016-11-9-下午5:53:55 
	*/
	int userBindingPhone(UserDetail userDetail);

	/**
	 * 通过手机号查询绑定了哪些第三方帐号
	 * com.jiabian.service.basic 
	 * 方法名：selectByTel
	 * 创建人：潇洒
	 * 时间：2016-11-9-下午6:02:25 
	*/
	UserDetail selectByTel(String userTel);

	/**
	 * 绑定第三方帐号查询数据库是否有该数据
	 * com.jiabian.service.basic 
	 * 方法名：selectQQ
	 * 创建人：潇洒
	 * 时间：2016-11-14-上午10:12:49 
	*/
	List<UserDetail> selectQQ(String qqopenId);

	/**
	 * 查询users表是否有该手机号
	 * com.jiabian.service.basic 
	 * 方法名：selectIdByTel
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午4:23:44 
	*/
	Long selectIdByTel(String userTel);

	/**
	 * (这里用一句话描述这个方法的作用)
	 * com.jiabian.service.basic 
	 * 方法名：addUserTel
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午4:39:24 
	 * @param users 
	*/
	int addUserTel(Users users);

	/**
	 * (这里用一句话描述这个方法的作用)
	 * com.jiabian.service.basic 
	 * 方法名：addUserTelForDetail
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午4:54:53 
	 * @param userDetail 
	*/
	void addUserTelForDetail(UserDetail userDetail);

}
