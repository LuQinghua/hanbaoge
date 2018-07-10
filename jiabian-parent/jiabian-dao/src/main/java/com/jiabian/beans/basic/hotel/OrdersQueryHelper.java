/*
 * OrdersQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-17 Created
 */
package com.jiabian.beans.basic.hotel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public OrdersQueryHelper() {
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
     * @version 1.0 2018-06-17
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
        public Criteria andHomeIdIsNull() {
            addCriterion("homeId is null");
            return (Criteria) this;
        }
        public Criteria andHomeIdIsNotNull() {
            addCriterion("homeId is not null");
            return (Criteria) this;
        }
        public Criteria andHomeIdEqualTo(Long value) {
            addCriterion("homeId =", value, "homeId");
            return (Criteria) this;
        }
        public Criteria andHomeIdNotEqualTo(Long value) {
            addCriterion("homeId <>", value, "homeId");
            return (Criteria) this;
        }
        public Criteria andHomeIdGreaterThan(Long value) {
            addCriterion("homeId >", value, "homeId");
            return (Criteria) this;
        }
        public Criteria andHomeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("homeId >=", value, "homeId");
            return (Criteria) this;
        }
        public Criteria andHomeIdLessThan(Long value) {
            addCriterion("homeId <", value, "homeId");
            return (Criteria) this;
        }
        public Criteria andHomeIdLessThanOrEqualTo(Long value) {
            addCriterion("homeId <=", value, "homeId");
            return (Criteria) this;
        }
        public Criteria andHomeIdIn(List<Long> values) {
            addCriterion("homeId in", values, "homeId");
            return (Criteria) this;
        }
        public Criteria andHomeIdNotIn(List<Long> values) {
            addCriterion("homeId not in", values, "homeId");
            return (Criteria) this;
        }
        public Criteria andHomeIdBetween(Long value1, Long value2) {
            addCriterion("homeId between", value1, value2, "homeId");
            return (Criteria) this;
        }
        public Criteria andHomeIdNotBetween(Long value1, Long value2) {
            addCriterion("homeId not between", value1, value2, "homeId");
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
        public Criteria andPaymentTimeIsNull() {
            addCriterion("paymentTime is null");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("paymentTime is not null");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("paymentTime =", value, "paymentTime");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("paymentTime <>", value, "paymentTime");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("paymentTime >", value, "paymentTime");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paymentTime >=", value, "paymentTime");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("paymentTime <", value, "paymentTime");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("paymentTime <=", value, "paymentTime");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("paymentTime in", values, "paymentTime");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("paymentTime not in", values, "paymentTime");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("paymentTime between", value1, value2, "paymentTime");
            return (Criteria) this;
        }
        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("paymentTime not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }
        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }
        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }
        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }
        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }
        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }
        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }
        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }
        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }
        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }
        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }
        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }
        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }
        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }
        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }
        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
        public Criteria andRefundIsNull() {
            addCriterion("refund is null");
            return (Criteria) this;
        }
        public Criteria andRefundIsNotNull() {
            addCriterion("refund is not null");
            return (Criteria) this;
        }
        public Criteria andRefundEqualTo(Byte value) {
            addCriterion("refund =", value, "refund");
            return (Criteria) this;
        }
        public Criteria andRefundNotEqualTo(Byte value) {
            addCriterion("refund <>", value, "refund");
            return (Criteria) this;
        }
        public Criteria andRefundGreaterThan(Byte value) {
            addCriterion("refund >", value, "refund");
            return (Criteria) this;
        }
        public Criteria andRefundGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund >=", value, "refund");
            return (Criteria) this;
        }
        public Criteria andRefundLessThan(Byte value) {
            addCriterion("refund <", value, "refund");
            return (Criteria) this;
        }
        public Criteria andRefundLessThanOrEqualTo(Byte value) {
            addCriterion("refund <=", value, "refund");
            return (Criteria) this;
        }
        public Criteria andRefundIn(List<Byte> values) {
            addCriterion("refund in", values, "refund");
            return (Criteria) this;
        }
        public Criteria andRefundNotIn(List<Byte> values) {
            addCriterion("refund not in", values, "refund");
            return (Criteria) this;
        }
        public Criteria andRefundBetween(Byte value1, Byte value2) {
            addCriterion("refund between", value1, value2, "refund");
            return (Criteria) this;
        }
        public Criteria andRefundNotBetween(Byte value1, Byte value2) {
            addCriterion("refund not between", value1, value2, "refund");
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
        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }
        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }
        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }
        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }
        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }
        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }
        public Criteria andDaysLessThan(Integer value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }
        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }
        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }
        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }
        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }
        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }
        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }
        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }
        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }
        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }
        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }
        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }
        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }
        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }
        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }
        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }
        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }
        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }
        public Criteria andOrderCodeLikeInsensitive(String value) {
            addCriterion("upper(orderCode) like", value.toUpperCase(), "orderCode");
            return (Criteria) this;
        }
        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }
        public Criteria andTelephoneLikeInsensitive(String value) {
            addCriterion("upper(telephone) like", value.toUpperCase(), "telephone");
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
     * @version 1.0 2018-06-17
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