/*
 * SysReturnMoneyQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-20 Created
 */
package com.jiabian.beans.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysReturnMoneyQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SysReturnMoneyQueryHelper() {
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
     * @version 1.0 2017-01-20
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
        public Criteria andReturnMoneyIsNull() {
            addCriterion("returnMoney is null");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyIsNotNull() {
            addCriterion("returnMoney is not null");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyEqualTo(BigDecimal value) {
            addCriterion("returnMoney =", value, "returnMoney");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyNotEqualTo(BigDecimal value) {
            addCriterion("returnMoney <>", value, "returnMoney");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyGreaterThan(BigDecimal value) {
            addCriterion("returnMoney >", value, "returnMoney");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("returnMoney >=", value, "returnMoney");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyLessThan(BigDecimal value) {
            addCriterion("returnMoney <", value, "returnMoney");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("returnMoney <=", value, "returnMoney");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyIn(List<BigDecimal> values) {
            addCriterion("returnMoney in", values, "returnMoney");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyNotIn(List<BigDecimal> values) {
            addCriterion("returnMoney not in", values, "returnMoney");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("returnMoney between", value1, value2, "returnMoney");
            return (Criteria) this;
        }
        public Criteria andReturnMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("returnMoney not between", value1, value2, "returnMoney");
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
        public Criteria andBelongPlatformIsNull() {
            addCriterion("belongPlatform is null");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformIsNotNull() {
            addCriterion("belongPlatform is not null");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformEqualTo(Byte value) {
            addCriterion("belongPlatform =", value, "belongPlatform");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformNotEqualTo(Byte value) {
            addCriterion("belongPlatform <>", value, "belongPlatform");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformGreaterThan(Byte value) {
            addCriterion("belongPlatform >", value, "belongPlatform");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformGreaterThanOrEqualTo(Byte value) {
            addCriterion("belongPlatform >=", value, "belongPlatform");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformLessThan(Byte value) {
            addCriterion("belongPlatform <", value, "belongPlatform");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformLessThanOrEqualTo(Byte value) {
            addCriterion("belongPlatform <=", value, "belongPlatform");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformIn(List<Byte> values) {
            addCriterion("belongPlatform in", values, "belongPlatform");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformNotIn(List<Byte> values) {
            addCriterion("belongPlatform not in", values, "belongPlatform");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformBetween(Byte value1, Byte value2) {
            addCriterion("belongPlatform between", value1, value2, "belongPlatform");
            return (Criteria) this;
        }
        public Criteria andBelongPlatformNotBetween(Byte value1, Byte value2) {
            addCriterion("belongPlatform not between", value1, value2, "belongPlatform");
            return (Criteria) this;
        }
        public Criteria andPayWayIsNull() {
            addCriterion("payWay is null");
            return (Criteria) this;
        }
        public Criteria andPayWayIsNotNull() {
            addCriterion("payWay is not null");
            return (Criteria) this;
        }
        public Criteria andPayWayEqualTo(Byte value) {
            addCriterion("payWay =", value, "payWay");
            return (Criteria) this;
        }
        public Criteria andPayWayNotEqualTo(Byte value) {
            addCriterion("payWay <>", value, "payWay");
            return (Criteria) this;
        }
        public Criteria andPayWayGreaterThan(Byte value) {
            addCriterion("payWay >", value, "payWay");
            return (Criteria) this;
        }
        public Criteria andPayWayGreaterThanOrEqualTo(Byte value) {
            addCriterion("payWay >=", value, "payWay");
            return (Criteria) this;
        }
        public Criteria andPayWayLessThan(Byte value) {
            addCriterion("payWay <", value, "payWay");
            return (Criteria) this;
        }
        public Criteria andPayWayLessThanOrEqualTo(Byte value) {
            addCriterion("payWay <=", value, "payWay");
            return (Criteria) this;
        }
        public Criteria andPayWayIn(List<Byte> values) {
            addCriterion("payWay in", values, "payWay");
            return (Criteria) this;
        }
        public Criteria andPayWayNotIn(List<Byte> values) {
            addCriterion("payWay not in", values, "payWay");
            return (Criteria) this;
        }
        public Criteria andPayWayBetween(Byte value1, Byte value2) {
            addCriterion("payWay between", value1, value2, "payWay");
            return (Criteria) this;
        }
        public Criteria andPayWayNotBetween(Byte value1, Byte value2) {
            addCriterion("payWay not between", value1, value2, "payWay");
            return (Criteria) this;
        }
        public Criteria andPayAccountIsNull() {
            addCriterion("payAccount is null");
            return (Criteria) this;
        }
        public Criteria andPayAccountIsNotNull() {
            addCriterion("payAccount is not null");
            return (Criteria) this;
        }
        public Criteria andPayAccountEqualTo(String value) {
            addCriterion("payAccount =", value, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountNotEqualTo(String value) {
            addCriterion("payAccount <>", value, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountGreaterThan(String value) {
            addCriterion("payAccount >", value, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("payAccount >=", value, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountLessThan(String value) {
            addCriterion("payAccount <", value, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountLessThanOrEqualTo(String value) {
            addCriterion("payAccount <=", value, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountLike(String value) {
            addCriterion("payAccount like", value, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountNotLike(String value) {
            addCriterion("payAccount not like", value, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountIn(List<String> values) {
            addCriterion("payAccount in", values, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountNotIn(List<String> values) {
            addCriterion("payAccount not in", values, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountBetween(String value1, String value2) {
            addCriterion("payAccount between", value1, value2, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayAccountNotBetween(String value1, String value2) {
            addCriterion("payAccount not between", value1, value2, "payAccount");
            return (Criteria) this;
        }
        public Criteria andPayTimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }
        public Criteria andPayTimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }
        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("payTime =", value, "payTime");
            return (Criteria) this;
        }
        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "payTime");
            return (Criteria) this;
        }
        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "payTime");
            return (Criteria) this;
        }
        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "payTime");
            return (Criteria) this;
        }
        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("payTime <", value, "payTime");
            return (Criteria) this;
        }
        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "payTime");
            return (Criteria) this;
        }
        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("payTime in", values, "payTime");
            return (Criteria) this;
        }
        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "payTime");
            return (Criteria) this;
        }
        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "payTime");
            return (Criteria) this;
        }
        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "payTime");
            return (Criteria) this;
        }
        public Criteria andReturnStatusIsNull() {
            addCriterion("returnStatus is null");
            return (Criteria) this;
        }
        public Criteria andReturnStatusIsNotNull() {
            addCriterion("returnStatus is not null");
            return (Criteria) this;
        }
        public Criteria andReturnStatusEqualTo(Byte value) {
            addCriterion("returnStatus =", value, "returnStatus");
            return (Criteria) this;
        }
        public Criteria andReturnStatusNotEqualTo(Byte value) {
            addCriterion("returnStatus <>", value, "returnStatus");
            return (Criteria) this;
        }
        public Criteria andReturnStatusGreaterThan(Byte value) {
            addCriterion("returnStatus >", value, "returnStatus");
            return (Criteria) this;
        }
        public Criteria andReturnStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("returnStatus >=", value, "returnStatus");
            return (Criteria) this;
        }
        public Criteria andReturnStatusLessThan(Byte value) {
            addCriterion("returnStatus <", value, "returnStatus");
            return (Criteria) this;
        }
        public Criteria andReturnStatusLessThanOrEqualTo(Byte value) {
            addCriterion("returnStatus <=", value, "returnStatus");
            return (Criteria) this;
        }
        public Criteria andReturnStatusIn(List<Byte> values) {
            addCriterion("returnStatus in", values, "returnStatus");
            return (Criteria) this;
        }
        public Criteria andReturnStatusNotIn(List<Byte> values) {
            addCriterion("returnStatus not in", values, "returnStatus");
            return (Criteria) this;
        }
        public Criteria andReturnStatusBetween(Byte value1, Byte value2) {
            addCriterion("returnStatus between", value1, value2, "returnStatus");
            return (Criteria) this;
        }
        public Criteria andReturnStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("returnStatus not between", value1, value2, "returnStatus");
            return (Criteria) this;
        }
        public Criteria andApplyTimeIsNull() {
            addCriterion("applyTime is null");
            return (Criteria) this;
        }
        public Criteria andApplyTimeIsNotNull() {
            addCriterion("applyTime is not null");
            return (Criteria) this;
        }
        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("applyTime =", value, "applyTime");
            return (Criteria) this;
        }
        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("applyTime <>", value, "applyTime");
            return (Criteria) this;
        }
        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("applyTime >", value, "applyTime");
            return (Criteria) this;
        }
        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applyTime >=", value, "applyTime");
            return (Criteria) this;
        }
        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("applyTime <", value, "applyTime");
            return (Criteria) this;
        }
        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("applyTime <=", value, "applyTime");
            return (Criteria) this;
        }
        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("applyTime in", values, "applyTime");
            return (Criteria) this;
        }
        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("applyTime not in", values, "applyTime");
            return (Criteria) this;
        }
        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("applyTime between", value1, value2, "applyTime");
            return (Criteria) this;
        }
        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("applyTime not between", value1, value2, "applyTime");
            return (Criteria) this;
        }
        public Criteria andDealTimeIsNull() {
            addCriterion("dealTime is null");
            return (Criteria) this;
        }
        public Criteria andDealTimeIsNotNull() {
            addCriterion("dealTime is not null");
            return (Criteria) this;
        }
        public Criteria andDealTimeEqualTo(Date value) {
            addCriterion("dealTime =", value, "dealTime");
            return (Criteria) this;
        }
        public Criteria andDealTimeNotEqualTo(Date value) {
            addCriterion("dealTime <>", value, "dealTime");
            return (Criteria) this;
        }
        public Criteria andDealTimeGreaterThan(Date value) {
            addCriterion("dealTime >", value, "dealTime");
            return (Criteria) this;
        }
        public Criteria andDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dealTime >=", value, "dealTime");
            return (Criteria) this;
        }
        public Criteria andDealTimeLessThan(Date value) {
            addCriterion("dealTime <", value, "dealTime");
            return (Criteria) this;
        }
        public Criteria andDealTimeLessThanOrEqualTo(Date value) {
            addCriterion("dealTime <=", value, "dealTime");
            return (Criteria) this;
        }
        public Criteria andDealTimeIn(List<Date> values) {
            addCriterion("dealTime in", values, "dealTime");
            return (Criteria) this;
        }
        public Criteria andDealTimeNotIn(List<Date> values) {
            addCriterion("dealTime not in", values, "dealTime");
            return (Criteria) this;
        }
        public Criteria andDealTimeBetween(Date value1, Date value2) {
            addCriterion("dealTime between", value1, value2, "dealTime");
            return (Criteria) this;
        }
        public Criteria andDealTimeNotBetween(Date value1, Date value2) {
            addCriterion("dealTime not between", value1, value2, "dealTime");
            return (Criteria) this;
        }
        public Criteria andVerifierIsNull() {
            addCriterion("verifier is null");
            return (Criteria) this;
        }
        public Criteria andVerifierIsNotNull() {
            addCriterion("verifier is not null");
            return (Criteria) this;
        }
        public Criteria andVerifierEqualTo(Long value) {
            addCriterion("verifier =", value, "verifier");
            return (Criteria) this;
        }
        public Criteria andVerifierNotEqualTo(Long value) {
            addCriterion("verifier <>", value, "verifier");
            return (Criteria) this;
        }
        public Criteria andVerifierGreaterThan(Long value) {
            addCriterion("verifier >", value, "verifier");
            return (Criteria) this;
        }
        public Criteria andVerifierGreaterThanOrEqualTo(Long value) {
            addCriterion("verifier >=", value, "verifier");
            return (Criteria) this;
        }
        public Criteria andVerifierLessThan(Long value) {
            addCriterion("verifier <", value, "verifier");
            return (Criteria) this;
        }
        public Criteria andVerifierLessThanOrEqualTo(Long value) {
            addCriterion("verifier <=", value, "verifier");
            return (Criteria) this;
        }
        public Criteria andVerifierIn(List<Long> values) {
            addCriterion("verifier in", values, "verifier");
            return (Criteria) this;
        }
        public Criteria andVerifierNotIn(List<Long> values) {
            addCriterion("verifier not in", values, "verifier");
            return (Criteria) this;
        }
        public Criteria andVerifierBetween(Long value1, Long value2) {
            addCriterion("verifier between", value1, value2, "verifier");
            return (Criteria) this;
        }
        public Criteria andVerifierNotBetween(Long value1, Long value2) {
            addCriterion("verifier not between", value1, value2, "verifier");
            return (Criteria) this;
        }
        public Criteria andRefundCauseIsNull() {
            addCriterion("refundCause is null");
            return (Criteria) this;
        }
        public Criteria andRefundCauseIsNotNull() {
            addCriterion("refundCause is not null");
            return (Criteria) this;
        }
        public Criteria andRefundCauseEqualTo(String value) {
            addCriterion("refundCause =", value, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseNotEqualTo(String value) {
            addCriterion("refundCause <>", value, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseGreaterThan(String value) {
            addCriterion("refundCause >", value, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseGreaterThanOrEqualTo(String value) {
            addCriterion("refundCause >=", value, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseLessThan(String value) {
            addCriterion("refundCause <", value, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseLessThanOrEqualTo(String value) {
            addCriterion("refundCause <=", value, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseLike(String value) {
            addCriterion("refundCause like", value, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseNotLike(String value) {
            addCriterion("refundCause not like", value, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseIn(List<String> values) {
            addCriterion("refundCause in", values, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseNotIn(List<String> values) {
            addCriterion("refundCause not in", values, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseBetween(String value1, String value2) {
            addCriterion("refundCause between", value1, value2, "refundCause");
            return (Criteria) this;
        }
        public Criteria andRefundCauseNotBetween(String value1, String value2) {
            addCriterion("refundCause not between", value1, value2, "refundCause");
            return (Criteria) this;
        }
        public Criteria andProdIdIsNull() {
            addCriterion("prodId is null");
            return (Criteria) this;
        }
        public Criteria andProdIdIsNotNull() {
            addCriterion("prodId is not null");
            return (Criteria) this;
        }
        public Criteria andProdIdEqualTo(Long value) {
            addCriterion("prodId =", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdNotEqualTo(Long value) {
            addCriterion("prodId <>", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdGreaterThan(Long value) {
            addCriterion("prodId >", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("prodId >=", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdLessThan(Long value) {
            addCriterion("prodId <", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdLessThanOrEqualTo(Long value) {
            addCriterion("prodId <=", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdIn(List<Long> values) {
            addCriterion("prodId in", values, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdNotIn(List<Long> values) {
            addCriterion("prodId not in", values, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdBetween(Long value1, Long value2) {
            addCriterion("prodId between", value1, value2, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdNotBetween(Long value1, Long value2) {
            addCriterion("prodId not between", value1, value2, "prodId");
            return (Criteria) this;
        }
        public Criteria andOrderCodeLikeInsensitive(String value) {
            addCriterion("upper(orderCode) like", value.toUpperCase(), "orderCode");
            return (Criteria) this;
        }
        public Criteria andPayAccountLikeInsensitive(String value) {
            addCriterion("upper(payAccount) like", value.toUpperCase(), "payAccount");
            return (Criteria) this;
        }
        public Criteria andRefundCauseLikeInsensitive(String value) {
            addCriterion("upper(refundCause) like", value.toUpperCase(), "refundCause");
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
     * @version 1.0 2017-01-20
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