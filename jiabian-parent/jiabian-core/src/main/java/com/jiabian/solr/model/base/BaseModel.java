package com.jiabian.solr.model.base;

import java.util.List;

public class BaseModel<T> {

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
    private T       model;

    /**
     * 查询结果
     */
    private List<T> results;

    public BaseModel() {
        total = 0;
        pages = 0;
        currentPage = 1;
        limitNum = 10;
    }

    public BaseModel(T model, boolean doPage) {
        this();
        this.model = model;
        this.doPage = doPage;
    }

    public BaseModel(T model) {
        this();
        this.model = model;
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

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

}
