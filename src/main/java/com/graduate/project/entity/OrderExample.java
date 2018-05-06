package com.graduate.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("orderDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterion("orderDate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterion("orderDate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterion("orderDate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("orderDate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterion("orderDate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterion("orderDate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterion("orderDate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterion("orderDate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterion("orderDate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterion("orderDate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceIsNull() {
            addCriterion("orderTotalPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceIsNotNull() {
            addCriterion("orderTotalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceEqualTo(BigDecimal value) {
            addCriterion("orderTotalPrice =", value, "ordertotalprice");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("orderTotalPrice <>", value, "ordertotalprice");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceGreaterThan(BigDecimal value) {
            addCriterion("orderTotalPrice >", value, "ordertotalprice");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orderTotalPrice >=", value, "ordertotalprice");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceLessThan(BigDecimal value) {
            addCriterion("orderTotalPrice <", value, "ordertotalprice");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orderTotalPrice <=", value, "ordertotalprice");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceIn(List<BigDecimal> values) {
            addCriterion("orderTotalPrice in", values, "ordertotalprice");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("orderTotalPrice not in", values, "ordertotalprice");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderTotalPrice between", value1, value2, "ordertotalprice");
            return (Criteria) this;
        }

        public Criteria andOrdertotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderTotalPrice not between", value1, value2, "ordertotalprice");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidIsNull() {
            addCriterion("orderCompanyId is null");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidIsNotNull() {
            addCriterion("orderCompanyId is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidEqualTo(Integer value) {
            addCriterion("orderCompanyId =", value, "ordercompanyid");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidNotEqualTo(Integer value) {
            addCriterion("orderCompanyId <>", value, "ordercompanyid");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidGreaterThan(Integer value) {
            addCriterion("orderCompanyId >", value, "ordercompanyid");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderCompanyId >=", value, "ordercompanyid");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidLessThan(Integer value) {
            addCriterion("orderCompanyId <", value, "ordercompanyid");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("orderCompanyId <=", value, "ordercompanyid");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidIn(List<Integer> values) {
            addCriterion("orderCompanyId in", values, "ordercompanyid");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidNotIn(List<Integer> values) {
            addCriterion("orderCompanyId not in", values, "ordercompanyid");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidBetween(Integer value1, Integer value2) {
            addCriterion("orderCompanyId between", value1, value2, "ordercompanyid");
            return (Criteria) this;
        }

        public Criteria andOrdercompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderCompanyId not between", value1, value2, "ordercompanyid");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameIsNull() {
            addCriterion("orderCompanyName is null");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameIsNotNull() {
            addCriterion("orderCompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameEqualTo(String value) {
            addCriterion("orderCompanyName =", value, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameNotEqualTo(String value) {
            addCriterion("orderCompanyName <>", value, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameGreaterThan(String value) {
            addCriterion("orderCompanyName >", value, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("orderCompanyName >=", value, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameLessThan(String value) {
            addCriterion("orderCompanyName <", value, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameLessThanOrEqualTo(String value) {
            addCriterion("orderCompanyName <=", value, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameLike(String value) {
            addCriterion("orderCompanyName like", value, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameNotLike(String value) {
            addCriterion("orderCompanyName not like", value, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameIn(List<String> values) {
            addCriterion("orderCompanyName in", values, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameNotIn(List<String> values) {
            addCriterion("orderCompanyName not in", values, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameBetween(String value1, String value2) {
            addCriterion("orderCompanyName between", value1, value2, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrdercompanynameNotBetween(String value1, String value2) {
            addCriterion("orderCompanyName not between", value1, value2, "ordercompanyname");
            return (Criteria) this;
        }

        public Criteria andOrderpersonIsNull() {
            addCriterion("orderPerson is null");
            return (Criteria) this;
        }

        public Criteria andOrderpersonIsNotNull() {
            addCriterion("orderPerson is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpersonEqualTo(String value) {
            addCriterion("orderPerson =", value, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonNotEqualTo(String value) {
            addCriterion("orderPerson <>", value, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonGreaterThan(String value) {
            addCriterion("orderPerson >", value, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonGreaterThanOrEqualTo(String value) {
            addCriterion("orderPerson >=", value, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonLessThan(String value) {
            addCriterion("orderPerson <", value, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonLessThanOrEqualTo(String value) {
            addCriterion("orderPerson <=", value, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonLike(String value) {
            addCriterion("orderPerson like", value, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonNotLike(String value) {
            addCriterion("orderPerson not like", value, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonIn(List<String> values) {
            addCriterion("orderPerson in", values, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonNotIn(List<String> values) {
            addCriterion("orderPerson not in", values, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonBetween(String value1, String value2) {
            addCriterion("orderPerson between", value1, value2, "orderperson");
            return (Criteria) this;
        }

        public Criteria andOrderpersonNotBetween(String value1, String value2) {
            addCriterion("orderPerson not between", value1, value2, "orderperson");
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