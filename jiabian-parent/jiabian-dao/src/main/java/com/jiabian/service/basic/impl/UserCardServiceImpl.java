/**
 * 家边网络科技有限公司
 * jiabian-dao
 * com.jiabian.service.basic.impl
 * SolrServiceImpl.java
 * 创建人:潇洒
 * 时间：2016-11-21-下午5:51:26 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.service.basic.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.base.BaseEnum;
import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.UserCard;
import com.jiabian.dao.basic.UserCardMapper;
import com.jiabian.dao.basic.UserCardRelMapper;
import com.jiabian.service.basic.IUserCardService;
import com.jiabian.usercard.request.UserCardReq;
import com.jiabian.usercard.response.OrderRes;
import com.jiabian.util.SpringBeanUtils;

/**
 * 会员卡数据实现层
 * 
 * UserCardServiceImpl
 * 创建人:何雪平 
 * 时间：2017年4月12日-下午2:32:01 
 * @version 1.0.0
 *
 */
@Service
public class UserCardServiceImpl implements IUserCardService {

	
	@Autowired
	UserCardMapper userCardMapper;
	
	@Autowired
	UserCardRelMapper userCardRelMapper;
	
	/**
	 * 查询会员卡列表
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectList
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午2:31:53 
	 * @param pagesModel
	 * @return
	 * @see com.jiabian.service.basic.IUserCardService#selectList(com.jiabian.base.PagesModel)
	 * @exception 
	 * @since  1.0.0
	*/
	@Override
	public List<OrderRes> selectList(
			PagesModel<UserCardReq, OrderRes> pagesModel) {
		pagesModel.setTotal(userCardMapper.selectListCount(pagesModel));
		pagesModel.setOrderBy("id DESC");
		List<OrderRes> list= userCardMapper.selectList(pagesModel);
		pagesModel.setResults(list);
		return list;
	}

	/**
	 * 删除会员卡
	 * com.jiabian.service.basic.impl 
	 * 方法名：deleteById
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午2:31:53 
	 * @param id
	 * @return
	 * @see com.jiabian.service.basic.IUserCardService#deleteById(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	*/
	@Override
	public int deleteById(Long id) {
		UserCard userCard=new UserCard();
		userCard.setId(id);
		userCard.setIsDel(BaseEnum.isDel.DEL.getValue());
		return userCardMapper.updateByPrimaryKeySelective(userCard);
	}

	/**
	 * 更新会员卡
	 * com.jiabian.service.basic.impl 
	 * 方法名：updateById
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午2:31:53 
	 * @param userCardReq
	 * @return
	 * @see com.jiabian.service.basic.IUserCardService#updateById(com.jiabian.usercard.request.UserCardReq)
	 * @exception 
	 * @since  1.0.0
	*/
	@Override
	public int updateById(UserCardReq userCardReq) {
		UserCard userCard=new UserCard();
		userCard.setUpdateTime(new Date());
		SpringBeanUtils.copyProperties(userCardReq, userCard);
		return userCardMapper.updateByPrimaryKeySelective(userCard);
	}

	/**
	 * 添加会员卡
	 * com.jiabian.service.basic.impl 
	 * 方法名：insert
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午2:31:53 
	 * @param userCardReq
	 * @return
	 * @see com.jiabian.service.basic.IUserCardService#insert(com.jiabian.usercard.request.UserCardReq)
	 * @exception 
	 * @since  1.0.0
	*/
	@Override
	public int insert(UserCardReq userCardReq) {
		UserCard userCard=new UserCard();
		userCard.setCreateTime(new Date());
		SpringBeanUtils.copyProperties(userCardReq, userCard);
		return userCardMapper.insertSelective(userCard);
	}

	/**
	 * 更加id查询会员卡
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectById
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午2:31:53 
	 * @param id
	 * @return
	 * @see com.jiabian.service.basic.IUserCardService#selectById(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	*/
	@Override
	public UserCard selectById(Long id) {
		return userCardMapper.selectByPrimaryKey(id);
	}

	/**
	 * 会员卡列表
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectList
	 * 创建人：何雪平 
	 * 时间：2017年4月13日-上午9:53:35 
	 * @return
	 * @see com.jiabian.service.basic.IUserCardService#selectList()
	 * @exception 
	 * @since  1.0.0
	*/
	@Override
	public List<OrderRes> selectList(Long userId) {
		return userCardMapper.selectListByUserId(userId);
	}

	/**
	 * (这里用一句话描述这个方法的作用)
	 * com.jiabian.service.basic.impl 
	 * 方法名：testDate
	 * 创建人：何雪平 
	 * 时间：2017年4月14日-下午4:39:54 
	 * @return
	 * @see com.jiabian.service.basic.IUserCardService#testDate()
	 * @exception 
	 * @since  1.0.0
	*/
	@Override
	public int testDate() {
		// TODO Auto-generated method stub
		
		int timet=userCardRelMapper.selectTimePeriod((long) 1402);
		System.out.println(timet+"===========");
		int aa=userCardRelMapper.updateCardTime((long) 1212,12 );
		System.out.println(aa+"===========");
		int bb=userCardRelMapper.insertCardRel((long) 666,1);
		System.out.println(bb+"===========");
		return 0;
	}

	/**
	 * 查询用户会员卡
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectUserCard
	 * 创建人：何雪平 
	 * 时间：2017年4月19日-下午1:31:20 
	 * @return
	 * @see com.jiabian.service.basic.IUserCardService#selectUserCard()
	 * @exception 
	 * @since  1.0.0
	*/
	@Override
	public OrderRes selectUserCard(Long userId) {
		return userCardMapper.selectUserCard(userId);
	}
	
}
