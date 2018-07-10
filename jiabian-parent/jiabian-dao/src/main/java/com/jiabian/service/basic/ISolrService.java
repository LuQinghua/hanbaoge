/**
 * 家边网络科技有限公司
 * jiabian-dao
 * com.jiabian.service.basic
 * ISolrService.java
 * 创建人:潇洒
 * 时间：2016-11-21-下午5:50:50 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.service.basic;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;

import com.jiabian.solr.model.base.BaseSolrModel;


/**
 * ISolrService
 * 创建人:潇洒
 * 时间：2016-11-21-下午5:50:50 
 */
public interface ISolrService {

	/**
	 * 搜索
	 * com.jiabian.service.basic 
	 * 方法名：queryProduct
	 * 创建人：潇洒
	 * 时间：2016-11-22-下午2:34:11 
	 * @throws SolrServerException 
	*/
	BaseSolrModel queryProduct(SolrQuery query) throws SolrServerException;
}
