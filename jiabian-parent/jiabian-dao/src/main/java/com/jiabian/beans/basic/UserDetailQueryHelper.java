/*
 * UserDetailQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-04-18 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserDetailQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public UserDetailQueryHelper() {
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
     * 用户详情表
     * 
     * @author 菠萝大象
     * @version 1.0 2017-04-18
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
        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }
        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }
        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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
        public Criteria andRealNameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }
        public Criteria andRealNameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }
        public Criteria andRealNameEqualTo(String value) {
            addCriterion("realName =", value, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("realName >", value, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameLessThan(String value) {
            addCriterion("realName <", value, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameLike(String value) {
            addCriterion("realName like", value, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameNotLike(String value) {
            addCriterion("realName not like", value, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameIn(List<String> values) {
            addCriterion("realName in", values, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realName");
            return (Criteria) this;
        }
        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realName");
            return (Criteria) this;
        }
        public Criteria andIdCardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }
        public Criteria andIdCardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }
        public Criteria andIdCardEqualTo(String value) {
            addCriterion("idCard =", value, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("idCard >", value, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardLessThan(String value) {
            addCriterion("idCard <", value, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardLike(String value) {
            addCriterion("idCard like", value, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardNotLike(String value) {
            addCriterion("idCard not like", value, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardIn(List<String> values) {
            addCriterion("idCard in", values, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idCard");
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
        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }
        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }
        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }
        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }
        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }
        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }
        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }
        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }
        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }
        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }
        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }
        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }
        public Criteria andHobbyIsNull() {
            addCriterion("hobby is null");
            return (Criteria) this;
        }
        public Criteria andHobbyIsNotNull() {
            addCriterion("hobby is not null");
            return (Criteria) this;
        }
        public Criteria andHobbyEqualTo(String value) {
            addCriterion("hobby =", value, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("hobby <>", value, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("hobby >", value, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("hobby >=", value, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyLessThan(String value) {
            addCriterion("hobby <", value, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("hobby <=", value, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyLike(String value) {
            addCriterion("hobby like", value, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyNotLike(String value) {
            addCriterion("hobby not like", value, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyIn(List<String> values) {
            addCriterion("hobby in", values, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("hobby not in", values, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }
        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }
        public Criteria andUserImgIsNull() {
            addCriterion("userImg is null");
            return (Criteria) this;
        }
        public Criteria andUserImgIsNotNull() {
            addCriterion("userImg is not null");
            return (Criteria) this;
        }
        public Criteria andUserImgEqualTo(String value) {
            addCriterion("userImg =", value, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgNotEqualTo(String value) {
            addCriterion("userImg <>", value, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgGreaterThan(String value) {
            addCriterion("userImg >", value, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgGreaterThanOrEqualTo(String value) {
            addCriterion("userImg >=", value, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgLessThan(String value) {
            addCriterion("userImg <", value, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgLessThanOrEqualTo(String value) {
            addCriterion("userImg <=", value, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgLike(String value) {
            addCriterion("userImg like", value, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgNotLike(String value) {
            addCriterion("userImg not like", value, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgIn(List<String> values) {
            addCriterion("userImg in", values, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgNotIn(List<String> values) {
            addCriterion("userImg not in", values, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgBetween(String value1, String value2) {
            addCriterion("userImg between", value1, value2, "userImg");
            return (Criteria) this;
        }
        public Criteria andUserImgNotBetween(String value1, String value2) {
            addCriterion("userImg not between", value1, value2, "userImg");
            return (Criteria) this;
        }
        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }
        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }
        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }
        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }
        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }
        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }
        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }
        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }
        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }
        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }
        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }
        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }
        public Criteria andShoppingNumIsNull() {
            addCriterion("shoppingNum is null");
            return (Criteria) this;
        }
        public Criteria andShoppingNumIsNotNull() {
            addCriterion("shoppingNum is not null");
            return (Criteria) this;
        }
        public Criteria andShoppingNumEqualTo(Integer value) {
            addCriterion("shoppingNum =", value, "shoppingNum");
            return (Criteria) this;
        }
        public Criteria andShoppingNumNotEqualTo(Integer value) {
            addCriterion("shoppingNum <>", value, "shoppingNum");
            return (Criteria) this;
        }
        public Criteria andShoppingNumGreaterThan(Integer value) {
            addCriterion("shoppingNum >", value, "shoppingNum");
            return (Criteria) this;
        }
        public Criteria andShoppingNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoppingNum >=", value, "shoppingNum");
            return (Criteria) this;
        }
        public Criteria andShoppingNumLessThan(Integer value) {
            addCriterion("shoppingNum <", value, "shoppingNum");
            return (Criteria) this;
        }
        public Criteria andShoppingNumLessThanOrEqualTo(Integer value) {
            addCriterion("shoppingNum <=", value, "shoppingNum");
            return (Criteria) this;
        }
        public Criteria andShoppingNumIn(List<Integer> values) {
            addCriterion("shoppingNum in", values, "shoppingNum");
            return (Criteria) this;
        }
        public Criteria andShoppingNumNotIn(List<Integer> values) {
            addCriterion("shoppingNum not in", values, "shoppingNum");
            return (Criteria) this;
        }
        public Criteria andShoppingNumBetween(Integer value1, Integer value2) {
            addCriterion("shoppingNum between", value1, value2, "shoppingNum");
            return (Criteria) this;
        }
        public Criteria andShoppingNumNotBetween(Integer value1, Integer value2) {
            addCriterion("shoppingNum not between", value1, value2, "shoppingNum");
            return (Criteria) this;
        }
        public Criteria andGrowthValIsNull() {
            addCriterion("growthVal is null");
            return (Criteria) this;
        }
        public Criteria andGrowthValIsNotNull() {
            addCriterion("growthVal is not null");
            return (Criteria) this;
        }
        public Criteria andGrowthValEqualTo(Integer value) {
            addCriterion("growthVal =", value, "growthVal");
            return (Criteria) this;
        }
        public Criteria andGrowthValNotEqualTo(Integer value) {
            addCriterion("growthVal <>", value, "growthVal");
            return (Criteria) this;
        }
        public Criteria andGrowthValGreaterThan(Integer value) {
            addCriterion("growthVal >", value, "growthVal");
            return (Criteria) this;
        }
        public Criteria andGrowthValGreaterThanOrEqualTo(Integer value) {
            addCriterion("growthVal >=", value, "growthVal");
            return (Criteria) this;
        }
        public Criteria andGrowthValLessThan(Integer value) {
            addCriterion("growthVal <", value, "growthVal");
            return (Criteria) this;
        }
        public Criteria andGrowthValLessThanOrEqualTo(Integer value) {
            addCriterion("growthVal <=", value, "growthVal");
            return (Criteria) this;
        }
        public Criteria andGrowthValIn(List<Integer> values) {
            addCriterion("growthVal in", values, "growthVal");
            return (Criteria) this;
        }
        public Criteria andGrowthValNotIn(List<Integer> values) {
            addCriterion("growthVal not in", values, "growthVal");
            return (Criteria) this;
        }
        public Criteria andGrowthValBetween(Integer value1, Integer value2) {
            addCriterion("growthVal between", value1, value2, "growthVal");
            return (Criteria) this;
        }
        public Criteria andGrowthValNotBetween(Integer value1, Integer value2) {
            addCriterion("growthVal not between", value1, value2, "growthVal");
            return (Criteria) this;
        }
        public Criteria andPhoneVerIsNull() {
            addCriterion("phoneVer is null");
            return (Criteria) this;
        }
        public Criteria andPhoneVerIsNotNull() {
            addCriterion("phoneVer is not null");
            return (Criteria) this;
        }
        public Criteria andPhoneVerEqualTo(Byte value) {
            addCriterion("phoneVer =", value, "phoneVer");
            return (Criteria) this;
        }
        public Criteria andPhoneVerNotEqualTo(Byte value) {
            addCriterion("phoneVer <>", value, "phoneVer");
            return (Criteria) this;
        }
        public Criteria andPhoneVerGreaterThan(Byte value) {
            addCriterion("phoneVer >", value, "phoneVer");
            return (Criteria) this;
        }
        public Criteria andPhoneVerGreaterThanOrEqualTo(Byte value) {
            addCriterion("phoneVer >=", value, "phoneVer");
            return (Criteria) this;
        }
        public Criteria andPhoneVerLessThan(Byte value) {
            addCriterion("phoneVer <", value, "phoneVer");
            return (Criteria) this;
        }
        public Criteria andPhoneVerLessThanOrEqualTo(Byte value) {
            addCriterion("phoneVer <=", value, "phoneVer");
            return (Criteria) this;
        }
        public Criteria andPhoneVerIn(List<Byte> values) {
            addCriterion("phoneVer in", values, "phoneVer");
            return (Criteria) this;
        }
        public Criteria andPhoneVerNotIn(List<Byte> values) {
            addCriterion("phoneVer not in", values, "phoneVer");
            return (Criteria) this;
        }
        public Criteria andPhoneVerBetween(Byte value1, Byte value2) {
            addCriterion("phoneVer between", value1, value2, "phoneVer");
            return (Criteria) this;
        }
        public Criteria andPhoneVerNotBetween(Byte value1, Byte value2) {
            addCriterion("phoneVer not between", value1, value2, "phoneVer");
            return (Criteria) this;
        }
        public Criteria andEmailVerIsNull() {
            addCriterion("emailVer is null");
            return (Criteria) this;
        }
        public Criteria andEmailVerIsNotNull() {
            addCriterion("emailVer is not null");
            return (Criteria) this;
        }
        public Criteria andEmailVerEqualTo(Byte value) {
            addCriterion("emailVer =", value, "emailVer");
            return (Criteria) this;
        }
        public Criteria andEmailVerNotEqualTo(Byte value) {
            addCriterion("emailVer <>", value, "emailVer");
            return (Criteria) this;
        }
        public Criteria andEmailVerGreaterThan(Byte value) {
            addCriterion("emailVer >", value, "emailVer");
            return (Criteria) this;
        }
        public Criteria andEmailVerGreaterThanOrEqualTo(Byte value) {
            addCriterion("emailVer >=", value, "emailVer");
            return (Criteria) this;
        }
        public Criteria andEmailVerLessThan(Byte value) {
            addCriterion("emailVer <", value, "emailVer");
            return (Criteria) this;
        }
        public Criteria andEmailVerLessThanOrEqualTo(Byte value) {
            addCriterion("emailVer <=", value, "emailVer");
            return (Criteria) this;
        }
        public Criteria andEmailVerIn(List<Byte> values) {
            addCriterion("emailVer in", values, "emailVer");
            return (Criteria) this;
        }
        public Criteria andEmailVerNotIn(List<Byte> values) {
            addCriterion("emailVer not in", values, "emailVer");
            return (Criteria) this;
        }
        public Criteria andEmailVerBetween(Byte value1, Byte value2) {
            addCriterion("emailVer between", value1, value2, "emailVer");
            return (Criteria) this;
        }
        public Criteria andEmailVerNotBetween(Byte value1, Byte value2) {
            addCriterion("emailVer not between", value1, value2, "emailVer");
            return (Criteria) this;
        }
        public Criteria andIdVerIsNull() {
            addCriterion("idVer is null");
            return (Criteria) this;
        }
        public Criteria andIdVerIsNotNull() {
            addCriterion("idVer is not null");
            return (Criteria) this;
        }
        public Criteria andIdVerEqualTo(Byte value) {
            addCriterion("idVer =", value, "idVer");
            return (Criteria) this;
        }
        public Criteria andIdVerNotEqualTo(Byte value) {
            addCriterion("idVer <>", value, "idVer");
            return (Criteria) this;
        }
        public Criteria andIdVerGreaterThan(Byte value) {
            addCriterion("idVer >", value, "idVer");
            return (Criteria) this;
        }
        public Criteria andIdVerGreaterThanOrEqualTo(Byte value) {
            addCriterion("idVer >=", value, "idVer");
            return (Criteria) this;
        }
        public Criteria andIdVerLessThan(Byte value) {
            addCriterion("idVer <", value, "idVer");
            return (Criteria) this;
        }
        public Criteria andIdVerLessThanOrEqualTo(Byte value) {
            addCriterion("idVer <=", value, "idVer");
            return (Criteria) this;
        }
        public Criteria andIdVerIn(List<Byte> values) {
            addCriterion("idVer in", values, "idVer");
            return (Criteria) this;
        }
        public Criteria andIdVerNotIn(List<Byte> values) {
            addCriterion("idVer not in", values, "idVer");
            return (Criteria) this;
        }
        public Criteria andIdVerBetween(Byte value1, Byte value2) {
            addCriterion("idVer between", value1, value2, "idVer");
            return (Criteria) this;
        }
        public Criteria andIdVerNotBetween(Byte value1, Byte value2) {
            addCriterion("idVer not between", value1, value2, "idVer");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeIsNull() {
            addCriterion("securityType is null");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeIsNotNull() {
            addCriterion("securityType is not null");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeEqualTo(Byte value) {
            addCriterion("securityType =", value, "securityType");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeNotEqualTo(Byte value) {
            addCriterion("securityType <>", value, "securityType");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeGreaterThan(Byte value) {
            addCriterion("securityType >", value, "securityType");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("securityType >=", value, "securityType");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeLessThan(Byte value) {
            addCriterion("securityType <", value, "securityType");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeLessThanOrEqualTo(Byte value) {
            addCriterion("securityType <=", value, "securityType");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeIn(List<Byte> values) {
            addCriterion("securityType in", values, "securityType");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeNotIn(List<Byte> values) {
            addCriterion("securityType not in", values, "securityType");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeBetween(Byte value1, Byte value2) {
            addCriterion("securityType between", value1, value2, "securityType");
            return (Criteria) this;
        }
        public Criteria andSecurityTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("securityType not between", value1, value2, "securityType");
            return (Criteria) this;
        }
        public Criteria andDeviceIsNull() {
            addCriterion("device is null");
            return (Criteria) this;
        }
        public Criteria andDeviceIsNotNull() {
            addCriterion("device is not null");
            return (Criteria) this;
        }
        public Criteria andDeviceEqualTo(String value) {
            addCriterion("device =", value, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceNotEqualTo(String value) {
            addCriterion("device <>", value, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceGreaterThan(String value) {
            addCriterion("device >", value, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("device >=", value, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceLessThan(String value) {
            addCriterion("device <", value, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceLessThanOrEqualTo(String value) {
            addCriterion("device <=", value, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceLike(String value) {
            addCriterion("device like", value, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceNotLike(String value) {
            addCriterion("device not like", value, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceIn(List<String> values) {
            addCriterion("device in", values, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceNotIn(List<String> values) {
            addCriterion("device not in", values, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceBetween(String value1, String value2) {
            addCriterion("device between", value1, value2, "device");
            return (Criteria) this;
        }
        public Criteria andDeviceNotBetween(String value1, String value2) {
            addCriterion("device not between", value1, value2, "device");
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
        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }
        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }
        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }
        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }
        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }
        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }
        public Criteria andQqopenIdIsNull() {
            addCriterion("qqopenId is null");
            return (Criteria) this;
        }
        public Criteria andQqopenIdIsNotNull() {
            addCriterion("qqopenId is not null");
            return (Criteria) this;
        }
        public Criteria andQqopenIdEqualTo(String value) {
            addCriterion("qqopenId =", value, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdNotEqualTo(String value) {
            addCriterion("qqopenId <>", value, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdGreaterThan(String value) {
            addCriterion("qqopenId >", value, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdGreaterThanOrEqualTo(String value) {
            addCriterion("qqopenId >=", value, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdLessThan(String value) {
            addCriterion("qqopenId <", value, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdLessThanOrEqualTo(String value) {
            addCriterion("qqopenId <=", value, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdLike(String value) {
            addCriterion("qqopenId like", value, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdNotLike(String value) {
            addCriterion("qqopenId not like", value, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdIn(List<String> values) {
            addCriterion("qqopenId in", values, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdNotIn(List<String> values) {
            addCriterion("qqopenId not in", values, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdBetween(String value1, String value2) {
            addCriterion("qqopenId between", value1, value2, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andQqopenIdNotBetween(String value1, String value2) {
            addCriterion("qqopenId not between", value1, value2, "qqopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdIsNull() {
            addCriterion("weixinopenId is null");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdIsNotNull() {
            addCriterion("weixinopenId is not null");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdEqualTo(String value) {
            addCriterion("weixinopenId =", value, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdNotEqualTo(String value) {
            addCriterion("weixinopenId <>", value, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdGreaterThan(String value) {
            addCriterion("weixinopenId >", value, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdGreaterThanOrEqualTo(String value) {
            addCriterion("weixinopenId >=", value, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdLessThan(String value) {
            addCriterion("weixinopenId <", value, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdLessThanOrEqualTo(String value) {
            addCriterion("weixinopenId <=", value, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdLike(String value) {
            addCriterion("weixinopenId like", value, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdNotLike(String value) {
            addCriterion("weixinopenId not like", value, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdIn(List<String> values) {
            addCriterion("weixinopenId in", values, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdNotIn(List<String> values) {
            addCriterion("weixinopenId not in", values, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdBetween(String value1, String value2) {
            addCriterion("weixinopenId between", value1, value2, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdNotBetween(String value1, String value2) {
            addCriterion("weixinopenId not between", value1, value2, "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdIsNull() {
            addCriterion("weiboopenId is null");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdIsNotNull() {
            addCriterion("weiboopenId is not null");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdEqualTo(String value) {
            addCriterion("weiboopenId =", value, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdNotEqualTo(String value) {
            addCriterion("weiboopenId <>", value, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdGreaterThan(String value) {
            addCriterion("weiboopenId >", value, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdGreaterThanOrEqualTo(String value) {
            addCriterion("weiboopenId >=", value, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdLessThan(String value) {
            addCriterion("weiboopenId <", value, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdLessThanOrEqualTo(String value) {
            addCriterion("weiboopenId <=", value, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdLike(String value) {
            addCriterion("weiboopenId like", value, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdNotLike(String value) {
            addCriterion("weiboopenId not like", value, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdIn(List<String> values) {
            addCriterion("weiboopenId in", values, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdNotIn(List<String> values) {
            addCriterion("weiboopenId not in", values, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdBetween(String value1, String value2) {
            addCriterion("weiboopenId between", value1, value2, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdNotBetween(String value1, String value2) {
            addCriterion("weiboopenId not between", value1, value2, "weiboopenId");
            return (Criteria) this;
        }
        public Criteria andBookMarkIsNull() {
            addCriterion("bookMark is null");
            return (Criteria) this;
        }
        public Criteria andBookMarkIsNotNull() {
            addCriterion("bookMark is not null");
            return (Criteria) this;
        }
        public Criteria andBookMarkEqualTo(Integer value) {
            addCriterion("bookMark =", value, "bookMark");
            return (Criteria) this;
        }
        public Criteria andBookMarkNotEqualTo(Integer value) {
            addCriterion("bookMark <>", value, "bookMark");
            return (Criteria) this;
        }
        public Criteria andBookMarkGreaterThan(Integer value) {
            addCriterion("bookMark >", value, "bookMark");
            return (Criteria) this;
        }
        public Criteria andBookMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookMark >=", value, "bookMark");
            return (Criteria) this;
        }
        public Criteria andBookMarkLessThan(Integer value) {
            addCriterion("bookMark <", value, "bookMark");
            return (Criteria) this;
        }
        public Criteria andBookMarkLessThanOrEqualTo(Integer value) {
            addCriterion("bookMark <=", value, "bookMark");
            return (Criteria) this;
        }
        public Criteria andBookMarkIn(List<Integer> values) {
            addCriterion("bookMark in", values, "bookMark");
            return (Criteria) this;
        }
        public Criteria andBookMarkNotIn(List<Integer> values) {
            addCriterion("bookMark not in", values, "bookMark");
            return (Criteria) this;
        }
        public Criteria andBookMarkBetween(Integer value1, Integer value2) {
            addCriterion("bookMark between", value1, value2, "bookMark");
            return (Criteria) this;
        }
        public Criteria andBookMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("bookMark not between", value1, value2, "bookMark");
            return (Criteria) this;
        }
        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }
        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }
        public Criteria andGradeEqualTo(Byte value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }
        public Criteria andGradeNotEqualTo(Byte value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }
        public Criteria andGradeGreaterThan(Byte value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }
        public Criteria andGradeGreaterThanOrEqualTo(Byte value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }
        public Criteria andGradeLessThan(Byte value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }
        public Criteria andGradeLessThanOrEqualTo(Byte value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }
        public Criteria andGradeIn(List<Byte> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }
        public Criteria andGradeNotIn(List<Byte> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }
        public Criteria andGradeBetween(Byte value1, Byte value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }
        public Criteria andGradeNotBetween(Byte value1, Byte value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }
        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }
        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }
        public Criteria andRankEqualTo(Byte value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }
        public Criteria andRankNotEqualTo(Byte value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }
        public Criteria andRankGreaterThan(Byte value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }
        public Criteria andRankGreaterThanOrEqualTo(Byte value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }
        public Criteria andRankLessThan(Byte value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }
        public Criteria andRankLessThanOrEqualTo(Byte value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }
        public Criteria andRankIn(List<Byte> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }
        public Criteria andRankNotIn(List<Byte> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }
        public Criteria andRankBetween(Byte value1, Byte value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }
        public Criteria andRankNotBetween(Byte value1, Byte value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }
        public Criteria andRealNameLikeInsensitive(String value) {
            addCriterion("upper(realName) like", value.toUpperCase(), "realName");
            return (Criteria) this;
        }
        public Criteria andIdCardLikeInsensitive(String value) {
            addCriterion("upper(idCard) like", value.toUpperCase(), "idCard");
            return (Criteria) this;
        }
        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }
        public Criteria andHobbyLikeInsensitive(String value) {
            addCriterion("upper(hobby) like", value.toUpperCase(), "hobby");
            return (Criteria) this;
        }
        public Criteria andUserImgLikeInsensitive(String value) {
            addCriterion("upper(userImg) like", value.toUpperCase(), "userImg");
            return (Criteria) this;
        }
        public Criteria andDeviceLikeInsensitive(String value) {
            addCriterion("upper(device) like", value.toUpperCase(), "device");
            return (Criteria) this;
        }
        public Criteria andSourceLikeInsensitive(String value) {
            addCriterion("upper(source) like", value.toUpperCase(), "source");
            return (Criteria) this;
        }
        public Criteria andQqopenIdLikeInsensitive(String value) {
            addCriterion("upper(qqopenId) like", value.toUpperCase(), "qqopenId");
            return (Criteria) this;
        }
        public Criteria andWeixinopenIdLikeInsensitive(String value) {
            addCriterion("upper(weixinopenId) like", value.toUpperCase(), "weixinopenId");
            return (Criteria) this;
        }
        public Criteria andWeiboopenIdLikeInsensitive(String value) {
            addCriterion("upper(weiboopenId) like", value.toUpperCase(), "weiboopenId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 用户详情表
     * 
     * @author 菠萝大象
     * @version 1.0 2017-04-18
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