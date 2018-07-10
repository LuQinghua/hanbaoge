/*
 * UserEvaluateQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-10 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserEvaluateQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public UserEvaluateQueryHelper() {
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
     * 商品评价表
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
        public Criteria andProdIdIsNull() {
            addCriterion("prodId is null");
            return (Criteria) this;
        }
        public Criteria andProdIdIsNotNull() {
            addCriterion("prodId is not null");
            return (Criteria) this;
        }
        public Criteria andProdIdEqualTo(Long value) {
            addCriterion("prodId =", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdNotEqualTo(Long value) {
            addCriterion("prodId <>", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdGreaterThan(Long value) {
            addCriterion("prodId >", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("prodId >=", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdLessThan(Long value) {
            addCriterion("prodId <", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdLessThanOrEqualTo(Long value) {
            addCriterion("prodId <=", value, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdIn(List<Long> values) {
            addCriterion("prodId in", values, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdNotIn(List<Long> values) {
            addCriterion("prodId not in", values, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdBetween(Long value1, Long value2) {
            addCriterion("prodId between", value1, value2, "prodId");
            return (Criteria) this;
        }
        public Criteria andProdIdNotBetween(Long value1, Long value2) {
            addCriterion("prodId not between", value1, value2, "prodId");
            return (Criteria) this;
        }
        public Criteria andEvalLevelIsNull() {
            addCriterion("evalLevel is null");
            return (Criteria) this;
        }
        public Criteria andEvalLevelIsNotNull() {
            addCriterion("evalLevel is not null");
            return (Criteria) this;
        }
        public Criteria andEvalLevelEqualTo(Byte value) {
            addCriterion("evalLevel =", value, "evalLevel");
            return (Criteria) this;
        }
        public Criteria andEvalLevelNotEqualTo(Byte value) {
            addCriterion("evalLevel <>", value, "evalLevel");
            return (Criteria) this;
        }
        public Criteria andEvalLevelGreaterThan(Byte value) {
            addCriterion("evalLevel >", value, "evalLevel");
            return (Criteria) this;
        }
        public Criteria andEvalLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("evalLevel >=", value, "evalLevel");
            return (Criteria) this;
        }
        public Criteria andEvalLevelLessThan(Byte value) {
            addCriterion("evalLevel <", value, "evalLevel");
            return (Criteria) this;
        }
        public Criteria andEvalLevelLessThanOrEqualTo(Byte value) {
            addCriterion("evalLevel <=", value, "evalLevel");
            return (Criteria) this;
        }
        public Criteria andEvalLevelIn(List<Byte> values) {
            addCriterion("evalLevel in", values, "evalLevel");
            return (Criteria) this;
        }
        public Criteria andEvalLevelNotIn(List<Byte> values) {
            addCriterion("evalLevel not in", values, "evalLevel");
            return (Criteria) this;
        }
        public Criteria andEvalLevelBetween(Byte value1, Byte value2) {
            addCriterion("evalLevel between", value1, value2, "evalLevel");
            return (Criteria) this;
        }
        public Criteria andEvalLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("evalLevel not between", value1, value2, "evalLevel");
            return (Criteria) this;
        }
        public Criteria andEvalTextIsNull() {
            addCriterion("evalText is null");
            return (Criteria) this;
        }
        public Criteria andEvalTextIsNotNull() {
            addCriterion("evalText is not null");
            return (Criteria) this;
        }
        public Criteria andEvalTextEqualTo(String value) {
            addCriterion("evalText =", value, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextNotEqualTo(String value) {
            addCriterion("evalText <>", value, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextGreaterThan(String value) {
            addCriterion("evalText >", value, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextGreaterThanOrEqualTo(String value) {
            addCriterion("evalText >=", value, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextLessThan(String value) {
            addCriterion("evalText <", value, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextLessThanOrEqualTo(String value) {
            addCriterion("evalText <=", value, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextLike(String value) {
            addCriterion("evalText like", value, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextNotLike(String value) {
            addCriterion("evalText not like", value, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextIn(List<String> values) {
            addCriterion("evalText in", values, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextNotIn(List<String> values) {
            addCriterion("evalText not in", values, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextBetween(String value1, String value2) {
            addCriterion("evalText between", value1, value2, "evalText");
            return (Criteria) this;
        }
        public Criteria andEvalTextNotBetween(String value1, String value2) {
            addCriterion("evalText not between", value1, value2, "evalText");
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
        public Criteria andEvalTextLikeInsensitive(String value) {
            addCriterion("upper(evalText) like", value.toUpperCase(), "evalText");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 商品评价表
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