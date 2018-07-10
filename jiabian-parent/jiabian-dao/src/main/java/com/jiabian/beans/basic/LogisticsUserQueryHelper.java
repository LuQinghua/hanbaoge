/*
 * LogisticsUserQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-16 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogisticsUserQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public LogisticsUserQueryHelper() {
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
     * @version 1.0 2016-12-16
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
        public Criteria andWorkIdIsNull() {
            addCriterion("workId is null");
            return (Criteria) this;
        }
        public Criteria andWorkIdIsNotNull() {
            addCriterion("workId is not null");
            return (Criteria) this;
        }
        public Criteria andWorkIdEqualTo(Long value) {
            addCriterion("workId =", value, "workId");
            return (Criteria) this;
        }
        public Criteria andWorkIdNotEqualTo(Long value) {
            addCriterion("workId <>", value, "workId");
            return (Criteria) this;
        }
        public Criteria andWorkIdGreaterThan(Long value) {
            addCriterion("workId >", value, "workId");
            return (Criteria) this;
        }
        public Criteria andWorkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("workId >=", value, "workId");
            return (Criteria) this;
        }
        public Criteria andWorkIdLessThan(Long value) {
            addCriterion("workId <", value, "workId");
            return (Criteria) this;
        }
        public Criteria andWorkIdLessThanOrEqualTo(Long value) {
            addCriterion("workId <=", value, "workId");
            return (Criteria) this;
        }
        public Criteria andWorkIdIn(List<Long> values) {
            addCriterion("workId in", values, "workId");
            return (Criteria) this;
        }
        public Criteria andWorkIdNotIn(List<Long> values) {
            addCriterion("workId not in", values, "workId");
            return (Criteria) this;
        }
        public Criteria andWorkIdBetween(Long value1, Long value2) {
            addCriterion("workId between", value1, value2, "workId");
            return (Criteria) this;
        }
        public Criteria andWorkIdNotBetween(Long value1, Long value2) {
            addCriterion("workId not between", value1, value2, "workId");
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
        public Criteria andPhotographIsNull() {
            addCriterion("photograph is null");
            return (Criteria) this;
        }
        public Criteria andPhotographIsNotNull() {
            addCriterion("photograph is not null");
            return (Criteria) this;
        }
        public Criteria andPhotographEqualTo(String value) {
            addCriterion("photograph =", value, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographNotEqualTo(String value) {
            addCriterion("photograph <>", value, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographGreaterThan(String value) {
            addCriterion("photograph >", value, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographGreaterThanOrEqualTo(String value) {
            addCriterion("photograph >=", value, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographLessThan(String value) {
            addCriterion("photograph <", value, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographLessThanOrEqualTo(String value) {
            addCriterion("photograph <=", value, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographLike(String value) {
            addCriterion("photograph like", value, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographNotLike(String value) {
            addCriterion("photograph not like", value, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographIn(List<String> values) {
            addCriterion("photograph in", values, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographNotIn(List<String> values) {
            addCriterion("photograph not in", values, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographBetween(String value1, String value2) {
            addCriterion("photograph between", value1, value2, "photograph");
            return (Criteria) this;
        }
        public Criteria andPhotographNotBetween(String value1, String value2) {
            addCriterion("photograph not between", value1, value2, "photograph");
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
        public Criteria andManagerUserIdIsNull() {
            addCriterion("managerUserId is null");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdIsNotNull() {
            addCriterion("managerUserId is not null");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdEqualTo(Long value) {
            addCriterion("managerUserId =", value, "managerUserId");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdNotEqualTo(Long value) {
            addCriterion("managerUserId <>", value, "managerUserId");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdGreaterThan(Long value) {
            addCriterion("managerUserId >", value, "managerUserId");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("managerUserId >=", value, "managerUserId");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdLessThan(Long value) {
            addCriterion("managerUserId <", value, "managerUserId");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdLessThanOrEqualTo(Long value) {
            addCriterion("managerUserId <=", value, "managerUserId");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdIn(List<Long> values) {
            addCriterion("managerUserId in", values, "managerUserId");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdNotIn(List<Long> values) {
            addCriterion("managerUserId not in", values, "managerUserId");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdBetween(Long value1, Long value2) {
            addCriterion("managerUserId between", value1, value2, "managerUserId");
            return (Criteria) this;
        }
        public Criteria andManagerUserIdNotBetween(Long value1, Long value2) {
            addCriterion("managerUserId not between", value1, value2, "managerUserId");
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
        public Criteria andIdCardImgIsNull() {
            addCriterion("idCardImg is null");
            return (Criteria) this;
        }
        public Criteria andIdCardImgIsNotNull() {
            addCriterion("idCardImg is not null");
            return (Criteria) this;
        }
        public Criteria andIdCardImgEqualTo(String value) {
            addCriterion("idCardImg =", value, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgNotEqualTo(String value) {
            addCriterion("idCardImg <>", value, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgGreaterThan(String value) {
            addCriterion("idCardImg >", value, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgGreaterThanOrEqualTo(String value) {
            addCriterion("idCardImg >=", value, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgLessThan(String value) {
            addCriterion("idCardImg <", value, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgLessThanOrEqualTo(String value) {
            addCriterion("idCardImg <=", value, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgLike(String value) {
            addCriterion("idCardImg like", value, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgNotLike(String value) {
            addCriterion("idCardImg not like", value, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgIn(List<String> values) {
            addCriterion("idCardImg in", values, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgNotIn(List<String> values) {
            addCriterion("idCardImg not in", values, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgBetween(String value1, String value2) {
            addCriterion("idCardImg between", value1, value2, "idCardImg");
            return (Criteria) this;
        }
        public Criteria andIdCardImgNotBetween(String value1, String value2) {
            addCriterion("idCardImg not between", value1, value2, "idCardImg");
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
        public Criteria andLogComPanyIdIsNull() {
            addCriterion("logComPanyId is null");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdIsNotNull() {
            addCriterion("logComPanyId is not null");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdEqualTo(Long value) {
            addCriterion("logComPanyId =", value, "logComPanyId");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdNotEqualTo(Long value) {
            addCriterion("logComPanyId <>", value, "logComPanyId");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdGreaterThan(Long value) {
            addCriterion("logComPanyId >", value, "logComPanyId");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("logComPanyId >=", value, "logComPanyId");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdLessThan(Long value) {
            addCriterion("logComPanyId <", value, "logComPanyId");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdLessThanOrEqualTo(Long value) {
            addCriterion("logComPanyId <=", value, "logComPanyId");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdIn(List<Long> values) {
            addCriterion("logComPanyId in", values, "logComPanyId");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdNotIn(List<Long> values) {
            addCriterion("logComPanyId not in", values, "logComPanyId");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdBetween(Long value1, Long value2) {
            addCriterion("logComPanyId between", value1, value2, "logComPanyId");
            return (Criteria) this;
        }
        public Criteria andLogComPanyIdNotBetween(Long value1, Long value2) {
            addCriterion("logComPanyId not between", value1, value2, "logComPanyId");
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
        public Criteria andPhotographLikeInsensitive(String value) {
            addCriterion("upper(photograph) like", value.toUpperCase(), "photograph");
            return (Criteria) this;
        }
        public Criteria andUserSaltLikeInsensitive(String value) {
            addCriterion("upper(userSalt) like", value.toUpperCase(), "userSalt");
            return (Criteria) this;
        }
        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }
        public Criteria andIdCardLikeInsensitive(String value) {
            addCriterion("upper(idCard) like", value.toUpperCase(), "idCard");
            return (Criteria) this;
        }
        public Criteria andIdCardImgLikeInsensitive(String value) {
            addCriterion("upper(idCardImg) like", value.toUpperCase(), "idCardImg");
            return (Criteria) this;
        }
        public Criteria andRealNameLikeInsensitive(String value) {
            addCriterion("upper(realName) like", value.toUpperCase(), "realName");
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
     * @version 1.0 2016-12-16
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