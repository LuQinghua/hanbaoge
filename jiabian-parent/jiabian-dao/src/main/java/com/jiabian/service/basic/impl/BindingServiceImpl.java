/**
 * 家边网络科技有限公司
 * jiabian-dao
 * com.jiabian.service.basic.impl
 * BindingServiceImpl.java
 * 创建人:潇洒
 * 时间：2016-11-8-下午1:19:42 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.service.basic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.beans.basic.UserDetail;
import com.jiabian.beans.basic.UserDetailQueryHelper;
import com.jiabian.beans.basic.Users;
import com.jiabian.dao.basic.UserDetailMapper;
import com.jiabian.dao.basic.UsersMapper;
import com.jiabian.service.basic.IBindingService;

/**
 * BindingServiceImpl
 * 创建人:潇洒
 * 时间：2016-11-8-下午1:19:42 
 */

@Service
public class BindingServiceImpl implements IBindingService {
	@Autowired
	UserDetailMapper userDetailMapper;
	@Autowired
	UsersMapper usersMapper;

	/**
	 * 绑定QQ
	 * com.jiabian.service.basic.impl 
	 * 方法名：userBindingQQ
	 * 创建人：潇洒
	 * 时间：2016-11-8-下午1:40:28 
	*/
	@Override
	public int userBindingQQ(String qqopenId) {
		// TODO Auto-generated method stub
		UserDetail userDetail = new UserDetail();
		userDetail.setQqopenId(qqopenId);
		UserDetailQueryHelper helper = new UserDetailQueryHelper();
		helper.createCriteria().andQqopenIdEqualTo(qqopenId);
		return userDetailMapper.insertSelective(userDetail);
	}

	/**
	 * 绑定微信
	 * com.jiabian.service.basic.impl 
	 * 方法名：userBindingWeixin
	 * 创建人：潇洒
	 * 时间：2016-11-8-下午2:30:53 
	*/
	@Override
	public int userBindingWeixin(String weixinopenId) {
		// TODO Auto-generated method stub
		UserDetail userDetail = new UserDetail();
		userDetail.setWeixinopenId(weixinopenId);
		UserDetailQueryHelper helper = new UserDetailQueryHelper();
		helper.createCriteria().andQqopenIdEqualTo(weixinopenId);
		return userDetailMapper.insertSelective(userDetail);
	}

	/**
	 * 绑定微博
	 * com.jiabian.service.basic.impl 
	 * 方法名：userBindingWeibo
	 * 创建人：潇洒
	 * 时间：2016-11-8-下午2:34:21 
	*/
	@Override
	public int userBindingWeibo(String weiboopenId) {
		// TODO Auto-generated method stub
		UserDetail userDetail = new UserDetail();
		userDetail.setWeiboopenId(weiboopenId);
		UserDetailQueryHelper helper = new UserDetailQueryHelper();
		helper.createCriteria().andQqopenIdEqualTo(weiboopenId);
		return userDetailMapper.insertSelective(userDetail);
	}

	/**
	 * 绑定手机号
	 * com.jiabian.service.basic.impl 
	 * 方法名：userBindingPhone
	 * 创建人：潇洒
	 * 时间：2016-11-9-下午4:49:40 
	*/
	@Override
	public int userBindingPhone(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return userDetailMapper.userBindingPhone(userDetail);
	}

	/**
	 * 通过手机号查询绑定了哪些第三方帐号
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectByTel
	 * 创建人：潇洒
	 * 时间：2016-11-9-下午6:06:57 
	*/
	@Override
	public UserDetail selectByTel(String userTel) {
		// TODO Auto-generated method stub
		return userDetailMapper.selectByTel(userTel);
	}

	/**
	 * 绑定第三方帐号查询数据库是否有该数据
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectQQ
	 * 创建人：潇洒
	 * 时间：2016-11-14-上午10:13:42 
	*/
	@Override
	public List<UserDetail> selectQQ(String qqopenId) {
		// TODO Auto-generated method stub
		UserDetail userDetail = new UserDetail();
		userDetail.setQqopenId(qqopenId);
		UserDetailQueryHelper helper = new UserDetailQueryHelper();
		helper.createCriteria().andQqopenIdEqualTo(qqopenId);
		return userDetailMapper.selectByExample(helper);
	}

	/**
	 * 查询users表是否有该手机号
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectIdByTel
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午4:23:54 
	*/
	@Override
	public Long selectIdByTel(String userTel) {
		// TODO Auto-generated method stub
		return usersMapper.selectIdByTel(userTel);
	}

	/**
	 * 绑定手机号插入到users表。
	 * com.jiabian.service.basic.impl 
	 * 方法名：addUserTel
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午4:39:30 
	*/
	@Override
	public int addUserTel(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.insertSelective(users);
	}

	/**
	 * 绑定手机号插入到usersDetail表。
	 * com.jiabian.service.basic.impl 
	 * 方法名：addUserTelForDetail
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午4:54:58 
	*/
	@Override
	public void addUserTelForDetail(UserDetail userDetail) {
		// TODO Auto-generated method stub
		userDetailMapper.insertSelective(userDetail);
	}
}
