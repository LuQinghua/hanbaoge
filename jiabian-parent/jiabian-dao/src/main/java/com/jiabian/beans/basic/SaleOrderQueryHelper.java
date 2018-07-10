/*
 * SaleOrderQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-17 Created
 */
package com.jiabian.beans.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleOrderQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SaleOrderQueryHelper() {
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
     * @version 1.0 2017-01-17
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
        public Criteria andOrderCodeIsNull() {
            addCriterion("orderCode is null");
            return (Criteria) this;
        }
        public Criteria andOrderCodeIsNotNull() {
            addCriterion("orderCode is not null");
            return (Criteria) this;
        }
        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("orderCode =", value, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("orderCode <>", value, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("orderCode >", value, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("orderCode >=", value, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("orderCode <", value, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("orderCode <=", value, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeLike(String value) {
            addCriterion("orderCode like", value, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("orderCode not like", value, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("orderCode in", values, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("orderCode not in", values, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("orderCode between", value1, value2, "orderCode");
            return (Criteria) this;
        }
        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("orderCode not between", value1, value2, "orderCode");
            return (Criteria) this;
        }
        public Criteria andSuserIdIsNull() {
            addCriterion("suserId is null");
            return (Criteria) this;
        }
        public Criteria andSuserIdIsNotNull() {
            addCriterion("suserId is not null");
            return (Criteria) this;
        }
        public Criteria andSuserIdEqualTo(Long value) {
            addCriterion("suserId =", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdNotEqualTo(Long value) {
            addCriterion("suserId <>", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdGreaterThan(Long value) {
            addCriterion("suserId >", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("suserId >=", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdLessThan(Long value) {
            addCriterion("suserId <", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdLessThanOrEqualTo(Long value) {
            addCriterion("suserId <=", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdIn(List<Long> values) {
            addCriterion("suserId in", values, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdNotIn(List<Long> values) {
            addCriterion("suserId not in", values, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdBetween(Long value1, Long value2) {
            addCriterion("suserId between", value1, value2, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdNotBetween(Long value1, Long value2) {
            addCriterion("suserId not between", value1, value2, "suserId");
            return (Criteria) this;
        }
        public Criteria andPayableTotalIsNull() {
            addCriterion("payableTotal is null");
            return (Criteria) this;
        }
        public Criteria andPayableTotalIsNotNull() {
            addCriterion("payableTotal is not null");
            return (Criteria) this;
        }
        public Criteria andPayableTotalEqualTo(BigDecimal value) {
            addCriterion("payableTotal =", value, "payableTotal");
            return (Criteria) this;
        }
        public Criteria andPayableTotalNotEqualTo(BigDecimal value) {
            addCriterion("payableTotal <>", value, "payableTotal");
            return (Criteria) this;
        }
        public Criteria andPayableTotalGreaterThan(BigDecimal value) {
            addCriterion("payableTotal >", value, "payableTotal");
            return (Criteria) this;
        }
        public Criteria andPayableTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payableTotal >=", value, "payableTotal");
            return (Criteria) this;
        }
        public Criteria andPayableTotalLessThan(BigDecimal value) {
            addCriterion("payableTotal <", value, "payableTotal");
            return (Criteria) this;
        }
        public Criteria andPayableTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payableTotal <=", value, "payableTotal");
            return (Criteria) this;
        }
        public Criteria andPayableTotalIn(List<BigDecimal> values) {
            addCriterion("payableTotal in", values, "payableTotal");
            return (Criteria) this;
        }
        public Criteria andPayableTotalNotIn(List<BigDecimal> values) {
            addCriterion("payableTotal not in", values, "payableTotal");
            return (Criteria) this;
        }
        public Criteria andPayableTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payableTotal between", value1, value2, "payableTotal");
            return (Criteria) this;
        }
        public Criteria andPayableTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payableTotal not between", value1, value2, "payableTotal");
            return (Criteria) this;
        }
        public Criteria andPaidTotalIsNull() {
            addCriterion("paidTotal is null");
            return (Criteria) this;
        }
        public Criteria andPaidTotalIsNotNull() {
            addCriterion("paidTotal is not null");
            return (Criteria) this;
        }
        public Criteria andPaidTotalEqualTo(BigDecimal value) {
            addCriterion("paidTotal =", value, "paidTotal");
            return (Criteria) this;
        }
        public Criteria andPaidTotalNotEqualTo(BigDecimal value) {
            addCriterion("paidTotal <>", value, "paidTotal");
            return (Criteria) this;
        }
        public Criteria andPaidTotalGreaterThan(BigDecimal value) {
            addCriterion("paidTotal >", value, "paidTotal");
            return (Criteria) this;
        }
        public Criteria andPaidTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paidTotal >=", value, "paidTotal");
            return (Criteria) this;
        }
        public Criteria andPaidTotalLessThan(BigDecimal value) {
            addCriterion("paidTotal <", value, "paidTotal");
            return (Criteria) this;
        }
        public Criteria andPaidTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paidTotal <=", value, "paidTotal");
            return (Criteria) this;
        }
        public Criteria andPaidTotalIn(List<BigDecimal> values) {
            addCriterion("paidTotal in", values, "paidTotal");
            return (Criteria) this;
        }
        public Criteria andPaidTotalNotIn(List<BigDecimal> values) {
            addCriterion("paidTotal not in", values, "paidTotal");
            return (Criteria) this;
        }
        public Criteria andPaidTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paidTotal between", value1, value2, "paidTotal");
            return (Criteria) this;
        }
        public Criteria andPaidTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paidTotal not between", value1, value2, "paidTotal");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeIsNull() {
            addCriterion("deliveryTime is null");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("deliveryTime is not null");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("deliveryTime =", value, "deliveryTime");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("deliveryTime <>", value, "deliveryTime");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("deliveryTime >", value, "deliveryTime");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliveryTime >=", value, "deliveryTime");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("deliveryTime <", value, "deliveryTime");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("deliveryTime <=", value, "deliveryTime");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("deliveryTime in", values, "deliveryTime");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("deliveryTime not in", values, "deliveryTime");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("deliveryTime between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }
        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("deliveryTime not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }
        public Criteria andOrderTimeIsNull() {
            addCriterion("orderTime is null");
            return (Criteria) this;
        }
        public Criteria andOrderTimeIsNotNull() {
            addCriterion("orderTime is not null");
            return (Criteria) this;
        }
        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("orderTime =", value, "orderTime");
            return (Criteria) this;
        }
        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("orderTime <>", value, "orderTime");
            return (Criteria) this;
        }
        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("orderTime >", value, "orderTime");
            return (Criteria) this;
        }
        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderTime >=", value, "orderTime");
            return (Criteria) this;
        }
        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("orderTime <", value, "orderTime");
            return (Criteria) this;
        }
        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("orderTime <=", value, "orderTime");
            return (Criteria) this;
        }
        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("orderTime in", values, "orderTime");
            return (Criteria) this;
        }
        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("orderTime not in", values, "orderTime");
            return (Criteria) this;
        }
        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("orderTime between", value1, value2, "orderTime");
            return (Criteria) this;
        }
        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("orderTime not between", value1, value2, "orderTime");
            return (Criteria) this;
        }
        public Criteria andReceiveIdIsNull() {
            addCriterion("receiveId is null");
            return (Criteria) this;
        }
        public Criteria andReceiveIdIsNotNull() {
            addCriterion("receiveId is not null");
            return (Criteria) this;
        }
        public Criteria andReceiveIdEqualTo(Long value) {
            addCriterion("receiveId =", value, "receiveId");
            return (Criteria) this;
        }
        public Criteria andReceiveIdNotEqualTo(Long value) {
            addCriterion("receiveId <>", value, "receiveId");
            return (Criteria) this;
        }
        public Criteria andReceiveIdGreaterThan(Long value) {
            addCriterion("receiveId >", value, "receiveId");
            return (Criteria) this;
        }
        public Criteria andReceiveIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receiveId >=", value, "receiveId");
            return (Criteria) this;
        }
        public Criteria andReceiveIdLessThan(Long value) {
            addCriterion("receiveId <", value, "receiveId");
            return (Criteria) this;
        }
        public Criteria andReceiveIdLessThanOrEqualTo(Long value) {
            addCriterion("receiveId <=", value, "receiveId");
            return (Criteria) this;
        }
        public Criteria andReceiveIdIn(List<Long> values) {
            addCriterion("receiveId in", values, "receiveId");
            return (Criteria) this;
        }
        public Criteria andReceiveIdNotIn(List<Long> values) {
            addCriterion("receiveId not in", values, "receiveId");
            return (Criteria) this;
        }
        public Criteria andReceiveIdBetween(Long value1, Long value2) {
            addCriterion("receiveId between", value1, value2, "receiveId");
            return (Criteria) this;
        }
        public Criteria andReceiveIdNotBetween(Long value1, Long value2) {
            addCriterion("receiveId not between", value1, value2, "receiveId");
            return (Criteria) this;
        }
        public Criteria andOrderStatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }
        public Criteria andOrderStatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }
        public Criteria andOrderStatusEqualTo(Byte value) {
            addCriterion("orderStatus =", value, "orderStatus");
            return (Criteria) this;
        }
        public Criteria andOrderStatusNotEqualTo(Byte value) {
            addCriterion("orderStatus <>", value, "orderStatus");
            return (Criteria) this;
        }
        public Criteria andOrderStatusGreaterThan(Byte value) {
            addCriterion("orderStatus >", value, "orderStatus");
            return (Criteria) this;
        }
        public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("orderStatus >=", value, "orderStatus");
            return (Criteria) this;
        }
        public Criteria andOrderStatusLessThan(Byte value) {
            addCriterion("orderStatus <", value, "orderStatus");
            return (Criteria) this;
        }
        public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("orderStatus <=", value, "orderStatus");
            return (Criteria) this;
        }
        public Criteria andOrderStatusIn(List<Byte> values) {
            addCriterion("orderStatus in", values, "orderStatus");
            return (Criteria) this;
        }
        public Criteria andOrderStatusNotIn(List<Byte> values) {
            addCriterion("orderStatus not in", values, "orderStatus");
            return (Criteria) this;
        }
        public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
            addCriterion("orderStatus between", value1, value2, "orderStatus");
            return (Criteria) this;
        }
        public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("orderStatus not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }
        public Criteria andOrderCodeLikeInsensitive(String value) {
            addCriterion("upper(orderCode) like", value.toUpperCase(), "orderCode");
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
     * @version 1.0 2017-01-17
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