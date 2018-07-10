package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.UserCard;
import com.jiabian.usercard.request.UserCardReq;
import com.jiabian.usercard.response.OrderRes;

/**
 * 会员卡业务接口层
 * 
 * IUserCardService
 * 创建人:何雪平 
 * 时间：2017年4月12日-下午2:22:12 
 * @version 1.0.0
 *
 */
public interface IUserCardService {

	/**
	 * 会员卡列表
	 * com.jiabian.service.basic 
	 * 方法名：selectList
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午2:23:40 
	 * @param pagesModel
	 * @return List<UserCardRes>
	 * @exception 
	 * @since  1.0.0
	*/
	List<OrderRes> selectList(PagesModel<UserCardReq, OrderRes> pagesModel);

	/**
	 * 删除会员卡
	 * com.jiabian.service.basic 
	 * 方法名：deleteById
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午2:24:33 
	 * @param id
	 * @return int
	 * @exception 
	 * @since  1.0.0
	*/
	int deleteById(Long id);

	/**
	 * 更新会员卡
	 * com.jiabian.service.basic 
	 * 方法名：updateById
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午2:27:46 
	 * @param userCardReq
	 * @return int
	 * @exception 
	 * @since  1.0.0
	*/
	int updateById(UserCardReq userCardReq);

	/**
	 * 添加会员卡
	 * com.jiabian.service.basic 
	 * 方法名：insert
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午2:29:49 
	 * @param userCardReq
	 * @return int
	 * @exception 
	 * @since  1.0.0
	*/
	int insert(UserCardReq userCardReq);

	/**
	 * 根据id查询会员卡
	 * com.jiabian.service.basic 
	 * 方法名：selectById
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午2:30:58 
	 * @param id
	 * @return UserCard
	 * @exception 
	 * @since  1.0.0
	*/
	UserCard selectById(Long id);

	/**
	 * 会员卡列表
	 * com.jiabian.service.basic 
	 * 方法名：selectList
	 * 创建人：何雪平 
	 * 时间：2017年4月13日-上午9:53:11 
	 * @return List<UserCard>
	 * @exception 
	 * @since  1.0.0
	*/
	List<OrderRes> selectList(Long userId);

	/**
	 * (这里用一句话描述这个方法的作用)
	 * com.jiabian.service.basic 
	 * 方法名：testDate
	 * 创建人：何雪平 
	 * 时间：2017年4月14日-下午4:39:45 
	 * @return int
	 * @exception 
	 * @since  1.0.0
	*/
	int testDate();

	/**
	 * 查询用户会员卡
	 * com.jiabian.service.basic 
	 * 方法名：selectUserCard
	 * 创建人：何雪平 
	 * 时间：2017年4月19日-下午1:30:57 
	 * @param userId 
	 * @return UserCardRel
	 * @exception 
	 * @since  1.0.0
	*/
	OrderRes selectUserCard(Long userId);
	
	

}
