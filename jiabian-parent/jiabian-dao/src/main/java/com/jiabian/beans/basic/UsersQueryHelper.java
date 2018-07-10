/*
 * UsersQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-23 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public UsersQueryHelper() {
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
     * 用户表
     * 
     * @author 菠萝大象
     * @version 1.0 2016-12-23
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
        public Criteria andUserTelIsNull() {
            addCriterion("userTel is null");
            return (Criteria) this;
        }
        public Criteria andUserTelIsNotNull() {
            addCriterion("userTel is not null");
            return (Criteria) this;
        }
        public Criteria andUserTelEqualTo(String value) {
            addCriterion("userTel =", value, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("userTel <>", value, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("userTel >", value, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("userTel >=", value, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelLessThan(String value) {
            addCriterion("userTel <", value, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("userTel <=", value, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelLike(String value) {
            addCriterion("userTel like", value, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelNotLike(String value) {
            addCriterion("userTel not like", value, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelIn(List<String> values) {
            addCriterion("userTel in", values, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("userTel not in", values, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("userTel between", value1, value2, "userTel");
            return (Criteria) this;
        }
        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("userTel not between", value1, value2, "userTel");
            return (Criteria) this;
        }
        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }
        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }
        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }
        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }
        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }
        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }
        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }
        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }
        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }
        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }
        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }
        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }
        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }
        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }
        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }
        public Criteria andUserPwdIsNull() {
            addCriterion("userPwd is null");
            return (Criteria) this;
        }
        public Criteria andUserPwdIsNotNull() {
            addCriterion("userPwd is not null");
            return (Criteria) this;
        }
        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("userPwd =", value, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("userPwd <>", value, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("userPwd >", value, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("userPwd >=", value, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdLessThan(String value) {
            addCriterion("userPwd <", value, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("userPwd <=", value, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdLike(String value) {
            addCriterion("userPwd like", value, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdNotLike(String value) {
            addCriterion("userPwd not like", value, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("userPwd in", values, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("userPwd not in", values, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("userPwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("userPwd not between", value1, value2, "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserSaltIsNull() {
            addCriterion("userSalt is null");
            return (Criteria) this;
        }
        public Criteria andUserSaltIsNotNull() {
            addCriterion("userSalt is not null");
            return (Criteria) this;
        }
        public Criteria andUserSaltEqualTo(String value) {
            addCriterion("userSalt =", value, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltNotEqualTo(String value) {
            addCriterion("userSalt <>", value, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltGreaterThan(String value) {
            addCriterion("userSalt >", value, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltGreaterThanOrEqualTo(String value) {
            addCriterion("userSalt >=", value, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltLessThan(String value) {
            addCriterion("userSalt <", value, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltLessThanOrEqualTo(String value) {
            addCriterion("userSalt <=", value, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltLike(String value) {
            addCriterion("userSalt like", value, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltNotLike(String value) {
            addCriterion("userSalt not like", value, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltIn(List<String> values) {
            addCriterion("userSalt in", values, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltNotIn(List<String> values) {
            addCriterion("userSalt not in", values, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltBetween(String value1, String value2) {
            addCriterion("userSalt between", value1, value2, "userSalt");
            return (Criteria) this;
        }
        public Criteria andUserSaltNotBetween(String value1, String value2) {
            addCriterion("userSalt not between", value1, value2, "userSalt");
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
        public Criteria andLastLogTimeIsNull() {
            addCriterion("lastLogTime is null");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeIsNotNull() {
            addCriterion("lastLogTime is not null");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeEqualTo(Date value) {
            addCriterion("lastLogTime =", value, "lastLogTime");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeNotEqualTo(Date value) {
            addCriterion("lastLogTime <>", value, "lastLogTime");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeGreaterThan(Date value) {
            addCriterion("lastLogTime >", value, "lastLogTime");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLogTime >=", value, "lastLogTime");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeLessThan(Date value) {
            addCriterion("lastLogTime <", value, "lastLogTime");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("lastLogTime <=", value, "lastLogTime");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeIn(List<Date> values) {
            addCriterion("lastLogTime in", values, "lastLogTime");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeNotIn(List<Date> values) {
            addCriterion("lastLogTime not in", values, "lastLogTime");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeBetween(Date value1, Date value2) {
            addCriterion("lastLogTime between", value1, value2, "lastLogTime");
            return (Criteria) this;
        }
        public Criteria andLastLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("lastLogTime not between", value1, value2, "lastLogTime");
            return (Criteria) this;
        }
        public Criteria andPorovinceIsNull() {
            addCriterion("porovince is null");
            return (Criteria) this;
        }
        public Criteria andPorovinceIsNotNull() {
            addCriterion("porovince is not null");
            return (Criteria) this;
        }
        public Criteria andPorovinceEqualTo(Integer value) {
            addCriterion("porovince =", value, "porovince");
            return (Criteria) this;
        }
        public Criteria andPorovinceNotEqualTo(Integer value) {
            addCriterion("porovince <>", value, "porovince");
            return (Criteria) this;
        }
        public Criteria andPorovinceGreaterThan(Integer value) {
            addCriterion("porovince >", value, "porovince");
            return (Criteria) this;
        }
        public Criteria andPorovinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("porovince >=", value, "porovince");
            return (Criteria) this;
        }
        public Criteria andPorovinceLessThan(Integer value) {
            addCriterion("porovince <", value, "porovince");
            return (Criteria) this;
        }
        public Criteria andPorovinceLessThanOrEqualTo(Integer value) {
            addCriterion("porovince <=", value, "porovince");
            return (Criteria) this;
        }
        public Criteria andPorovinceIn(List<Integer> values) {
            addCriterion("porovince in", values, "porovince");
            return (Criteria) this;
        }
        public Criteria andPorovinceNotIn(List<Integer> values) {
            addCriterion("porovince not in", values, "porovince");
            return (Criteria) this;
        }
        public Criteria andPorovinceBetween(Integer value1, Integer value2) {
            addCriterion("porovince between", value1, value2, "porovince");
            return (Criteria) this;
        }
        public Criteria andPorovinceNotBetween(Integer value1, Integer value2) {
            addCriterion("porovince not between", value1, value2, "porovince");
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
        public Criteria andUserShopNumIsNull() {
            addCriterion("userShopNum is null");
            return (Criteria) this;
        }
        public Criteria andUserShopNumIsNotNull() {
            addCriterion("userShopNum is not null");
            return (Criteria) this;
        }
        public Criteria andUserShopNumEqualTo(Integer value) {
            addCriterion("userShopNum =", value, "userShopNum");
            return (Criteria) this;
        }
        public Criteria andUserShopNumNotEqualTo(Integer value) {
            addCriterion("userShopNum <>", value, "userShopNum");
            return (Criteria) this;
        }
        public Criteria andUserShopNumGreaterThan(Integer value) {
            addCriterion("userShopNum >", value, "userShopNum");
            return (Criteria) this;
        }
        public Criteria andUserShopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("userShopNum >=", value, "userShopNum");
            return (Criteria) this;
        }
        public Criteria andUserShopNumLessThan(Integer value) {
            addCriterion("userShopNum <", value, "userShopNum");
            return (Criteria) this;
        }
        public Criteria andUserShopNumLessThanOrEqualTo(Integer value) {
            addCriterion("userShopNum <=", value, "userShopNum");
            return (Criteria) this;
        }
        public Criteria andUserShopNumIn(List<Integer> values) {
            addCriterion("userShopNum in", values, "userShopNum");
            return (Criteria) this;
        }
        public Criteria andUserShopNumNotIn(List<Integer> values) {
            addCriterion("userShopNum not in", values, "userShopNum");
            return (Criteria) this;
        }
        public Criteria andUserShopNumBetween(Integer value1, Integer value2) {
            addCriterion("userShopNum between", value1, value2, "userShopNum");
            return (Criteria) this;
        }
        public Criteria andUserShopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("userShopNum not between", value1, value2, "userShopNum");
            return (Criteria) this;
        }
        public Criteria andUserProdNumIsNull() {
            addCriterion("userProdNum is null");
            return (Criteria) this;
        }
        public Criteria andUserProdNumIsNotNull() {
            addCriterion("userProdNum is not null");
            return (Criteria) this;
        }
        public Criteria andUserProdNumEqualTo(Integer value) {
            addCriterion("userProdNum =", value, "userProdNum");
            return (Criteria) this;
        }
        public Criteria andUserProdNumNotEqualTo(Integer value) {
            addCriterion("userProdNum <>", value, "userProdNum");
            return (Criteria) this;
        }
        public Criteria andUserProdNumGreaterThan(Integer value) {
            addCriterion("userProdNum >", value, "userProdNum");
            return (Criteria) this;
        }
        public Criteria andUserProdNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("userProdNum >=", value, "userProdNum");
            return (Criteria) this;
        }
        public Criteria andUserProdNumLessThan(Integer value) {
            addCriterion("userProdNum <", value, "userProdNum");
            return (Criteria) this;
        }
        public Criteria andUserProdNumLessThanOrEqualTo(Integer value) {
            addCriterion("userProdNum <=", value, "userProdNum");
            return (Criteria) this;
        }
        public Criteria andUserProdNumIn(List<Integer> values) {
            addCriterion("userProdNum in", values, "userProdNum");
            return (Criteria) this;
        }
        public Criteria andUserProdNumNotIn(List<Integer> values) {
            addCriterion("userProdNum not in", values, "userProdNum");
            return (Criteria) this;
        }
        public Criteria andUserProdNumBetween(Integer value1, Integer value2) {
            addCriterion("userProdNum between", value1, value2, "userProdNum");
            return (Criteria) this;
        }
        public Criteria andUserProdNumNotBetween(Integer value1, Integer value2) {
            addCriterion("userProdNum not between", value1, value2, "userProdNum");
            return (Criteria) this;
        }
        public Criteria andUserSourceIsNull() {
            addCriterion("userSource is null");
            return (Criteria) this;
        }
        public Criteria andUserSourceIsNotNull() {
            addCriterion("userSource is not null");
            return (Criteria) this;
        }
        public Criteria andUserSourceEqualTo(Byte value) {
            addCriterion("userSource =", value, "userSource");
            return (Criteria) this;
        }
        public Criteria andUserSourceNotEqualTo(Byte value) {
            addCriterion("userSource <>", value, "userSource");
            return (Criteria) this;
        }
        public Criteria andUserSourceGreaterThan(Byte value) {
            addCriterion("userSource >", value, "userSource");
            return (Criteria) this;
        }
        public Criteria andUserSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("userSource >=", value, "userSource");
            return (Criteria) this;
        }
        public Criteria andUserSourceLessThan(Byte value) {
            addCriterion("userSource <", value, "userSource");
            return (Criteria) this;
        }
        public Criteria andUserSourceLessThanOrEqualTo(Byte value) {
            addCriterion("userSource <=", value, "userSource");
            return (Criteria) this;
        }
        public Criteria andUserSourceIn(List<Byte> values) {
            addCriterion("userSource in", values, "userSource");
            return (Criteria) this;
        }
        public Criteria andUserSourceNotIn(List<Byte> values) {
            addCriterion("userSource not in", values, "userSource");
            return (Criteria) this;
        }
        public Criteria andUserSourceBetween(Byte value1, Byte value2) {
            addCriterion("userSource between", value1, value2, "userSource");
            return (Criteria) this;
        }
        public Criteria andUserSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("userSource not between", value1, value2, "userSource");
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
        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }
        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }
        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }
        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
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
        public Criteria andIsChangeNameIsNull() {
            addCriterion("isChangeName is null");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameIsNotNull() {
            addCriterion("isChangeName is not null");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameEqualTo(Byte value) {
            addCriterion("isChangeName =", value, "isChangeName");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameNotEqualTo(Byte value) {
            addCriterion("isChangeName <>", value, "isChangeName");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameGreaterThan(Byte value) {
            addCriterion("isChangeName >", value, "isChangeName");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameGreaterThanOrEqualTo(Byte value) {
            addCriterion("isChangeName >=", value, "isChangeName");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameLessThan(Byte value) {
            addCriterion("isChangeName <", value, "isChangeName");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameLessThanOrEqualTo(Byte value) {
            addCriterion("isChangeName <=", value, "isChangeName");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameIn(List<Byte> values) {
            addCriterion("isChangeName in", values, "isChangeName");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameNotIn(List<Byte> values) {
            addCriterion("isChangeName not in", values, "isChangeName");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameBetween(Byte value1, Byte value2) {
            addCriterion("isChangeName between", value1, value2, "isChangeName");
            return (Criteria) this;
        }
        public Criteria andIsChangeNameNotBetween(Byte value1, Byte value2) {
            addCriterion("isChangeName not between", value1, value2, "isChangeName");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginIsNull() {
            addCriterion("isFirstLogin is null");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginIsNotNull() {
            addCriterion("isFirstLogin is not null");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginEqualTo(Byte value) {
            addCriterion("isFirstLogin =", value, "isFirstLogin");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginNotEqualTo(Byte value) {
            addCriterion("isFirstLogin <>", value, "isFirstLogin");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginGreaterThan(Byte value) {
            addCriterion("isFirstLogin >", value, "isFirstLogin");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginGreaterThanOrEqualTo(Byte value) {
            addCriterion("isFirstLogin >=", value, "isFirstLogin");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginLessThan(Byte value) {
            addCriterion("isFirstLogin <", value, "isFirstLogin");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginLessThanOrEqualTo(Byte value) {
            addCriterion("isFirstLogin <=", value, "isFirstLogin");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginIn(List<Byte> values) {
            addCriterion("isFirstLogin in", values, "isFirstLogin");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginNotIn(List<Byte> values) {
            addCriterion("isFirstLogin not in", values, "isFirstLogin");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginBetween(Byte value1, Byte value2) {
            addCriterion("isFirstLogin between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }
        public Criteria andIsFirstLoginNotBetween(Byte value1, Byte value2) {
            addCriterion("isFirstLogin not between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }
        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }
        public Criteria andUserTelLikeInsensitive(String value) {
            addCriterion("upper(userTel) like", value.toUpperCase(), "userTel");
            return (Criteria) this;
        }
        public Criteria andUserNameLikeInsensitive(String value) {
            addCriterion("upper(userName) like", value.toUpperCase(), "userName");
            return (Criteria) this;
        }
        public Criteria andUserPwdLikeInsensitive(String value) {
            addCriterion("upper(userPwd) like", value.toUpperCase(), "userPwd");
            return (Criteria) this;
        }
        public Criteria andUserSaltLikeInsensitive(String value) {
            addCriterion("upper(userSalt) like", value.toUpperCase(), "userSalt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 用户表
     * 
     * @author 菠萝大象
     * @version 1.0 2016-12-23
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