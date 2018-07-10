/*
 * ComplUserQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-05 Created
 */
package com.jiabian.beans.basic.complaints;

import java.util.ArrayList;
import java.util.List;

public class ComplUserQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public ComplUserQueryHelper() {
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
     * @version 1.0 2018-07-05
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
        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }
        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }
        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }
        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }
        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }
        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }
        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }
        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }
        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }
        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }
        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }
        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }
        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }
        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }
        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }
        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }
        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }
        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }
        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }
        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }
        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }
        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }
        public Criteria andImgLikeInsensitive(String value) {
            addCriterion("upper(img) like", value.toUpperCase(), "img");
            return (Criteria) this;
        }
        public Criteria andOpenidLikeInsensitive(String value) {
            addCriterion("upper(openid) like", value.toUpperCase(), "openid");
            return (Criteria) this;
        }
        public Criteria andRealnameLikeInsensitive(String value) {
            addCriterion("upper(realname) like", value.toUpperCase(), "realname");
            return (Criteria) this;
        }
        public Criteria andTelephoneLikeInsensitive(String value) {
            addCriterion("upper(telephone) like", value.toUpperCase(), "telephone");
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
     * @version 1.0 2018-07-05
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