/*
 * UserCouponsQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-31 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCouponsQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public UserCouponsQueryHelper() {
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
     * @version 1.0 2016-10-31
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
        public Criteria andCouponsIdIsNull() {
            addCriterion("couponsId is null");
            return (Criteria) this;
        }
        public Criteria andCouponsIdIsNotNull() {
            addCriterion("couponsId is not null");
            return (Criteria) this;
        }
        public Criteria andCouponsIdEqualTo(Long value) {
            addCriterion("couponsId =", value, "couponsId");
            return (Criteria) this;
        }
        public Criteria andCouponsIdNotEqualTo(Long value) {
            addCriterion("couponsId <>", value, "couponsId");
            return (Criteria) this;
        }
        public Criteria andCouponsIdGreaterThan(Long value) {
            addCriterion("couponsId >", value, "couponsId");
            return (Criteria) this;
        }
        public Criteria andCouponsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("couponsId >=", value, "couponsId");
            return (Criteria) this;
        }
        public Criteria andCouponsIdLessThan(Long value) {
            addCriterion("couponsId <", value, "couponsId");
            return (Criteria) this;
        }
        public Criteria andCouponsIdLessThanOrEqualTo(Long value) {
            addCriterion("couponsId <=", value, "couponsId");
            return (Criteria) this;
        }
        public Criteria andCouponsIdIn(List<Long> values) {
            addCriterion("couponsId in", values, "couponsId");
            return (Criteria) this;
        }
        public Criteria andCouponsIdNotIn(List<Long> values) {
            addCriterion("couponsId not in", values, "couponsId");
            return (Criteria) this;
        }
        public Criteria andCouponsIdBetween(Long value1, Long value2) {
            addCriterion("couponsId between", value1, value2, "couponsId");
            return (Criteria) this;
        }
        public Criteria andCouponsIdNotBetween(Long value1, Long value2) {
            addCriterion("couponsId not between", value1, value2, "couponsId");
            return (Criteria) this;
        }
        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }
        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }
        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdLessThan(Long value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusIsNull() {
            addCriterion("couponsStatus is null");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusIsNotNull() {
            addCriterion("couponsStatus is not null");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusEqualTo(Byte value) {
            addCriterion("couponsStatus =", value, "couponsStatus");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusNotEqualTo(Byte value) {
            addCriterion("couponsStatus <>", value, "couponsStatus");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusGreaterThan(Byte value) {
            addCriterion("couponsStatus >", value, "couponsStatus");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("couponsStatus >=", value, "couponsStatus");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusLessThan(Byte value) {
            addCriterion("couponsStatus <", value, "couponsStatus");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("couponsStatus <=", value, "couponsStatus");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusIn(List<Byte> values) {
            addCriterion("couponsStatus in", values, "couponsStatus");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusNotIn(List<Byte> values) {
            addCriterion("couponsStatus not in", values, "couponsStatus");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusBetween(Byte value1, Byte value2) {
            addCriterion("couponsStatus between", value1, value2, "couponsStatus");
            return (Criteria) this;
        }
        public Criteria andCouponsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("couponsStatus not between", value1, value2, "couponsStatus");
            return (Criteria) this;
        }
        public Criteria andGetTimeIsNull() {
            addCriterion("getTime is null");
            return (Criteria) this;
        }
        public Criteria andGetTimeIsNotNull() {
            addCriterion("getTime is not null");
            return (Criteria) this;
        }
        public Criteria andGetTimeEqualTo(Date value) {
            addCriterion("getTime =", value, "getTime");
            return (Criteria) this;
        }
        public Criteria andGetTimeNotEqualTo(Date value) {
            addCriterion("getTime <>", value, "getTime");
            return (Criteria) this;
        }
        public Criteria andGetTimeGreaterThan(Date value) {
            addCriterion("getTime >", value, "getTime");
            return (Criteria) this;
        }
        public Criteria andGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("getTime >=", value, "getTime");
            return (Criteria) this;
        }
        public Criteria andGetTimeLessThan(Date value) {
            addCriterion("getTime <", value, "getTime");
            return (Criteria) this;
        }
        public Criteria andGetTimeLessThanOrEqualTo(Date value) {
            addCriterion("getTime <=", value, "getTime");
            return (Criteria) this;
        }
        public Criteria andGetTimeIn(List<Date> values) {
            addCriterion("getTime in", values, "getTime");
            return (Criteria) this;
        }
        public Criteria andGetTimeNotIn(List<Date> values) {
            addCriterion("getTime not in", values, "getTime");
            return (Criteria) this;
        }
        public Criteria andGetTimeBetween(Date value1, Date value2) {
            addCriterion("getTime between", value1, value2, "getTime");
            return (Criteria) this;
        }
        public Criteria andGetTimeNotBetween(Date value1, Date value2) {
            addCriterion("getTime not between", value1, value2, "getTime");
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
     * @version 1.0 2016-10-31
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