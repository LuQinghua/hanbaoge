package com.jiabian.shop.biz;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.VersionApp;
import com.jiabian.util.Result;
import com.jiabian.versionapp.request.VersionAppReq;
import com.jiabian.versionapp.response.VersionAppRes;


/**
 * 版本更新服务接口层
 * ISCVersionServiceBiz
 * 创建人:何雪平 
 * 时间：2016年12月19日-下午7:39:45 
 * @version 1.0.0
 *
 */
public interface ISCVersionServiceBiz {

	/**
	 * 查询版本是否更新
	 * com.jiabian.shop.biz 
	 * 方法名：selectVersionUpdate
	 * 创建人：何雪平 
	 * 时间：2016年12月19日-下午7:39:11 
	 * @param source
	 * @param type
	 * @return Result<VersionApp>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<VersionApp> selectVersionUpdate(Byte source,Byte type,String versionNo);
	
	/**
	 * 添加版本号
	 * com.jiabian.shop.biz 
	 * 方法名：addVersion
	 * 创建人：何雪平 
	 * 时间：2016年12月20日-上午10:40:33 
	 * @param source
	 * @param type
	 * @param versionNo
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> addVersion(Byte source, Byte type,String versionNo,String versionDesc,String versionUrl);

	/**
	 * 
	 * APP版本管理分页
	 * com.jiabian.shop.biz 
	 * 方法名：selectVersion
	 * 创建人：李文凯
	 * 时间：2017年1月5日-下午5:52:49 
	 * @param pagesModel
	 * @return PagesModel<VersionAppReq,VersionAppRes>
	 * @exception 
	 * @since  1.0.0
	 */
	PagesModel<VersionAppReq, VersionAppRes> selectVersion(PagesModel<VersionAppReq, VersionAppRes> pagesModel);

	
	/**
	 * 
	 * 跳转修改页面
	 * com.jiabian.shop.biz 
	 * 方法名：selectVersionById
	 * 创建人：李文凯
	 * 时间：2017年1月6日-上午10:34:47 
	 * @param id
	 * @return VersionApp
	 * @exception 
	 * @since  1.0.0
	 */
	VersionApp selectVersionById(Long id);

	
	/**
	 * 
	 * 修改版本信息
	 * com.jiabian.shop.biz 
	 * 方法名：updateVersionApp
	 * 创建人：李文凯
	 * 时间：2017年1月6日-上午10:51:41 
	 * @param versionApp
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer updateVersionApp(VersionApp versionApp);

	
	/**
	 * 
	 * 新增App信息
	 * com.jiabian.shop.biz 
	 * 方法名：addNewVersionApp
	 * 创建人：李文凯
	 * 时间：2017年1月6日-下午3:00:51 
	 * @param versionApp
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer addNewVersionApp(VersionApp versionApp);

	
	/**
	 * 
	 * 删除版本信息
	 * com.jiabian.shop.biz 
	 * 方法名：deleteApp
	 * 创建人：李文凯
	 * 时间：2017年1月6日-下午3:13:23 
	 * @param id
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer deleteApp(Long id);

	
	/**
	 * 
	 * 查询当前APP版本
	 * com.jiabian.shop.biz 
	 * 方法名：selectNowAndroid
	 * 创建人：李文凯
	 * 时间：2017年1月6日-下午5:16:52 
	 * @return VersionApp
	 * @exception 
	 * @since  1.0.0
	 */
	VersionApp selectNowAndroid();
	VersionApp selectNowIos();
	
	
}
