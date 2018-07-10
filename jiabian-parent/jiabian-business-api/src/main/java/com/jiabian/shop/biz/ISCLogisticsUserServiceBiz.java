package com.jiabian.shop.biz;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.LogisticsCompany;
import com.jiabian.beans.basic.LogisticsUser;
import com.jiabian.logisticsuser.request.logisticsUserReq;
import com.jiabian.logisticsuser.response.LogisticsUserRes;




public interface ISCLogisticsUserServiceBiz {

	PagesModel<logisticsUserReq, LogisticsUserRes> selecteCourier(PagesModel<logisticsUserReq, LogisticsUserRes> pagesModel);

	Integer addCourier(LogisticsUser logisticsUser);

	LogisticsUser selectCouriereById(logisticsUserReq userReq);

	List<LogisticsCompany> selectLogisticsCompany();

	Integer updateCourier(logisticsUserReq userReq);

	Integer deleteCourier(Long id);

}
