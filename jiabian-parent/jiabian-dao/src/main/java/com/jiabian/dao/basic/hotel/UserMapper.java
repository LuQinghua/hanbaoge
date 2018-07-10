/*
 * UserMapper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-12 Created
 */
package com.jiabian.dao.basic.hotel;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.hotel.User;
import com.jiabian.beans.basic.hotel.UserQueryHelper;
import com.jiabian.hotel.request.HomeReq;
import com.jiabian.hotel.request.UserReq;
import com.jiabian.hotel.response.HomeRes;
import com.jiabian.hotel.response.UserRes;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserQueryHelper example);

    int deleteByExample(UserQueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserQueryHelper example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserQueryHelper example);

    int updateByExample(@Param("record") User record, @Param("example") UserQueryHelper example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    @Delete("DELETE FROM user WHERE id =#{id}")
	Integer deletUser(Integer id);

	Integer countUsers(PagesModel<UserReq, UserRes> pagesModel);

	List<UserRes> selectUsers(PagesModel<UserReq, UserRes> pagesModel);
	
	List<UserRes> selectUsersByCondition(@Param("username") String username, @Param("telephone") String telephone,@Param("pagesModel") PagesModel<UserReq, UserRes> pagesModel);
	
}