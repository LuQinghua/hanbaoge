/*
 * UserCapitalInfoQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-10 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCapitalInfoQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public UserCapitalInfoQueryHelper() {
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
     * @version 1.0 2017-01-10
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
        public Criteria andUserTypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }
        public Criteria andUserTypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }
        public Criteria andUserTypeEqualTo(Byte value) {
            addCriterion("userType =", value, "userType");
            return (Criteria) this;
        }
        public Criteria andUserTypeNotEqualTo(Byte value) {
            addCriterion("userType <>", value, "userType");
            return (Criteria) this;
        }
        public Criteria andUserTypeGreaterThan(Byte value) {
            addCriterion("userType >", value, "userType");
            return (Criteria) this;
        }
        public Criteria andUserTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("userType >=", value, "userType");
            return (Criteria) this;
        }
        public Criteria andUserTypeLessThan(Byte value) {
            addCriterion("userType <", value, "userType");
            return (Criteria) this;
        }
        public Criteria andUserTypeLessThanOrEqualTo(Byte value) {
            addCriterion("userType <=", value, "userType");
            return (Criteria) this;
        }
        public Criteria andUserTypeIn(List<Byte> values) {
            addCriterion("userType in", values, "userType");
            return (Criteria) this;
        }
        public Criteria andUserTypeNotIn(List<Byte> values) {
            addCriterion("userType not in", values, "userType");
            return (Criteria) this;
        }
        public Criteria andUserTypeBetween(Byte value1, Byte value2) {
            addCriterion("userType between", value1, value2, "userType");
            return (Criteria) this;
        }
        public Criteria andUserTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("userType not between", value1, value2, "userType");
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
        public Criteria andBankIdIsNull() {
            addCriterion("bankId is null");
            return (Criteria) this;
        }
        public Criteria andBankIdIsNotNull() {
            addCriterion("bankId is not null");
            return (Criteria) this;
        }
        public Criteria andBankIdEqualTo(String value) {
            addCriterion("bankId =", value, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("bankId <>", value, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("bankId >", value, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("bankId >=", value, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdLessThan(String value) {
            addCriterion("bankId <", value, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("bankId <=", value, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdLike(String value) {
            addCriterion("bankId like", value, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdNotLike(String value) {
            addCriterion("bankId not like", value, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdIn(List<String> values) {
            addCriterion("bankId in", values, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("bankId not in", values, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("bankId between", value1, value2, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("bankId not between", value1, value2, "bankId");
            return (Criteria) this;
        }
        public Criteria andBankAddressIsNull() {
            addCriterion("bankAddress is null");
            return (Criteria) this;
        }
        public Criteria andBankAddressIsNotNull() {
            addCriterion("bankAddress is not null");
            return (Criteria) this;
        }
        public Criteria andBankAddressEqualTo(String value) {
            addCriterion("bankAddress =", value, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressNotEqualTo(String value) {
            addCriterion("bankAddress <>", value, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressGreaterThan(String value) {
            addCriterion("bankAddress >", value, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bankAddress >=", value, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressLessThan(String value) {
            addCriterion("bankAddress <", value, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressLessThanOrEqualTo(String value) {
            addCriterion("bankAddress <=", value, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressLike(String value) {
            addCriterion("bankAddress like", value, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressNotLike(String value) {
            addCriterion("bankAddress not like", value, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressIn(List<String> values) {
            addCriterion("bankAddress in", values, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressNotIn(List<String> values) {
            addCriterion("bankAddress not in", values, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressBetween(String value1, String value2) {
            addCriterion("bankAddress between", value1, value2, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankAddressNotBetween(String value1, String value2) {
            addCriterion("bankAddress not between", value1, value2, "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankNameIsNull() {
            addCriterion("bankName is null");
            return (Criteria) this;
        }
        public Criteria andBankNameIsNotNull() {
            addCriterion("bankName is not null");
            return (Criteria) this;
        }
        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bankName =", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bankName <>", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bankName >", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bankName >=", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameLessThan(String value) {
            addCriterion("bankName <", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bankName <=", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameLike(String value) {
            addCriterion("bankName like", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameNotLike(String value) {
            addCriterion("bankName not like", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bankName in", values, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bankName not in", values, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bankName between", value1, value2, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bankName not between", value1, value2, "bankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameIsNull() {
            addCriterion("openBankName is null");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameIsNotNull() {
            addCriterion("openBankName is not null");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameEqualTo(String value) {
            addCriterion("openBankName =", value, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameNotEqualTo(String value) {
            addCriterion("openBankName <>", value, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameGreaterThan(String value) {
            addCriterion("openBankName >", value, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("openBankName >=", value, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameLessThan(String value) {
            addCriterion("openBankName <", value, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameLessThanOrEqualTo(String value) {
            addCriterion("openBankName <=", value, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameLike(String value) {
            addCriterion("openBankName like", value, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameNotLike(String value) {
            addCriterion("openBankName not like", value, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameIn(List<String> values) {
            addCriterion("openBankName in", values, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameNotIn(List<String> values) {
            addCriterion("openBankName not in", values, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameBetween(String value1, String value2) {
            addCriterion("openBankName between", value1, value2, "openBankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameNotBetween(String value1, String value2) {
            addCriterion("openBankName not between", value1, value2, "openBankName");
            return (Criteria) this;
        }
        public Criteria andAlipayIdIsNull() {
            addCriterion("alipayId is null");
            return (Criteria) this;
        }
        public Criteria andAlipayIdIsNotNull() {
            addCriterion("alipayId is not null");
            return (Criteria) this;
        }
        public Criteria andAlipayIdEqualTo(String value) {
            addCriterion("alipayId =", value, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdNotEqualTo(String value) {
            addCriterion("alipayId <>", value, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdGreaterThan(String value) {
            addCriterion("alipayId >", value, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdGreaterThanOrEqualTo(String value) {
            addCriterion("alipayId >=", value, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdLessThan(String value) {
            addCriterion("alipayId <", value, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdLessThanOrEqualTo(String value) {
            addCriterion("alipayId <=", value, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdLike(String value) {
            addCriterion("alipayId like", value, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdNotLike(String value) {
            addCriterion("alipayId not like", value, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdIn(List<String> values) {
            addCriterion("alipayId in", values, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdNotIn(List<String> values) {
            addCriterion("alipayId not in", values, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdBetween(String value1, String value2) {
            addCriterion("alipayId between", value1, value2, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayIdNotBetween(String value1, String value2) {
            addCriterion("alipayId not between", value1, value2, "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayNameIsNull() {
            addCriterion("alipayName is null");
            return (Criteria) this;
        }
        public Criteria andAlipayNameIsNotNull() {
            addCriterion("alipayName is not null");
            return (Criteria) this;
        }
        public Criteria andAlipayNameEqualTo(String value) {
            addCriterion("alipayName =", value, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameNotEqualTo(String value) {
            addCriterion("alipayName <>", value, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameGreaterThan(String value) {
            addCriterion("alipayName >", value, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameGreaterThanOrEqualTo(String value) {
            addCriterion("alipayName >=", value, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameLessThan(String value) {
            addCriterion("alipayName <", value, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameLessThanOrEqualTo(String value) {
            addCriterion("alipayName <=", value, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameLike(String value) {
            addCriterion("alipayName like", value, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameNotLike(String value) {
            addCriterion("alipayName not like", value, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameIn(List<String> values) {
            addCriterion("alipayName in", values, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameNotIn(List<String> values) {
            addCriterion("alipayName not in", values, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameBetween(String value1, String value2) {
            addCriterion("alipayName between", value1, value2, "alipayName");
            return (Criteria) this;
        }
        public Criteria andAlipayNameNotBetween(String value1, String value2) {
            addCriterion("alipayName not between", value1, value2, "alipayName");
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
        public Criteria andAccountTypeIsNull() {
            addCriterion("accountType is null");
            return (Criteria) this;
        }
        public Criteria andAccountTypeIsNotNull() {
            addCriterion("accountType is not null");
            return (Criteria) this;
        }
        public Criteria andAccountTypeEqualTo(Byte value) {
            addCriterion("accountType =", value, "accountType");
            return (Criteria) this;
        }
        public Criteria andAccountTypeNotEqualTo(Byte value) {
            addCriterion("accountType <>", value, "accountType");
            return (Criteria) this;
        }
        public Criteria andAccountTypeGreaterThan(Byte value) {
            addCriterion("accountType >", value, "accountType");
            return (Criteria) this;
        }
        public Criteria andAccountTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("accountType >=", value, "accountType");
            return (Criteria) this;
        }
        public Criteria andAccountTypeLessThan(Byte value) {
            addCriterion("accountType <", value, "accountType");
            return (Criteria) this;
        }
        public Criteria andAccountTypeLessThanOrEqualTo(Byte value) {
            addCriterion("accountType <=", value, "accountType");
            return (Criteria) this;
        }
        public Criteria andAccountTypeIn(List<Byte> values) {
            addCriterion("accountType in", values, "accountType");
            return (Criteria) this;
        }
        public Criteria andAccountTypeNotIn(List<Byte> values) {
            addCriterion("accountType not in", values, "accountType");
            return (Criteria) this;
        }
        public Criteria andAccountTypeBetween(Byte value1, Byte value2) {
            addCriterion("accountType between", value1, value2, "accountType");
            return (Criteria) this;
        }
        public Criteria andAccountTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("accountType not between", value1, value2, "accountType");
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
        public Criteria andBankIdLikeInsensitive(String value) {
            addCriterion("upper(bankId) like", value.toUpperCase(), "bankId");
            return (Criteria) this;
        }
        public Criteria andBankAddressLikeInsensitive(String value) {
            addCriterion("upper(bankAddress) like", value.toUpperCase(), "bankAddress");
            return (Criteria) this;
        }
        public Criteria andBankNameLikeInsensitive(String value) {
            addCriterion("upper(bankName) like", value.toUpperCase(), "bankName");
            return (Criteria) this;
        }
        public Criteria andOpenBankNameLikeInsensitive(String value) {
            addCriterion("upper(openBankName) like", value.toUpperCase(), "openBankName");
            return (Criteria) this;
        }
        public Criteria andAlipayIdLikeInsensitive(String value) {
            addCriterion("upper(alipayId) like", value.toUpperCase(), "alipayId");
            return (Criteria) this;
        }
        public Criteria andAlipayNameLikeInsensitive(String value) {
            addCriterion("upper(alipayName) like", value.toUpperCase(), "alipayName");
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
     * @version 1.0 2017-01-10
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