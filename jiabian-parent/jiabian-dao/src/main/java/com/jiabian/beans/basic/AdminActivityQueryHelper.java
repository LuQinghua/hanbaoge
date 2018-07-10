/*
 * AdminActivityQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-06 Created
 */
package com.jiabian.beans.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminActivityQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public AdminActivityQueryHelper() {
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
     * 
     * 
     * @author 菠萝大象
     * @version 1.0 2016-12-06
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
        public Criteria andProdNameIsNull() {
            addCriterion("prodName is null");
            return (Criteria) this;
        }
        public Criteria andProdNameIsNotNull() {
            addCriterion("prodName is not null");
            return (Criteria) this;
        }
        public Criteria andProdNameEqualTo(String value) {
            addCriterion("prodName =", value, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("prodName <>", value, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("prodName >", value, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("prodName >=", value, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameLessThan(String value) {
            addCriterion("prodName <", value, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("prodName <=", value, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameLike(String value) {
            addCriterion("prodName like", value, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameNotLike(String value) {
            addCriterion("prodName not like", value, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameIn(List<String> values) {
            addCriterion("prodName in", values, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("prodName not in", values, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("prodName between", value1, value2, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("prodName not between", value1, value2, "prodName");
            return (Criteria) this;
        }
        public Criteria andProdImgIsNull() {
            addCriterion("prodImg is null");
            return (Criteria) this;
        }
        public Criteria andProdImgIsNotNull() {
            addCriterion("prodImg is not null");
            return (Criteria) this;
        }
        public Criteria andProdImgEqualTo(String value) {
            addCriterion("prodImg =", value, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgNotEqualTo(String value) {
            addCriterion("prodImg <>", value, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgGreaterThan(String value) {
            addCriterion("prodImg >", value, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgGreaterThanOrEqualTo(String value) {
            addCriterion("prodImg >=", value, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgLessThan(String value) {
            addCriterion("prodImg <", value, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgLessThanOrEqualTo(String value) {
            addCriterion("prodImg <=", value, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgLike(String value) {
            addCriterion("prodImg like", value, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgNotLike(String value) {
            addCriterion("prodImg not like", value, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgIn(List<String> values) {
            addCriterion("prodImg in", values, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgNotIn(List<String> values) {
            addCriterion("prodImg not in", values, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgBetween(String value1, String value2) {
            addCriterion("prodImg between", value1, value2, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdImgNotBetween(String value1, String value2) {
            addCriterion("prodImg not between", value1, value2, "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdTextIsNull() {
            addCriterion("prodText is null");
            return (Criteria) this;
        }
        public Criteria andProdTextIsNotNull() {
            addCriterion("prodText is not null");
            return (Criteria) this;
        }
        public Criteria andProdTextEqualTo(String value) {
            addCriterion("prodText =", value, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextNotEqualTo(String value) {
            addCriterion("prodText <>", value, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextGreaterThan(String value) {
            addCriterion("prodText >", value, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextGreaterThanOrEqualTo(String value) {
            addCriterion("prodText >=", value, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextLessThan(String value) {
            addCriterion("prodText <", value, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextLessThanOrEqualTo(String value) {
            addCriterion("prodText <=", value, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextLike(String value) {
            addCriterion("prodText like", value, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextNotLike(String value) {
            addCriterion("prodText not like", value, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextIn(List<String> values) {
            addCriterion("prodText in", values, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextNotIn(List<String> values) {
            addCriterion("prodText not in", values, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextBetween(String value1, String value2) {
            addCriterion("prodText between", value1, value2, "prodText");
            return (Criteria) this;
        }
        public Criteria andProdTextNotBetween(String value1, String value2) {
            addCriterion("prodText not between", value1, value2, "prodText");
            return (Criteria) this;
        }
        public Criteria andClassifyIsNull() {
            addCriterion("classify is null");
            return (Criteria) this;
        }
        public Criteria andClassifyIsNotNull() {
            addCriterion("classify is not null");
            return (Criteria) this;
        }
        public Criteria andClassifyEqualTo(String value) {
            addCriterion("classify =", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyNotEqualTo(String value) {
            addCriterion("classify <>", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyGreaterThan(String value) {
            addCriterion("classify >", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("classify >=", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyLessThan(String value) {
            addCriterion("classify <", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyLessThanOrEqualTo(String value) {
            addCriterion("classify <=", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyLike(String value) {
            addCriterion("classify like", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyNotLike(String value) {
            addCriterion("classify not like", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyIn(List<String> values) {
            addCriterion("classify in", values, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyNotIn(List<String> values) {
            addCriterion("classify not in", values, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyBetween(String value1, String value2) {
            addCriterion("classify between", value1, value2, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyNotBetween(String value1, String value2) {
            addCriterion("classify not between", value1, value2, "classify");
            return (Criteria) this;
        }
        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }
        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }
        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }
        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }
        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }
        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }
        public Criteria andCreatTimeIsNull() {
            addCriterion("creatTime is null");
            return (Criteria) this;
        }
        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creatTime is not null");
            return (Criteria) this;
        }
        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creatTime =", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creatTime <>", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creatTime >", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatTime >=", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creatTime <", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creatTime <=", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creatTime in", values, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creatTime not in", values, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creatTime between", value1, value2, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creatTime not between", value1, value2, "creatTime");
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
        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }
        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }
        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }
        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }
        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }
        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
        public Criteria andStartTimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }
        public Criteria andStartTimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }
        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("startTime =", value, "startTime");
            return (Criteria) this;
        }
        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "startTime");
            return (Criteria) this;
        }
        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "startTime");
            return (Criteria) this;
        }
        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "startTime");
            return (Criteria) this;
        }
        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("startTime <", value, "startTime");
            return (Criteria) this;
        }
        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "startTime");
            return (Criteria) this;
        }
        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("startTime in", values, "startTime");
            return (Criteria) this;
        }
        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "startTime");
            return (Criteria) this;
        }
        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "startTime");
            return (Criteria) this;
        }
        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "startTime");
            return (Criteria) this;
        }
        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }
        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }
        public Criteria andRegionEqualTo(Byte value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionNotEqualTo(Byte value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionGreaterThan(Byte value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionGreaterThanOrEqualTo(Byte value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionLessThan(Byte value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionLessThanOrEqualTo(Byte value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionIn(List<Byte> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }
        public Criteria andRegionNotIn(List<Byte> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }
        public Criteria andRegionBetween(Byte value1, Byte value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }
        public Criteria andRegionNotBetween(Byte value1, Byte value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }
        public Criteria andProdNameLikeInsensitive(String value) {
            addCriterion("upper(prodName) like", value.toUpperCase(), "prodName");
            return (Criteria) this;
        }
        public Criteria andProdImgLikeInsensitive(String value) {
            addCriterion("upper(prodImg) like", value.toUpperCase(), "prodImg");
            return (Criteria) this;
        }
        public Criteria andProdTextLikeInsensitive(String value) {
            addCriterion("upper(prodText) like", value.toUpperCase(), "prodText");
            return (Criteria) this;
        }
        public Criteria andClassifyLikeInsensitive(String value) {
            addCriterion("upper(classify) like", value.toUpperCase(), "classify");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author 菠萝大象
     * @version 1.0 2016-12-06
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