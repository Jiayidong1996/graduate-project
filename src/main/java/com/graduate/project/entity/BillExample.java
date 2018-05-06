package com.graduate.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillExample() {
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

        public Criteria andBillidIsNull() {
            addCriterion("billId is null");
            return (Criteria) this;
        }

        public Criteria andBillidIsNotNull() {
            addCriterion("billId is not null");
            return (Criteria) this;
        }

        public Criteria andBillidEqualTo(Integer value) {
            addCriterion("billId =", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotEqualTo(Integer value) {
            addCriterion("billId <>", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThan(Integer value) {
            addCriterion("billId >", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThanOrEqualTo(Integer value) {
            addCriterion("billId >=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThan(Integer value) {
            addCriterion("billId <", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThanOrEqualTo(Integer value) {
            addCriterion("billId <=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidIn(List<Integer> values) {
            addCriterion("billId in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotIn(List<Integer> values) {
            addCriterion("billId not in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidBetween(Integer value1, Integer value2) {
            addCriterion("billId between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotBetween(Integer value1, Integer value2) {
            addCriterion("billId not between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNull() {
            addCriterion("billDate is null");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNotNull() {
            addCriterion("billDate is not null");
            return (Criteria) this;
        }

        public Criteria andBilldateEqualTo(Date value) {
            addCriterion("billDate =", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotEqualTo(Date value) {
            addCriterion("billDate <>", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThan(Date value) {
            addCriterion("billDate >", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThanOrEqualTo(Date value) {
            addCriterion("billDate >=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThan(Date value) {
            addCriterion("billDate <", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThanOrEqualTo(Date value) {
            addCriterion("billDate <=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateIn(List<Date> values) {
            addCriterion("billDate in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotIn(List<Date> values) {
            addCriterion("billDate not in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateBetween(Date value1, Date value2) {
            addCriterion("billDate between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotBetween(Date value1, Date value2) {
            addCriterion("billDate not between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andBillmoneyIsNull() {
            addCriterion("billMoney is null");
            return (Criteria) this;
        }

        public Criteria andBillmoneyIsNotNull() {
            addCriterion("billMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBillmoneyEqualTo(BigDecimal value) {
            addCriterion("billMoney =", value, "billmoney");
            return (Criteria) this;
        }

        public Criteria andBillmoneyNotEqualTo(BigDecimal value) {
            addCriterion("billMoney <>", value, "billmoney");
            return (Criteria) this;
        }

        public Criteria andBillmoneyGreaterThan(BigDecimal value) {
            addCriterion("billMoney >", value, "billmoney");
            return (Criteria) this;
        }

        public Criteria andBillmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("billMoney >=", value, "billmoney");
            return (Criteria) this;
        }

        public Criteria andBillmoneyLessThan(BigDecimal value) {
            addCriterion("billMoney <", value, "billmoney");
            return (Criteria) this;
        }

        public Criteria andBillmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("billMoney <=", value, "billmoney");
            return (Criteria) this;
        }

        public Criteria andBillmoneyIn(List<BigDecimal> values) {
            addCriterion("billMoney in", values, "billmoney");
            return (Criteria) this;
        }

        public Criteria andBillmoneyNotIn(List<BigDecimal> values) {
            addCriterion("billMoney not in", values, "billmoney");
            return (Criteria) this;
        }

        public Criteria andBillmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("billMoney between", value1, value2, "billmoney");
            return (Criteria) this;
        }

        public Criteria andBillmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("billMoney not between", value1, value2, "billmoney");
            return (Criteria) this;
        }

        public Criteria andBillremarkIsNull() {
            addCriterion("billRemark is null");
            return (Criteria) this;
        }

        public Criteria andBillremarkIsNotNull() {
            addCriterion("billRemark is not null");
            return (Criteria) this;
        }

        public Criteria andBillremarkEqualTo(String value) {
            addCriterion("billRemark =", value, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkNotEqualTo(String value) {
            addCriterion("billRemark <>", value, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkGreaterThan(String value) {
            addCriterion("billRemark >", value, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkGreaterThanOrEqualTo(String value) {
            addCriterion("billRemark >=", value, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkLessThan(String value) {
            addCriterion("billRemark <", value, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkLessThanOrEqualTo(String value) {
            addCriterion("billRemark <=", value, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkLike(String value) {
            addCriterion("billRemark like", value, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkNotLike(String value) {
            addCriterion("billRemark not like", value, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkIn(List<String> values) {
            addCriterion("billRemark in", values, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkNotIn(List<String> values) {
            addCriterion("billRemark not in", values, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkBetween(String value1, String value2) {
            addCriterion("billRemark between", value1, value2, "billremark");
            return (Criteria) this;
        }

        public Criteria andBillremarkNotBetween(String value1, String value2) {
            addCriterion("billRemark not between", value1, value2, "billremark");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("payType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("payType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andDeskidIsNull() {
            addCriterion("deskId is null");
            return (Criteria) this;
        }

        public Criteria andDeskidIsNotNull() {
            addCriterion("deskId is not null");
            return (Criteria) this;
        }

        public Criteria andDeskidEqualTo(Integer value) {
            addCriterion("deskId =", value, "deskid");
            return (Criteria) this;
        }

        public Criteria andDeskidNotEqualTo(Integer value) {
            addCriterion("deskId <>", value, "deskid");
            return (Criteria) this;
        }

        public Criteria andDeskidGreaterThan(Integer value) {
            addCriterion("deskId >", value, "deskid");
            return (Criteria) this;
        }

        public Criteria andDeskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deskId >=", value, "deskid");
            return (Criteria) this;
        }

        public Criteria andDeskidLessThan(Integer value) {
            addCriterion("deskId <", value, "deskid");
            return (Criteria) this;
        }

        public Criteria andDeskidLessThanOrEqualTo(Integer value) {
            addCriterion("deskId <=", value, "deskid");
            return (Criteria) this;
        }

        public Criteria andDeskidIn(List<Integer> values) {
            addCriterion("deskId in", values, "deskid");
            return (Criteria) this;
        }

        public Criteria andDeskidNotIn(List<Integer> values) {
            addCriterion("deskId not in", values, "deskid");
            return (Criteria) this;
        }

        public Criteria andDeskidBetween(Integer value1, Integer value2) {
            addCriterion("deskId between", value1, value2, "deskid");
            return (Criteria) this;
        }

        public Criteria andDeskidNotBetween(Integer value1, Integer value2) {
            addCriterion("deskId not between", value1, value2, "deskid");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("areaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("areaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("areaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("areaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("areaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("areaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("areaId like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("areaId not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("areaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("areaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("areaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("areaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andVipidIsNull() {
            addCriterion("vipId is null");
            return (Criteria) this;
        }

        public Criteria andVipidIsNotNull() {
            addCriterion("vipId is not null");
            return (Criteria) this;
        }

        public Criteria andVipidEqualTo(Integer value) {
            addCriterion("vipId =", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotEqualTo(Integer value) {
            addCriterion("vipId <>", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThan(Integer value) {
            addCriterion("vipId >", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipId >=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThan(Integer value) {
            addCriterion("vipId <", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThanOrEqualTo(Integer value) {
            addCriterion("vipId <=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidIn(List<Integer> values) {
            addCriterion("vipId in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotIn(List<Integer> values) {
            addCriterion("vipId not in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidBetween(Integer value1, Integer value2) {
            addCriterion("vipId between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotBetween(Integer value1, Integer value2) {
            addCriterion("vipId not between", value1, value2, "vipid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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