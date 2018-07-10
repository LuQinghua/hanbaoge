/*
 * UserDetailMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-08 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jiabian.beans.basic.UserDetail;
import com.jiabian.beans.basic.UserDetailQueryHelper;
import com.jiabian.sys.activity.response.QdyGoodsRes;
import com.jiabian.user.request.UsersReq;
import com.jiabian.user.response.UserRes;

public interface UserDetailMapper {
    int countByExample(UserDetailQueryHelper example);

    int deleteByExample(UserDetailQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    List<UserDetail> selectByExample(UserDetailQueryHelper example);

    UserDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserDetail record, @Param("example") UserDetailQueryHelper example);

    int updateByExample(@Param("record") UserDetail record, @Param("example") UserDetailQueryHelper example);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);
    
	/**
	 * @Description:插入用户头像
	 * @author 潇洒
	 */
	int addUserImg(UserRes userRes);

	/**
	 * 通过手机号查询绑定了哪些第三方帐号
	 * com.jiabian.dao.basic 
	 * 方法名：selectByTel
	 * 创建人：潇洒
	 * 时间：2016-11-9-下午6:10:27 
	*/
	UserDetail selectByTel(String userTel);

	/**
	 * 绑定手机号
	 * com.jiabian.dao.basic 
	 * 方法名：userBindingPhone
	 * 创建人：潇洒
	 * 时间：2016-11-9-下午7:49:40 
	*/
	int userBindingPhone(UserDetail userDetail);

	/**
	 * (这里用一句话描述这个方法的作用)
	 * com.jiabian.dao.basic 
	 * 方法名：selectUserId
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午5:34:19 
	*/
	Long selectUserId(UsersReq userReq);

	/**
	 * H5 支付家边通宝
	 * com.jiabian.dao.basic 
	 * 方法名：jbtbCutPayment
	 * 创建人：张铁成
	 * 时间：2016年12月15日-下午3:08:40 
	 * @param userId
	 * @param price
	 * @param coin
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int jbtbCutPayment(@Param("userId") Long userId,@Param("price") Integer price);

	/**
	 * 
	 * (pc通宝总数)
	 * com.jiabian.dao.basic 
	 * 方法名：selectactivitytongbaoproducts
	 * 创建人：鲁清华
	 * 时间：2016年12月22日-上午9:38:31 
	 * @param userId
	 * @return UserDetail
	 * @exception 
	 * @since  1.0.0
	 */
	UserDetail selectactivitytongbaoproducts(UserDetail userId);

	/**
	 * 查询用户信息
	 * com.jiabian.dao.basic 
	 * 方法名：selectUserInfo
	 * 创建人：张铁成
	 * 时间：2016年12月29日-上午9:55:42 
	 * @param userId
	 * @return QdyGoods
	 * @exception 
	 * @since  1.0.0
	 */
	QdyGoodsRes selectUserInfo(@Param("userId") long userId);

	/**
	 * 分别给用户充入对应数量家边通宝
	 * com.jiabian.dao.basic 
	 * 方法名：updateJbtbNum
	 * 创建人：张铁成
	 * 时间：2017年1月4日-下午2:38:53 
	 * @param userId
	 * @param jbtbNum void
	 * @exception 
	 * @since  1.0.0
	 */
	void updateJbtbNum(@Param("userId") Long userId, @Param("jbtbNum") Integer jbtbNum);

	@Select("SELECT count(1) from user_detail where userId = #{0}")
	Integer exitsUserId(Long userId);
	
	/**
	 * 更新用户书签
	 * com.jiabian.dao.basic 
	 * 方法名：updateUserBookMark
	 * 创建人：何雪平 
	 * 时间：2017年4月18日-下午2:47:39 
	 * @param userId
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int  updateUserBookMark(@Param("userId") Long userId,@Param("bookMark") Integer bookMark);
	
	/**
	 * 更新快乐学习会员等级
	 * com.jiabian.dao.basic 
	 * 方法名：updateRank
	 * 创建人：何雪平 
	 * 时间：2017年4月18日-下午4:33:01 
	 * @param userId
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int  updateRank(@Param("userId") Long userId,@Param("rank") Byte rank);
	
	/**
	 * 根据用户id查询邀请人会员卡等级
	 * com.jiabian.dao.basic 
	 * 方法名：selectRankByUserId
	 * 创建人：何雪平 
	 * 时间：2017年4月28日-上午10:40:00 
	 * @param userId
	 * @return Byte
	 * @exception 
	 * @since  1.0.0
	 */
	Byte selectRankByUserId(Long userId);
	
}