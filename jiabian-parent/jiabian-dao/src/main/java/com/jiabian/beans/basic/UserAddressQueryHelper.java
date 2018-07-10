/*
 * UserAddressQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-06 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAddressQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public UserAddressQueryHelper() {
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
     * 收货地址表
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
        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }
        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }
        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }
        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
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
        public Criteria andTelPhoneIsNull() {
            addCriterion("telPhone is null");
            return (Criteria) this;
        }
        public Criteria andTelPhoneIsNotNull() {
            addCriterion("telPhone is not null");
            return (Criteria) this;
        }
        public Criteria andTelPhoneEqualTo(String value) {
            addCriterion("telPhone =", value, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneNotEqualTo(String value) {
            addCriterion("telPhone <>", value, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneGreaterThan(String value) {
            addCriterion("telPhone >", value, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("telPhone >=", value, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneLessThan(String value) {
            addCriterion("telPhone <", value, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneLessThanOrEqualTo(String value) {
            addCriterion("telPhone <=", value, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneLike(String value) {
            addCriterion("telPhone like", value, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneNotLike(String value) {
            addCriterion("telPhone not like", value, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneIn(List<String> values) {
            addCriterion("telPhone in", values, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneNotIn(List<String> values) {
            addCriterion("telPhone not in", values, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneBetween(String value1, String value2) {
            addCriterion("telPhone between", value1, value2, "telPhone");
            return (Criteria) this;
        }
        public Criteria andTelPhoneNotBetween(String value1, String value2) {
            addCriterion("telPhone not between", value1, value2, "telPhone");
            return (Criteria) this;
        }
        public Criteria andHomeTelIsNull() {
            addCriterion("homeTel is null");
            return (Criteria) this;
        }
        public Criteria andHomeTelIsNotNull() {
            addCriterion("homeTel is not null");
            return (Criteria) this;
        }
        public Criteria andHomeTelEqualTo(String value) {
            addCriterion("homeTel =", value, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelNotEqualTo(String value) {
            addCriterion("homeTel <>", value, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelGreaterThan(String value) {
            addCriterion("homeTel >", value, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelGreaterThanOrEqualTo(String value) {
            addCriterion("homeTel >=", value, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelLessThan(String value) {
            addCriterion("homeTel <", value, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelLessThanOrEqualTo(String value) {
            addCriterion("homeTel <=", value, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelLike(String value) {
            addCriterion("homeTel like", value, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelNotLike(String value) {
            addCriterion("homeTel not like", value, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelIn(List<String> values) {
            addCriterion("homeTel in", values, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelNotIn(List<String> values) {
            addCriterion("homeTel not in", values, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelBetween(String value1, String value2) {
            addCriterion("homeTel between", value1, value2, "homeTel");
            return (Criteria) this;
        }
        public Criteria andHomeTelNotBetween(String value1, String value2) {
            addCriterion("homeTel not between", value1, value2, "homeTel");
            return (Criteria) this;
        }
        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }
        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }
        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }
        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }
        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }
        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }
        public Criteria andAddressInfoIsNull() {
            addCriterion("addressInfo is null");
            return (Criteria) this;
        }
        public Criteria andAddressInfoIsNotNull() {
            addCriterion("addressInfo is not null");
            return (Criteria) this;
        }
        public Criteria andAddressInfoEqualTo(String value) {
            addCriterion("addressInfo =", value, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoNotEqualTo(String value) {
            addCriterion("addressInfo <>", value, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoGreaterThan(String value) {
            addCriterion("addressInfo >", value, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoGreaterThanOrEqualTo(String value) {
            addCriterion("addressInfo >=", value, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoLessThan(String value) {
            addCriterion("addressInfo <", value, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoLessThanOrEqualTo(String value) {
            addCriterion("addressInfo <=", value, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoLike(String value) {
            addCriterion("addressInfo like", value, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoNotLike(String value) {
            addCriterion("addressInfo not like", value, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoIn(List<String> values) {
            addCriterion("addressInfo in", values, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoNotIn(List<String> values) {
            addCriterion("addressInfo not in", values, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoBetween(String value1, String value2) {
            addCriterion("addressInfo between", value1, value2, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andAddressInfoNotBetween(String value1, String value2) {
            addCriterion("addressInfo not between", value1, value2, "addressInfo");
            return (Criteria) this;
        }
        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }
        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }
        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }
        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }
        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }
        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }
        public Criteria andPostCodeIsNull() {
            addCriterion("postCode is null");
            return (Criteria) this;
        }
        public Criteria andPostCodeIsNotNull() {
            addCriterion("postCode is not null");
            return (Criteria) this;
        }
        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("postCode =", value, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("postCode <>", value, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("postCode >", value, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("postCode >=", value, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeLessThan(String value) {
            addCriterion("postCode <", value, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("postCode <=", value, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeLike(String value) {
            addCriterion("postCode like", value, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeNotLike(String value) {
            addCriterion("postCode not like", value, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("postCode in", values, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("postCode not in", values, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("postCode between", value1, value2, "postCode");
            return (Criteria) this;
        }
        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("postCode not between", value1, value2, "postCode");
            return (Criteria) this;
        }
        public Criteria andAddNickNameIsNull() {
            addCriterion("addNickName is null");
            return (Criteria) this;
        }
        public Criteria andAddNickNameIsNotNull() {
            addCriterion("addNickName is not null");
            return (Criteria) this;
        }
        public Criteria andAddNickNameEqualTo(String value) {
            addCriterion("addNickName =", value, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameNotEqualTo(String value) {
            addCriterion("addNickName <>", value, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameGreaterThan(String value) {
            addCriterion("addNickName >", value, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("addNickName >=", value, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameLessThan(String value) {
            addCriterion("addNickName <", value, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameLessThanOrEqualTo(String value) {
            addCriterion("addNickName <=", value, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameLike(String value) {
            addCriterion("addNickName like", value, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameNotLike(String value) {
            addCriterion("addNickName not like", value, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameIn(List<String> values) {
            addCriterion("addNickName in", values, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameNotIn(List<String> values) {
            addCriterion("addNickName not in", values, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameBetween(String value1, String value2) {
            addCriterion("addNickName between", value1, value2, "addNickName");
            return (Criteria) this;
        }
        public Criteria andAddNickNameNotBetween(String value1, String value2) {
            addCriterion("addNickName not between", value1, value2, "addNickName");
            return (Criteria) this;
        }
        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }
        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }
        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }
        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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
        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }
        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }
        public Criteria andGenderEqualTo(Byte value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }
        public Criteria andGenderNotEqualTo(Byte value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }
        public Criteria andGenderGreaterThan(Byte value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }
        public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }
        public Criteria andGenderLessThan(Byte value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }
        public Criteria andGenderLessThanOrEqualTo(Byte value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }
        public Criteria andGenderIn(List<Byte> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }
        public Criteria andGenderNotIn(List<Byte> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }
        public Criteria andGenderBetween(Byte value1, Byte value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }
        public Criteria andGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }
        public Criteria andIsStairIsNull() {
            addCriterion("isStair is null");
            return (Criteria) this;
        }
        public Criteria andIsStairIsNotNull() {
            addCriterion("isStair is not null");
            return (Criteria) this;
        }
        public Criteria andIsStairEqualTo(Byte value) {
            addCriterion("isStair =", value, "isStair");
            return (Criteria) this;
        }
        public Criteria andIsStairNotEqualTo(Byte value) {
            addCriterion("isStair <>", value, "isStair");
            return (Criteria) this;
        }
        public Criteria andIsStairGreaterThan(Byte value) {
            addCriterion("isStair >", value, "isStair");
            return (Criteria) this;
        }
        public Criteria andIsStairGreaterThanOrEqualTo(Byte value) {
            addCriterion("isStair >=", value, "isStair");
            return (Criteria) this;
        }
        public Criteria andIsStairLessThan(Byte value) {
            addCriterion("isStair <", value, "isStair");
            return (Criteria) this;
        }
        public Criteria andIsStairLessThanOrEqualTo(Byte value) {
            addCriterion("isStair <=", value, "isStair");
            return (Criteria) this;
        }
        public Criteria andIsStairIn(List<Byte> values) {
            addCriterion("isStair in", values, "isStair");
            return (Criteria) this;
        }
        public Criteria andIsStairNotIn(List<Byte> values) {
            addCriterion("isStair not in", values, "isStair");
            return (Criteria) this;
        }
        public Criteria andIsStairBetween(Byte value1, Byte value2) {
            addCriterion("isStair between", value1, value2, "isStair");
            return (Criteria) this;
        }
        public Criteria andIsStairNotBetween(Byte value1, Byte value2) {
            addCriterion("isStair not between", value1, value2, "isStair");
            return (Criteria) this;
        }
        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }
        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }
        public Criteria andLabelEqualTo(Byte value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }
        public Criteria andLabelNotEqualTo(Byte value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }
        public Criteria andLabelGreaterThan(Byte value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }
        public Criteria andLabelGreaterThanOrEqualTo(Byte value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }
        public Criteria andLabelLessThan(Byte value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }
        public Criteria andLabelLessThanOrEqualTo(Byte value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }
        public Criteria andLabelIn(List<Byte> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }
        public Criteria andLabelNotIn(List<Byte> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }
        public Criteria andLabelBetween(Byte value1, Byte value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }
        public Criteria andLabelNotBetween(Byte value1, Byte value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }
        public Criteria andIsDefaultIsNull() {
            addCriterion("isDefault is null");
            return (Criteria) this;
        }
        public Criteria andIsDefaultIsNotNull() {
            addCriterion("isDefault is not null");
            return (Criteria) this;
        }
        public Criteria andIsDefaultEqualTo(Byte value) {
            addCriterion("isDefault =", value, "isDefault");
            return (Criteria) this;
        }
        public Criteria andIsDefaultNotEqualTo(Byte value) {
            addCriterion("isDefault <>", value, "isDefault");
            return (Criteria) this;
        }
        public Criteria andIsDefaultGreaterThan(Byte value) {
            addCriterion("isDefault >", value, "isDefault");
            return (Criteria) this;
        }
        public Criteria andIsDefaultGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDefault >=", value, "isDefault");
            return (Criteria) this;
        }
        public Criteria andIsDefaultLessThan(Byte value) {
            addCriterion("isDefault <", value, "isDefault");
            return (Criteria) this;
        }
        public Criteria andIsDefaultLessThanOrEqualTo(Byte value) {
            addCriterion("isDefault <=", value, "isDefault");
            return (Criteria) this;
        }
        public Criteria andIsDefaultIn(List<Byte> values) {
            addCriterion("isDefault in", values, "isDefault");
            return (Criteria) this;
        }
        public Criteria andIsDefaultNotIn(List<Byte> values) {
            addCriterion("isDefault not in", values, "isDefault");
            return (Criteria) this;
        }
        public Criteria andIsDefaultBetween(Byte value1, Byte value2) {
            addCriterion("isDefault between", value1, value2, "isDefault");
            return (Criteria) this;
        }
        public Criteria andIsDefaultNotBetween(Byte value1, Byte value2) {
            addCriterion("isDefault not between", value1, value2, "isDefault");
            return (Criteria) this;
        }
        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }
        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }
        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }
        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }
        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }
        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }
        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }
        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }
        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }
        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }
        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }
        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }
        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }
        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }
        public Criteria andProvinceEqualTo(Long value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceNotEqualTo(Long value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceGreaterThan(Long value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceGreaterThanOrEqualTo(Long value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceLessThan(Long value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceLessThanOrEqualTo(Long value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceIn(List<Long> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceNotIn(List<Long> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceBetween(Long value1, Long value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceNotBetween(Long value1, Long value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }
        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }
        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }
        public Criteria andCityEqualTo(Long value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityNotEqualTo(Long value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityGreaterThan(Long value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityGreaterThanOrEqualTo(Long value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityLessThan(Long value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityLessThanOrEqualTo(Long value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityIn(List<Long> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }
        public Criteria andCityNotIn(List<Long> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }
        public Criteria andCityBetween(Long value1, Long value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }
        public Criteria andCityNotBetween(Long value1, Long value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }
        public Criteria andCoordinateIsNull() {
            addCriterion("coordinate is null");
            return (Criteria) this;
        }
        public Criteria andCoordinateIsNotNull() {
            addCriterion("coordinate is not null");
            return (Criteria) this;
        }
        public Criteria andCoordinateEqualTo(String value) {
            addCriterion("coordinate =", value, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateNotEqualTo(String value) {
            addCriterion("coordinate <>", value, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateGreaterThan(String value) {
            addCriterion("coordinate >", value, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("coordinate >=", value, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateLessThan(String value) {
            addCriterion("coordinate <", value, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateLessThanOrEqualTo(String value) {
            addCriterion("coordinate <=", value, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateLike(String value) {
            addCriterion("coordinate like", value, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateNotLike(String value) {
            addCriterion("coordinate not like", value, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateIn(List<String> values) {
            addCriterion("coordinate in", values, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateNotIn(List<String> values) {
            addCriterion("coordinate not in", values, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateBetween(String value1, String value2) {
            addCriterion("coordinate between", value1, value2, "coordinate");
            return (Criteria) this;
        }
        public Criteria andCoordinateNotBetween(String value1, String value2) {
            addCriterion("coordinate not between", value1, value2, "coordinate");
            return (Criteria) this;
        }
        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }
        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }
        public Criteria andAreaEqualTo(Long value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaNotEqualTo(Long value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaGreaterThan(Long value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaLessThan(Long value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaLessThanOrEqualTo(Long value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaIn(List<Long> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }
        public Criteria andAreaNotIn(List<Long> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }
        public Criteria andAreaBetween(Long value1, Long value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }
        public Criteria andAreaNotBetween(Long value1, Long value2) {
            addCriterion("area not between", value1, value2, "area");
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
        public Criteria andReceiverLikeInsensitive(String value) {
            addCriterion("upper(receiver) like", value.toUpperCase(), "receiver");
            return (Criteria) this;
        }
        public Criteria andTelPhoneLikeInsensitive(String value) {
            addCriterion("upper(telPhone) like", value.toUpperCase(), "telPhone");
            return (Criteria) this;
        }
        public Criteria andHomeTelLikeInsensitive(String value) {
            addCriterion("upper(homeTel) like", value.toUpperCase(), "homeTel");
            return (Criteria) this;
        }
        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }
        public Criteria andAddressInfoLikeInsensitive(String value) {
            addCriterion("upper(addressInfo) like", value.toUpperCase(), "addressInfo");
            return (Criteria) this;
        }
        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }
        public Criteria andPostCodeLikeInsensitive(String value) {
            addCriterion("upper(postCode) like", value.toUpperCase(), "postCode");
            return (Criteria) this;
        }
        public Criteria andAddNickNameLikeInsensitive(String value) {
            addCriterion("upper(addNickName) like", value.toUpperCase(), "addNickName");
            return (Criteria) this;
        }
        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }
        public Criteria andCoordinateLikeInsensitive(String value) {
            addCriterion("upper(coordinate) like", value.toUpperCase(), "coordinate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 收货地址表
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