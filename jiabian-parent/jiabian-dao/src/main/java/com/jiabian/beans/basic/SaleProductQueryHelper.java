/*
 * SaleProductQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-27 Created
 */
package com.jiabian.beans.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleProductQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SaleProductQueryHelper() {
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
     * @version 1.0 2016-12-27
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
        public Criteria andProdPriceIsNull() {
            addCriterion("prodPrice is null");
            return (Criteria) this;
        }
        public Criteria andProdPriceIsNotNull() {
            addCriterion("prodPrice is not null");
            return (Criteria) this;
        }
        public Criteria andProdPriceEqualTo(BigDecimal value) {
            addCriterion("prodPrice =", value, "prodPrice");
            return (Criteria) this;
        }
        public Criteria andProdPriceNotEqualTo(BigDecimal value) {
            addCriterion("prodPrice <>", value, "prodPrice");
            return (Criteria) this;
        }
        public Criteria andProdPriceGreaterThan(BigDecimal value) {
            addCriterion("prodPrice >", value, "prodPrice");
            return (Criteria) this;
        }
        public Criteria andProdPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prodPrice >=", value, "prodPrice");
            return (Criteria) this;
        }
        public Criteria andProdPriceLessThan(BigDecimal value) {
            addCriterion("prodPrice <", value, "prodPrice");
            return (Criteria) this;
        }
        public Criteria andProdPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prodPrice <=", value, "prodPrice");
            return (Criteria) this;
        }
        public Criteria andProdPriceIn(List<BigDecimal> values) {
            addCriterion("prodPrice in", values, "prodPrice");
            return (Criteria) this;
        }
        public Criteria andProdPriceNotIn(List<BigDecimal> values) {
            addCriterion("prodPrice not in", values, "prodPrice");
            return (Criteria) this;
        }
        public Criteria andProdPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prodPrice between", value1, value2, "prodPrice");
            return (Criteria) this;
        }
        public Criteria andProdPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prodPrice not between", value1, value2, "prodPrice");
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
        public Criteria andUpdateUserIdIsNull() {
            addCriterion("updateUserId is null");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("updateUserId is not null");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("updateUserId =", value, "updateUserId");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("updateUserId <>", value, "updateUserId");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("updateUserId >", value, "updateUserId");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("updateUserId >=", value, "updateUserId");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("updateUserId <", value, "updateUserId");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("updateUserId <=", value, "updateUserId");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("updateUserId in", values, "updateUserId");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("updateUserId not in", values, "updateUserId");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("updateUserId between", value1, value2, "updateUserId");
            return (Criteria) this;
        }
        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("updateUserId not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }
        public Criteria andProdDNumIsNull() {
            addCriterion("prodDNum is null");
            return (Criteria) this;
        }
        public Criteria andProdDNumIsNotNull() {
            addCriterion("prodDNum is not null");
            return (Criteria) this;
        }
        public Criteria andProdDNumEqualTo(Integer value) {
            addCriterion("prodDNum =", value, "prodDNum");
            return (Criteria) this;
        }
        public Criteria andProdDNumNotEqualTo(Integer value) {
            addCriterion("prodDNum <>", value, "prodDNum");
            return (Criteria) this;
        }
        public Criteria andProdDNumGreaterThan(Integer value) {
            addCriterion("prodDNum >", value, "prodDNum");
            return (Criteria) this;
        }
        public Criteria andProdDNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("prodDNum >=", value, "prodDNum");
            return (Criteria) this;
        }
        public Criteria andProdDNumLessThan(Integer value) {
            addCriterion("prodDNum <", value, "prodDNum");
            return (Criteria) this;
        }
        public Criteria andProdDNumLessThanOrEqualTo(Integer value) {
            addCriterion("prodDNum <=", value, "prodDNum");
            return (Criteria) this;
        }
        public Criteria andProdDNumIn(List<Integer> values) {
            addCriterion("prodDNum in", values, "prodDNum");
            return (Criteria) this;
        }
        public Criteria andProdDNumNotIn(List<Integer> values) {
            addCriterion("prodDNum not in", values, "prodDNum");
            return (Criteria) this;
        }
        public Criteria andProdDNumBetween(Integer value1, Integer value2) {
            addCriterion("prodDNum between", value1, value2, "prodDNum");
            return (Criteria) this;
        }
        public Criteria andProdDNumNotBetween(Integer value1, Integer value2) {
            addCriterion("prodDNum not between", value1, value2, "prodDNum");
            return (Criteria) this;
        }
        public Criteria andProfileIsNull() {
            addCriterion("profile is null");
            return (Criteria) this;
        }
        public Criteria andProfileIsNotNull() {
            addCriterion("profile is not null");
            return (Criteria) this;
        }
        public Criteria andProfileEqualTo(String value) {
            addCriterion("profile =", value, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileNotEqualTo(String value) {
            addCriterion("profile <>", value, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileGreaterThan(String value) {
            addCriterion("profile >", value, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileGreaterThanOrEqualTo(String value) {
            addCriterion("profile >=", value, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileLessThan(String value) {
            addCriterion("profile <", value, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileLessThanOrEqualTo(String value) {
            addCriterion("profile <=", value, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileLike(String value) {
            addCriterion("profile like", value, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileNotLike(String value) {
            addCriterion("profile not like", value, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileIn(List<String> values) {
            addCriterion("profile in", values, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileNotIn(List<String> values) {
            addCriterion("profile not in", values, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileBetween(String value1, String value2) {
            addCriterion("profile between", value1, value2, "profile");
            return (Criteria) this;
        }
        public Criteria andProfileNotBetween(String value1, String value2) {
            addCriterion("profile not between", value1, value2, "profile");
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
        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("isDel =", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("isDel <>", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("isDel >", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDel >=", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("isDel <", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("isDel <=", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("isDel in", values, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("isDel not in", values, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("isDel between", value1, value2, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("isDel not between", value1, value2, "isDel");
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
        public Criteria andProfileLikeInsensitive(String value) {
            addCriterion("upper(profile) like", value.toUpperCase(), "profile");
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
     * @version 1.0 2016-12-27
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