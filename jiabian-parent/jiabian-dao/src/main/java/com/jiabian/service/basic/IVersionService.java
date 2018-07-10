package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.VersionApp;
import com.jiabian.versionapp.request.VersionAppReq;
import com.jiabian.versionapp.response.VersionAppRes;
/**
 * 版本更新数据接口层
 * 
 * IVersionService
 * 创建人:何雪平 
 * 时间：2016年12月19日-下午7:48:15 
 * @version 1.0.0
 *
 */
public interface IVersionService {
	
	/**
	 * 查询版本是否更新
	 * com.jiabian.service.basic 
	 * 方法名：selectVersionUpdate
	 * 创建人：何雪平 
	 * 时间：2016年12月19日-下午7:48:05 
	 * @param source
	 * @param type
	 * @return VersionApp
	 * @exception 
	 * @since  1.0.0
	 */
	VersionApp selectVersionUpdate(Byte source, Byte type,String versionNo);
	
	/**
	 * 添加版本号
	 * com.jiabian.service.basic 
	 * 方法名：addVersion
	 * 创建人：何雪平 
	 * 时间：2016年12月20日-上午10:41:18 
	 * @param source
	 * @param type
	 * @param versionNo void
	 * @exception 
	 * @since  1.0.0
	 */
	int addVersion(Byte source, Byte type,String versionNo,String versionDesc,String versionUrl);

	
	/**
	 * 
	 * APP版本管理分页
	 * com.jiabian.service.basic 
	 * 方法名：selectVersion
	 * 创建人：李文凯
	 * 时间：2017年1月5日-下午5:55:14 
	 * @param pagesModel
	 * @return List<VersionAppRes>
	 * @exception 
	 * @since  1.0.0
	 */
	List<VersionAppRes> selectVersion(PagesModel<VersionAppReq, VersionAppRes> pagesModel);
	Integer countVersion(PagesModel<VersionAppReq, VersionAppRes> pagesModel);

	
	/**
	 * 
	 * 跳转修改页面
	 * com.jiabian.service.basic 
	 * 方法名：selectVersionById
	 * 创建人：李文凯
	 * 时间：2017年1月6日-上午10:35:46 
	 * @param id
	 * @return VersionApp
	 * @exception 
	 * @since  1.0.0
	 */
	VersionApp selectVersionById(Long id);

	
	/**
	 * 
	 * 修改版本信息
	 * com.jiabian.service.basic 
	 * 方法名：updateVersionApp
	 * 创建人：李文凯
	 * 时间：2017年1月6日-上午10:52:39 
	 * @param versionApp
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer updateVersionApp(VersionApp versionApp);

	
	/**
	 * 
	 * 新增App信息
	 * com.jiabian.service.basic 
	 * 方法名：addNewVersionApp
	 * 创建人：李文凯
	 * 时间：2017年1月6日-下午3:01:46 
	 * @param versionApp
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer addNewVersionApp(VersionApp versionApp);

	
	/**
	 * 
	 * 删除版本信息
	 * com.jiabian.service.basic 
	 * 方法名：deleteApp
	 * 创建人：李文凯
	 * 时间：2017年1月6日-下午3:14:20 
	 * @param id
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer deleteApp(Long id);

	
	/**
	 * 
	 * 当前app版本
	 * com.jiabian.service.basic 
	 * 方法名：selectNowAndroid
	 * 创建人：李文凯
	 * 时间：2017年1月6日-下午5:18:24 
	 * @return VersionApp
	 * @exception 
	 * @since  1.0.0
	 */
	VersionApp selectNowAndroid();
	VersionApp selectNowIos();
	
}
