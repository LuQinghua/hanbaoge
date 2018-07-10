/*
 * CommentQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-05 Created
 */
package com.jiabian.beans.basic.complaints;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public CommentQueryHelper() {
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
     * 评论表
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
        public Criteria andCompidIsNull() {
            addCriterion("compid is null");
            return (Criteria) this;
        }
        public Criteria andCompidIsNotNull() {
            addCriterion("compid is not null");
            return (Criteria) this;
        }
        public Criteria andCompidEqualTo(Long value) {
            addCriterion("compid =", value, "compid");
            return (Criteria) this;
        }
        public Criteria andCompidNotEqualTo(Long value) {
            addCriterion("compid <>", value, "compid");
            return (Criteria) this;
        }
        public Criteria andCompidGreaterThan(Long value) {
            addCriterion("compid >", value, "compid");
            return (Criteria) this;
        }
        public Criteria andCompidGreaterThanOrEqualTo(Long value) {
            addCriterion("compid >=", value, "compid");
            return (Criteria) this;
        }
        public Criteria andCompidLessThan(Long value) {
            addCriterion("compid <", value, "compid");
            return (Criteria) this;
        }
        public Criteria andCompidLessThanOrEqualTo(Long value) {
            addCriterion("compid <=", value, "compid");
            return (Criteria) this;
        }
        public Criteria andCompidIn(List<Long> values) {
            addCriterion("compid in", values, "compid");
            return (Criteria) this;
        }
        public Criteria andCompidNotIn(List<Long> values) {
            addCriterion("compid not in", values, "compid");
            return (Criteria) this;
        }
        public Criteria andCompidBetween(Long value1, Long value2) {
            addCriterion("compid between", value1, value2, "compid");
            return (Criteria) this;
        }
        public Criteria andCompidNotBetween(Long value1, Long value2) {
            addCriterion("compid not between", value1, value2, "compid");
            return (Criteria) this;
        }
        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }
        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }
        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
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
        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }
        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }
        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }
        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }
        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }
        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }
        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }
        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }
        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }
        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }
        public Criteria andImgLikeInsensitive(String value) {
            addCriterion("upper(img) like", value.toUpperCase(), "img");
            return (Criteria) this;
        }
        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }
        public Criteria andCommentLikeInsensitive(String value) {
            addCriterion("upper(comment) like", value.toUpperCase(), "comment");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 评论表
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