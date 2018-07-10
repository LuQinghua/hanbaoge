/*
 * SysUserQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-21 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SysUserQueryHelper() {
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
     * @version 1.0 2016-12-21
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
        public Criteria andSuserIdIsNull() {
            addCriterion("suserId is null");
            return (Criteria) this;
        }
        public Criteria andSuserIdIsNotNull() {
            addCriterion("suserId is not null");
            return (Criteria) this;
        }
        public Criteria andSuserIdEqualTo(Long value) {
            addCriterion("suserId =", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdNotEqualTo(Long value) {
            addCriterion("suserId <>", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdGreaterThan(Long value) {
            addCriterion("suserId >", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("suserId >=", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdLessThan(Long value) {
            addCriterion("suserId <", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdLessThanOrEqualTo(Long value) {
            addCriterion("suserId <=", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdIn(List<Long> values) {
            addCriterion("suserId in", values, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdNotIn(List<Long> values) {
            addCriterion("suserId not in", values, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdBetween(Long value1, Long value2) {
            addCriterion("suserId between", value1, value2, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdNotBetween(Long value1, Long value2) {
            addCriterion("suserId not between", value1, value2, "suserId");
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
        public Criteria andLoginNameIsNull() {
            addCriterion("loginName is null");
            return (Criteria) this;
        }
        public Criteria andLoginNameIsNotNull() {
            addCriterion("loginName is not null");
            return (Criteria) this;
        }
        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("loginName =", value, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("loginName <>", value, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("loginName >", value, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("loginName >=", value, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameLessThan(String value) {
            addCriterion("loginName <", value, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("loginName <=", value, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameLike(String value) {
            addCriterion("loginName like", value, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameNotLike(String value) {
            addCriterion("loginName not like", value, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("loginName in", values, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("loginName not in", values, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("loginName between", value1, value2, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("loginName not between", value1, value2, "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginPwdIsNull() {
            addCriterion("loginPwd is null");
            return (Criteria) this;
        }
        public Criteria andLoginPwdIsNotNull() {
            addCriterion("loginPwd is not null");
            return (Criteria) this;
        }
        public Criteria andLoginPwdEqualTo(String value) {
            addCriterion("loginPwd =", value, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdNotEqualTo(String value) {
            addCriterion("loginPwd <>", value, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdGreaterThan(String value) {
            addCriterion("loginPwd >", value, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("loginPwd >=", value, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdLessThan(String value) {
            addCriterion("loginPwd <", value, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("loginPwd <=", value, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdLike(String value) {
            addCriterion("loginPwd like", value, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdNotLike(String value) {
            addCriterion("loginPwd not like", value, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdIn(List<String> values) {
            addCriterion("loginPwd in", values, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdNotIn(List<String> values) {
            addCriterion("loginPwd not in", values, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdBetween(String value1, String value2) {
            addCriterion("loginPwd between", value1, value2, "loginPwd");
            return (Criteria) this;
        }
        public Criteria andLoginPwdNotBetween(String value1, String value2) {
            addCriterion("loginPwd not between", value1, value2, "loginPwd");
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
        public Criteria andRoleIdIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }
        public Criteria andRoleIdIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }
        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("roleId =", value, "roleId");
            return (Criteria) this;
        }
        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("roleId <>", value, "roleId");
            return (Criteria) this;
        }
        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("roleId >", value, "roleId");
            return (Criteria) this;
        }
        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("roleId >=", value, "roleId");
            return (Criteria) this;
        }
        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("roleId <", value, "roleId");
            return (Criteria) this;
        }
        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("roleId <=", value, "roleId");
            return (Criteria) this;
        }
        public Criteria andRoleIdIn(List<Long> values) {
            addCriterion("roleId in", values, "roleId");
            return (Criteria) this;
        }
        public Criteria andRoleIdNotIn(List<Long> values) {
            addCriterion("roleId not in", values, "roleId");
            return (Criteria) this;
        }
        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("roleId between", value1, value2, "roleId");
            return (Criteria) this;
        }
        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("roleId not between", value1, value2, "roleId");
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
        public Criteria andRealNameLikeInsensitive(String value) {
            addCriterion("upper(realName) like", value.toUpperCase(), "realName");
            return (Criteria) this;
        }
        public Criteria andLoginNameLikeInsensitive(String value) {
            addCriterion("upper(loginName) like", value.toUpperCase(), "loginName");
            return (Criteria) this;
        }
        public Criteria andLoginPwdLikeInsensitive(String value) {
            addCriterion("upper(loginPwd) like", value.toUpperCase(), "loginPwd");
            return (Criteria) this;
        }
        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
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
     * @version 1.0 2016-12-21
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