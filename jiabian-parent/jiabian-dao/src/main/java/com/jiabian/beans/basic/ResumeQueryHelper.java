/*
 * ResumeQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-04 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.List;

public class ResumeQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public ResumeQueryHelper() {
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
     * @author 鑿犺悵澶ц薄
     * @version 1.0 2018-06-04
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
        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }
        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }
        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }
        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }
        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }
        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }
        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }
        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }
        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }
        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }
        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }
        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }
        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }
        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }
        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }
        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }
        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }
        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }
        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }
        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }
        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }
        public Criteria andTelephoneIsNull() {
            addCriterion("Telephone is null");
            return (Criteria) this;
        }
        public Criteria andTelephoneIsNotNull() {
            addCriterion("Telephone is not null");
            return (Criteria) this;
        }
        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("Telephone =", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("Telephone <>", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("Telephone >", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("Telephone >=", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLessThan(String value) {
            addCriterion("Telephone <", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("Telephone <=", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLike(String value) {
            addCriterion("Telephone like", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotLike(String value) {
            addCriterion("Telephone not like", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("Telephone in", values, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("Telephone not in", values, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("Telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("Telephone not between", value1, value2, "telephone");
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
        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }
        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }
        public Criteria andSalaryEqualTo(String value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryNotEqualTo(String value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryGreaterThan(String value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryLessThan(String value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryLessThanOrEqualTo(String value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryLike(String value) {
            addCriterion("salary like", value, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryNotLike(String value) {
            addCriterion("salary not like", value, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryIn(List<String> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryNotIn(List<String> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryBetween(String value1, String value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }
        public Criteria andSalaryNotBetween(String value1, String value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }
        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }
        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }
        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }
        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }
        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }
        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }
        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }
        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }
        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }
        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }
        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }
        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }
        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }
        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }
        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }
        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }
        public Criteria andRidEqualTo(Long value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }
        public Criteria andRidNotEqualTo(Long value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }
        public Criteria andRidGreaterThan(Long value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }
        public Criteria andRidGreaterThanOrEqualTo(Long value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }
        public Criteria andRidLessThan(Long value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }
        public Criteria andRidLessThanOrEqualTo(Long value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }
        public Criteria andRidIn(List<Long> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }
        public Criteria andRidNotIn(List<Long> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }
        public Criteria andRidBetween(Long value1, Long value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }
        public Criteria andRidNotBetween(Long value1, Long value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }
        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }
        public Criteria andTelephoneLikeInsensitive(String value) {
            addCriterion("upper(Telephone) like", value.toUpperCase(), "telephone");
            return (Criteria) this;
        }
        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }
        public Criteria andSalaryLikeInsensitive(String value) {
            addCriterion("upper(salary) like", value.toUpperCase(), "salary");
            return (Criteria) this;
        }
        public Criteria andContentLikeInsensitive(String value) {
            addCriterion("upper(content) like", value.toUpperCase(), "content");
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
     * @author 鑿犺悵澶ц薄
     * @version 1.0 2018-06-04
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