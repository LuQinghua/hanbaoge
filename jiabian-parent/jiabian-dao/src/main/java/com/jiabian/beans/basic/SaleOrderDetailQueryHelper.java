/*
 * SaleOrderDetailQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-27 Created
 */
package com.jiabian.beans.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SaleOrderDetailQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SaleOrderDetailQueryHelper() {
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
     * @version 1.0 2016-12-27
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
        public Criteria andOrderIdIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }
        public Criteria andOrderIdIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }
        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("orderId =", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("orderId <>", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("orderId >", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("orderId >=", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("orderId <", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("orderId <=", value, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("orderId in", values, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("orderId not in", values, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("orderId between", value1, value2, "orderId");
            return (Criteria) this;
        }
        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("orderId not between", value1, value2, "orderId");
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
        public Criteria andSalePriceIsNull() {
            addCriterion("salePrice is null");
            return (Criteria) this;
        }
        public Criteria andSalePriceIsNotNull() {
            addCriterion("salePrice is not null");
            return (Criteria) this;
        }
        public Criteria andSalePriceEqualTo(BigDecimal value) {
            addCriterion("salePrice =", value, "salePrice");
            return (Criteria) this;
        }
        public Criteria andSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("salePrice <>", value, "salePrice");
            return (Criteria) this;
        }
        public Criteria andSalePriceGreaterThan(BigDecimal value) {
            addCriterion("salePrice >", value, "salePrice");
            return (Criteria) this;
        }
        public Criteria andSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salePrice >=", value, "salePrice");
            return (Criteria) this;
        }
        public Criteria andSalePriceLessThan(BigDecimal value) {
            addCriterion("salePrice <", value, "salePrice");
            return (Criteria) this;
        }
        public Criteria andSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salePrice <=", value, "salePrice");
            return (Criteria) this;
        }
        public Criteria andSalePriceIn(List<BigDecimal> values) {
            addCriterion("salePrice in", values, "salePrice");
            return (Criteria) this;
        }
        public Criteria andSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("salePrice not in", values, "salePrice");
            return (Criteria) this;
        }
        public Criteria andSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salePrice between", value1, value2, "salePrice");
            return (Criteria) this;
        }
        public Criteria andSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salePrice not between", value1, value2, "salePrice");
            return (Criteria) this;
        }
        public Criteria andSaleNumIsNull() {
            addCriterion("saleNum is null");
            return (Criteria) this;
        }
        public Criteria andSaleNumIsNotNull() {
            addCriterion("saleNum is not null");
            return (Criteria) this;
        }
        public Criteria andSaleNumEqualTo(Integer value) {
            addCriterion("saleNum =", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumNotEqualTo(Integer value) {
            addCriterion("saleNum <>", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumGreaterThan(Integer value) {
            addCriterion("saleNum >", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleNum >=", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumLessThan(Integer value) {
            addCriterion("saleNum <", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("saleNum <=", value, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumIn(List<Integer> values) {
            addCriterion("saleNum in", values, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumNotIn(List<Integer> values) {
            addCriterion("saleNum not in", values, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("saleNum between", value1, value2, "saleNum");
            return (Criteria) this;
        }
        public Criteria andSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("saleNum not between", value1, value2, "saleNum");
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
     * @version 1.0 2016-12-27
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