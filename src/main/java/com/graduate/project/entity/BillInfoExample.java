package com.graduate.project.entity;

import java.util.ArrayList;
import java.util.List;

public class BillInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillInfoExample() {
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

        public Criteria andDishidIsNull() {
            addCriterion("dishId is null");
            return (Criteria) this;
        }

        public Criteria andDishidIsNotNull() {
            addCriterion("dishId is not null");
            return (Criteria) this;
        }

        public Criteria andDishidEqualTo(Integer value) {
            addCriterion("dishId =", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotEqualTo(Integer value) {
            addCriterion("dishId <>", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidGreaterThan(Integer value) {
            addCriterion("dishId >", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishId >=", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLessThan(Integer value) {
            addCriterion("dishId <", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLessThanOrEqualTo(Integer value) {
            addCriterion("dishId <=", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidIn(List<Integer> values) {
            addCriterion("dishId in", values, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotIn(List<Integer> values) {
            addCriterion("dishId not in", values, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidBetween(Integer value1, Integer value2) {
            addCriterion("dishId between", value1, value2, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotBetween(Integer value1, Integer value2) {
            addCriterion("dishId not between", value1, value2, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishnumIsNull() {
            addCriterion("dishNum is null");
            return (Criteria) this;
        }

        public Criteria andDishnumIsNotNull() {
            addCriterion("dishNum is not null");
            return (Criteria) this;
        }

        public Criteria andDishnumEqualTo(Integer value) {
            addCriterion("dishNum =", value, "dishnum");
            return (Criteria) this;
        }

        public Criteria andDishnumNotEqualTo(Integer value) {
            addCriterion("dishNum <>", value, "dishnum");
            return (Criteria) this;
        }

        public Criteria andDishnumGreaterThan(Integer value) {
            addCriterion("dishNum >", value, "dishnum");
            return (Criteria) this;
        }

        public Criteria andDishnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishNum >=", value, "dishnum");
            return (Criteria) this;
        }

        public Criteria andDishnumLessThan(Integer value) {
            addCriterion("dishNum <", value, "dishnum");
            return (Criteria) this;
        }

        public Criteria andDishnumLessThanOrEqualTo(Integer value) {
            addCriterion("dishNum <=", value, "dishnum");
            return (Criteria) this;
        }

        public Criteria andDishnumIn(List<Integer> values) {
            addCriterion("dishNum in", values, "dishnum");
            return (Criteria) this;
        }

        public Criteria andDishnumNotIn(List<Integer> values) {
            addCriterion("dishNum not in", values, "dishnum");
            return (Criteria) this;
        }

        public Criteria andDishnumBetween(Integer value1, Integer value2) {
            addCriterion("dishNum between", value1, value2, "dishnum");
            return (Criteria) this;
        }

        public Criteria andDishnumNotBetween(Integer value1, Integer value2) {
            addCriterion("dishNum not between", value1, value2, "dishnum");
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