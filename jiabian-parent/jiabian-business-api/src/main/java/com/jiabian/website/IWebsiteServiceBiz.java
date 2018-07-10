package com.jiabian.website;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.hotel.Classify;
import com.jiabian.beans.basic.hotel.Company;
import com.jiabian.beans.basic.hotel.Equipment;
import com.jiabian.hotel.request.HomeReq;
import com.jiabian.hotel.request.NewsReq;
import com.jiabian.hotel.request.OrdersReq;
import com.jiabian.hotel.request.UserReq;
import com.jiabian.hotel.response.HomeRes;
import com.jiabian.hotel.response.NewsRes;
import com.jiabian.hotel.response.OrdersRes;
import com.jiabian.hotel.response.UserRes;

public interface IWebsiteServiceBiz {

	PagesModel<NewsReq, NewsRes> selectNews(PagesModel<NewsReq, NewsRes> pagesModel);

	Integer insertNews(NewsReq newsReq);

	Integer deletNews(NewsReq newsReq);

	NewsReq selectIdNews(Long id);

	Integer updatpNews(NewsReq newsReq);

	PagesModel<UserReq, UserRes> selectUsers(PagesModel<UserReq, UserRes> pagesModel);

	Integer insertUser(UserReq userReq);

	Integer deleteUser(UserReq userReq);

	Integer delBatchUsers(List<Integer> ids);

	PagesModel<UserReq, UserRes> selectUserByCondition(String username, String telephone, PagesModel<UserReq, UserRes> pagesModel);

	PagesModel<HomeReq, HomeRes> selectHomes(PagesModel<HomeReq, HomeRes> pagesModel);

	Integer deleteHome(HomeReq homeReq);

	Integer insertHome(HomeReq homeReq);

	List<Classify> getHomeClassifys();

	Integer delBatchHomes(List<Integer> ids);

	PagesModel<HomeReq, HomeRes> selectHomeByCondition(String name, Byte classifyId, String orderBy,
			PagesModel<HomeReq, HomeRes> pagesModel);

	HomeReq selectHomeById(Integer id);

	Integer updateHome(HomeReq homeReq);

	Company selectCompanyInfo();

	Integer updateCompanyInfo(Company company);

	List<Equipment> selectEquipmentsById(Long id);

	Integer deleteClassify(Classify classify);

	Integer insertClassify(Classify classify);

	Classify selectClassifyById(Long id);

	Integer updateClassify(Classify classify);

	List<String> selectAllEquipments();

	Integer insertEquipment(Equipment equip);

	Integer deleteEquipment(Long id);

	PagesModel<OrdersReq, OrdersRes> selectOrders(PagesModel<OrdersReq, OrdersRes> pagesModel);

	Integer deleteOrder(OrdersReq ordersReq);

	Integer delBatchOrders(List<Long> ids);

	UserRes selectUserById(Integer id);

	PagesModel<OrdersReq, OrdersRes> selectOrdersByCondition(String orderCode, String condition, PagesModel<OrdersReq, OrdersRes> pagesModel);

}
