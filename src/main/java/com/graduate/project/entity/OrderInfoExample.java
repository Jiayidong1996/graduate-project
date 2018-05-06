package com.graduate.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andMateriaidIsNull() {
            addCriterion("materiaId is null");
            return (Criteria) this;
        }

        public Criteria andMateriaidIsNotNull() {
            addCriterion("materiaId is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaidEqualTo(Integer value) {
            addCriterion("materiaId =", value, "materiaid");
            return (Criteria) this;
        }

        public Criteria andMateriaidNotEqualTo(Integer value) {
            addCriterion("materiaId <>", value, "materiaid");
            return (Criteria) this;
        }

        public Criteria andMateriaidGreaterThan(Integer value) {
            addCriterion("materiaId >", value, "materiaid");
            return (Criteria) this;
        }

        public Criteria andMateriaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("materiaId >=", value, "materiaid");
            return (Criteria) this;
        }

        public Criteria andMateriaidLessThan(Integer value) {
            addCriterion("materiaId <", value, "materiaid");
            return (Criteria) this;
        }

        public Criteria andMateriaidLessThanOrEqualTo(Integer value) {
            addCriterion("materiaId <=", value, "materiaid");
            return (Criteria) this;
        }

        public Criteria andMateriaidIn(List<Integer> values) {
            addCriterion("materiaId in", values, "materiaid");
            return (Criteria) this;
        }

        public Criteria andMateriaidNotIn(List<Integer> values) {
            addCriterion("materiaId not in", values, "materiaid");
            return (Criteria) this;
        }

        public Criteria andMateriaidBetween(Integer value1, Integer value2) {
            addCriterion("materiaId between", value1, value2, "materiaid");
            return (Criteria) this;
        }

        public Criteria andMateriaidNotBetween(Integer value1, Integer value2) {
            addCriterion("materiaId not between", value1, value2, "materiaid");
            return (Criteria) this;
        }

        public Criteria andMaterianameIsNull() {
            addCriterion("materiaName is null");
            return (Criteria) this;
        }

        public Criteria andMaterianameIsNotNull() {
            addCriterion("materiaName is not null");
            return (Criteria) this;
        }

        public Criteria andMaterianameEqualTo(String value) {
            addCriterion("materiaName =", value, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameNotEqualTo(String value) {
            addCriterion("materiaName <>", value, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameGreaterThan(String value) {
            addCriterion("materiaName >", value, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameGreaterThanOrEqualTo(String value) {
            addCriterion("materiaName >=", value, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameLessThan(String value) {
            addCriterion("materiaName <", value, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameLessThanOrEqualTo(String value) {
            addCriterion("materiaName <=", value, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameLike(String value) {
            addCriterion("materiaName like", value, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameNotLike(String value) {
            addCriterion("materiaName not like", value, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameIn(List<String> values) {
            addCriterion("materiaName in", values, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameNotIn(List<String> values) {
            addCriterion("materiaName not in", values, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameBetween(String value1, String value2) {
            addCriterion("materiaName between", value1, value2, "materianame");
            return (Criteria) this;
        }

        public Criteria andMaterianameNotBetween(String value1, String value2) {
            addCriterion("materiaName not between", value1, value2, "materianame");
            return (Criteria) this;
        }

        public Criteria andMateriapriceIsNull() {
            addCriterion("materiaPrice is null");
            return (Criteria) this;
        }

        public Criteria andMateriapriceIsNotNull() {
            addCriterion("materiaPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMateriapriceEqualTo(BigDecimal value) {
            addCriterion("materiaPrice =", value, "materiaprice");
            return (Criteria) this;
        }

        public Criteria andMateriapriceNotEqualTo(BigDecimal value) {
            addCriterion("materiaPrice <>", value, "materiaprice");
            return (Criteria) this;
        }

        public Criteria andMateriapriceGreaterThan(BigDecimal value) {
            addCriterion("materiaPrice >", value, "materiaprice");
            return (Criteria) this;
        }

        public Criteria andMateriapriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("materiaPrice >=", value, "materiaprice");
            return (Criteria) this;
        }

        public Criteria andMateriapriceLessThan(BigDecimal value) {
            addCriterion("materiaPrice <", value, "materiaprice");
            return (Criteria) this;
        }

        public Criteria andMateriapriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("materiaPrice <=", value, "materiaprice");
            return (Criteria) this;
        }

        public Criteria andMateriapriceIn(List<BigDecimal> values) {
            addCriterion("materiaPrice in", values, "materiaprice");
            return (Criteria) this;
        }

        public Criteria andMateriapriceNotIn(List<BigDecimal> values) {
            addCriterion("materiaPrice not in", values, "materiaprice");
            return (Criteria) this;
        }

        public Criteria andMateriapriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("materiaPrice between", value1, value2, "materiaprice");
            return (Criteria) this;
        }

        public Criteria andMateriapriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("materiaPrice not between", value1, value2, "materiaprice");
            return (Criteria) this;
        }

        public Criteria andMaterianumIsNull() {
            addCriterion("materiaNum is null");
            return (Criteria) this;
        }

        public Criteria andMaterianumIsNotNull() {
            addCriterion("materiaNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaterianumEqualTo(BigDecimal value) {
            addCriterion("materiaNum =", value, "materianum");
            return (Criteria) this;
        }

        public Criteria andMaterianumNotEqualTo(BigDecimal value) {
            addCriterion("materiaNum <>", value, "materianum");
            return (Criteria) this;
        }

        public Criteria andMaterianumGreaterThan(BigDecimal value) {
            addCriterion("materiaNum >", value, "materianum");
            return (Criteria) this;
        }

        public Criteria andMaterianumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("materiaNum >=", value, "materianum");
            return (Criteria) this;
        }

        public Criteria andMaterianumLessThan(BigDecimal value) {
            addCriterion("materiaNum <", value, "materianum");
            return (Criteria) this;
        }

        public Criteria andMaterianumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("materiaNum <=", value, "materianum");
            return (Criteria) this;
        }

        public Criteria andMaterianumIn(List<BigDecimal> values) {
            addCriterion("materiaNum in", values, "materianum");
            return (Criteria) this;
        }

        public Criteria andMaterianumNotIn(List<BigDecimal> values) {
            addCriterion("materiaNum not in", values, "materianum");
            return (Criteria) this;
        }

        public Criteria andMaterianumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("materiaNum between", value1, value2, "materianum");
            return (Criteria) this;
        }

        public Criteria andMaterianumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("materiaNum not between", value1, value2, "materianum");
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