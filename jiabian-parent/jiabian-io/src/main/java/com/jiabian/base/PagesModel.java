package com.jiabian.base;

import java.util.List;

/**
 * 
 * 分页范类
 * PagesModel
 * 创建人:黄世平
 * 时间：2016年11月8日-上午9:15:50 
 * @version 1.0.0
 *
 */
public class PagesModel<R,Q> implements java.io.Serializable {

    /**
	 * serialVersionUID:TODO
	 * @since 1.0.0
	 */
	
	private static final long serialVersionUID = 1L;

	/**
     * 是否分页
     */
    private boolean doPage = true;

    /**
     * 当前页面
     */
    private Integer currentPage;
    /**
     * 总记录条数
     */
    private Integer total;
    /**
     * 总页数
     */
    private Integer pages;

    /**
     *  分页起始位置 
     */
    private Integer limitStart;
    /**
     * 单页显示记录数量
     */
    private Integer limitNum;

    /**
     * 排序条件（自定义，如 ： id desc）
     */
    private String  orderBy;

    /**
     * 查询条件类
     */
    private R       req;
 
    /**
     * 查询结果
     */
    private List<Q> results;

    public PagesModel() {
        total = 0;
        pages = 0;
        currentPage = 1;
        limitNum = 9;
    }

    public PagesModel(R req, boolean doPage) {
        this();
        this.req = req;
        this.doPage = doPage;
    }

    public PagesModel(R req) {
        this();
        this.req = req;
    }

    /**
     *  取消分页
     */
    public void cancelPage() {
        this.doPage = false;
    }

    public boolean isDoPage() {
        return doPage;
    }

    public void setDoPage(boolean doPage) {
        this.doPage = doPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPages() {
        if (this.limitNum == null)
            return null;
        this.pages = (this.total + (this.limitNum - 1)) / this.limitNum;
        return this.pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getLimitStart() {
        if (this.limitNum == null)
            return null;
        this.limitStart = (this.currentPage - 1) * this.limitNum;
        return this.limitStart;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart = limitStart;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }


    public R getReq() {
		return req;
	}

	public void setReq(R req) {
		this.req = req;
	}


    public List<Q> getResults() {
		return results;
	}

	public void setResults(List<Q> results) {
		this.results = results;
	}

	public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

	
}
