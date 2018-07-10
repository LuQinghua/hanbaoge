/*
 * HomeQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-14 Created
 */
package com.jiabian.beans.basic.hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public HomeQueryHelper() {
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
     * 房型表
     * 
     * @author 菠萝大象
     * @version 1.0 2018-06-14
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
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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
        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }
        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }
        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }
        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }
        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }
        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
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
        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }
        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }
        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }
        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
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
        public Criteria andClassifyIdIsNull() {
            addCriterion("classifyId is null");
            return (Criteria) this;
        }
        public Criteria andClassifyIdIsNotNull() {
            addCriterion("classifyId is not null");
            return (Criteria) this;
        }
        public Criteria andClassifyIdEqualTo(Long value) {
            addCriterion("classifyId =", value, "classifyId");
            return (Criteria) this;
        }
        public Criteria andClassifyIdNotEqualTo(Long value) {
            addCriterion("classifyId <>", value, "classifyId");
            return (Criteria) this;
        }
        public Criteria andClassifyIdGreaterThan(Long value) {
            addCriterion("classifyId >", value, "classifyId");
            return (Criteria) this;
        }
        public Criteria andClassifyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("classifyId >=", value, "classifyId");
            return (Criteria) this;
        }
        public Criteria andClassifyIdLessThan(Long value) {
            addCriterion("classifyId <", value, "classifyId");
            return (Criteria) this;
        }
        public Criteria andClassifyIdLessThanOrEqualTo(Long value) {
            addCriterion("classifyId <=", value, "classifyId");
            return (Criteria) this;
        }
        public Criteria andClassifyIdIn(List<Long> values) {
            addCriterion("classifyId in", values, "classifyId");
            return (Criteria) this;
        }
        public Criteria andClassifyIdNotIn(List<Long> values) {
            addCriterion("classifyId not in", values, "classifyId");
            return (Criteria) this;
        }
        public Criteria andClassifyIdBetween(Long value1, Long value2) {
            addCriterion("classifyId between", value1, value2, "classifyId");
            return (Criteria) this;
        }
        public Criteria andClassifyIdNotBetween(Long value1, Long value2) {
            addCriterion("classifyId not between", value1, value2, "classifyId");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberIsNull() {
            addCriterion("peopleNumber is null");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberIsNotNull() {
            addCriterion("peopleNumber is not null");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberEqualTo(Integer value) {
            addCriterion("peopleNumber =", value, "peopleNumber");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberNotEqualTo(Integer value) {
            addCriterion("peopleNumber <>", value, "peopleNumber");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberGreaterThan(Integer value) {
            addCriterion("peopleNumber >", value, "peopleNumber");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("peopleNumber >=", value, "peopleNumber");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberLessThan(Integer value) {
            addCriterion("peopleNumber <", value, "peopleNumber");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("peopleNumber <=", value, "peopleNumber");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberIn(List<Integer> values) {
            addCriterion("peopleNumber in", values, "peopleNumber");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberNotIn(List<Integer> values) {
            addCriterion("peopleNumber not in", values, "peopleNumber");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberBetween(Integer value1, Integer value2) {
            addCriterion("peopleNumber between", value1, value2, "peopleNumber");
            return (Criteria) this;
        }
        public Criteria andPeopleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("peopleNumber not between", value1, value2, "peopleNumber");
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
        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }
        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }
        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }
        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }
        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }
        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }
        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }
        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
        public Criteria andBreakfastIsNull() {
            addCriterion("breakfast is null");
            return (Criteria) this;
        }
        public Criteria andBreakfastIsNotNull() {
            addCriterion("breakfast is not null");
            return (Criteria) this;
        }
        public Criteria andBreakfastEqualTo(Byte value) {
            addCriterion("breakfast =", value, "breakfast");
            return (Criteria) this;
        }
        public Criteria andBreakfastNotEqualTo(Byte value) {
            addCriterion("breakfast <>", value, "breakfast");
            return (Criteria) this;
        }
        public Criteria andBreakfastGreaterThan(Byte value) {
            addCriterion("breakfast >", value, "breakfast");
            return (Criteria) this;
        }
        public Criteria andBreakfastGreaterThanOrEqualTo(Byte value) {
            addCriterion("breakfast >=", value, "breakfast");
            return (Criteria) this;
        }
        public Criteria andBreakfastLessThan(Byte value) {
            addCriterion("breakfast <", value, "breakfast");
            return (Criteria) this;
        }
        public Criteria andBreakfastLessThanOrEqualTo(Byte value) {
            addCriterion("breakfast <=", value, "breakfast");
            return (Criteria) this;
        }
        public Criteria andBreakfastIn(List<Byte> values) {
            addCriterion("breakfast in", values, "breakfast");
            return (Criteria) this;
        }
        public Criteria andBreakfastNotIn(List<Byte> values) {
            addCriterion("breakfast not in", values, "breakfast");
            return (Criteria) this;
        }
        public Criteria andBreakfastBetween(Byte value1, Byte value2) {
            addCriterion("breakfast between", value1, value2, "breakfast");
            return (Criteria) this;
        }
        public Criteria andBreakfastNotBetween(Byte value1, Byte value2) {
            addCriterion("breakfast not between", value1, value2, "breakfast");
            return (Criteria) this;
        }
        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }
        public Criteria andIntroduceLikeInsensitive(String value) {
            addCriterion("upper(introduce) like", value.toUpperCase(), "introduce");
            return (Criteria) this;
        }
        public Criteria andImgLikeInsensitive(String value) {
            addCriterion("upper(img) like", value.toUpperCase(), "img");
            return (Criteria) this;
        }
        public Criteria andAreaLikeInsensitive(String value) {
            addCriterion("upper(area) like", value.toUpperCase(), "area");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 房型表
     * 
     * @author 菠萝大象
     * @version 1.0 2018-06-14
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