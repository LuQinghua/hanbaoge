/*
 * MoneyWaterQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-02-22 Created
 */
package com.jiabian.beans.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MoneyWaterQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public MoneyWaterQueryHelper() {
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
     * @version 1.0 2017-02-22
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
        public Criteria andOrder_recordIdIsNull() {
            addCriterion("order_recordId is null");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdIsNotNull() {
            addCriterion("order_recordId is not null");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdEqualTo(Long value) {
            addCriterion("order_recordId =", value, "order_recordId");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdNotEqualTo(Long value) {
            addCriterion("order_recordId <>", value, "order_recordId");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdGreaterThan(Long value) {
            addCriterion("order_recordId >", value, "order_recordId");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_recordId >=", value, "order_recordId");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdLessThan(Long value) {
            addCriterion("order_recordId <", value, "order_recordId");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdLessThanOrEqualTo(Long value) {
            addCriterion("order_recordId <=", value, "order_recordId");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdIn(List<Long> values) {
            addCriterion("order_recordId in", values, "order_recordId");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdNotIn(List<Long> values) {
            addCriterion("order_recordId not in", values, "order_recordId");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdBetween(Long value1, Long value2) {
            addCriterion("order_recordId between", value1, value2, "order_recordId");
            return (Criteria) this;
        }
        public Criteria andOrder_recordIdNotBetween(Long value1, Long value2) {
            addCriterion("order_recordId not between", value1, value2, "order_recordId");
            return (Criteria) this;
        }
        public Criteria andShopIdIsNull() {
            addCriterion("shopId is null");
            return (Criteria) this;
        }
        public Criteria andShopIdIsNotNull() {
            addCriterion("shopId is not null");
            return (Criteria) this;
        }
        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shopId =", value, "shopId");
            return (Criteria) this;
        }
        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shopId <>", value, "shopId");
            return (Criteria) this;
        }
        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shopId >", value, "shopId");
            return (Criteria) this;
        }
        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shopId >=", value, "shopId");
            return (Criteria) this;
        }
        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shopId <", value, "shopId");
            return (Criteria) this;
        }
        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shopId <=", value, "shopId");
            return (Criteria) this;
        }
        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shopId in", values, "shopId");
            return (Criteria) this;
        }
        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shopId not in", values, "shopId");
            return (Criteria) this;
        }
        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shopId between", value1, value2, "shopId");
            return (Criteria) this;
        }
        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shopId not between", value1, value2, "shopId");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeIsNull() {
            addCriterion("moneyWaterCode is null");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeIsNotNull() {
            addCriterion("moneyWaterCode is not null");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeEqualTo(String value) {
            addCriterion("moneyWaterCode =", value, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeNotEqualTo(String value) {
            addCriterion("moneyWaterCode <>", value, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeGreaterThan(String value) {
            addCriterion("moneyWaterCode >", value, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("moneyWaterCode >=", value, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeLessThan(String value) {
            addCriterion("moneyWaterCode <", value, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeLessThanOrEqualTo(String value) {
            addCriterion("moneyWaterCode <=", value, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeLike(String value) {
            addCriterion("moneyWaterCode like", value, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeNotLike(String value) {
            addCriterion("moneyWaterCode not like", value, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeIn(List<String> values) {
            addCriterion("moneyWaterCode in", values, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeNotIn(List<String> values) {
            addCriterion("moneyWaterCode not in", values, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeBetween(String value1, String value2) {
            addCriterion("moneyWaterCode between", value1, value2, "moneyWaterCode");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeNotBetween(String value1, String value2) {
            addCriterion("moneyWaterCode not between", value1, value2, "moneyWaterCode");
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
        public Criteria andIncomeTimeIsNull() {
            addCriterion("incomeTime is null");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeIsNotNull() {
            addCriterion("incomeTime is not null");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeEqualTo(Date value) {
            addCriterion("incomeTime =", value, "incomeTime");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeNotEqualTo(Date value) {
            addCriterion("incomeTime <>", value, "incomeTime");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeGreaterThan(Date value) {
            addCriterion("incomeTime >", value, "incomeTime");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("incomeTime >=", value, "incomeTime");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeLessThan(Date value) {
            addCriterion("incomeTime <", value, "incomeTime");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeLessThanOrEqualTo(Date value) {
            addCriterion("incomeTime <=", value, "incomeTime");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeIn(List<Date> values) {
            addCriterion("incomeTime in", values, "incomeTime");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeNotIn(List<Date> values) {
            addCriterion("incomeTime not in", values, "incomeTime");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeBetween(Date value1, Date value2) {
            addCriterion("incomeTime between", value1, value2, "incomeTime");
            return (Criteria) this;
        }
        public Criteria andIncomeTimeNotBetween(Date value1, Date value2) {
            addCriterion("incomeTime not between", value1, value2, "incomeTime");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyIsNull() {
            addCriterion("withdrawMoney is null");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyIsNotNull() {
            addCriterion("withdrawMoney is not null");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyEqualTo(BigDecimal value) {
            addCriterion("withdrawMoney =", value, "withdrawMoney");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyNotEqualTo(BigDecimal value) {
            addCriterion("withdrawMoney <>", value, "withdrawMoney");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyGreaterThan(BigDecimal value) {
            addCriterion("withdrawMoney >", value, "withdrawMoney");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawMoney >=", value, "withdrawMoney");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyLessThan(BigDecimal value) {
            addCriterion("withdrawMoney <", value, "withdrawMoney");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawMoney <=", value, "withdrawMoney");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyIn(List<BigDecimal> values) {
            addCriterion("withdrawMoney in", values, "withdrawMoney");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyNotIn(List<BigDecimal> values) {
            addCriterion("withdrawMoney not in", values, "withdrawMoney");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawMoney between", value1, value2, "withdrawMoney");
            return (Criteria) this;
        }
        public Criteria andWithdrawMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawMoney not between", value1, value2, "withdrawMoney");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeIsNull() {
            addCriterion("withdrawTime is null");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeIsNotNull() {
            addCriterion("withdrawTime is not null");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeEqualTo(Date value) {
            addCriterion("withdrawTime =", value, "withdrawTime");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeNotEqualTo(Date value) {
            addCriterion("withdrawTime <>", value, "withdrawTime");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeGreaterThan(Date value) {
            addCriterion("withdrawTime >", value, "withdrawTime");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("withdrawTime >=", value, "withdrawTime");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeLessThan(Date value) {
            addCriterion("withdrawTime <", value, "withdrawTime");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeLessThanOrEqualTo(Date value) {
            addCriterion("withdrawTime <=", value, "withdrawTime");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeIn(List<Date> values) {
            addCriterion("withdrawTime in", values, "withdrawTime");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeNotIn(List<Date> values) {
            addCriterion("withdrawTime not in", values, "withdrawTime");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeBetween(Date value1, Date value2) {
            addCriterion("withdrawTime between", value1, value2, "withdrawTime");
            return (Criteria) this;
        }
        public Criteria andWithdrawTimeNotBetween(Date value1, Date value2) {
            addCriterion("withdrawTime not between", value1, value2, "withdrawTime");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusIsNull() {
            addCriterion("moneyStatus is null");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusIsNotNull() {
            addCriterion("moneyStatus is not null");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusEqualTo(Byte value) {
            addCriterion("moneyStatus =", value, "moneyStatus");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusNotEqualTo(Byte value) {
            addCriterion("moneyStatus <>", value, "moneyStatus");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusGreaterThan(Byte value) {
            addCriterion("moneyStatus >", value, "moneyStatus");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("moneyStatus >=", value, "moneyStatus");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusLessThan(Byte value) {
            addCriterion("moneyStatus <", value, "moneyStatus");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("moneyStatus <=", value, "moneyStatus");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusIn(List<Byte> values) {
            addCriterion("moneyStatus in", values, "moneyStatus");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusNotIn(List<Byte> values) {
            addCriterion("moneyStatus not in", values, "moneyStatus");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusBetween(Byte value1, Byte value2) {
            addCriterion("moneyStatus between", value1, value2, "moneyStatus");
            return (Criteria) this;
        }
        public Criteria andMoneyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("moneyStatus not between", value1, value2, "moneyStatus");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdIsNull() {
            addCriterion("handlingManId is null");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdIsNotNull() {
            addCriterion("handlingManId is not null");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdEqualTo(Long value) {
            addCriterion("handlingManId =", value, "handlingManId");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdNotEqualTo(Long value) {
            addCriterion("handlingManId <>", value, "handlingManId");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdGreaterThan(Long value) {
            addCriterion("handlingManId >", value, "handlingManId");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdGreaterThanOrEqualTo(Long value) {
            addCriterion("handlingManId >=", value, "handlingManId");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdLessThan(Long value) {
            addCriterion("handlingManId <", value, "handlingManId");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdLessThanOrEqualTo(Long value) {
            addCriterion("handlingManId <=", value, "handlingManId");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdIn(List<Long> values) {
            addCriterion("handlingManId in", values, "handlingManId");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdNotIn(List<Long> values) {
            addCriterion("handlingManId not in", values, "handlingManId");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdBetween(Long value1, Long value2) {
            addCriterion("handlingManId between", value1, value2, "handlingManId");
            return (Criteria) this;
        }
        public Criteria andHandlingManIdNotBetween(Long value1, Long value2) {
            addCriterion("handlingManId not between", value1, value2, "handlingManId");
            return (Criteria) this;
        }
        public Criteria andAuditManIdIsNull() {
            addCriterion("auditManId is null");
            return (Criteria) this;
        }
        public Criteria andAuditManIdIsNotNull() {
            addCriterion("auditManId is not null");
            return (Criteria) this;
        }
        public Criteria andAuditManIdEqualTo(Long value) {
            addCriterion("auditManId =", value, "auditManId");
            return (Criteria) this;
        }
        public Criteria andAuditManIdNotEqualTo(Long value) {
            addCriterion("auditManId <>", value, "auditManId");
            return (Criteria) this;
        }
        public Criteria andAuditManIdGreaterThan(Long value) {
            addCriterion("auditManId >", value, "auditManId");
            return (Criteria) this;
        }
        public Criteria andAuditManIdGreaterThanOrEqualTo(Long value) {
            addCriterion("auditManId >=", value, "auditManId");
            return (Criteria) this;
        }
        public Criteria andAuditManIdLessThan(Long value) {
            addCriterion("auditManId <", value, "auditManId");
            return (Criteria) this;
        }
        public Criteria andAuditManIdLessThanOrEqualTo(Long value) {
            addCriterion("auditManId <=", value, "auditManId");
            return (Criteria) this;
        }
        public Criteria andAuditManIdIn(List<Long> values) {
            addCriterion("auditManId in", values, "auditManId");
            return (Criteria) this;
        }
        public Criteria andAuditManIdNotIn(List<Long> values) {
            addCriterion("auditManId not in", values, "auditManId");
            return (Criteria) this;
        }
        public Criteria andAuditManIdBetween(Long value1, Long value2) {
            addCriterion("auditManId between", value1, value2, "auditManId");
            return (Criteria) this;
        }
        public Criteria andAuditManIdNotBetween(Long value1, Long value2) {
            addCriterion("auditManId not between", value1, value2, "auditManId");
            return (Criteria) this;
        }
        public Criteria andAuditTimeIsNull() {
            addCriterion("auditTime is null");
            return (Criteria) this;
        }
        public Criteria andAuditTimeIsNotNull() {
            addCriterion("auditTime is not null");
            return (Criteria) this;
        }
        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("auditTime =", value, "auditTime");
            return (Criteria) this;
        }
        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("auditTime <>", value, "auditTime");
            return (Criteria) this;
        }
        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("auditTime >", value, "auditTime");
            return (Criteria) this;
        }
        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditTime >=", value, "auditTime");
            return (Criteria) this;
        }
        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("auditTime <", value, "auditTime");
            return (Criteria) this;
        }
        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("auditTime <=", value, "auditTime");
            return (Criteria) this;
        }
        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("auditTime in", values, "auditTime");
            return (Criteria) this;
        }
        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("auditTime not in", values, "auditTime");
            return (Criteria) this;
        }
        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("auditTime between", value1, value2, "auditTime");
            return (Criteria) this;
        }
        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("auditTime not between", value1, value2, "auditTime");
            return (Criteria) this;
        }
        public Criteria andWaterTypeIsNull() {
            addCriterion("waterType is null");
            return (Criteria) this;
        }
        public Criteria andWaterTypeIsNotNull() {
            addCriterion("waterType is not null");
            return (Criteria) this;
        }
        public Criteria andWaterTypeEqualTo(Byte value) {
            addCriterion("waterType =", value, "waterType");
            return (Criteria) this;
        }
        public Criteria andWaterTypeNotEqualTo(Byte value) {
            addCriterion("waterType <>", value, "waterType");
            return (Criteria) this;
        }
        public Criteria andWaterTypeGreaterThan(Byte value) {
            addCriterion("waterType >", value, "waterType");
            return (Criteria) this;
        }
        public Criteria andWaterTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("waterType >=", value, "waterType");
            return (Criteria) this;
        }
        public Criteria andWaterTypeLessThan(Byte value) {
            addCriterion("waterType <", value, "waterType");
            return (Criteria) this;
        }
        public Criteria andWaterTypeLessThanOrEqualTo(Byte value) {
            addCriterion("waterType <=", value, "waterType");
            return (Criteria) this;
        }
        public Criteria andWaterTypeIn(List<Byte> values) {
            addCriterion("waterType in", values, "waterType");
            return (Criteria) this;
        }
        public Criteria andWaterTypeNotIn(List<Byte> values) {
            addCriterion("waterType not in", values, "waterType");
            return (Criteria) this;
        }
        public Criteria andWaterTypeBetween(Byte value1, Byte value2) {
            addCriterion("waterType between", value1, value2, "waterType");
            return (Criteria) this;
        }
        public Criteria andWaterTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("waterType not between", value1, value2, "waterType");
            return (Criteria) this;
        }
        public Criteria andAccountIdIsNull() {
            addCriterion("accountId is null");
            return (Criteria) this;
        }
        public Criteria andAccountIdIsNotNull() {
            addCriterion("accountId is not null");
            return (Criteria) this;
        }
        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("accountId =", value, "accountId");
            return (Criteria) this;
        }
        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("accountId <>", value, "accountId");
            return (Criteria) this;
        }
        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("accountId >", value, "accountId");
            return (Criteria) this;
        }
        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("accountId >=", value, "accountId");
            return (Criteria) this;
        }
        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("accountId <", value, "accountId");
            return (Criteria) this;
        }
        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("accountId <=", value, "accountId");
            return (Criteria) this;
        }
        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("accountId in", values, "accountId");
            return (Criteria) this;
        }
        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("accountId not in", values, "accountId");
            return (Criteria) this;
        }
        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("accountId between", value1, value2, "accountId");
            return (Criteria) this;
        }
        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("accountId not between", value1, value2, "accountId");
            return (Criteria) this;
        }
        public Criteria andMoneyWaterCodeLikeInsensitive(String value) {
            addCriterion("upper(moneyWaterCode) like", value.toUpperCase(), "moneyWaterCode");
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
     * @version 1.0 2017-02-22
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