/*
 * AdpositionQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-13 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdpositionQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public AdpositionQueryHelper() {
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
     * @version 1.0 2017-01-13
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
        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }
        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }
        public Criteria andPlatformEqualTo(Byte value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }
        public Criteria andPlatformNotEqualTo(Byte value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }
        public Criteria andPlatformGreaterThan(Byte value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }
        public Criteria andPlatformGreaterThanOrEqualTo(Byte value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }
        public Criteria andPlatformLessThan(Byte value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }
        public Criteria andPlatformLessThanOrEqualTo(Byte value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }
        public Criteria andPlatformIn(List<Byte> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }
        public Criteria andPlatformNotIn(List<Byte> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }
        public Criteria andPlatformBetween(Byte value1, Byte value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }
        public Criteria andPlatformNotBetween(Byte value1, Byte value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }
        public Criteria andAdImgIsNull() {
            addCriterion("adImg is null");
            return (Criteria) this;
        }
        public Criteria andAdImgIsNotNull() {
            addCriterion("adImg is not null");
            return (Criteria) this;
        }
        public Criteria andAdImgEqualTo(String value) {
            addCriterion("adImg =", value, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgNotEqualTo(String value) {
            addCriterion("adImg <>", value, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgGreaterThan(String value) {
            addCriterion("adImg >", value, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgGreaterThanOrEqualTo(String value) {
            addCriterion("adImg >=", value, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgLessThan(String value) {
            addCriterion("adImg <", value, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgLessThanOrEqualTo(String value) {
            addCriterion("adImg <=", value, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgLike(String value) {
            addCriterion("adImg like", value, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgNotLike(String value) {
            addCriterion("adImg not like", value, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgIn(List<String> values) {
            addCriterion("adImg in", values, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgNotIn(List<String> values) {
            addCriterion("adImg not in", values, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgBetween(String value1, String value2) {
            addCriterion("adImg between", value1, value2, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdImgNotBetween(String value1, String value2) {
            addCriterion("adImg not between", value1, value2, "adImg");
            return (Criteria) this;
        }
        public Criteria andAdUrlIsNull() {
            addCriterion("adUrl is null");
            return (Criteria) this;
        }
        public Criteria andAdUrlIsNotNull() {
            addCriterion("adUrl is not null");
            return (Criteria) this;
        }
        public Criteria andAdUrlEqualTo(String value) {
            addCriterion("adUrl =", value, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlNotEqualTo(String value) {
            addCriterion("adUrl <>", value, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlGreaterThan(String value) {
            addCriterion("adUrl >", value, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlGreaterThanOrEqualTo(String value) {
            addCriterion("adUrl >=", value, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlLessThan(String value) {
            addCriterion("adUrl <", value, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlLessThanOrEqualTo(String value) {
            addCriterion("adUrl <=", value, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlLike(String value) {
            addCriterion("adUrl like", value, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlNotLike(String value) {
            addCriterion("adUrl not like", value, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlIn(List<String> values) {
            addCriterion("adUrl in", values, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlNotIn(List<String> values) {
            addCriterion("adUrl not in", values, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlBetween(String value1, String value2) {
            addCriterion("adUrl between", value1, value2, "adUrl");
            return (Criteria) this;
        }
        public Criteria andAdUrlNotBetween(String value1, String value2) {
            addCriterion("adUrl not between", value1, value2, "adUrl");
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
        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }
        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }
        public Criteria andSiteEqualTo(Byte value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }
        public Criteria andSiteNotEqualTo(Byte value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }
        public Criteria andSiteGreaterThan(Byte value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }
        public Criteria andSiteGreaterThanOrEqualTo(Byte value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }
        public Criteria andSiteLessThan(Byte value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }
        public Criteria andSiteLessThanOrEqualTo(Byte value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }
        public Criteria andSiteIn(List<Byte> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }
        public Criteria andSiteNotIn(List<Byte> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }
        public Criteria andSiteBetween(Byte value1, Byte value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }
        public Criteria andSiteNotBetween(Byte value1, Byte value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }
        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }
        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }
        public Criteria andDomainEqualTo(Byte value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }
        public Criteria andDomainNotEqualTo(Byte value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }
        public Criteria andDomainGreaterThan(Byte value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }
        public Criteria andDomainGreaterThanOrEqualTo(Byte value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }
        public Criteria andDomainLessThan(Byte value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }
        public Criteria andDomainLessThanOrEqualTo(Byte value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }
        public Criteria andDomainIn(List<Byte> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }
        public Criteria andDomainNotIn(List<Byte> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }
        public Criteria andDomainBetween(Byte value1, Byte value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }
        public Criteria andDomainNotBetween(Byte value1, Byte value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }
        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }
        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }
        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }
        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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
        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }
        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }
        public Criteria andSortEqualTo(Long value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortNotEqualTo(Long value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortGreaterThan(Long value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortGreaterThanOrEqualTo(Long value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortLessThan(Long value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortLessThanOrEqualTo(Long value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }
        public Criteria andSortIn(List<Long> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }
        public Criteria andSortNotIn(List<Long> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }
        public Criteria andSortBetween(Long value1, Long value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }
        public Criteria andSortNotBetween(Long value1, Long value2) {
            addCriterion("sort not between", value1, value2, "sort");
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
        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }
        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }
        public Criteria andSourceEqualTo(Long value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceNotEqualTo(Long value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceGreaterThan(Long value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceGreaterThanOrEqualTo(Long value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceLessThan(Long value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceLessThanOrEqualTo(Long value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }
        public Criteria andSourceIn(List<Long> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }
        public Criteria andSourceNotIn(List<Long> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }
        public Criteria andSourceBetween(Long value1, Long value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }
        public Criteria andSourceNotBetween(Long value1, Long value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }
        public Criteria andAdImgLikeInsensitive(String value) {
            addCriterion("upper(adImg) like", value.toUpperCase(), "adImg");
            return (Criteria) this;
        }
        public Criteria andAdUrlLikeInsensitive(String value) {
            addCriterion("upper(adUrl) like", value.toUpperCase(), "adUrl");
            return (Criteria) this;
        }
        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }
        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
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
     * @version 1.0 2017-01-13
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