/*
 * AfterSaleQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-11 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AfterSaleQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public AfterSaleQueryHelper() {
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
     * @version 1.0 2018-06-11
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
        public Criteria andFactoryTimeIsNull() {
            addCriterion("factoryTime is null");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeIsNotNull() {
            addCriterion("factoryTime is not null");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeEqualTo(String value) {
            addCriterion("factoryTime =", value, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeNotEqualTo(String value) {
            addCriterion("factoryTime <>", value, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeGreaterThan(String value) {
            addCriterion("factoryTime >", value, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("factoryTime >=", value, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeLessThan(String value) {
            addCriterion("factoryTime <", value, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeLessThanOrEqualTo(String value) {
            addCriterion("factoryTime <=", value, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeLike(String value) {
            addCriterion("factoryTime like", value, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeNotLike(String value) {
            addCriterion("factoryTime not like", value, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeIn(List<String> values) {
            addCriterion("factoryTime in", values, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeNotIn(List<String> values) {
            addCriterion("factoryTime not in", values, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeBetween(String value1, String value2) {
            addCriterion("factoryTime between", value1, value2, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeNotBetween(String value1, String value2) {
            addCriterion("factoryTime not between", value1, value2, "factoryTime");
            return (Criteria) this;
        }
        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }
        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }
        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }
        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
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
        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }
        public Criteria andNumberLikeInsensitive(String value) {
            addCriterion("upper(number) like", value.toUpperCase(), "number");
            return (Criteria) this;
        }
        public Criteria andFactoryTimeLikeInsensitive(String value) {
            addCriterion("upper(factoryTime) like", value.toUpperCase(), "factoryTime");
            return (Criteria) this;
        }
        public Criteria andContactsLikeInsensitive(String value) {
            addCriterion("upper(contacts) like", value.toUpperCase(), "contacts");
            return (Criteria) this;
        }
        public Criteria andTelephoneLikeInsensitive(String value) {
            addCriterion("upper(Telephone) like", value.toUpperCase(), "telephone");
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
     * @version 1.0 2018-06-11
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