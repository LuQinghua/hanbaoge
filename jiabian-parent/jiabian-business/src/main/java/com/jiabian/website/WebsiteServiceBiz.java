package com.jiabian.website;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.hotel.Classify;
import com.jiabian.beans.basic.hotel.Company;
import com.jiabian.beans.basic.hotel.Equipment;
import com.jiabian.beans.basic.hotel.Home;
import com.jiabian.beans.basic.hotel.HomeQueryHelper;
import com.jiabian.beans.basic.hotel.News;
import com.jiabian.beans.basic.hotel.OrdersQueryHelper;
import com.jiabian.beans.basic.hotel.User;
import com.jiabian.beans.basic.hotel.UserQueryHelper;
import com.jiabian.beans.basic.hotel.UserQueryHelper.Criteria;
import com.jiabian.dao.basic.hotel.CompanyMapper;
import com.jiabian.dao.basic.hotel.ClassifyMapper;
import com.jiabian.dao.basic.hotel.EquipmentMapper;
import com.jiabian.dao.basic.hotel.HomeMapper;
import com.jiabian.dao.basic.hotel.NewsMapper;
import com.jiabian.dao.basic.hotel.OrdersMapper;
import com.jiabian.dao.basic.hotel.UserMapper;
import com.jiabian.hotel.request.HomeReq;
import com.jiabian.hotel.request.NewsReq;
import com.jiabian.hotel.request.OrdersReq;
import com.jiabian.hotel.request.UserReq;
import com.jiabian.hotel.response.HomeRes;
import com.jiabian.hotel.response.NewsRes;
import com.jiabian.hotel.response.OrdersRes;
import com.jiabian.hotel.response.UserRes;
import com.jiabian.util.SpringBeanUtils;

@Service
public class WebsiteServiceBiz implements IWebsiteServiceBiz {

	@Autowired
	private NewsMapper newsMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private HomeMapper homeMapper;
	
	@Autowired
	private OrdersMapper ordersMapper;
	
	@Autowired
	private ClassifyMapper classifyMapper;
	
	@Autowired
	private CompanyMapper companyMapper;
	
	@Autowired
	private EquipmentMapper equipmentMapper;
	
