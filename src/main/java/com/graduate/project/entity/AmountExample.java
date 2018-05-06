package com.graduate.project.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmountExample() {
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

        public Criteria andAmountidIsNull() {
            addCriterion("amountId is null");
            return (Criteria) this;
        }

        public Criteria andAmountidIsNotNull() {
            addCriterion("amountId is not null");
            return (Criteria) this;
        }

        public Criteria andAmountidEqualTo(Integer value) {
            addCriterion("amountId =", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidNotEqualTo(Integer value) {
            addCriterion("amountId <>", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidGreaterThan(Integer value) {
            addCriterion("amountId >", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("amountId >=", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidLessThan(Integer value) {
            addCriterion("amountId <", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidLessThanOrEqualTo(Integer value) {
            addCriterion("amountId <=", value, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidIn(List<Integer> values) {
            addCriterion("amountId in", values, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidNotIn(List<Integer> values) {
            addCriterion("amountId not in", values, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidBetween(Integer value1, Integer value2) {
            addCriterion("amountId between", value1, value2, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountidNotBetween(Integer value1, Integer value2) {
            addCriterion("amountId not between", value1, value2, "amountid");
            return (Criteria) this;
        }

        public Criteria andAmountareaIsNull() {
            addCriterion("amountArea is null");
            return (Criteria) this;
        }

        public Criteria andAmountareaIsNotNull() {
            addCriterion("amountArea is not null");
            return (Criteria) this;
        }

        public Criteria andAmountareaEqualTo(String value) {
            addCriterion("amountArea =", value, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaNotEqualTo(String value) {
            addCriterion("amountArea <>", value, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaGreaterThan(String value) {
            addCriterion("amountArea >", value, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaGreaterThanOrEqualTo(String value) {
            addCriterion("amountArea >=", value, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaLessThan(String value) {
            addCriterion("amountArea <", value, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaLessThanOrEqualTo(String value) {
            addCriterion("amountArea <=", value, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaLike(String value) {
            addCriterion("amountArea like", value, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaNotLike(String value) {
            addCriterion("amountArea not like", value, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaIn(List<String> values) {
            addCriterion("amountArea in", values, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaNotIn(List<String> values) {
            addCriterion("amountArea not in", values, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaBetween(String value1, String value2) {
            addCriterion("amountArea between", value1, value2, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmountareaNotBetween(String value1, String value2) {
            addCriterion("amountArea not between", value1, value2, "amountarea");
            return (Criteria) this;
        }

        public Criteria andAmounttypeIsNull() {
            addCriterion("amountType is null");
            return (Criteria) this;
        }

        public Criteria andAmounttypeIsNotNull() {
            addCriterion("amountType is not null");
            return (Criteria) this;
        }

        public Criteria andAmounttypeEqualTo(String value) {
            addCriterion("amountType =", value, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeNotEqualTo(String value) {
            addCriterion("amountType <>", value, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeGreaterThan(String value) {
            addCriterion("amountType >", value, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeGreaterThanOrEqualTo(String value) {
            addCriterion("amountType >=", value, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeLessThan(String value) {
            addCriterion("amountType <", value, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeLessThanOrEqualTo(String value) {
            addCriterion("amountType <=", value, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeLike(String value) {
            addCriterion("amountType like", value, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeNotLike(String value) {
            addCriterion("amountType not like", value, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeIn(List<String> values) {
            addCriterion("amountType in", values, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeNotIn(List<String> values) {
            addCriterion("amountType not in", values, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeBetween(String value1, String value2) {
            addCriterion("amountType between", value1, value2, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmounttypeNotBetween(String value1, String value2) {
            addCriterion("amountType not between", value1, value2, "amounttype");
            return (Criteria) this;
        }

        public Criteria andAmountdateIsNull() {
            addCriterion("amountDate is null");
            return (Criteria) this;
        }

        public Criteria andAmountdateIsNotNull() {
            addCriterion("amountDate is not null");
            return (Criteria) this;
        }

        public Criteria andAmountdateEqualTo(Date value) {
            addCriterion("amountDate =", value, "amountdate");
            return (Criteria) this;
        }

        public Criteria andAmountdateNotEqualTo(Date value) {
            addCriterion("amountDate <>", value, "amountdate");
            return (Criteria) this;
        }

        public Criteria andAmountdateGreaterThan(Date value) {
            addCriterion("amountDate >", value, "amountdate");
            return (Criteria) this;
        }

        public Criteria andAmountdateGreaterThanOrEqualTo(Date value) {
            addCriterion("amountDate >=", value, "amountdate");
            return (Criteria) this;
        }

        public Criteria andAmountdateLessThan(Date value) {
            addCriterion("amountDate <", value, "amountdate");
            return (Criteria) this;
        }

        public Criteria andAmountdateLessThanOrEqualTo(Date value) {
            addCriterion("amountDate <=", value, "amountdate");
            return (Criteria) this;
        }

        public Criteria andAmountdateIn(List<Date> values) {
            addCriterion("amountDate in", values, "amountdate");
            return (Criteria) this;
        }

        public Criteria andAmountdateNotIn(List<Date> values) {
            addCriterion("amountDate not in", values, "amountdate");
            return (Criteria) this;
        }

        public Criteria andAmountdateBetween(Date value1, Date value2) {
            addCriterion("amountDate between", value1, value2, "amountdate");
            return (Criteria) this;
        }

        public Criteria andAmountdateNotBetween(Date value1, Date value2) {
            addCriterion("amountDate not between", value1, value2, "amountdate");
            return (Criteria) this;
        }

        public Criteria andAmountremarkIsNull() {
            addCriterion("amountRemark is null");
            return (Criteria) this;
        }

        public Criteria andAmountremarkIsNotNull() {
            addCriterion("amountRemark is not null");
            return (Criteria) this;
        }

        public Criteria andAmountremarkEqualTo(String value) {
            addCriterion("amountRemark =", value, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkNotEqualTo(String value) {
            addCriterion("amountRemark <>", value, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkGreaterThan(String value) {
            addCriterion("amountRemark >", value, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkGreaterThanOrEqualTo(String value) {
            addCriterion("amountRemark >=", value, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkLessThan(String value) {
            addCriterion("amountRemark <", value, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkLessThanOrEqualTo(String value) {
            addCriterion("amountRemark <=", value, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkLike(String value) {
            addCriterion("amountRemark like", value, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkNotLike(String value) {
            addCriterion("amountRemark not like", value, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkIn(List<String> values) {
            addCriterion("amountRemark in", values, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkNotIn(List<String> values) {
            addCriterion("amountRemark not in", values, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkBetween(String value1, String value2) {
            addCriterion("amountRemark between", value1, value2, "amountremark");
            return (Criteria) this;
        }

        public Criteria andAmountremarkNotBetween(String value1, String value2) {
            addCriterion("amountRemark not between", value1, value2, "amountremark");
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