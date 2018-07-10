/*
 * JiabianShareQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-03-09 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JiabianShareQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public JiabianShareQueryHelper() {
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
     * @version 1.0 2017-03-09
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
        public Criteria andShareUserIdIsNull() {
            addCriterion("shareUserId is null");
            return (Criteria) this;
        }
        public Criteria andShareUserIdIsNotNull() {
            addCriterion("shareUserId is not null");
            return (Criteria) this;
        }
        public Criteria andShareUserIdEqualTo(Long value) {
            addCriterion("shareUserId =", value, "shareUserId");
            return (Criteria) this;
        }
        public Criteria andShareUserIdNotEqualTo(Long value) {
            addCriterion("shareUserId <>", value, "shareUserId");
            return (Criteria) this;
        }
        public Criteria andShareUserIdGreaterThan(Long value) {
            addCriterion("shareUserId >", value, "shareUserId");
            return (Criteria) this;
        }
        public Criteria andShareUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shareUserId >=", value, "shareUserId");
            return (Criteria) this;
        }
        public Criteria andShareUserIdLessThan(Long value) {
            addCriterion("shareUserId <", value, "shareUserId");
            return (Criteria) this;
        }
        public Criteria andShareUserIdLessThanOrEqualTo(Long value) {
            addCriterion("shareUserId <=", value, "shareUserId");
            return (Criteria) this;
        }
        public Criteria andShareUserIdIn(List<Long> values) {
            addCriterion("shareUserId in", values, "shareUserId");
            return (Criteria) this;
        }
        public Criteria andShareUserIdNotIn(List<Long> values) {
            addCriterion("shareUserId not in", values, "shareUserId");
            return (Criteria) this;
        }
        public Criteria andShareUserIdBetween(Long value1, Long value2) {
            addCriterion("shareUserId between", value1, value2, "shareUserId");
            return (Criteria) this;
        }
        public Criteria andShareUserIdNotBetween(Long value1, Long value2) {
            addCriterion("shareUserId not between", value1, value2, "shareUserId");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdIsNull() {
            addCriterion("enrollUserId is null");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdIsNotNull() {
            addCriterion("enrollUserId is not null");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdEqualTo(Long value) {
            addCriterion("enrollUserId =", value, "enrollUserId");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdNotEqualTo(Long value) {
            addCriterion("enrollUserId <>", value, "enrollUserId");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdGreaterThan(Long value) {
            addCriterion("enrollUserId >", value, "enrollUserId");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("enrollUserId >=", value, "enrollUserId");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdLessThan(Long value) {
            addCriterion("enrollUserId <", value, "enrollUserId");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdLessThanOrEqualTo(Long value) {
            addCriterion("enrollUserId <=", value, "enrollUserId");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdIn(List<Long> values) {
            addCriterion("enrollUserId in", values, "enrollUserId");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdNotIn(List<Long> values) {
            addCriterion("enrollUserId not in", values, "enrollUserId");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdBetween(Long value1, Long value2) {
            addCriterion("enrollUserId between", value1, value2, "enrollUserId");
            return (Criteria) this;
        }
        public Criteria andEnrollUserIdNotBetween(Long value1, Long value2) {
            addCriterion("enrollUserId not between", value1, value2, "enrollUserId");
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
        public Criteria andFirstLoginTimeIsNull() {
            addCriterion("firstLoginTime is null");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeIsNotNull() {
            addCriterion("firstLoginTime is not null");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeEqualTo(Date value) {
            addCriterion("firstLoginTime =", value, "firstLoginTime");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeNotEqualTo(Date value) {
            addCriterion("firstLoginTime <>", value, "firstLoginTime");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeGreaterThan(Date value) {
            addCriterion("firstLoginTime >", value, "firstLoginTime");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("firstLoginTime >=", value, "firstLoginTime");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeLessThan(Date value) {
            addCriterion("firstLoginTime <", value, "firstLoginTime");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("firstLoginTime <=", value, "firstLoginTime");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeIn(List<Date> values) {
            addCriterion("firstLoginTime in", values, "firstLoginTime");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeNotIn(List<Date> values) {
            addCriterion("firstLoginTime not in", values, "firstLoginTime");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeBetween(Date value1, Date value2) {
            addCriterion("firstLoginTime between", value1, value2, "firstLoginTime");
            return (Criteria) this;
        }
        public Criteria andFirstLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("firstLoginTime not between", value1, value2, "firstLoginTime");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeIsNull() {
            addCriterion("firstPayTime is null");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeIsNotNull() {
            addCriterion("firstPayTime is not null");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeEqualTo(Date value) {
            addCriterion("firstPayTime =", value, "firstPayTime");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeNotEqualTo(Date value) {
            addCriterion("firstPayTime <>", value, "firstPayTime");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeGreaterThan(Date value) {
            addCriterion("firstPayTime >", value, "firstPayTime");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("firstPayTime >=", value, "firstPayTime");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeLessThan(Date value) {
            addCriterion("firstPayTime <", value, "firstPayTime");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("firstPayTime <=", value, "firstPayTime");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeIn(List<Date> values) {
            addCriterion("firstPayTime in", values, "firstPayTime");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeNotIn(List<Date> values) {
            addCriterion("firstPayTime not in", values, "firstPayTime");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeBetween(Date value1, Date value2) {
            addCriterion("firstPayTime between", value1, value2, "firstPayTime");
            return (Criteria) this;
        }
        public Criteria andFirstPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("firstPayTime not between", value1, value2, "firstPayTime");
            return (Criteria) this;
        }
        public Criteria andIsLoginIsNull() {
            addCriterion("isLogin is null");
            return (Criteria) this;
        }
        public Criteria andIsLoginIsNotNull() {
            addCriterion("isLogin is not null");
            return (Criteria) this;
        }
        public Criteria andIsLoginEqualTo(Byte value) {
            addCriterion("isLogin =", value, "isLogin");
            return (Criteria) this;
        }
        public Criteria andIsLoginNotEqualTo(Byte value) {
            addCriterion("isLogin <>", value, "isLogin");
            return (Criteria) this;
        }
        public Criteria andIsLoginGreaterThan(Byte value) {
            addCriterion("isLogin >", value, "isLogin");
            return (Criteria) this;
        }
        public Criteria andIsLoginGreaterThanOrEqualTo(Byte value) {
            addCriterion("isLogin >=", value, "isLogin");
            return (Criteria) this;
        }
        public Criteria andIsLoginLessThan(Byte value) {
            addCriterion("isLogin <", value, "isLogin");
            return (Criteria) this;
        }
        public Criteria andIsLoginLessThanOrEqualTo(Byte value) {
            addCriterion("isLogin <=", value, "isLogin");
            return (Criteria) this;
        }
        public Criteria andIsLoginIn(List<Byte> values) {
            addCriterion("isLogin in", values, "isLogin");
            return (Criteria) this;
        }
        public Criteria andIsLoginNotIn(List<Byte> values) {
            addCriterion("isLogin not in", values, "isLogin");
            return (Criteria) this;
        }
        public Criteria andIsLoginBetween(Byte value1, Byte value2) {
            addCriterion("isLogin between", value1, value2, "isLogin");
            return (Criteria) this;
        }
        public Criteria andIsLoginNotBetween(Byte value1, Byte value2) {
            addCriterion("isLogin not between", value1, value2, "isLogin");
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
     * @version 1.0 2017-03-09
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