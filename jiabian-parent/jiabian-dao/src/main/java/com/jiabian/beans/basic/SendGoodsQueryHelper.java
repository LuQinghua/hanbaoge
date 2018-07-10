/*
 * SendGoodsQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-02 Created
 */
package com.jiabian.beans.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SendGoodsQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SendGoodsQueryHelper() {
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
     * @version 1.0 2016-12-02
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
        public Criteria andSendShopIdIsNull() {
            addCriterion("sendShopId is null");
            return (Criteria) this;
        }
        public Criteria andSendShopIdIsNotNull() {
            addCriterion("sendShopId is not null");
            return (Criteria) this;
        }
        public Criteria andSendShopIdEqualTo(Long value) {
            addCriterion("sendShopId =", value, "sendShopId");
            return (Criteria) this;
        }
        public Criteria andSendShopIdNotEqualTo(Long value) {
            addCriterion("sendShopId <>", value, "sendShopId");
            return (Criteria) this;
        }
        public Criteria andSendShopIdGreaterThan(Long value) {
            addCriterion("sendShopId >", value, "sendShopId");
            return (Criteria) this;
        }
        public Criteria andSendShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sendShopId >=", value, "sendShopId");
            return (Criteria) this;
        }
        public Criteria andSendShopIdLessThan(Long value) {
            addCriterion("sendShopId <", value, "sendShopId");
            return (Criteria) this;
        }
        public Criteria andSendShopIdLessThanOrEqualTo(Long value) {
            addCriterion("sendShopId <=", value, "sendShopId");
            return (Criteria) this;
        }
        public Criteria andSendShopIdIn(List<Long> values) {
            addCriterion("sendShopId in", values, "sendShopId");
            return (Criteria) this;
        }
        public Criteria andSendShopIdNotIn(List<Long> values) {
            addCriterion("sendShopId not in", values, "sendShopId");
            return (Criteria) this;
        }
        public Criteria andSendShopIdBetween(Long value1, Long value2) {
            addCriterion("sendShopId between", value1, value2, "sendShopId");
            return (Criteria) this;
        }
        public Criteria andSendShopIdNotBetween(Long value1, Long value2) {
            addCriterion("sendShopId not between", value1, value2, "sendShopId");
            return (Criteria) this;
        }
        public Criteria andSendStatusIsNull() {
            addCriterion("sendStatus is null");
            return (Criteria) this;
        }
        public Criteria andSendStatusIsNotNull() {
            addCriterion("sendStatus is not null");
            return (Criteria) this;
        }
        public Criteria andSendStatusEqualTo(Byte value) {
            addCriterion("sendStatus =", value, "sendStatus");
            return (Criteria) this;
        }
        public Criteria andSendStatusNotEqualTo(Byte value) {
            addCriterion("sendStatus <>", value, "sendStatus");
            return (Criteria) this;
        }
        public Criteria andSendStatusGreaterThan(Byte value) {
            addCriterion("sendStatus >", value, "sendStatus");
            return (Criteria) this;
        }
        public Criteria andSendStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sendStatus >=", value, "sendStatus");
            return (Criteria) this;
        }
        public Criteria andSendStatusLessThan(Byte value) {
            addCriterion("sendStatus <", value, "sendStatus");
            return (Criteria) this;
        }
        public Criteria andSendStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sendStatus <=", value, "sendStatus");
            return (Criteria) this;
        }
        public Criteria andSendStatusIn(List<Byte> values) {
            addCriterion("sendStatus in", values, "sendStatus");
            return (Criteria) this;
        }
        public Criteria andSendStatusNotIn(List<Byte> values) {
            addCriterion("sendStatus not in", values, "sendStatus");
            return (Criteria) this;
        }
        public Criteria andSendStatusBetween(Byte value1, Byte value2) {
            addCriterion("sendStatus between", value1, value2, "sendStatus");
            return (Criteria) this;
        }
        public Criteria andSendStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sendStatus not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }
        public Criteria andPostTimeIsNull() {
            addCriterion("postTime is null");
            return (Criteria) this;
        }
        public Criteria andPostTimeIsNotNull() {
            addCriterion("postTime is not null");
            return (Criteria) this;
        }
        public Criteria andPostTimeEqualTo(Date value) {
            addCriterion("postTime =", value, "postTime");
            return (Criteria) this;
        }
        public Criteria andPostTimeNotEqualTo(Date value) {
            addCriterion("postTime <>", value, "postTime");
            return (Criteria) this;
        }
        public Criteria andPostTimeGreaterThan(Date value) {
            addCriterion("postTime >", value, "postTime");
            return (Criteria) this;
        }
        public Criteria andPostTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("postTime >=", value, "postTime");
            return (Criteria) this;
        }
        public Criteria andPostTimeLessThan(Date value) {
            addCriterion("postTime <", value, "postTime");
            return (Criteria) this;
        }
        public Criteria andPostTimeLessThanOrEqualTo(Date value) {
            addCriterion("postTime <=", value, "postTime");
            return (Criteria) this;
        }
        public Criteria andPostTimeIn(List<Date> values) {
            addCriterion("postTime in", values, "postTime");
            return (Criteria) this;
        }
        public Criteria andPostTimeNotIn(List<Date> values) {
            addCriterion("postTime not in", values, "postTime");
            return (Criteria) this;
        }
        public Criteria andPostTimeBetween(Date value1, Date value2) {
            addCriterion("postTime between", value1, value2, "postTime");
            return (Criteria) this;
        }
        public Criteria andPostTimeNotBetween(Date value1, Date value2) {
            addCriterion("postTime not between", value1, value2, "postTime");
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
        public Criteria andLogisticsCompanyIdIsNull() {
            addCriterion("logisticsCompanyId is null");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdIsNotNull() {
            addCriterion("logisticsCompanyId is not null");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdEqualTo(Long value) {
            addCriterion("logisticsCompanyId =", value, "logisticsCompanyId");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdNotEqualTo(Long value) {
            addCriterion("logisticsCompanyId <>", value, "logisticsCompanyId");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdGreaterThan(Long value) {
            addCriterion("logisticsCompanyId >", value, "logisticsCompanyId");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("logisticsCompanyId >=", value, "logisticsCompanyId");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdLessThan(Long value) {
            addCriterion("logisticsCompanyId <", value, "logisticsCompanyId");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("logisticsCompanyId <=", value, "logisticsCompanyId");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdIn(List<Long> values) {
            addCriterion("logisticsCompanyId in", values, "logisticsCompanyId");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdNotIn(List<Long> values) {
            addCriterion("logisticsCompanyId not in", values, "logisticsCompanyId");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdBetween(Long value1, Long value2) {
            addCriterion("logisticsCompanyId between", value1, value2, "logisticsCompanyId");
            return (Criteria) this;
        }
        public Criteria andLogisticsCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("logisticsCompanyId not between", value1, value2, "logisticsCompanyId");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdIsNull() {
            addCriterion("scLogiUserId is null");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdIsNotNull() {
            addCriterion("scLogiUserId is not null");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdEqualTo(Long value) {
            addCriterion("scLogiUserId =", value, "scLogiUserId");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdNotEqualTo(Long value) {
            addCriterion("scLogiUserId <>", value, "scLogiUserId");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdGreaterThan(Long value) {
            addCriterion("scLogiUserId >", value, "scLogiUserId");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("scLogiUserId >=", value, "scLogiUserId");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdLessThan(Long value) {
            addCriterion("scLogiUserId <", value, "scLogiUserId");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdLessThanOrEqualTo(Long value) {
            addCriterion("scLogiUserId <=", value, "scLogiUserId");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdIn(List<Long> values) {
            addCriterion("scLogiUserId in", values, "scLogiUserId");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdNotIn(List<Long> values) {
            addCriterion("scLogiUserId not in", values, "scLogiUserId");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdBetween(Long value1, Long value2) {
            addCriterion("scLogiUserId between", value1, value2, "scLogiUserId");
            return (Criteria) this;
        }
        public Criteria andScLogiUserIdNotBetween(Long value1, Long value2) {
            addCriterion("scLogiUserId not between", value1, value2, "scLogiUserId");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeIsNull() {
            addCriterion("sendOverTime is null");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeIsNotNull() {
            addCriterion("sendOverTime is not null");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeEqualTo(Date value) {
            addCriterion("sendOverTime =", value, "sendOverTime");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeNotEqualTo(Date value) {
            addCriterion("sendOverTime <>", value, "sendOverTime");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeGreaterThan(Date value) {
            addCriterion("sendOverTime >", value, "sendOverTime");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendOverTime >=", value, "sendOverTime");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeLessThan(Date value) {
            addCriterion("sendOverTime <", value, "sendOverTime");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("sendOverTime <=", value, "sendOverTime");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeIn(List<Date> values) {
            addCriterion("sendOverTime in", values, "sendOverTime");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeNotIn(List<Date> values) {
            addCriterion("sendOverTime not in", values, "sendOverTime");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeBetween(Date value1, Date value2) {
            addCriterion("sendOverTime between", value1, value2, "sendOverTime");
            return (Criteria) this;
        }
        public Criteria andSendOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("sendOverTime not between", value1, value2, "sendOverTime");
            return (Criteria) this;
        }
        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }
        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }
        public Criteria andFreightEqualTo(BigDecimal value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }
        public Criteria andFreightNotEqualTo(BigDecimal value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }
        public Criteria andFreightGreaterThan(BigDecimal value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }
        public Criteria andFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }
        public Criteria andFreightLessThan(BigDecimal value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }
        public Criteria andFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }
        public Criteria andFreightIn(List<BigDecimal> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }
        public Criteria andFreightNotIn(List<BigDecimal> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }
        public Criteria andFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }
        public Criteria andFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }
        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }
        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }
        public Criteria andInsuranceEqualTo(BigDecimal value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }
        public Criteria andInsuranceNotEqualTo(BigDecimal value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }
        public Criteria andInsuranceGreaterThan(BigDecimal value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }
        public Criteria andInsuranceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }
        public Criteria andInsuranceLessThan(BigDecimal value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }
        public Criteria andInsuranceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }
        public Criteria andInsuranceIn(List<BigDecimal> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }
        public Criteria andInsuranceNotIn(List<BigDecimal> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }
        public Criteria andInsuranceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }
        public Criteria andInsuranceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }
        public Criteria andRecordIdIsNull() {
            addCriterion("recordId is null");
            return (Criteria) this;
        }
        public Criteria andRecordIdIsNotNull() {
            addCriterion("recordId is not null");
            return (Criteria) this;
        }
        public Criteria andRecordIdEqualTo(Long value) {
            addCriterion("recordId =", value, "recordId");
            return (Criteria) this;
        }
        public Criteria andRecordIdNotEqualTo(Long value) {
            addCriterion("recordId <>", value, "recordId");
            return (Criteria) this;
        }
        public Criteria andRecordIdGreaterThan(Long value) {
            addCriterion("recordId >", value, "recordId");
            return (Criteria) this;
        }
        public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("recordId >=", value, "recordId");
            return (Criteria) this;
        }
        public Criteria andRecordIdLessThan(Long value) {
            addCriterion("recordId <", value, "recordId");
            return (Criteria) this;
        }
        public Criteria andRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("recordId <=", value, "recordId");
            return (Criteria) this;
        }
        public Criteria andRecordIdIn(List<Long> values) {
            addCriterion("recordId in", values, "recordId");
            return (Criteria) this;
        }
        public Criteria andRecordIdNotIn(List<Long> values) {
            addCriterion("recordId not in", values, "recordId");
            return (Criteria) this;
        }
        public Criteria andRecordIdBetween(Long value1, Long value2) {
            addCriterion("recordId between", value1, value2, "recordId");
            return (Criteria) this;
        }
        public Criteria andRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("recordId not between", value1, value2, "recordId");
            return (Criteria) this;
        }
        public Criteria andOrderIdIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }
        public Criteria andOrderIdIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }
        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("orderId =", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("orderId <>", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("orderId >", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("orderId >=", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("orderId <", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("orderId <=", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("orderId in", values, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("orderId not in", values, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("orderId between", value1, value2, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("orderId not between", value1, value2, "orderId");
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
     * @version 1.0 2016-12-02
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