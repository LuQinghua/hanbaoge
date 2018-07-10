/*
 * ComplaintsQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-06 Created
 */
package com.jiabian.beans.basic.complaints;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplaintsQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public ComplaintsQueryHelper() {
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
     * 投诉表
     * 
     * @author 菠萝大象
     * @version 1.0 2018-07-06
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
        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }
        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }
        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }
        public Criteria andCompNameIsNull() {
            addCriterion("compName is null");
            return (Criteria) this;
        }
        public Criteria andCompNameIsNotNull() {
            addCriterion("compName is not null");
            return (Criteria) this;
        }
        public Criteria andCompNameEqualTo(String value) {
            addCriterion("compName =", value, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameNotEqualTo(String value) {
            addCriterion("compName <>", value, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameGreaterThan(String value) {
            addCriterion("compName >", value, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameGreaterThanOrEqualTo(String value) {
            addCriterion("compName >=", value, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameLessThan(String value) {
            addCriterion("compName <", value, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameLessThanOrEqualTo(String value) {
            addCriterion("compName <=", value, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameLike(String value) {
            addCriterion("compName like", value, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameNotLike(String value) {
            addCriterion("compName not like", value, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameIn(List<String> values) {
            addCriterion("compName in", values, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameNotIn(List<String> values) {
            addCriterion("compName not in", values, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameBetween(String value1, String value2) {
            addCriterion("compName between", value1, value2, "compName");
            return (Criteria) this;
        }
        public Criteria andCompNameNotBetween(String value1, String value2) {
            addCriterion("compName not between", value1, value2, "compName");
            return (Criteria) this;
        }
        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }
        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }
        public Criteria andReasonEqualTo(Byte value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonNotEqualTo(Byte value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonGreaterThan(Byte value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonGreaterThanOrEqualTo(Byte value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonLessThan(Byte value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonLessThanOrEqualTo(Byte value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonIn(List<Byte> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonNotIn(List<Byte> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonBetween(Byte value1, Byte value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonNotBetween(Byte value1, Byte value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }
        public Criteria andDetailsIsNull() {
            addCriterion("details is null");
            return (Criteria) this;
        }
        public Criteria andDetailsIsNotNull() {
            addCriterion("details is not null");
            return (Criteria) this;
        }
        public Criteria andDetailsEqualTo(String value) {
            addCriterion("details =", value, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("details <>", value, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("details >", value, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("details >=", value, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsLessThan(String value) {
            addCriterion("details <", value, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("details <=", value, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsLike(String value) {
            addCriterion("details like", value, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsNotLike(String value) {
            addCriterion("details not like", value, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsIn(List<String> values) {
            addCriterion("details in", values, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("details not in", values, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("details between", value1, value2, "details");
            return (Criteria) this;
        }
        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("details not between", value1, value2, "details");
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
        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }
        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }
        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }
        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }
        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }
        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }
        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }
        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }
        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }
        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }
        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }
        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
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
        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }
        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }
        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }
        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }
        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }
        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
        public Criteria andCompNameLikeInsensitive(String value) {
            addCriterion("upper(compName) like", value.toUpperCase(), "compName");
            return (Criteria) this;
        }
        public Criteria andDetailsLikeInsensitive(String value) {
            addCriterion("upper(details) like", value.toUpperCase(), "details");
            return (Criteria) this;
        }
        public Criteria andImgLikeInsensitive(String value) {
            addCriterion("upper(img) like", value.toUpperCase(), "img");
            return (Criteria) this;
        }
        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }
        public Criteria andIdcardLikeInsensitive(String value) {
            addCriterion("upper(idcard) like", value.toUpperCase(), "idcard");
            return (Criteria) this;
        }
        public Criteria andTelephoneLikeInsensitive(String value) {
            addCriterion("upper(telephone) like", value.toUpperCase(), "telephone");
            return (Criteria) this;
        }
        public Criteria andCompanyLikeInsensitive(String value) {
            addCriterion("upper(company) like", value.toUpperCase(), "company");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 投诉表
     * 
     * @author 菠萝大象
     * @version 1.0 2018-07-06
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