package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.LogisticsCompany;
import com.jiabian.beans.basic.LogisticsUser;
import com.jiabian.logisticsuser.request.logisticsUserReq;
import com.jiabian.logisticsuser.response.LogisticsUserRes;

public interface IlogisticsUserService {

	
	/**
	 * 
	 * 配送员查询
	 * com.jiabian.service.basic 
	 * 方法名：selectCourierList
	 * 创建人：李文凯
	 * 时间：2016年12月16日-上午11:29:22 
	 * @param pagesModel
	 * @return List<LogisticsUserRes>
	 * @exception 
	 * @since  1.0.0
	 */
	List<LogisticsUserRes> selectCourierList(PagesModel<logisticsUserReq, LogisticsUserRes> pagesModel);
	Integer countCourierList(PagesModel<logisticsUserReq, LogisticsUserRes> pagesModel);
	
	
	/**
	 * 
	 * 上传配送人员
	 * com.jiabian.service.basic 
	 * 方法名：addCourier
	 * 创建人：李文凯
	 * 时间：2016年12月16日-下午5:46:05 
	 * @param logisticsUser
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer addCourier(LogisticsUser logisticsUser);
	
	
	LogisticsUser toUpdateCourier(logisticsUserReq userReq);
	
	List<LogisticsCompany> selectLogisticsCompany();
	
	Integer updateCourier(logisticsUserReq userReq);
	
	Integer deleteCourier(Long id);

}
