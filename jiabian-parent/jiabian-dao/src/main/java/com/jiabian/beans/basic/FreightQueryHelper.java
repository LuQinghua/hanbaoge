/*
 * FreightQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-15 Created
 */
package com.jiabian.beans.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FreightQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public FreightQueryHelper() {
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
     * @version 1.0 2016-11-15
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
        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }
        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }
        public Criteria andMemberEqualTo(String value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }
        public Criteria andMemberNotEqualTo(String value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }
        public Criteria andMemberGreaterThan(String value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }
        public Criteria andMemberGreaterThanOrEqualTo(String value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }
        public Criteria andMemberLessThan(String value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }
        public Criteria andMemberLessThanOrEqualTo(String value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }
        public Criteria andMemberLike(String value) {
            addCriterion("member like", value, "member");
            return (Criteria) this;
        }
        public Criteria andMemberNotLike(String value) {
            addCriterion("member not like", value, "member");
            return (Criteria) this;
        }
        public Criteria andMemberIn(List<String> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }
        public Criteria andMemberNotIn(List<String> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }
        public Criteria andMemberBetween(String value1, String value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }
        public Criteria andMemberNotBetween(String value1, String value2) {
            addCriterion("member not between", value1, value2, "member");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyIsNull() {
            addCriterion("ordermoney is null");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyIsNotNull() {
            addCriterion("ordermoney is not null");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyEqualTo(BigDecimal value) {
            addCriterion("ordermoney =", value, "ordermoney");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyNotEqualTo(BigDecimal value) {
            addCriterion("ordermoney <>", value, "ordermoney");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyGreaterThan(BigDecimal value) {
            addCriterion("ordermoney >", value, "ordermoney");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ordermoney >=", value, "ordermoney");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyLessThan(BigDecimal value) {
            addCriterion("ordermoney <", value, "ordermoney");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ordermoney <=", value, "ordermoney");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyIn(List<BigDecimal> values) {
            addCriterion("ordermoney in", values, "ordermoney");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyNotIn(List<BigDecimal> values) {
            addCriterion("ordermoney not in", values, "ordermoney");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ordermoney between", value1, value2, "ordermoney");
            return (Criteria) this;
        }
        public Criteria andOrdermoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ordermoney not between", value1, value2, "ordermoney");
            return (Criteria) this;
        }
        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }
        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }
        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }
        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }
        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }
        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }
        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }
        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }
        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }
        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }
        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }
        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }
        public Criteria andBasefreightIsNull() {
            addCriterion("basefreight is null");
            return (Criteria) this;
        }
        public Criteria andBasefreightIsNotNull() {
            addCriterion("basefreight is not null");
            return (Criteria) this;
        }
        public Criteria andBasefreightEqualTo(BigDecimal value) {
            addCriterion("basefreight =", value, "basefreight");
            return (Criteria) this;
        }
        public Criteria andBasefreightNotEqualTo(BigDecimal value) {
            addCriterion("basefreight <>", value, "basefreight");
            return (Criteria) this;
        }
        public Criteria andBasefreightGreaterThan(BigDecimal value) {
            addCriterion("basefreight >", value, "basefreight");
            return (Criteria) this;
        }
        public Criteria andBasefreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("basefreight >=", value, "basefreight");
            return (Criteria) this;
        }
        public Criteria andBasefreightLessThan(BigDecimal value) {
            addCriterion("basefreight <", value, "basefreight");
            return (Criteria) this;
        }
        public Criteria andBasefreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("basefreight <=", value, "basefreight");
            return (Criteria) this;
        }
        public Criteria andBasefreightIn(List<BigDecimal> values) {
            addCriterion("basefreight in", values, "basefreight");
            return (Criteria) this;
        }
        public Criteria andBasefreightNotIn(List<BigDecimal> values) {
            addCriterion("basefreight not in", values, "basefreight");
            return (Criteria) this;
        }
        public Criteria andBasefreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("basefreight between", value1, value2, "basefreight");
            return (Criteria) this;
        }
        public Criteria andBasefreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("basefreight not between", value1, value2, "basefreight");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightIsNull() {
            addCriterion("overweightfreight is null");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightIsNotNull() {
            addCriterion("overweightfreight is not null");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightEqualTo(BigDecimal value) {
            addCriterion("overweightfreight =", value, "overweightfreight");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightNotEqualTo(BigDecimal value) {
            addCriterion("overweightfreight <>", value, "overweightfreight");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightGreaterThan(BigDecimal value) {
            addCriterion("overweightfreight >", value, "overweightfreight");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overweightfreight >=", value, "overweightfreight");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightLessThan(BigDecimal value) {
            addCriterion("overweightfreight <", value, "overweightfreight");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overweightfreight <=", value, "overweightfreight");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightIn(List<BigDecimal> values) {
            addCriterion("overweightfreight in", values, "overweightfreight");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightNotIn(List<BigDecimal> values) {
            addCriterion("overweightfreight not in", values, "overweightfreight");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overweightfreight between", value1, value2, "overweightfreight");
            return (Criteria) this;
        }
        public Criteria andOverweightfreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overweightfreight not between", value1, value2, "overweightfreight");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightIsNull() {
            addCriterion("unelevatorfreight is null");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightIsNotNull() {
            addCriterion("unelevatorfreight is not null");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightEqualTo(BigDecimal value) {
            addCriterion("unelevatorfreight =", value, "unelevatorfreight");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightNotEqualTo(BigDecimal value) {
            addCriterion("unelevatorfreight <>", value, "unelevatorfreight");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightGreaterThan(BigDecimal value) {
            addCriterion("unelevatorfreight >", value, "unelevatorfreight");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unelevatorfreight >=", value, "unelevatorfreight");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightLessThan(BigDecimal value) {
            addCriterion("unelevatorfreight <", value, "unelevatorfreight");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unelevatorfreight <=", value, "unelevatorfreight");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightIn(List<BigDecimal> values) {
            addCriterion("unelevatorfreight in", values, "unelevatorfreight");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightNotIn(List<BigDecimal> values) {
            addCriterion("unelevatorfreight not in", values, "unelevatorfreight");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unelevatorfreight between", value1, value2, "unelevatorfreight");
            return (Criteria) this;
        }
        public Criteria andUnelevatorfreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unelevatorfreight not between", value1, value2, "unelevatorfreight");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightIsNull() {
            addCriterion("elevatorfreight is null");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightIsNotNull() {
            addCriterion("elevatorfreight is not null");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightEqualTo(BigDecimal value) {
            addCriterion("elevatorfreight =", value, "elevatorfreight");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightNotEqualTo(BigDecimal value) {
            addCriterion("elevatorfreight <>", value, "elevatorfreight");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightGreaterThan(BigDecimal value) {
            addCriterion("elevatorfreight >", value, "elevatorfreight");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("elevatorfreight >=", value, "elevatorfreight");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightLessThan(BigDecimal value) {
            addCriterion("elevatorfreight <", value, "elevatorfreight");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("elevatorfreight <=", value, "elevatorfreight");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightIn(List<BigDecimal> values) {
            addCriterion("elevatorfreight in", values, "elevatorfreight");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightNotIn(List<BigDecimal> values) {
            addCriterion("elevatorfreight not in", values, "elevatorfreight");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("elevatorfreight between", value1, value2, "elevatorfreight");
            return (Criteria) this;
        }
        public Criteria andElevatorfreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("elevatorfreight not between", value1, value2, "elevatorfreight");
            return (Criteria) this;
        }
        public Criteria andOverrestrictIsNull() {
            addCriterion("overrestrict is null");
            return (Criteria) this;
        }
        public Criteria andOverrestrictIsNotNull() {
            addCriterion("overrestrict is not null");
            return (Criteria) this;
        }
        public Criteria andOverrestrictEqualTo(Integer value) {
            addCriterion("overrestrict =", value, "overrestrict");
            return (Criteria) this;
        }
        public Criteria andOverrestrictNotEqualTo(Integer value) {
            addCriterion("overrestrict <>", value, "overrestrict");
            return (Criteria) this;
        }
        public Criteria andOverrestrictGreaterThan(Integer value) {
            addCriterion("overrestrict >", value, "overrestrict");
            return (Criteria) this;
        }
        public Criteria andOverrestrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("overrestrict >=", value, "overrestrict");
            return (Criteria) this;
        }
        public Criteria andOverrestrictLessThan(Integer value) {
            addCriterion("overrestrict <", value, "overrestrict");
            return (Criteria) this;
        }
        public Criteria andOverrestrictLessThanOrEqualTo(Integer value) {
            addCriterion("overrestrict <=", value, "overrestrict");
            return (Criteria) this;
        }
        public Criteria andOverrestrictIn(List<Integer> values) {
            addCriterion("overrestrict in", values, "overrestrict");
            return (Criteria) this;
        }
        public Criteria andOverrestrictNotIn(List<Integer> values) {
            addCriterion("overrestrict not in", values, "overrestrict");
            return (Criteria) this;
        }
        public Criteria andOverrestrictBetween(Integer value1, Integer value2) {
            addCriterion("overrestrict between", value1, value2, "overrestrict");
            return (Criteria) this;
        }
        public Criteria andOverrestrictNotBetween(Integer value1, Integer value2) {
            addCriterion("overrestrict not between", value1, value2, "overrestrict");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyIsNull() {
            addCriterion("couponmoney is null");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyIsNotNull() {
            addCriterion("couponmoney is not null");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyEqualTo(BigDecimal value) {
            addCriterion("couponmoney =", value, "couponmoney");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyNotEqualTo(BigDecimal value) {
            addCriterion("couponmoney <>", value, "couponmoney");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyGreaterThan(BigDecimal value) {
            addCriterion("couponmoney >", value, "couponmoney");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("couponmoney >=", value, "couponmoney");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyLessThan(BigDecimal value) {
            addCriterion("couponmoney <", value, "couponmoney");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("couponmoney <=", value, "couponmoney");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyIn(List<BigDecimal> values) {
            addCriterion("couponmoney in", values, "couponmoney");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyNotIn(List<BigDecimal> values) {
            addCriterion("couponmoney not in", values, "couponmoney");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("couponmoney between", value1, value2, "couponmoney");
            return (Criteria) this;
        }
        public Criteria andCouponmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("couponmoney not between", value1, value2, "couponmoney");
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
        public Criteria andMemberLikeInsensitive(String value) {
            addCriterion("upper(member) like", value.toUpperCase(), "member");
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
     * @version 1.0 2016-11-15
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