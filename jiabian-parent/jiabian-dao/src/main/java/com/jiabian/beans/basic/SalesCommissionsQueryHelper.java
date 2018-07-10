/*
 * SalesCommissionsQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-12 Created
 */
package com.jiabian.beans.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesCommissionsQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SalesCommissionsQueryHelper() {
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
     * @version 1.0 2017-01-12
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
        public Criteria andProductIdIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }
        public Criteria andProductIdIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }
        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("productId =", value, "productId");
            return (Criteria) this;
        }
        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("productId <>", value, "productId");
            return (Criteria) this;
        }
        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("productId >", value, "productId");
            return (Criteria) this;
        }
        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("productId >=", value, "productId");
            return (Criteria) this;
        }
        public Criteria andProductIdLessThan(Long value) {
            addCriterion("productId <", value, "productId");
            return (Criteria) this;
        }
        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("productId <=", value, "productId");
            return (Criteria) this;
        }
        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("productId in", values, "productId");
            return (Criteria) this;
        }
        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("productId not in", values, "productId");
            return (Criteria) this;
        }
        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("productId between", value1, value2, "productId");
            return (Criteria) this;
        }
        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("productId not between", value1, value2, "productId");
            return (Criteria) this;
        }
        public Criteria andProductMoneyIsNull() {
            addCriterion("productMoney is null");
            return (Criteria) this;
        }
        public Criteria andProductMoneyIsNotNull() {
            addCriterion("productMoney is not null");
            return (Criteria) this;
        }
        public Criteria andProductMoneyEqualTo(BigDecimal value) {
            addCriterion("productMoney =", value, "productMoney");
            return (Criteria) this;
        }
        public Criteria andProductMoneyNotEqualTo(BigDecimal value) {
            addCriterion("productMoney <>", value, "productMoney");
            return (Criteria) this;
        }
        public Criteria andProductMoneyGreaterThan(BigDecimal value) {
            addCriterion("productMoney >", value, "productMoney");
            return (Criteria) this;
        }
        public Criteria andProductMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productMoney >=", value, "productMoney");
            return (Criteria) this;
        }
        public Criteria andProductMoneyLessThan(BigDecimal value) {
            addCriterion("productMoney <", value, "productMoney");
            return (Criteria) this;
        }
        public Criteria andProductMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productMoney <=", value, "productMoney");
            return (Criteria) this;
        }
        public Criteria andProductMoneyIn(List<BigDecimal> values) {
            addCriterion("productMoney in", values, "productMoney");
            return (Criteria) this;
        }
        public Criteria andProductMoneyNotIn(List<BigDecimal> values) {
            addCriterion("productMoney not in", values, "productMoney");
            return (Criteria) this;
        }
        public Criteria andProductMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productMoney between", value1, value2, "productMoney");
            return (Criteria) this;
        }
        public Criteria andProductMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productMoney not between", value1, value2, "productMoney");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyIsNull() {
            addCriterion("commissionsMoney is null");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyIsNotNull() {
            addCriterion("commissionsMoney is not null");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyEqualTo(BigDecimal value) {
            addCriterion("commissionsMoney =", value, "commissionsMoney");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyNotEqualTo(BigDecimal value) {
            addCriterion("commissionsMoney <>", value, "commissionsMoney");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyGreaterThan(BigDecimal value) {
            addCriterion("commissionsMoney >", value, "commissionsMoney");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commissionsMoney >=", value, "commissionsMoney");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyLessThan(BigDecimal value) {
            addCriterion("commissionsMoney <", value, "commissionsMoney");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commissionsMoney <=", value, "commissionsMoney");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyIn(List<BigDecimal> values) {
            addCriterion("commissionsMoney in", values, "commissionsMoney");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyNotIn(List<BigDecimal> values) {
            addCriterion("commissionsMoney not in", values, "commissionsMoney");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commissionsMoney between", value1, value2, "commissionsMoney");
            return (Criteria) this;
        }
        public Criteria andCommissionsMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commissionsMoney not between", value1, value2, "commissionsMoney");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeIsNull() {
            addCriterion("invitationCode is null");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeIsNotNull() {
            addCriterion("invitationCode is not null");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeEqualTo(String value) {
            addCriterion("invitationCode =", value, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeNotEqualTo(String value) {
            addCriterion("invitationCode <>", value, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeGreaterThan(String value) {
            addCriterion("invitationCode >", value, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invitationCode >=", value, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeLessThan(String value) {
            addCriterion("invitationCode <", value, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeLessThanOrEqualTo(String value) {
            addCriterion("invitationCode <=", value, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeLike(String value) {
            addCriterion("invitationCode like", value, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeNotLike(String value) {
            addCriterion("invitationCode not like", value, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeIn(List<String> values) {
            addCriterion("invitationCode in", values, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeNotIn(List<String> values) {
            addCriterion("invitationCode not in", values, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeBetween(String value1, String value2) {
            addCriterion("invitationCode between", value1, value2, "invitationCode");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeNotBetween(String value1, String value2) {
            addCriterion("invitationCode not between", value1, value2, "invitationCode");
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
        public Criteria andIsPayIsNull() {
            addCriterion("isPay is null");
            return (Criteria) this;
        }
        public Criteria andIsPayIsNotNull() {
            addCriterion("isPay is not null");
            return (Criteria) this;
        }
        public Criteria andIsPayEqualTo(Byte value) {
            addCriterion("isPay =", value, "isPay");
            return (Criteria) this;
        }
        public Criteria andIsPayNotEqualTo(Byte value) {
            addCriterion("isPay <>", value, "isPay");
            return (Criteria) this;
        }
        public Criteria andIsPayGreaterThan(Byte value) {
            addCriterion("isPay >", value, "isPay");
            return (Criteria) this;
        }
        public Criteria andIsPayGreaterThanOrEqualTo(Byte value) {
            addCriterion("isPay >=", value, "isPay");
            return (Criteria) this;
        }
        public Criteria andIsPayLessThan(Byte value) {
            addCriterion("isPay <", value, "isPay");
            return (Criteria) this;
        }
        public Criteria andIsPayLessThanOrEqualTo(Byte value) {
            addCriterion("isPay <=", value, "isPay");
            return (Criteria) this;
        }
        public Criteria andIsPayIn(List<Byte> values) {
            addCriterion("isPay in", values, "isPay");
            return (Criteria) this;
        }
        public Criteria andIsPayNotIn(List<Byte> values) {
            addCriterion("isPay not in", values, "isPay");
            return (Criteria) this;
        }
        public Criteria andIsPayBetween(Byte value1, Byte value2) {
            addCriterion("isPay between", value1, value2, "isPay");
            return (Criteria) this;
        }
        public Criteria andIsPayNotBetween(Byte value1, Byte value2) {
            addCriterion("isPay not between", value1, value2, "isPay");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdIsNull() {
            addCriterion("capitalInfoId is null");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdIsNotNull() {
            addCriterion("capitalInfoId is not null");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdEqualTo(Long value) {
            addCriterion("capitalInfoId =", value, "capitalInfoId");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdNotEqualTo(Long value) {
            addCriterion("capitalInfoId <>", value, "capitalInfoId");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdGreaterThan(Long value) {
            addCriterion("capitalInfoId >", value, "capitalInfoId");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("capitalInfoId >=", value, "capitalInfoId");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdLessThan(Long value) {
            addCriterion("capitalInfoId <", value, "capitalInfoId");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("capitalInfoId <=", value, "capitalInfoId");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdIn(List<Long> values) {
            addCriterion("capitalInfoId in", values, "capitalInfoId");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdNotIn(List<Long> values) {
            addCriterion("capitalInfoId not in", values, "capitalInfoId");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdBetween(Long value1, Long value2) {
            addCriterion("capitalInfoId between", value1, value2, "capitalInfoId");
            return (Criteria) this;
        }
        public Criteria andCapitalInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("capitalInfoId not between", value1, value2, "capitalInfoId");
            return (Criteria) this;
        }
        public Criteria andSaleNumIsNull() {
            addCriterion("saleNum is null");
            return (Criteria) this;
        }
        public Criteria andSaleNumIsNotNull() {
            addCriterion("saleNum is not null");
            return (Criteria) this;
        }
        public Criteria andSaleNumEqualTo(Integer value) {
            addCriterion("saleNum =", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumNotEqualTo(Integer value) {
            addCriterion("saleNum <>", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumGreaterThan(Integer value) {
            addCriterion("saleNum >", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleNum >=", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumLessThan(Integer value) {
            addCriterion("saleNum <", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("saleNum <=", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumIn(List<Integer> values) {
            addCriterion("saleNum in", values, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumNotIn(List<Integer> values) {
            addCriterion("saleNum not in", values, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("saleNum between", value1, value2, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("saleNum not between", value1, value2, "saleNum");
            return (Criteria) this;
        }
        public Criteria andInvitationCodeLikeInsensitive(String value) {
            addCriterion("upper(invitationCode) like", value.toUpperCase(), "invitationCode");
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
     * @version 1.0 2017-01-12
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