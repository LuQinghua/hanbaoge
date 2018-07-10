/*
 * RecruitQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-04 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecruitQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public RecruitQueryHelper() {
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
        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }
        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }
        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }
        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }
        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }
        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }
        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }
        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }
        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }
        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }
        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }
        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }
        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }
        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }
        public Criteria andRequirementIsNull() {
            addCriterion("requirement is null");
            return (Criteria) this;
        }
        public Criteria andRequirementIsNotNull() {
            addCriterion("requirement is not null");
            return (Criteria) this;
        }
        public Criteria andRequirementEqualTo(String value) {
            addCriterion("requirement =", value, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementNotEqualTo(String value) {
            addCriterion("requirement <>", value, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementGreaterThan(String value) {
            addCriterion("requirement >", value, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("requirement >=", value, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementLessThan(String value) {
            addCriterion("requirement <", value, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementLessThanOrEqualTo(String value) {
            addCriterion("requirement <=", value, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementLike(String value) {
            addCriterion("requirement like", value, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementNotLike(String value) {
            addCriterion("requirement not like", value, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementIn(List<String> values) {
            addCriterion("requirement in", values, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementNotIn(List<String> values) {
            addCriterion("requirement not in", values, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementBetween(String value1, String value2) {
            addCriterion("requirement between", value1, value2, "requirement");
            return (Criteria) this;
        }
        public Criteria andRequirementNotBetween(String value1, String value2) {
            addCriterion("requirement not between", value1, value2, "requirement");
            return (Criteria) this;
        }
        public Criteria andDutyIsNull() {
            addCriterion("duty is null");
            return (Criteria) this;
        }
        public Criteria andDutyIsNotNull() {
            addCriterion("duty is not null");
            return (Criteria) this;
        }
        public Criteria andDutyEqualTo(String value) {
            addCriterion("duty =", value, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("duty <>", value, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyGreaterThan(String value) {
            addCriterion("duty >", value, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("duty >=", value, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyLessThan(String value) {
            addCriterion("duty <", value, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("duty <=", value, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyLike(String value) {
            addCriterion("duty like", value, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyNotLike(String value) {
            addCriterion("duty not like", value, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyIn(List<String> values) {
            addCriterion("duty in", values, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("duty not in", values, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("duty between", value1, value2, "duty");
            return (Criteria) this;
        }
        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("duty not between", value1, value2, "duty");
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
        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }
        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }
        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }
        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }
        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }
        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }
        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }
        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }
        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }
        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }
        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }
        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }
        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }
        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }
        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }
        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }
        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }
        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }
        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }
        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }
        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
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
        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }
        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }
        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }
        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }
        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }
        public Criteria andRequirementLikeInsensitive(String value) {
            addCriterion("upper(requirement) like", value.toUpperCase(), "requirement");
            return (Criteria) this;
        }
        public Criteria andDutyLikeInsensitive(String value) {
            addCriterion("upper(duty) like", value.toUpperCase(), "duty");
            return (Criteria) this;
        }
        public Criteria andEducationLikeInsensitive(String value) {
            addCriterion("upper(education) like", value.toUpperCase(), "education");
            return (Criteria) this;
        }
        public Criteria andNumberLikeInsensitive(String value) {
            addCriterion("upper(number) like", value.toUpperCase(), "number");
            return (Criteria) this;
        }
        public Criteria andSalaryLikeInsensitive(String value) {
            addCriterion("upper(salary) like", value.toUpperCase(), "salary");
            return (Criteria) this;
        }
        public Criteria andPlaceLikeInsensitive(String value) {
            addCriterion("upper(place) like", value.toUpperCase(), "place");
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