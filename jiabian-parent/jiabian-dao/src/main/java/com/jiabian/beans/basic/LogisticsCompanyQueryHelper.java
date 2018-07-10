/*
 * LogisticsCompanyQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-18 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogisticsCompanyQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public LogisticsCompanyQueryHelper() {
        oredCriteria = new ArrayList<Criteria>();
    }
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }
    public String getOrderByClause() {
        return orderByClause;
    }
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }
    public boolean isDistinct() {
        return distinct;
    }
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 物流信息表
     * 
     * @author 菠萝大象
     * @version 1.0 2017-01-18
     */
    protected abstract static class GeneratedCriteria {

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }
        public boolean isValid() {
            return criteria.size() > 0;
        }
        public List<Criterion> getAllCriteria() {
            return criteria;
        }
        public List<Criterion> getCriteria() {
            return criteria;
        }
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }
        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }
        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeIsNull() {
            addCriterion("companyCode is null");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("companyCode is not null");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("companyCode =", value, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("companyCode <>", value, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("companyCode >", value, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("companyCode >=", value, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("companyCode <", value, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("companyCode <=", value, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeLike(String value) {
            addCriterion("companyCode like", value, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("companyCode not like", value, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("companyCode in", values, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("companyCode not in", values, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("companyCode between", value1, value2, "companyCode");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("companyCode not between", value1, value2, "companyCode");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyIsNull() {
            addCriterion("logiCompany is null");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyIsNotNull() {
            addCriterion("logiCompany is not null");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyEqualTo(String value) {
            addCriterion("logiCompany =", value, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyNotEqualTo(String value) {
            addCriterion("logiCompany <>", value, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyGreaterThan(String value) {
            addCriterion("logiCompany >", value, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logiCompany >=", value, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyLessThan(String value) {
            addCriterion("logiCompany <", value, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyLessThanOrEqualTo(String value) {
            addCriterion("logiCompany <=", value, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyLike(String value) {
            addCriterion("logiCompany like", value, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyNotLike(String value) {
            addCriterion("logiCompany not like", value, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyIn(List<String> values) {
            addCriterion("logiCompany in", values, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyNotIn(List<String> values) {
            addCriterion("logiCompany not in", values, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyBetween(String value1, String value2) {
            addCriterion("logiCompany between", value1, value2, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyNotBetween(String value1, String value2) {
            addCriterion("logiCompany not between", value1, value2, "logiCompany");
            return (Criteria) this;
        }
        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }
        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }
        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }
        public Criteria andLogiAddressIsNull() {
            addCriterion("logiAddress is null");
            return (Criteria) this;
        }
        public Criteria andLogiAddressIsNotNull() {
            addCriterion("logiAddress is not null");
            return (Criteria) this;
        }
        public Criteria andLogiAddressEqualTo(String value) {
            addCriterion("logiAddress =", value, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressNotEqualTo(String value) {
            addCriterion("logiAddress <>", value, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressGreaterThan(String value) {
            addCriterion("logiAddress >", value, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressGreaterThanOrEqualTo(String value) {
            addCriterion("logiAddress >=", value, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressLessThan(String value) {
            addCriterion("logiAddress <", value, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressLessThanOrEqualTo(String value) {
            addCriterion("logiAddress <=", value, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressLike(String value) {
            addCriterion("logiAddress like", value, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressNotLike(String value) {
            addCriterion("logiAddress not like", value, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressIn(List<String> values) {
            addCriterion("logiAddress in", values, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressNotIn(List<String> values) {
            addCriterion("logiAddress not in", values, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressBetween(String value1, String value2) {
            addCriterion("logiAddress between", value1, value2, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiAddressNotBetween(String value1, String value2) {
            addCriterion("logiAddress not between", value1, value2, "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiTellIsNull() {
            addCriterion("logiTell is null");
            return (Criteria) this;
        }
        public Criteria andLogiTellIsNotNull() {
            addCriterion("logiTell is not null");
            return (Criteria) this;
        }
        public Criteria andLogiTellEqualTo(String value) {
            addCriterion("logiTell =", value, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellNotEqualTo(String value) {
            addCriterion("logiTell <>", value, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellGreaterThan(String value) {
            addCriterion("logiTell >", value, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellGreaterThanOrEqualTo(String value) {
            addCriterion("logiTell >=", value, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellLessThan(String value) {
            addCriterion("logiTell <", value, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellLessThanOrEqualTo(String value) {
            addCriterion("logiTell <=", value, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellLike(String value) {
            addCriterion("logiTell like", value, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellNotLike(String value) {
            addCriterion("logiTell not like", value, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellIn(List<String> values) {
            addCriterion("logiTell in", values, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellNotIn(List<String> values) {
            addCriterion("logiTell not in", values, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellBetween(String value1, String value2) {
            addCriterion("logiTell between", value1, value2, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiTellNotBetween(String value1, String value2) {
            addCriterion("logiTell not between", value1, value2, "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteIsNull() {
            addCriterion("logiWebsite is null");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteIsNotNull() {
            addCriterion("logiWebsite is not null");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteEqualTo(String value) {
            addCriterion("logiWebsite =", value, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteNotEqualTo(String value) {
            addCriterion("logiWebsite <>", value, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteGreaterThan(String value) {
            addCriterion("logiWebsite >", value, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("logiWebsite >=", value, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteLessThan(String value) {
            addCriterion("logiWebsite <", value, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteLessThanOrEqualTo(String value) {
            addCriterion("logiWebsite <=", value, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteLike(String value) {
            addCriterion("logiWebsite like", value, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteNotLike(String value) {
            addCriterion("logiWebsite not like", value, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteIn(List<String> values) {
            addCriterion("logiWebsite in", values, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteNotIn(List<String> values) {
            addCriterion("logiWebsite not in", values, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteBetween(String value1, String value2) {
            addCriterion("logiWebsite between", value1, value2, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteNotBetween(String value1, String value2) {
            addCriterion("logiWebsite not between", value1, value2, "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }
        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }
        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
        public Criteria andIsDelIsNull() {
            addCriterion("isDel is null");
            return (Criteria) this;
        }
        public Criteria andIsDelIsNotNull() {
            addCriterion("isDel is not null");
            return (Criteria) this;
        }
        public Criteria andIsDelEqualTo(Byte value) {
            addCriterion("isDel =", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelNotEqualTo(Byte value) {
            addCriterion("isDel <>", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelGreaterThan(Byte value) {
            addCriterion("isDel >", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDel >=", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelLessThan(Byte value) {
            addCriterion("isDel <", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("isDel <=", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelIn(List<Byte> values) {
            addCriterion("isDel in", values, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelNotIn(List<Byte> values) {
            addCriterion("isDel not in", values, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelBetween(Byte value1, Byte value2) {
            addCriterion("isDel between", value1, value2, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("isDel not between", value1, value2, "isDel");
            return (Criteria) this;
        }
        public Criteria andCompanyCodeLikeInsensitive(String value) {
            addCriterion("upper(companyCode) like", value.toUpperCase(), "companyCode");
            return (Criteria) this;
        }
        public Criteria andLogiCompanyLikeInsensitive(String value) {
            addCriterion("upper(logiCompany) like", value.toUpperCase(), "logiCompany");
            return (Criteria) this;
        }
        public Criteria andContactsLikeInsensitive(String value) {
            addCriterion("upper(contacts) like", value.toUpperCase(), "contacts");
            return (Criteria) this;
        }
        public Criteria andLogiAddressLikeInsensitive(String value) {
            addCriterion("upper(logiAddress) like", value.toUpperCase(), "logiAddress");
            return (Criteria) this;
        }
        public Criteria andLogiTellLikeInsensitive(String value) {
            addCriterion("upper(logiTell) like", value.toUpperCase(), "logiTell");
            return (Criteria) this;
        }
        public Criteria andLogiWebsiteLikeInsensitive(String value) {
            addCriterion("upper(logiWebsite) like", value.toUpperCase(), "logiWebsite");
            return (Criteria) this;
        }
        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 物流信息表
     * 
     * @author 菠萝大象
     * @version 1.0 2017-01-18
     */
    public static class Criterion {

        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition() {
            return condition;
        }
        public Object getValue() {
            return value;
        }
        public Object getSecondValue() {
            return secondValue;
        }
        public boolean isNoValue() {
            return noValue;
        }
        public boolean isSingleValue() {
            return singleValue;
        }
        public boolean isBetweenValue() {
            return betweenValue;
        }
        public boolean isListValue() {
            return listValue;
        }
        public String getTypeHandler() {
            return typeHandler;
        }
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}