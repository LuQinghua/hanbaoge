/*
 * SysApplicationQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-21 Created
 */
package com.jiabian.beans.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysApplicationQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SysApplicationQueryHelper() {
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
     * @version 1.0 2016-12-21
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
        public Criteria andCardNoIsNull() {
            addCriterion("cardNo is null");
            return (Criteria) this;
        }
        public Criteria andCardNoIsNotNull() {
            addCriterion("cardNo is not null");
            return (Criteria) this;
        }
        public Criteria andCardNoEqualTo(String value) {
            addCriterion("cardNo =", value, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("cardNo <>", value, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("cardNo >", value, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("cardNo >=", value, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoLessThan(String value) {
            addCriterion("cardNo <", value, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("cardNo <=", value, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoLike(String value) {
            addCriterion("cardNo like", value, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoNotLike(String value) {
            addCriterion("cardNo not like", value, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoIn(List<String> values) {
            addCriterion("cardNo in", values, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("cardNo not in", values, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("cardNo between", value1, value2, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("cardNo not between", value1, value2, "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardImgIsNull() {
            addCriterion("cardImg is null");
            return (Criteria) this;
        }
        public Criteria andCardImgIsNotNull() {
            addCriterion("cardImg is not null");
            return (Criteria) this;
        }
        public Criteria andCardImgEqualTo(String value) {
            addCriterion("cardImg =", value, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgNotEqualTo(String value) {
            addCriterion("cardImg <>", value, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgGreaterThan(String value) {
            addCriterion("cardImg >", value, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgGreaterThanOrEqualTo(String value) {
            addCriterion("cardImg >=", value, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgLessThan(String value) {
            addCriterion("cardImg <", value, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgLessThanOrEqualTo(String value) {
            addCriterion("cardImg <=", value, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgLike(String value) {
            addCriterion("cardImg like", value, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgNotLike(String value) {
            addCriterion("cardImg not like", value, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgIn(List<String> values) {
            addCriterion("cardImg in", values, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgNotIn(List<String> values) {
            addCriterion("cardImg not in", values, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgBetween(String value1, String value2) {
            addCriterion("cardImg between", value1, value2, "cardImg");
            return (Criteria) this;
        }
        public Criteria andCardImgNotBetween(String value1, String value2) {
            addCriterion("cardImg not between", value1, value2, "cardImg");
            return (Criteria) this;
        }
        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }
        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }
        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }
        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }
        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }
        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }
        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }
        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }
        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }
        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }
        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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
        public Criteria andBankNameIsNull() {
            addCriterion("bankName is null");
            return (Criteria) this;
        }
        public Criteria andBankNameIsNotNull() {
            addCriterion("bankName is not null");
            return (Criteria) this;
        }
        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bankName =", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bankName <>", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bankName >", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bankName >=", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameLessThan(String value) {
            addCriterion("bankName <", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bankName <=", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameLike(String value) {
            addCriterion("bankName like", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameNotLike(String value) {
            addCriterion("bankName not like", value, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bankName in", values, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bankName not in", values, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bankName between", value1, value2, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bankName not between", value1, value2, "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNoIsNull() {
            addCriterion("bankNo is null");
            return (Criteria) this;
        }
        public Criteria andBankNoIsNotNull() {
            addCriterion("bankNo is not null");
            return (Criteria) this;
        }
        public Criteria andBankNoEqualTo(String value) {
            addCriterion("bankNo =", value, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("bankNo <>", value, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("bankNo >", value, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("bankNo >=", value, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoLessThan(String value) {
            addCriterion("bankNo <", value, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("bankNo <=", value, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoLike(String value) {
            addCriterion("bankNo like", value, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoNotLike(String value) {
            addCriterion("bankNo not like", value, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoIn(List<String> values) {
            addCriterion("bankNo in", values, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("bankNo not in", values, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("bankNo between", value1, value2, "bankNo");
            return (Criteria) this;
        }
        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("bankNo not between", value1, value2, "bankNo");
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
        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }
        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }
        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }
        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }
        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }
        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }
        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }
        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }
        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }
        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }
        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }
        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }
        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }
        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }
        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }
        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }
        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }
        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentIsNull() {
            addCriterion("attractInvestment is null");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentIsNotNull() {
            addCriterion("attractInvestment is not null");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentEqualTo(Byte value) {
            addCriterion("attractInvestment =", value, "attractInvestment");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentNotEqualTo(Byte value) {
            addCriterion("attractInvestment <>", value, "attractInvestment");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentGreaterThan(Byte value) {
            addCriterion("attractInvestment >", value, "attractInvestment");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentGreaterThanOrEqualTo(Byte value) {
            addCriterion("attractInvestment >=", value, "attractInvestment");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentLessThan(Byte value) {
            addCriterion("attractInvestment <", value, "attractInvestment");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentLessThanOrEqualTo(Byte value) {
            addCriterion("attractInvestment <=", value, "attractInvestment");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentIn(List<Byte> values) {
            addCriterion("attractInvestment in", values, "attractInvestment");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentNotIn(List<Byte> values) {
            addCriterion("attractInvestment not in", values, "attractInvestment");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentBetween(Byte value1, Byte value2) {
            addCriterion("attractInvestment between", value1, value2, "attractInvestment");
            return (Criteria) this;
        }
        public Criteria andAttractInvestmentNotBetween(Byte value1, Byte value2) {
            addCriterion("attractInvestment not between", value1, value2, "attractInvestment");
            return (Criteria) this;
        }
        public Criteria andLogisticsIsNull() {
            addCriterion("logistics is null");
            return (Criteria) this;
        }
        public Criteria andLogisticsIsNotNull() {
            addCriterion("logistics is not null");
            return (Criteria) this;
        }
        public Criteria andLogisticsEqualTo(Byte value) {
            addCriterion("logistics =", value, "logistics");
            return (Criteria) this;
        }
        public Criteria andLogisticsNotEqualTo(Byte value) {
            addCriterion("logistics <>", value, "logistics");
            return (Criteria) this;
        }
        public Criteria andLogisticsGreaterThan(Byte value) {
            addCriterion("logistics >", value, "logistics");
            return (Criteria) this;
        }
        public Criteria andLogisticsGreaterThanOrEqualTo(Byte value) {
            addCriterion("logistics >=", value, "logistics");
            return (Criteria) this;
        }
        public Criteria andLogisticsLessThan(Byte value) {
            addCriterion("logistics <", value, "logistics");
            return (Criteria) this;
        }
        public Criteria andLogisticsLessThanOrEqualTo(Byte value) {
            addCriterion("logistics <=", value, "logistics");
            return (Criteria) this;
        }
        public Criteria andLogisticsIn(List<Byte> values) {
            addCriterion("logistics in", values, "logistics");
            return (Criteria) this;
        }
        public Criteria andLogisticsNotIn(List<Byte> values) {
            addCriterion("logistics not in", values, "logistics");
            return (Criteria) this;
        }
        public Criteria andLogisticsBetween(Byte value1, Byte value2) {
            addCriterion("logistics between", value1, value2, "logistics");
            return (Criteria) this;
        }
        public Criteria andLogisticsNotBetween(Byte value1, Byte value2) {
            addCriterion("logistics not between", value1, value2, "logistics");
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
        public Criteria andSubbranchNameIsNull() {
            addCriterion("subbranchName is null");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameIsNotNull() {
            addCriterion("subbranchName is not null");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameEqualTo(String value) {
            addCriterion("subbranchName =", value, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameNotEqualTo(String value) {
            addCriterion("subbranchName <>", value, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameGreaterThan(String value) {
            addCriterion("subbranchName >", value, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("subbranchName >=", value, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameLessThan(String value) {
            addCriterion("subbranchName <", value, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameLessThanOrEqualTo(String value) {
            addCriterion("subbranchName <=", value, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameLike(String value) {
            addCriterion("subbranchName like", value, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameNotLike(String value) {
            addCriterion("subbranchName not like", value, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameIn(List<String> values) {
            addCriterion("subbranchName in", values, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameNotIn(List<String> values) {
            addCriterion("subbranchName not in", values, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameBetween(String value1, String value2) {
            addCriterion("subbranchName between", value1, value2, "subbranchName");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameNotBetween(String value1, String value2) {
            addCriterion("subbranchName not between", value1, value2, "subbranchName");
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
        public Criteria andReviewerIsNull() {
            addCriterion("reviewer is null");
            return (Criteria) this;
        }
        public Criteria andReviewerIsNotNull() {
            addCriterion("reviewer is not null");
            return (Criteria) this;
        }
        public Criteria andReviewerEqualTo(Long value) {
            addCriterion("reviewer =", value, "reviewer");
            return (Criteria) this;
        }
        public Criteria andReviewerNotEqualTo(Long value) {
            addCriterion("reviewer <>", value, "reviewer");
            return (Criteria) this;
        }
        public Criteria andReviewerGreaterThan(Long value) {
            addCriterion("reviewer >", value, "reviewer");
            return (Criteria) this;
        }
        public Criteria andReviewerGreaterThanOrEqualTo(Long value) {
            addCriterion("reviewer >=", value, "reviewer");
            return (Criteria) this;
        }
        public Criteria andReviewerLessThan(Long value) {
            addCriterion("reviewer <", value, "reviewer");
            return (Criteria) this;
        }
        public Criteria andReviewerLessThanOrEqualTo(Long value) {
            addCriterion("reviewer <=", value, "reviewer");
            return (Criteria) this;
        }
        public Criteria andReviewerIn(List<Long> values) {
            addCriterion("reviewer in", values, "reviewer");
            return (Criteria) this;
        }
        public Criteria andReviewerNotIn(List<Long> values) {
            addCriterion("reviewer not in", values, "reviewer");
            return (Criteria) this;
        }
        public Criteria andReviewerBetween(Long value1, Long value2) {
            addCriterion("reviewer between", value1, value2, "reviewer");
            return (Criteria) this;
        }
        public Criteria andReviewerNotBetween(Long value1, Long value2) {
            addCriterion("reviewer not between", value1, value2, "reviewer");
            return (Criteria) this;
        }
        public Criteria andReviewTimeIsNull() {
            addCriterion("reviewTime is null");
            return (Criteria) this;
        }
        public Criteria andReviewTimeIsNotNull() {
            addCriterion("reviewTime is not null");
            return (Criteria) this;
        }
        public Criteria andReviewTimeEqualTo(Date value) {
            addCriterion("reviewTime =", value, "reviewTime");
            return (Criteria) this;
        }
        public Criteria andReviewTimeNotEqualTo(Date value) {
            addCriterion("reviewTime <>", value, "reviewTime");
            return (Criteria) this;
        }
        public Criteria andReviewTimeGreaterThan(Date value) {
            addCriterion("reviewTime >", value, "reviewTime");
            return (Criteria) this;
        }
        public Criteria andReviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reviewTime >=", value, "reviewTime");
            return (Criteria) this;
        }
        public Criteria andReviewTimeLessThan(Date value) {
            addCriterion("reviewTime <", value, "reviewTime");
            return (Criteria) this;
        }
        public Criteria andReviewTimeLessThanOrEqualTo(Date value) {
            addCriterion("reviewTime <=", value, "reviewTime");
            return (Criteria) this;
        }
        public Criteria andReviewTimeIn(List<Date> values) {
            addCriterion("reviewTime in", values, "reviewTime");
            return (Criteria) this;
        }
        public Criteria andReviewTimeNotIn(List<Date> values) {
            addCriterion("reviewTime not in", values, "reviewTime");
            return (Criteria) this;
        }
        public Criteria andReviewTimeBetween(Date value1, Date value2) {
            addCriterion("reviewTime between", value1, value2, "reviewTime");
            return (Criteria) this;
        }
        public Criteria andReviewTimeNotBetween(Date value1, Date value2) {
            addCriterion("reviewTime not between", value1, value2, "reviewTime");
            return (Criteria) this;
        }
        public Criteria andSuserIdIsNull() {
            addCriterion("suserId is null");
            return (Criteria) this;
        }
        public Criteria andSuserIdIsNotNull() {
            addCriterion("suserId is not null");
            return (Criteria) this;
        }
        public Criteria andSuserIdEqualTo(Long value) {
            addCriterion("suserId =", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdNotEqualTo(Long value) {
            addCriterion("suserId <>", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdGreaterThan(Long value) {
            addCriterion("suserId >", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("suserId >=", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdLessThan(Long value) {
            addCriterion("suserId <", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdLessThanOrEqualTo(Long value) {
            addCriterion("suserId <=", value, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdIn(List<Long> values) {
            addCriterion("suserId in", values, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdNotIn(List<Long> values) {
            addCriterion("suserId not in", values, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdBetween(Long value1, Long value2) {
            addCriterion("suserId between", value1, value2, "suserId");
            return (Criteria) this;
        }
        public Criteria andSuserIdNotBetween(Long value1, Long value2) {
            addCriterion("suserId not between", value1, value2, "suserId");
            return (Criteria) this;
        }
        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }
        public Criteria andCardNoLikeInsensitive(String value) {
            addCriterion("upper(cardNo) like", value.toUpperCase(), "cardNo");
            return (Criteria) this;
        }
        public Criteria andCardImgLikeInsensitive(String value) {
            addCriterion("upper(cardImg) like", value.toUpperCase(), "cardImg");
            return (Criteria) this;
        }
        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }
        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }
        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }
        public Criteria andBankNameLikeInsensitive(String value) {
            addCriterion("upper(bankName) like", value.toUpperCase(), "bankName");
            return (Criteria) this;
        }
        public Criteria andBankNoLikeInsensitive(String value) {
            addCriterion("upper(bankNo) like", value.toUpperCase(), "bankNo");
            return (Criteria) this;
        }
        public Criteria andSubbranchNameLikeInsensitive(String value) {
            addCriterion("upper(subbranchName) like", value.toUpperCase(), "subbranchName");
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
     * @version 1.0 2016-12-21
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