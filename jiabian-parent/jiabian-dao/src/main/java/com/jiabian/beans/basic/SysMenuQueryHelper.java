/*
 * SysMenuQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-31 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.List;

public class SysMenuQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SysMenuQueryHelper() {
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
     * @version 1.0 2016-10-31
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
        public Criteria andMenuIdIsNull() {
            addCriterion("menuId is null");
            return (Criteria) this;
        }
        public Criteria andMenuIdIsNotNull() {
            addCriterion("menuId is not null");
            return (Criteria) this;
        }
        public Criteria andMenuIdEqualTo(Long value) {
            addCriterion("menuId =", value, "menuId");
            return (Criteria) this;
        }
        public Criteria andMenuIdNotEqualTo(Long value) {
            addCriterion("menuId <>", value, "menuId");
            return (Criteria) this;
        }
        public Criteria andMenuIdGreaterThan(Long value) {
            addCriterion("menuId >", value, "menuId");
            return (Criteria) this;
        }
        public Criteria andMenuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("menuId >=", value, "menuId");
            return (Criteria) this;
        }
        public Criteria andMenuIdLessThan(Long value) {
            addCriterion("menuId <", value, "menuId");
            return (Criteria) this;
        }
        public Criteria andMenuIdLessThanOrEqualTo(Long value) {
            addCriterion("menuId <=", value, "menuId");
            return (Criteria) this;
        }
        public Criteria andMenuIdIn(List<Long> values) {
            addCriterion("menuId in", values, "menuId");
            return (Criteria) this;
        }
        public Criteria andMenuIdNotIn(List<Long> values) {
            addCriterion("menuId not in", values, "menuId");
            return (Criteria) this;
        }
        public Criteria andMenuIdBetween(Long value1, Long value2) {
            addCriterion("menuId between", value1, value2, "menuId");
            return (Criteria) this;
        }
        public Criteria andMenuIdNotBetween(Long value1, Long value2) {
            addCriterion("menuId not between", value1, value2, "menuId");
            return (Criteria) this;
        }
        public Criteria andMenuNameIsNull() {
            addCriterion("menuName is null");
            return (Criteria) this;
        }
        public Criteria andMenuNameIsNotNull() {
            addCriterion("menuName is not null");
            return (Criteria) this;
        }
        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menuName =", value, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menuName <>", value, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menuName >", value, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menuName >=", value, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menuName <", value, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menuName <=", value, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameLike(String value) {
            addCriterion("menuName like", value, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menuName not like", value, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menuName in", values, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menuName not in", values, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menuName between", value1, value2, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menuName not between", value1, value2, "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuDescIsNull() {
            addCriterion("menuDesc is null");
            return (Criteria) this;
        }
        public Criteria andMenuDescIsNotNull() {
            addCriterion("menuDesc is not null");
            return (Criteria) this;
        }
        public Criteria andMenuDescEqualTo(String value) {
            addCriterion("menuDesc =", value, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescNotEqualTo(String value) {
            addCriterion("menuDesc <>", value, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescGreaterThan(String value) {
            addCriterion("menuDesc >", value, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescGreaterThanOrEqualTo(String value) {
            addCriterion("menuDesc >=", value, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescLessThan(String value) {
            addCriterion("menuDesc <", value, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescLessThanOrEqualTo(String value) {
            addCriterion("menuDesc <=", value, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescLike(String value) {
            addCriterion("menuDesc like", value, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescNotLike(String value) {
            addCriterion("menuDesc not like", value, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescIn(List<String> values) {
            addCriterion("menuDesc in", values, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescNotIn(List<String> values) {
            addCriterion("menuDesc not in", values, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescBetween(String value1, String value2) {
            addCriterion("menuDesc between", value1, value2, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuDescNotBetween(String value1, String value2) {
            addCriterion("menuDesc not between", value1, value2, "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuUrlIsNull() {
            addCriterion("menuUrl is null");
            return (Criteria) this;
        }
        public Criteria andMenuUrlIsNotNull() {
            addCriterion("menuUrl is not null");
            return (Criteria) this;
        }
        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("menuUrl =", value, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("menuUrl <>", value, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("menuUrl >", value, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("menuUrl >=", value, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("menuUrl <", value, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("menuUrl <=", value, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlLike(String value) {
            addCriterion("menuUrl like", value, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("menuUrl not like", value, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("menuUrl in", values, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("menuUrl not in", values, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("menuUrl between", value1, value2, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("menuUrl not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdIsNull() {
            addCriterion("menuParentId is null");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdIsNotNull() {
            addCriterion("menuParentId is not null");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdEqualTo(Long value) {
            addCriterion("menuParentId =", value, "menuParentId");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdNotEqualTo(Long value) {
            addCriterion("menuParentId <>", value, "menuParentId");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdGreaterThan(Long value) {
            addCriterion("menuParentId >", value, "menuParentId");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("menuParentId >=", value, "menuParentId");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdLessThan(Long value) {
            addCriterion("menuParentId <", value, "menuParentId");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdLessThanOrEqualTo(Long value) {
            addCriterion("menuParentId <=", value, "menuParentId");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdIn(List<Long> values) {
            addCriterion("menuParentId in", values, "menuParentId");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdNotIn(List<Long> values) {
            addCriterion("menuParentId not in", values, "menuParentId");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdBetween(Long value1, Long value2) {
            addCriterion("menuParentId between", value1, value2, "menuParentId");
            return (Criteria) this;
        }
        public Criteria andMenuParentIdNotBetween(Long value1, Long value2) {
            addCriterion("menuParentId not between", value1, value2, "menuParentId");
            return (Criteria) this;
        }
        public Criteria andMenuIconIsNull() {
            addCriterion("menuIcon is null");
            return (Criteria) this;
        }
        public Criteria andMenuIconIsNotNull() {
            addCriterion("menuIcon is not null");
            return (Criteria) this;
        }
        public Criteria andMenuIconEqualTo(String value) {
            addCriterion("menuIcon =", value, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconNotEqualTo(String value) {
            addCriterion("menuIcon <>", value, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconGreaterThan(String value) {
            addCriterion("menuIcon >", value, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconGreaterThanOrEqualTo(String value) {
            addCriterion("menuIcon >=", value, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconLessThan(String value) {
            addCriterion("menuIcon <", value, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconLessThanOrEqualTo(String value) {
            addCriterion("menuIcon <=", value, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconLike(String value) {
            addCriterion("menuIcon like", value, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconNotLike(String value) {
            addCriterion("menuIcon not like", value, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconIn(List<String> values) {
            addCriterion("menuIcon in", values, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconNotIn(List<String> values) {
            addCriterion("menuIcon not in", values, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconBetween(String value1, String value2) {
            addCriterion("menuIcon between", value1, value2, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuIconNotBetween(String value1, String value2) {
            addCriterion("menuIcon not between", value1, value2, "menuIcon");
            return (Criteria) this;
        }
        public Criteria andMenuStateIsNull() {
            addCriterion("menuState is null");
            return (Criteria) this;
        }
        public Criteria andMenuStateIsNotNull() {
            addCriterion("menuState is not null");
            return (Criteria) this;
        }
        public Criteria andMenuStateEqualTo(Byte value) {
            addCriterion("menuState =", value, "menuState");
            return (Criteria) this;
        }
        public Criteria andMenuStateNotEqualTo(Byte value) {
            addCriterion("menuState <>", value, "menuState");
            return (Criteria) this;
        }
        public Criteria andMenuStateGreaterThan(Byte value) {
            addCriterion("menuState >", value, "menuState");
            return (Criteria) this;
        }
        public Criteria andMenuStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("menuState >=", value, "menuState");
            return (Criteria) this;
        }
        public Criteria andMenuStateLessThan(Byte value) {
            addCriterion("menuState <", value, "menuState");
            return (Criteria) this;
        }
        public Criteria andMenuStateLessThanOrEqualTo(Byte value) {
            addCriterion("menuState <=", value, "menuState");
            return (Criteria) this;
        }
        public Criteria andMenuStateIn(List<Byte> values) {
            addCriterion("menuState in", values, "menuState");
            return (Criteria) this;
        }
        public Criteria andMenuStateNotIn(List<Byte> values) {
            addCriterion("menuState not in", values, "menuState");
            return (Criteria) this;
        }
        public Criteria andMenuStateBetween(Byte value1, Byte value2) {
            addCriterion("menuState between", value1, value2, "menuState");
            return (Criteria) this;
        }
        public Criteria andMenuStateNotBetween(Byte value1, Byte value2) {
            addCriterion("menuState not between", value1, value2, "menuState");
            return (Criteria) this;
        }
        public Criteria andMenuTypeIsNull() {
            addCriterion("menuType is null");
            return (Criteria) this;
        }
        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menuType is not null");
            return (Criteria) this;
        }
        public Criteria andMenuTypeEqualTo(Byte value) {
            addCriterion("menuType =", value, "menuType");
            return (Criteria) this;
        }
        public Criteria andMenuTypeNotEqualTo(Byte value) {
            addCriterion("menuType <>", value, "menuType");
            return (Criteria) this;
        }
        public Criteria andMenuTypeGreaterThan(Byte value) {
            addCriterion("menuType >", value, "menuType");
            return (Criteria) this;
        }
        public Criteria andMenuTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("menuType >=", value, "menuType");
            return (Criteria) this;
        }
        public Criteria andMenuTypeLessThan(Byte value) {
            addCriterion("menuType <", value, "menuType");
            return (Criteria) this;
        }
        public Criteria andMenuTypeLessThanOrEqualTo(Byte value) {
            addCriterion("menuType <=", value, "menuType");
            return (Criteria) this;
        }
        public Criteria andMenuTypeIn(List<Byte> values) {
            addCriterion("menuType in", values, "menuType");
            return (Criteria) this;
        }
        public Criteria andMenuTypeNotIn(List<Byte> values) {
            addCriterion("menuType not in", values, "menuType");
            return (Criteria) this;
        }
        public Criteria andMenuTypeBetween(Byte value1, Byte value2) {
            addCriterion("menuType between", value1, value2, "menuType");
            return (Criteria) this;
        }
        public Criteria andMenuTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("menuType not between", value1, value2, "menuType");
            return (Criteria) this;
        }
        public Criteria andMenuNameLikeInsensitive(String value) {
            addCriterion("upper(menuName) like", value.toUpperCase(), "menuName");
            return (Criteria) this;
        }
        public Criteria andMenuDescLikeInsensitive(String value) {
            addCriterion("upper(menuDesc) like", value.toUpperCase(), "menuDesc");
            return (Criteria) this;
        }
        public Criteria andMenuUrlLikeInsensitive(String value) {
            addCriterion("upper(menuUrl) like", value.toUpperCase(), "menuUrl");
            return (Criteria) this;
        }
        public Criteria andMenuIconLikeInsensitive(String value) {
            addCriterion("upper(menuIcon) like", value.toUpperCase(), "menuIcon");
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
     * @version 1.0 2016-10-31
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