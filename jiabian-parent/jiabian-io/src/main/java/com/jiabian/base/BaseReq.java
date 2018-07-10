package com.jiabian.base;

import java.io.Serializable;

/**
 * 
 * 请求基类
 * BaseReq
 * 创建人:黄世平
 * 时间：2016年11月8日-上午9:17:17 
 * @version 1.0.0
 *
 */
public class BaseReq implements Serializable {

	private static final long serialVersionUID = 5405867850353264830L;
	
	private String version;
	/**
	 * 查询多少条
	 */
	private int size;
	/**
	 * 依稀量。 每几条开始查询
	 */
	private int offset;
	
	private int page; //第几页
	/**
	 * 查询下一页关键字
	 */
	private String nextKeyward;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getNextKeyward() {
		return nextKeyward;
	}

	public void setNextKeyward(String nextKeyward) {
		this.nextKeyward = nextKeyward;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

}