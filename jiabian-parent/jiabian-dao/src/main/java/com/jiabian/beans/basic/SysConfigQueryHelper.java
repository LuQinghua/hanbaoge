/*
 * SysConfigQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-18 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysConfigQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SysConfigQueryHelper() {
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
     * 系统配置表
     * 
     * @author 菠萝大象
     * @version 1.0 2016-10-18
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
        public Criteria andConKeyIsNull() {
            addCriterion("conKey is null");
            return (Criteria) this;
        }
        public Criteria andConKeyIsNotNull() {
            addCriterion("conKey is not null");
            return (Criteria) this;
        }
        public Criteria andConKeyEqualTo(String value) {
            addCriterion("conKey =", value, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyNotEqualTo(String value) {
            addCriterion("conKey <>", value, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyGreaterThan(String value) {
            addCriterion("conKey >", value, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyGreaterThanOrEqualTo(String value) {
            addCriterion("conKey >=", value, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyLessThan(String value) {
            addCriterion("conKey <", value, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyLessThanOrEqualTo(String value) {
            addCriterion("conKey <=", value, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyLike(String value) {
            addCriterion("conKey like", value, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyNotLike(String value) {
            addCriterion("conKey not like", value, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyIn(List<String> values) {
            addCriterion("conKey in", values, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyNotIn(List<String> values) {
            addCriterion("conKey not in", values, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyBetween(String value1, String value2) {
            addCriterion("conKey between", value1, value2, "conKey");
            return (Criteria) this;
        }
        public Criteria andConKeyNotBetween(String value1, String value2) {
            addCriterion("conKey not between", value1, value2, "conKey");
            return (Criteria) this;
        }
        public Criteria andConValueIsNull() {
            addCriterion("conValue is null");
            return (Criteria) this;
        }
        public Criteria andConValueIsNotNull() {
            addCriterion("conValue is not null");
            return (Criteria) this;
        }
        public Criteria andConValueEqualTo(String value) {
            addCriterion("conValue =", value, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueNotEqualTo(String value) {
            addCriterion("conValue <>", value, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueGreaterThan(String value) {
            addCriterion("conValue >", value, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueGreaterThanOrEqualTo(String value) {
            addCriterion("conValue >=", value, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueLessThan(String value) {
            addCriterion("conValue <", value, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueLessThanOrEqualTo(String value) {
            addCriterion("conValue <=", value, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueLike(String value) {
            addCriterion("conValue like", value, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueNotLike(String value) {
            addCriterion("conValue not like", value, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueIn(List<String> values) {
            addCriterion("conValue in", values, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueNotIn(List<String> values) {
            addCriterion("conValue not in", values, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueBetween(String value1, String value2) {
            addCriterion("conValue between", value1, value2, "conValue");
            return (Criteria) this;
        }
        public Criteria andConValueNotBetween(String value1, String value2) {
            addCriterion("conValue not between", value1, value2, "conValue");
            return (Criteria) this;
        }
        public Criteria andReMarkIsNull() {
            addCriterion("reMark is null");
            return (Criteria) this;
        }
        public Criteria andReMarkIsNotNull() {
            addCriterion("reMark is not null");
            return (Criteria) this;
        }
        public Criteria andReMarkEqualTo(String value) {
            addCriterion("reMark =", value, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkNotEqualTo(String value) {
            addCriterion("reMark <>", value, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkGreaterThan(String value) {
            addCriterion("reMark >", value, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkGreaterThanOrEqualTo(String value) {
            addCriterion("reMark >=", value, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkLessThan(String value) {
            addCriterion("reMark <", value, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkLessThanOrEqualTo(String value) {
            addCriterion("reMark <=", value, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkLike(String value) {
            addCriterion("reMark like", value, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkNotLike(String value) {
            addCriterion("reMark not like", value, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkIn(List<String> values) {
            addCriterion("reMark in", values, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkNotIn(List<String> values) {
            addCriterion("reMark not in", values, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkBetween(String value1, String value2) {
            addCriterion("reMark between", value1, value2, "reMark");
            return (Criteria) this;
        }
        public Criteria andReMarkNotBetween(String value1, String value2) {
            addCriterion("reMark not between", value1, value2, "reMark");
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
        public Criteria andConForNameIsNull() {
            addCriterion("conForName is null");
            return (Criteria) this;
        }
        public Criteria andConForNameIsNotNull() {
            addCriterion("conForName is not null");
            return (Criteria) this;
        }
        public Criteria andConForNameEqualTo(String value) {
            addCriterion("conForName =", value, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameNotEqualTo(String value) {
            addCriterion("conForName <>", value, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameGreaterThan(String value) {
            addCriterion("conForName >", value, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameGreaterThanOrEqualTo(String value) {
            addCriterion("conForName >=", value, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameLessThan(String value) {
            addCriterion("conForName <", value, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameLessThanOrEqualTo(String value) {
            addCriterion("conForName <=", value, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameLike(String value) {
            addCriterion("conForName like", value, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameNotLike(String value) {
            addCriterion("conForName not like", value, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameIn(List<String> values) {
            addCriterion("conForName in", values, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameNotIn(List<String> values) {
            addCriterion("conForName not in", values, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameBetween(String value1, String value2) {
            addCriterion("conForName between", value1, value2, "conForName");
            return (Criteria) this;
        }
        public Criteria andConForNameNotBetween(String value1, String value2) {
            addCriterion("conForName not between", value1, value2, "conForName");
            return (Criteria) this;
        }
        public Criteria andConKeyLikeInsensitive(String value) {
            addCriterion("upper(conKey) like", value.toUpperCase(), "conKey");
            return (Criteria) this;
        }
        public Criteria andConValueLikeInsensitive(String value) {
            addCriterion("upper(conValue) like", value.toUpperCase(), "conValue");
            return (Criteria) this;
        }
        public Criteria andReMarkLikeInsensitive(String value) {
            addCriterion("upper(reMark) like", value.toUpperCase(), "reMark");
            return (Criteria) this;
        }
        public Criteria andConForNameLikeInsensitive(String value) {
            addCriterion("upper(conForName) like", value.toUpperCase(), "conForName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 系统配置表
     * 
     * @author 菠萝大象
     * @version 1.0 2016-10-18
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