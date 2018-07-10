/*
 * CommentMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-05 Created
 */
package com.jiabian.dao.basic.complaints;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.complaints.Comment;
import com.jiabian.beans.basic.complaints.CommentQueryHelper;
import com.jiabian.tspt.request.CommentReq;
import com.jiabian.tspt.response.CommentRes;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    int countByExample(CommentQueryHelper example);

    int deleteByExample(CommentQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentQueryHelper example);

    Comment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentQueryHelper example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentQueryHelper example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
    
    @Delete("DELETE FROM comment WHERE id = #{id}")
    Integer deleteComment(Long id);

	Integer countComments(PagesModel<CommentReq, CommentRes> pagesModel);

	List<CommentRes> selectComments(PagesModel<CommentReq, CommentRes> pagesModel);

	List<CommentRes> selectCommentsByCondition(@Param("condition") String condition, @Param("pagesModel") PagesModel<CommentReq, CommentRes> pagesModel);
}