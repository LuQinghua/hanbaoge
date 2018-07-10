/*
 * UserSafeQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-10 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserSafeQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public UserSafeQueryHelper() {
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
     * 用户安全中心表
     * 
     * @author 鑿犺悵澶ц薄
     * @version 1.0 2016-10-10
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
        public Criteria andUserSafeIsNull() {
            addCriterion("userSafe is null");
            return (Criteria) this;
        }
        public Criteria andUserSafeIsNotNull() {
            addCriterion("userSafe is not null");
            return (Criteria) this;
        }
        public Criteria andUserSafeEqualTo(String value) {
            addCriterion("userSafe =", value, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeNotEqualTo(String value) {
            addCriterion("userSafe <>", value, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeGreaterThan(String value) {
            addCriterion("userSafe >", value, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeGreaterThanOrEqualTo(String value) {
            addCriterion("userSafe >=", value, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeLessThan(String value) {
            addCriterion("userSafe <", value, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeLessThanOrEqualTo(String value) {
            addCriterion("userSafe <=", value, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeLike(String value) {
            addCriterion("userSafe like", value, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeNotLike(String value) {
            addCriterion("userSafe not like", value, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeIn(List<String> values) {
            addCriterion("userSafe in", values, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeNotIn(List<String> values) {
            addCriterion("userSafe not in", values, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeBetween(String value1, String value2) {
            addCriterion("userSafe between", value1, value2, "userSafe");
            return (Criteria) this;
        }
        public Criteria andUserSafeNotBetween(String value1, String value2) {
            addCriterion("userSafe not between", value1, value2, "userSafe");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerIsNull() {
            addCriterion("safeAnwer is null");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerIsNotNull() {
            addCriterion("safeAnwer is not null");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerEqualTo(String value) {
            addCriterion("safeAnwer =", value, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerNotEqualTo(String value) {
            addCriterion("safeAnwer <>", value, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerGreaterThan(String value) {
            addCriterion("safeAnwer >", value, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerGreaterThanOrEqualTo(String value) {
            addCriterion("safeAnwer >=", value, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerLessThan(String value) {
            addCriterion("safeAnwer <", value, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerLessThanOrEqualTo(String value) {
            addCriterion("safeAnwer <=", value, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerLike(String value) {
            addCriterion("safeAnwer like", value, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerNotLike(String value) {
            addCriterion("safeAnwer not like", value, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerIn(List<String> values) {
            addCriterion("safeAnwer in", values, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerNotIn(List<String> values) {
            addCriterion("safeAnwer not in", values, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerBetween(String value1, String value2) {
            addCriterion("safeAnwer between", value1, value2, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerNotBetween(String value1, String value2) {
            addCriterion("safeAnwer not between", value1, value2, "safeAnwer");
            return (Criteria) this;
        }
        public Criteria andSafeLevelIsNull() {
            addCriterion("safeLevel is null");
            return (Criteria) this;
        }
        public Criteria andSafeLevelIsNotNull() {
            addCriterion("safeLevel is not null");
            return (Criteria) this;
        }
        public Criteria andSafeLevelEqualTo(Byte value) {
            addCriterion("safeLevel =", value, "safeLevel");
            return (Criteria) this;
        }
        public Criteria andSafeLevelNotEqualTo(Byte value) {
            addCriterion("safeLevel <>", value, "safeLevel");
            return (Criteria) this;
        }
        public Criteria andSafeLevelGreaterThan(Byte value) {
            addCriterion("safeLevel >", value, "safeLevel");
            return (Criteria) this;
        }
        public Criteria andSafeLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("safeLevel >=", value, "safeLevel");
            return (Criteria) this;
        }
        public Criteria andSafeLevelLessThan(Byte value) {
            addCriterion("safeLevel <", value, "safeLevel");
            return (Criteria) this;
        }
        public Criteria andSafeLevelLessThanOrEqualTo(Byte value) {
            addCriterion("safeLevel <=", value, "safeLevel");
            return (Criteria) this;
        }
        public Criteria andSafeLevelIn(List<Byte> values) {
            addCriterion("safeLevel in", values, "safeLevel");
            return (Criteria) this;
        }
        public Criteria andSafeLevelNotIn(List<Byte> values) {
            addCriterion("safeLevel not in", values, "safeLevel");
            return (Criteria) this;
        }
        public Criteria andSafeLevelBetween(Byte value1, Byte value2) {
            addCriterion("safeLevel between", value1, value2, "safeLevel");
            return (Criteria) this;
        }
        public Criteria andSafeLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("safeLevel not between", value1, value2, "safeLevel");
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
        public Criteria andUserSafeLikeInsensitive(String value) {
            addCriterion("upper(userSafe) like", value.toUpperCase(), "userSafe");
            return (Criteria) this;
        }
        public Criteria andSafeAnwerLikeInsensitive(String value) {
            addCriterion("upper(safeAnwer) like", value.toUpperCase(), "safeAnwer");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 用户安全中心表
     * 
     * @author 鑿犺悵澶ц薄
     * @version 1.0 2016-10-10
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