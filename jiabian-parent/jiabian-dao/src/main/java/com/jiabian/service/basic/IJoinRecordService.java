package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.sys.activity.request.QdyJoinReq;
import com.jiabian.sys.activity.response.QdyJoinRes;

/**
 * 用户参与记录
 * 
 * IJoinRecordService
 * 创建人:张铁成
 * 时间：2016-12-8-下午8:32:43 
 * @version 1.0.0
 *
 */
public interface IJoinRecordService {

	/**
	 * 
	 * (查询所有用户参与记录&分页)
	 * com.jiabian.service.basic 
	 * 方法名：countJoinRecord
	 * 创建人：张铁成
	 * 时间：2016-12-8-下午8:38:27 
	 * @param pagesModel
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer countJoinRecord(PagesModel<QdyJoinReq, QdyJoinRes> pagesModel);
	List<QdyJoinRes> selectJoinRecord(PagesModel<QdyJoinReq, QdyJoinRes> pagesModel);
	
	
	
	/**
	 * 查询中奖信息
	 * com.jiabian.service.basic 
	 * 方法名：countPrizMsg
	 * 创建人：张铁成
	 * 时间：2016-12-9-上午8:58:52 
	 * @param pagesModel
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer countPrizMsg(PagesModel<QdyJoinReq, QdyJoinRes> pagesModel);
	List<QdyJoinRes> selectPrizeMsg(PagesModel<QdyJoinReq, QdyJoinRes> pagesModel);
	
	

}
