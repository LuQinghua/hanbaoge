/**
 * 家边网络科技有限公司
 * jiabian-business-api
 * com.jiabian.sh.biz
 * ISHAdpositionServiceBiz.java
 * 创建人:方玉明
 * 时间：2016-12-7-上午11:37:01 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.sh.biz;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.adposition.request.AdpositionReq;
import com.jiabian.adposition.response.AdpositionRes;
import com.jiabian.beans.basic.Adposition;
import com.jiabian.util.Result;

/**
 * 
 * ISHAdpositionServiceBiz
 * 创建人:方玉明
 * 时间：2016-12-7-上午11:37:01 
 * @version 1.0.0
 * 
 */
public interface ISHAdpositionServiceBiz {

	/**
	 * 根据区域查询广告位
	 * com.jiabian.sh.biz 
	 * 方法名：selectAdposition
	 * 创建人：方玉明
	 * 时间：2016-12-7-上午11:42:40 
	 * @param adpositionReq
	 * @return List<AdpositionRes>
	 * @exception 
	 * @since  1.0.0
	*/
	List<AdpositionRes> selectAdposition(AdpositionReq adpositionReq);

	/**
	 * 设置广告位
	 * com.jiabian.sh.biz 
	 * 方法名：setadposition
	 * 创建人：方玉明
	 * 时间：2016-12-8-上午11:21:07 
	 * @param adposition
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	*/
	Result<JSONObject> setadposition(Adposition adposition);

	/**
	 * 移除广告位
	 * com.jiabian.sh.biz 
	 * 方法名：deleteAdposition
	 * 创建人：方玉明
	 * 时间：2016-12-8-下午5:53:51 
	 * @param adposition
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	*/
	Result<JSONObject> deleteAdposition(Adposition adposition);
	
}
