/*
 * jkproductQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-31 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class jkproductQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public jkproductQueryHelper() {
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
     * @version 1.0 2017-05-31
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
        public Criteria andImgNameIsNull() {
            addCriterion("imgName is null");
            return (Criteria) this;
        }
        public Criteria andImgNameIsNotNull() {
            addCriterion("imgName is not null");
            return (Criteria) this;
        }
        public Criteria andImgNameEqualTo(String value) {
            addCriterion("imgName =", value, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameNotEqualTo(String value) {
            addCriterion("imgName <>", value, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameGreaterThan(String value) {
            addCriterion("imgName >", value, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameGreaterThanOrEqualTo(String value) {
            addCriterion("imgName >=", value, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameLessThan(String value) {
            addCriterion("imgName <", value, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameLessThanOrEqualTo(String value) {
            addCriterion("imgName <=", value, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameLike(String value) {
            addCriterion("imgName like", value, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameNotLike(String value) {
            addCriterion("imgName not like", value, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameIn(List<String> values) {
            addCriterion("imgName in", values, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameNotIn(List<String> values) {
            addCriterion("imgName not in", values, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameBetween(String value1, String value2) {
            addCriterion("imgName between", value1, value2, "imgName");
            return (Criteria) this;
        }
        public Criteria andImgNameNotBetween(String value1, String value2) {
            addCriterion("imgName not between", value1, value2, "imgName");
            return (Criteria) this;
        }
        public Criteria andClassifyIsNull() {
            addCriterion("classify is null");
            return (Criteria) this;
        }
        public Criteria andClassifyIsNotNull() {
            addCriterion("classify is not null");
            return (Criteria) this;
        }
        public Criteria andClassifyEqualTo(Byte value) {
            addCriterion("classify =", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyNotEqualTo(Byte value) {
            addCriterion("classify <>", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyGreaterThan(Byte value) {
            addCriterion("classify >", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("classify >=", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyLessThan(Byte value) {
            addCriterion("classify <", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyLessThanOrEqualTo(Byte value) {
            addCriterion("classify <=", value, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyIn(List<Byte> values) {
            addCriterion("classify in", values, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyNotIn(List<Byte> values) {
            addCriterion("classify not in", values, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyBetween(Byte value1, Byte value2) {
            addCriterion("classify between", value1, value2, "classify");
            return (Criteria) this;
        }
        public Criteria andClassifyNotBetween(Byte value1, Byte value2) {
            addCriterion("classify not between", value1, value2, "classify");
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
        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }
        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }
        public Criteria andStyleEqualTo(Byte value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }
        public Criteria andStyleNotEqualTo(Byte value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }
        public Criteria andStyleGreaterThan(Byte value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }
        public Criteria andStyleGreaterThanOrEqualTo(Byte value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }
        public Criteria andStyleLessThan(Byte value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }
        public Criteria andStyleLessThanOrEqualTo(Byte value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }
        public Criteria andStyleIn(List<Byte> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }
        public Criteria andStyleNotIn(List<Byte> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }
        public Criteria andStyleBetween(Byte value1, Byte value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }
        public Criteria andStyleNotBetween(Byte value1, Byte value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }
        public Criteria andColourIsNull() {
            addCriterion("colour is null");
            return (Criteria) this;
        }
        public Criteria andColourIsNotNull() {
            addCriterion("colour is not null");
            return (Criteria) this;
        }
        public Criteria andColourEqualTo(Byte value) {
            addCriterion("colour =", value, "colour");
            return (Criteria) this;
        }
        public Criteria andColourNotEqualTo(Byte value) {
            addCriterion("colour <>", value, "colour");
            return (Criteria) this;
        }
        public Criteria andColourGreaterThan(Byte value) {
            addCriterion("colour >", value, "colour");
            return (Criteria) this;
        }
        public Criteria andColourGreaterThanOrEqualTo(Byte value) {
            addCriterion("colour >=", value, "colour");
            return (Criteria) this;
        }
        public Criteria andColourLessThan(Byte value) {
            addCriterion("colour <", value, "colour");
            return (Criteria) this;
        }
        public Criteria andColourLessThanOrEqualTo(Byte value) {
            addCriterion("colour <=", value, "colour");
            return (Criteria) this;
        }
        public Criteria andColourIn(List<Byte> values) {
            addCriterion("colour in", values, "colour");
            return (Criteria) this;
        }
        public Criteria andColourNotIn(List<Byte> values) {
            addCriterion("colour not in", values, "colour");
            return (Criteria) this;
        }
        public Criteria andColourBetween(Byte value1, Byte value2) {
            addCriterion("colour between", value1, value2, "colour");
            return (Criteria) this;
        }
        public Criteria andColourNotBetween(Byte value1, Byte value2) {
            addCriterion("colour not between", value1, value2, "colour");
            return (Criteria) this;
        }
        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }
        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }
        public Criteria andMaterialEqualTo(Byte value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }
        public Criteria andMaterialNotEqualTo(Byte value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }
        public Criteria andMaterialGreaterThan(Byte value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }
        public Criteria andMaterialGreaterThanOrEqualTo(Byte value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }
        public Criteria andMaterialLessThan(Byte value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }
        public Criteria andMaterialLessThanOrEqualTo(Byte value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }
        public Criteria andMaterialIn(List<Byte> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }
        public Criteria andMaterialNotIn(List<Byte> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }
        public Criteria andMaterialBetween(Byte value1, Byte value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }
        public Criteria andMaterialNotBetween(Byte value1, Byte value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }
        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }
        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }
        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }
        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }
        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }
        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }
        public Criteria andCreatTimeIsNull() {
            addCriterion("creatTime is null");
            return (Criteria) this;
        }
        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creatTime is not null");
            return (Criteria) this;
        }
        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creatTime =", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creatTime <>", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creatTime >", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatTime >=", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creatTime <", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creatTime <=", value, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creatTime in", values, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creatTime not in", values, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creatTime between", value1, value2, "creatTime");
            return (Criteria) this;
        }
        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creatTime not between", value1, value2, "creatTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
        public Criteria andImgNameLikeInsensitive(String value) {
            addCriterion("upper(imgName) like", value.toUpperCase(), "imgName");
            return (Criteria) this;
        }
        public Criteria andImgLikeInsensitive(String value) {
            addCriterion("upper(img) like", value.toUpperCase(), "img");
            return (Criteria) this;
        }
        public Criteria andUrlLikeInsensitive(String value) {
            addCriterion("upper(url) like", value.toUpperCase(), "url");
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
     * @version 1.0 2017-05-31
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