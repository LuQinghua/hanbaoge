/*
 * VersionAppQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-20 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VersionAppQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public VersionAppQueryHelper() {
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
     * @version 1.0 2016-12-20
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
        public Criteria andVersionDescIsNull() {
            addCriterion("versionDesc is null");
            return (Criteria) this;
        }
        public Criteria andVersionDescIsNotNull() {
            addCriterion("versionDesc is not null");
            return (Criteria) this;
        }
        public Criteria andVersionDescEqualTo(String value) {
            addCriterion("versionDesc =", value, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescNotEqualTo(String value) {
            addCriterion("versionDesc <>", value, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescGreaterThan(String value) {
            addCriterion("versionDesc >", value, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescGreaterThanOrEqualTo(String value) {
            addCriterion("versionDesc >=", value, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescLessThan(String value) {
            addCriterion("versionDesc <", value, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescLessThanOrEqualTo(String value) {
            addCriterion("versionDesc <=", value, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescLike(String value) {
            addCriterion("versionDesc like", value, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescNotLike(String value) {
            addCriterion("versionDesc not like", value, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescIn(List<String> values) {
            addCriterion("versionDesc in", values, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescNotIn(List<String> values) {
            addCriterion("versionDesc not in", values, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescBetween(String value1, String value2) {
            addCriterion("versionDesc between", value1, value2, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionDescNotBetween(String value1, String value2) {
            addCriterion("versionDesc not between", value1, value2, "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionNoIsNull() {
            addCriterion("versionNo is null");
            return (Criteria) this;
        }
        public Criteria andVersionNoIsNotNull() {
            addCriterion("versionNo is not null");
            return (Criteria) this;
        }
        public Criteria andVersionNoEqualTo(String value) {
            addCriterion("versionNo =", value, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoNotEqualTo(String value) {
            addCriterion("versionNo <>", value, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoGreaterThan(String value) {
            addCriterion("versionNo >", value, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoGreaterThanOrEqualTo(String value) {
            addCriterion("versionNo >=", value, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoLessThan(String value) {
            addCriterion("versionNo <", value, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoLessThanOrEqualTo(String value) {
            addCriterion("versionNo <=", value, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoLike(String value) {
            addCriterion("versionNo like", value, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoNotLike(String value) {
            addCriterion("versionNo not like", value, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoIn(List<String> values) {
            addCriterion("versionNo in", values, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoNotIn(List<String> values) {
            addCriterion("versionNo not in", values, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoBetween(String value1, String value2) {
            addCriterion("versionNo between", value1, value2, "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionNoNotBetween(String value1, String value2) {
            addCriterion("versionNo not between", value1, value2, "versionNo");
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
        public Criteria andVersionUrlIsNull() {
            addCriterion("versionUrl is null");
            return (Criteria) this;
        }
        public Criteria andVersionUrlIsNotNull() {
            addCriterion("versionUrl is not null");
            return (Criteria) this;
        }
        public Criteria andVersionUrlEqualTo(String value) {
            addCriterion("versionUrl =", value, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlNotEqualTo(String value) {
            addCriterion("versionUrl <>", value, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlGreaterThan(String value) {
            addCriterion("versionUrl >", value, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("versionUrl >=", value, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlLessThan(String value) {
            addCriterion("versionUrl <", value, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlLessThanOrEqualTo(String value) {
            addCriterion("versionUrl <=", value, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlLike(String value) {
            addCriterion("versionUrl like", value, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlNotLike(String value) {
            addCriterion("versionUrl not like", value, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlIn(List<String> values) {
            addCriterion("versionUrl in", values, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlNotIn(List<String> values) {
            addCriterion("versionUrl not in", values, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlBetween(String value1, String value2) {
            addCriterion("versionUrl between", value1, value2, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andVersionUrlNotBetween(String value1, String value2) {
            addCriterion("versionUrl not between", value1, value2, "versionUrl");
            return (Criteria) this;
        }
        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }
        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }
        public Criteria andSourceEqualTo(Byte value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceNotEqualTo(Byte value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceGreaterThan(Byte value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceLessThan(Byte value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceLessThanOrEqualTo(Byte value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceIn(List<Byte> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }
        public Criteria andSourceNotIn(List<Byte> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }
        public Criteria andSourceBetween(Byte value1, Byte value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }
        public Criteria andSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("source not between", value1, value2, "source");
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
        public Criteria andVersionDescLikeInsensitive(String value) {
            addCriterion("upper(versionDesc) like", value.toUpperCase(), "versionDesc");
            return (Criteria) this;
        }
        public Criteria andVersionNoLikeInsensitive(String value) {
            addCriterion("upper(versionNo) like", value.toUpperCase(), "versionNo");
            return (Criteria) this;
        }
        public Criteria andVersionUrlLikeInsensitive(String value) {
            addCriterion("upper(versionUrl) like", value.toUpperCase(), "versionUrl");
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
     * @version 1.0 2016-12-20
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