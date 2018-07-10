package com.jiabian.solr.model.base;

import java.util.List;

import org.apache.solr.client.solrj.response.FacetField;
import org.apache.solr.client.solrj.response.RangeFacet;


/**
 * 
 * Sorl 查询范类
 * BaseSolrModel
 * 创建人:黄世平
 * 时间：2016年11月7日-下午3:16:00 
 * @version 1.0.0
 *
 */
public class BaseSolrModel<T> extends BaseModel<T> {

	/**
	 * 过滤语句
	 */
	private String fQuery;
	/**
	 * 查询字符串
	 */
	private String query;

	/**
	 * collection名称
	 */
	private String collectionName = "jiabian";
	/**
	 * 统计字段名称
	 */
	private String[] facetField;

	/**
	 * 统计结果
	 */
	private List<FacetField> facetList;

	private List<RangeFacet> rangeList;

	/**
	 * 返回字段
	 */
	private String fls;

	public BaseSolrModel() {
		super();
	}

	public BaseSolrModel(T model) {
		super(model);
	}

	public BaseSolrModel(T model, boolean doPage) {
		super(model, doPage);
	}

	public String getfQuery() {
		return fQuery;
	}

	public void setfQuery(String fQuery) {
		this.fQuery = fQuery;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String[] getFacetField() {
		return facetField;
	}

	public void setFacetField(String[] facetField) {
		this.facetField = facetField;
	}


	public List<FacetField> getFacetList() {
		return facetList;
	}

	public void setFacetList(List<FacetField> facetList) {
		this.facetList = facetList;
	}

	public List<RangeFacet> getRangeList() {
		return rangeList;
	}

	public void setRangeList(List<RangeFacet> rangeList) {
		this.rangeList = rangeList;
	}

	public String getFls() {
		return fls;
	}

	public void setFls(String fls) {
		this.fls = fls;
	}


}