	@Override
	public PagesModel<NewsReq, NewsRes> selectNews(PagesModel<NewsReq, NewsRes> pagesModel) {
		pagesModel.setTotal(newsMapper.counNews(pagesModel));
		pagesModel.setResults(newsMapper.selectNews(pagesModel));
		return pagesModel;
	}
	@Override
	public Integer insertNews(NewsReq newsReq) {
		newsReq.setCreateTime(new Date());
		News news = new News();
		SpringBeanUtils.copyProperties(newsReq, news);
		return newsMapper.insertSelective(news);
	}
	@Override
	public Integer deletNews(NewsReq newsReq) {
		return newsMapper.deletNews(newsReq.getId());
	}
	@Override
	public NewsReq selectIdNews(Long id) {
		NewsReq newsReq = new NewsReq();
		News news = newsMapper.selectByPrimaryKey(id);
		SpringBeanUtils.copyProperties(news, newsReq);
		return newsReq;
	}
	@Override
	public Integer updatpNews(NewsReq newsReq) {
		News news = new News();
		SpringBeanUtils.copyProperties(newsReq, news);
		return newsMapper.updateByPrimaryKeySelective(news);
	}
	//==============================================================================================
	@Override
	public PagesModel<UserReq, UserRes> selectUsers(PagesModel<UserReq, UserRes> pagesModel) {
		pagesModel.setTotal(userMapper.countUsers(pagesModel));
		pagesModel.setResults(userMapper.selectUsers(pagesModel));
		return pagesModel;
	}
	@Override
	public Integer insertUser(UserReq userReq) {
		User user = new User();
		SpringBeanUtils.copyProperties(userReq, user);
		return userMapper.insert(user);
	}
	@Override
	public Integer deleteUser(UserReq userReq) {
		return userMapper.deletUser(userReq.getId());
	}
	@Override
	public Integer delBatchUsers(List<Integer> ids) {
		UserQueryHelper helper = new UserQueryHelper();
		Criteria criteria = helper.createCriteria();
		criteria.andIdIn(ids);
		return userMapper.deleteByExample(helper);
	}
	@Override
	public PagesModel<UserReq, UserRes> selectUserByCondition(String username, String telephone,
			PagesModel<UserReq, UserRes> pagesModel) {
		UserQueryHelper helper = new UserQueryHelper();
		Criteria criteria = helper.createCriteria();
		if(!"".equals(username) && username != null) criteria.andUsernameLike(username);
		if(!"".equals(telephone) && telephone != null) criteria.andTelephoneEqualTo(telephone);
		pagesModel.setTotal(userMapper.countByExample(helper));
		pagesModel.setResults(userMapper.selectUsersByCondition(username, telephone, pagesModel));
		return pagesModel;
	}
	@Override
	public UserRes selectUserById(Integer id) {
		UserRes userRes = new UserRes();
		User user = userMapper.selectByPrimaryKey(id);
		SpringBeanUtils.copyProperties(user, userRes);
		return userRes;
	}
	//==============================================================================================
	@Override
	public PagesModel<HomeReq, HomeRes> selectHomes(PagesModel<HomeReq, HomeRes> pagesModel) {
		pagesModel.setTotal(homeMapper.countHomes(pagesModel));
		pagesModel.setResults(homeMapper.selectHomes(pagesModel));
		return pagesModel;
	}
	@Override
	public Integer deleteHome(HomeReq homeReq) {
		return homeMapper.deletHome(homeReq.getId());
	}
	@Override
	public Integer insertHome(HomeReq homeReq) {
		homeReq.setTime(new Date());
		Home home = new Home();
		SpringBeanUtils.copyProperties(homeReq, home);
		return homeMapper.insertSelective(home);
	}
	@Override
	public List<Classify> getHomeClassifys() {
		return classifyMapper.selectByExample(null);
	}
	@Override
	public Integer delBatchHomes(List<Integer> ids) {
		HomeQueryHelper helper = new HomeQueryHelper();
		com.jiabian.beans.basic.hotel.HomeQueryHelper.Criteria criteria = helper.createCriteria();
		criteria.andIdIn(ids);
		return homeMapper.deleteByExample(helper);
	}
	@Override
	public PagesModel<HomeReq, HomeRes> selectHomeByCondition(String name, Byte classifyId, String orderBy,
			PagesModel<HomeReq, HomeRes> pagesModel) {
		HomeQueryHelper helper = new HomeQueryHelper();
		com.jiabian.beans.basic.hotel.HomeQueryHelper.Criteria criteria = helper.createCriteria();
		if(!"".equals(name) && name != null) criteria.andNameLike(name);
		if(classifyId != 0) criteria.andTypeEqualTo(classifyId);
		if(!"".equals(orderBy)) {
			helper.setOrderByClause(orderBy);
			pagesModel.setOrderBy(orderBy);
		}
		pagesModel.setTotal(homeMapper.countByExample(helper));
		pagesModel.setResults(homeMapper.selectHomeByCondition(name, classifyId, pagesModel));
		return pagesModel;
	}
	@Override
	public HomeReq selectHomeById(Integer id) {
		HomeReq homeReq = new HomeReq();
		Home home = homeMapper.selectByPrimaryKey(id);
		SpringBeanUtils.copyProperties(home, homeReq);
		return homeReq;
	}
	@Override
	public Integer updateHome(HomeReq homeReq) {
		Home home = new Home();
		SpringBeanUtils.copyProperties(homeReq, home);
		return homeMapper.updateByPrimaryKeySelective(home);
	}
	//==============================================================================================
	@Override
	public Company selectCompanyInfo() {
		return companyMapper.selectByPrimaryKey(1);
	}
	@Override
	public Integer updateCompanyInfo(Company company) {
		return companyMapper.updateByPrimaryKeySelective(company);
	}
	//==============================================================================================
	@Override
	public Integer deleteClassify(Classify classify) {
		return classifyMapper.deleteByPrimaryKey(classify.getId());
	}
	@Override
	public Integer insertClassify(Classify classify) {
		classify.setCreateTime(new Date());
		return classifyMapper.insertSelective(classify);
	}
	@Override
	public Classify selectClassifyById(Long id) {
		return classifyMapper.selectByPrimaryKey(id);
	}
	@Override
	public Integer updateClassify(Classify classify) {
		return classifyMapper.updateByPrimaryKeySelective(classify);
	}
	//==============================================================================================
	@Override
	public List<Equipment> selectEquipmentsById(Long id) {
		return equipmentMapper.selectWithClassify(id);
	}
	@Override
	public List<String> selectAllEquipments() {
		return equipmentMapper.selectDistinctEquipments();
	}
	@Override
	public Integer insertEquipment(Equipment equip) {
		return equipmentMapper.insertSelective(equip);
	}
	@Override
	public Integer deleteEquipment(Long id) {
		return equipmentMapper.deleteByPrimaryKey(id);
	}
	//==============================================================================================
	@Override
	public PagesModel<OrdersReq, OrdersRes> selectOrders(PagesModel<OrdersReq, OrdersRes> pagesModel) {
		pagesModel.setTotal(ordersMapper.countOrders(pagesModel));
		pagesModel.setResults(ordersMapper.selectOrders(pagesModel));
		return pagesModel;
	}
	@Override
	public Integer deleteOrder(OrdersReq ordersReq) {
		return ordersMapper.deleteByPrimaryKey(ordersReq.getId());
	}
	@Override
	public Integer delBatchOrders(List<Long> ids) {
		OrdersQueryHelper helper = new OrdersQueryHelper();
		com.jiabian.beans.basic.hotel.OrdersQueryHelper.Criteria criteria = helper.createCriteria();
		criteria.andIdIn(ids);
		return ordersMapper.deleteByExample(helper);
	}
	@Override
	public PagesModel<OrdersReq, OrdersRes> selectOrdersByCondition(String orderCode, String condition,
			PagesModel<OrdersReq, OrdersRes> pagesModel) {
		pagesModel.setTotal(ordersMapper.countOrdersByCondition(orderCode, condition, pagesModel));
		pagesModel.setResults(ordersMapper.selectOrdersByCondition(orderCode, condition, pagesModel));
		return pagesModel;
	}
}
