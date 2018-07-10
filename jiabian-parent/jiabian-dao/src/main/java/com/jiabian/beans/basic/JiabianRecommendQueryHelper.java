/*
 * JiabianRecommendQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-04 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.List;

public class JiabianRecommendQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public JiabianRecommendQueryHelper() {
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
     * 商品推荐表
     * 
     * @author 菠萝大象
     * @version 1.0 2016-11-04
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
        public Criteria andIndexDomainIsNull() {
            addCriterion("indexDomain is null");
            return (Criteria) this;
        }
        public Criteria andIndexDomainIsNotNull() {
            addCriterion("indexDomain is not null");
            return (Criteria) this;
        }
        public Criteria andIndexDomainEqualTo(Integer value) {
            addCriterion("indexDomain =", value, "indexDomain");
            return (Criteria) this;
        }
        public Criteria andIndexDomainNotEqualTo(Integer value) {
            addCriterion("indexDomain <>", value, "indexDomain");
            return (Criteria) this;
        }
        public Criteria andIndexDomainGreaterThan(Integer value) {
            addCriterion("indexDomain >", value, "indexDomain");
            return (Criteria) this;
        }
        public Criteria andIndexDomainGreaterThanOrEqualTo(Integer value) {
            addCriterion("indexDomain >=", value, "indexDomain");
            return (Criteria) this;
        }
        public Criteria andIndexDomainLessThan(Integer value) {
            addCriterion("indexDomain <", value, "indexDomain");
            return (Criteria) this;
        }
        public Criteria andIndexDomainLessThanOrEqualTo(Integer value) {
            addCriterion("indexDomain <=", value, "indexDomain");
            return (Criteria) this;
        }
        public Criteria andIndexDomainIn(List<Integer> values) {
            addCriterion("indexDomain in", values, "indexDomain");
            return (Criteria) this;
        }
        public Criteria andIndexDomainNotIn(List<Integer> values) {
            addCriterion("indexDomain not in", values, "indexDomain");
            return (Criteria) this;
        }
        public Criteria andIndexDomainBetween(Integer value1, Integer value2) {
            addCriterion("indexDomain between", value1, value2, "indexDomain");
            return (Criteria) this;
        }
        public Criteria andIndexDomainNotBetween(Integer value1, Integer value2) {
            addCriterion("indexDomain not between", value1, value2, "indexDomain");
            return (Criteria) this;
        }
        public Criteria andRelyIdIsNull() {
            addCriterion("relyId is null");
            return (Criteria) this;
        }
        public Criteria andRelyIdIsNotNull() {
            addCriterion("relyId is not null");
            return (Criteria) this;
        }
        public Criteria andRelyIdEqualTo(Long value) {
            addCriterion("relyId =", value, "relyId");
            return (Criteria) this;
        }
        public Criteria andRelyIdNotEqualTo(Long value) {
            addCriterion("relyId <>", value, "relyId");
            return (Criteria) this;
        }
        public Criteria andRelyIdGreaterThan(Long value) {
            addCriterion("relyId >", value, "relyId");
            return (Criteria) this;
        }
        public Criteria andRelyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("relyId >=", value, "relyId");
            return (Criteria) this;
        }
        public Criteria andRelyIdLessThan(Long value) {
            addCriterion("relyId <", value, "relyId");
            return (Criteria) this;
        }
        public Criteria andRelyIdLessThanOrEqualTo(Long value) {
            addCriterion("relyId <=", value, "relyId");
            return (Criteria) this;
        }
        public Criteria andRelyIdIn(List<Long> values) {
            addCriterion("relyId in", values, "relyId");
            return (Criteria) this;
        }
        public Criteria andRelyIdNotIn(List<Long> values) {
            addCriterion("relyId not in", values, "relyId");
            return (Criteria) this;
        }
        public Criteria andRelyIdBetween(Long value1, Long value2) {
            addCriterion("relyId between", value1, value2, "relyId");
            return (Criteria) this;
        }
        public Criteria andRelyIdNotBetween(Long value1, Long value2) {
            addCriterion("relyId not between", value1, value2, "relyId");
            return (Criteria) this;
        }
        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }
        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }
        public Criteria andRegionEqualTo(Byte value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionNotEqualTo(Byte value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionGreaterThan(Byte value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionGreaterThanOrEqualTo(Byte value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionLessThan(Byte value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionLessThanOrEqualTo(Byte value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }
        public Criteria andRegionIn(List<Byte> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }
        public Criteria andRegionNotIn(List<Byte> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }
        public Criteria andRegionBetween(Byte value1, Byte value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }
        public Criteria andRegionNotBetween(Byte value1, Byte value2) {
            addCriterion("region not between", value1, value2, "region");
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
        public Criteria andRecomTypeIsNull() {
            addCriterion("recomType is null");
            return (Criteria) this;
        }
        public Criteria andRecomTypeIsNotNull() {
            addCriterion("recomType is not null");
            return (Criteria) this;
        }
        public Criteria andRecomTypeEqualTo(Byte value) {
            addCriterion("recomType =", value, "recomType");
            return (Criteria) this;
        }
        public Criteria andRecomTypeNotEqualTo(Byte value) {
            addCriterion("recomType <>", value, "recomType");
            return (Criteria) this;
        }
        public Criteria andRecomTypeGreaterThan(Byte value) {
            addCriterion("recomType >", value, "recomType");
            return (Criteria) this;
        }
        public Criteria andRecomTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("recomType >=", value, "recomType");
            return (Criteria) this;
        }
        public Criteria andRecomTypeLessThan(Byte value) {
            addCriterion("recomType <", value, "recomType");
            return (Criteria) this;
        }
        public Criteria andRecomTypeLessThanOrEqualTo(Byte value) {
            addCriterion("recomType <=", value, "recomType");
            return (Criteria) this;
        }
        public Criteria andRecomTypeIn(List<Byte> values) {
            addCriterion("recomType in", values, "recomType");
            return (Criteria) this;
        }
        public Criteria andRecomTypeNotIn(List<Byte> values) {
            addCriterion("recomType not in", values, "recomType");
            return (Criteria) this;
        }
        public Criteria andRecomTypeBetween(Byte value1, Byte value2) {
            addCriterion("recomType between", value1, value2, "recomType");
            return (Criteria) this;
        }
        public Criteria andRecomTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("recomType not between", value1, value2, "recomType");
            return (Criteria) this;
        }
        public Criteria andAddressTypeIsNull() {
            addCriterion("addressType is null");
            return (Criteria) this;
        }
        public Criteria andAddressTypeIsNotNull() {
            addCriterion("addressType is not null");
            return (Criteria) this;
        }
        public Criteria andAddressTypeEqualTo(Integer value) {
            addCriterion("addressType =", value, "addressType");
            return (Criteria) this;
        }
        public Criteria andAddressTypeNotEqualTo(Integer value) {
            addCriterion("addressType <>", value, "addressType");
            return (Criteria) this;
        }
        public Criteria andAddressTypeGreaterThan(Integer value) {
            addCriterion("addressType >", value, "addressType");
            return (Criteria) this;
        }
        public Criteria andAddressTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addressType >=", value, "addressType");
            return (Criteria) this;
        }
        public Criteria andAddressTypeLessThan(Integer value) {
            addCriterion("addressType <", value, "addressType");
            return (Criteria) this;
        }
        public Criteria andAddressTypeLessThanOrEqualTo(Integer value) {
            addCriterion("addressType <=", value, "addressType");
            return (Criteria) this;
        }
        public Criteria andAddressTypeIn(List<Integer> values) {
            addCriterion("addressType in", values, "addressType");
            return (Criteria) this;
        }
        public Criteria andAddressTypeNotIn(List<Integer> values) {
            addCriterion("addressType not in", values, "addressType");
            return (Criteria) this;
        }
        public Criteria andAddressTypeBetween(Integer value1, Integer value2) {
            addCriterion("addressType between", value1, value2, "addressType");
            return (Criteria) this;
        }
        public Criteria andAddressTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("addressType not between", value1, value2, "addressType");
            return (Criteria) this;
        }
        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }
        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }
        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }
        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }
        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }
        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }
        public Criteria andRecomSourceIsNull() {
            addCriterion("recomSource is null");
            return (Criteria) this;
        }
        public Criteria andRecomSourceIsNotNull() {
            addCriterion("recomSource is not null");
            return (Criteria) this;
        }
        public Criteria andRecomSourceEqualTo(Byte value) {
            addCriterion("recomSource =", value, "recomSource");
            return (Criteria) this;
        }
        public Criteria andRecomSourceNotEqualTo(Byte value) {
            addCriterion("recomSource <>", value, "recomSource");
            return (Criteria) this;
        }
        public Criteria andRecomSourceGreaterThan(Byte value) {
            addCriterion("recomSource >", value, "recomSource");
            return (Criteria) this;
        }
        public Criteria andRecomSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("recomSource >=", value, "recomSource");
            return (Criteria) this;
        }
        public Criteria andRecomSourceLessThan(Byte value) {
            addCriterion("recomSource <", value, "recomSource");
            return (Criteria) this;
        }
        public Criteria andRecomSourceLessThanOrEqualTo(Byte value) {
            addCriterion("recomSource <=", value, "recomSource");
            return (Criteria) this;
        }
        public Criteria andRecomSourceIn(List<Byte> values) {
            addCriterion("recomSource in", values, "recomSource");
            return (Criteria) this;
        }
        public Criteria andRecomSourceNotIn(List<Byte> values) {
            addCriterion("recomSource not in", values, "recomSource");
            return (Criteria) this;
        }
        public Criteria andRecomSourceBetween(Byte value1, Byte value2) {
            addCriterion("recomSource between", value1, value2, "recomSource");
            return (Criteria) this;
        }
        public Criteria andRecomSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("recomSource not between", value1, value2, "recomSource");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 商品推荐表
     * 
     * @author 菠萝大象
     * @version 1.0 2016-11-04
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