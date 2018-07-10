/*
 * jkRetailersQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-29 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class jkRetailersQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public jkRetailersQueryHelper() {
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
     * @version 1.0 2017-05-29
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
        public Criteria andHeadlineIsNull() {
            addCriterion("headline is null");
            return (Criteria) this;
        }
        public Criteria andHeadlineIsNotNull() {
            addCriterion("headline is not null");
            return (Criteria) this;
        }
        public Criteria andHeadlineEqualTo(String value) {
            addCriterion("headline =", value, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineNotEqualTo(String value) {
            addCriterion("headline <>", value, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineGreaterThan(String value) {
            addCriterion("headline >", value, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("headline >=", value, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineLessThan(String value) {
            addCriterion("headline <", value, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineLessThanOrEqualTo(String value) {
            addCriterion("headline <=", value, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineLike(String value) {
            addCriterion("headline like", value, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineNotLike(String value) {
            addCriterion("headline not like", value, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineIn(List<String> values) {
            addCriterion("headline in", values, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineNotIn(List<String> values) {
            addCriterion("headline not in", values, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineBetween(String value1, String value2) {
            addCriterion("headline between", value1, value2, "headline");
            return (Criteria) this;
        }
        public Criteria andHeadlineNotBetween(String value1, String value2) {
            addCriterion("headline not between", value1, value2, "headline");
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
        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }
        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }
        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }
        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }
        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }
        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }
        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberIsNull() {
            addCriterion("record_Number is null");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberIsNotNull() {
            addCriterion("record_Number is not null");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberEqualTo(String value) {
            addCriterion("record_Number =", value, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberNotEqualTo(String value) {
            addCriterion("record_Number <>", value, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberGreaterThan(String value) {
            addCriterion("record_Number >", value, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberGreaterThanOrEqualTo(String value) {
            addCriterion("record_Number >=", value, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberLessThan(String value) {
            addCriterion("record_Number <", value, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberLessThanOrEqualTo(String value) {
            addCriterion("record_Number <=", value, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberLike(String value) {
            addCriterion("record_Number like", value, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberNotLike(String value) {
            addCriterion("record_Number not like", value, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberIn(List<String> values) {
            addCriterion("record_Number in", values, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberNotIn(List<String> values) {
            addCriterion("record_Number not in", values, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberBetween(String value1, String value2) {
            addCriterion("record_Number between", value1, value2, "record_Number");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberNotBetween(String value1, String value2) {
            addCriterion("record_Number not between", value1, value2, "record_Number");
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
        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }
        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }
        public Criteria andPortEqualTo(Byte value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }
        public Criteria andPortNotEqualTo(Byte value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }
        public Criteria andPortGreaterThan(Byte value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }
        public Criteria andPortGreaterThanOrEqualTo(Byte value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }
        public Criteria andPortLessThan(Byte value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }
        public Criteria andPortLessThanOrEqualTo(Byte value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }
        public Criteria andPortIn(List<Byte> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }
        public Criteria andPortNotIn(List<Byte> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }
        public Criteria andPortBetween(Byte value1, Byte value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }
        public Criteria andPortNotBetween(Byte value1, Byte value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }
        public Criteria andClassificationIsNull() {
            addCriterion("classification is null");
            return (Criteria) this;
        }
        public Criteria andClassificationIsNotNull() {
            addCriterion("classification is not null");
            return (Criteria) this;
        }
        public Criteria andClassificationEqualTo(Byte value) {
            addCriterion("classification =", value, "classification");
            return (Criteria) this;
        }
        public Criteria andClassificationNotEqualTo(Byte value) {
            addCriterion("classification <>", value, "classification");
            return (Criteria) this;
        }
        public Criteria andClassificationGreaterThan(Byte value) {
            addCriterion("classification >", value, "classification");
            return (Criteria) this;
        }
        public Criteria andClassificationGreaterThanOrEqualTo(Byte value) {
            addCriterion("classification >=", value, "classification");
            return (Criteria) this;
        }
        public Criteria andClassificationLessThan(Byte value) {
            addCriterion("classification <", value, "classification");
            return (Criteria) this;
        }
        public Criteria andClassificationLessThanOrEqualTo(Byte value) {
            addCriterion("classification <=", value, "classification");
            return (Criteria) this;
        }
        public Criteria andClassificationIn(List<Byte> values) {
            addCriterion("classification in", values, "classification");
            return (Criteria) this;
        }
        public Criteria andClassificationNotIn(List<Byte> values) {
            addCriterion("classification not in", values, "classification");
            return (Criteria) this;
        }
        public Criteria andClassificationBetween(Byte value1, Byte value2) {
            addCriterion("classification between", value1, value2, "classification");
            return (Criteria) this;
        }
        public Criteria andClassificationNotBetween(Byte value1, Byte value2) {
            addCriterion("classification not between", value1, value2, "classification");
            return (Criteria) this;
        }
        public Criteria andHeadlineLikeInsensitive(String value) {
            addCriterion("upper(headline) like", value.toUpperCase(), "headline");
            return (Criteria) this;
        }
        public Criteria andContentLikeInsensitive(String value) {
            addCriterion("upper(content) like", value.toUpperCase(), "content");
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
        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }
        public Criteria andRecord_NumberLikeInsensitive(String value) {
            addCriterion("upper(record_Number) like", value.toUpperCase(), "record_Number");
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
     * @version 1.0 2017-05-29
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