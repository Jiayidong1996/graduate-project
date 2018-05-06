package com.graduate.project.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentName is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentName =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentName <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentName >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentName >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentName <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentName <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentName like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentName not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentName in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentName not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentName between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentName not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateIsNull() {
            addCriterion("establishedDate is null");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateIsNotNull() {
            addCriterion("establishedDate is not null");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateEqualTo(Date value) {
            addCriterion("establishedDate =", value, "establisheddate");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateNotEqualTo(Date value) {
            addCriterion("establishedDate <>", value, "establisheddate");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateGreaterThan(Date value) {
            addCriterion("establishedDate >", value, "establisheddate");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateGreaterThanOrEqualTo(Date value) {
            addCriterion("establishedDate >=", value, "establisheddate");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateLessThan(Date value) {
            addCriterion("establishedDate <", value, "establisheddate");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateLessThanOrEqualTo(Date value) {
            addCriterion("establishedDate <=", value, "establisheddate");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateIn(List<Date> values) {
            addCriterion("establishedDate in", values, "establisheddate");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateNotIn(List<Date> values) {
            addCriterion("establishedDate not in", values, "establisheddate");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateBetween(Date value1, Date value2) {
            addCriterion("establishedDate between", value1, value2, "establisheddate");
            return (Criteria) this;
        }

        public Criteria andEstablisheddateNotBetween(Date value1, Date value2) {
            addCriterion("establishedDate not between", value1, value2, "establisheddate");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumIsNull() {
            addCriterion("departmentperNum is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumIsNotNull() {
            addCriterion("departmentperNum is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumEqualTo(Integer value) {
            addCriterion("departmentperNum =", value, "departmentpernum");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumNotEqualTo(Integer value) {
            addCriterion("departmentperNum <>", value, "departmentpernum");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumGreaterThan(Integer value) {
            addCriterion("departmentperNum >", value, "departmentpernum");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentperNum >=", value, "departmentpernum");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumLessThan(Integer value) {
            addCriterion("departmentperNum <", value, "departmentpernum");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumLessThanOrEqualTo(Integer value) {
            addCriterion("departmentperNum <=", value, "departmentpernum");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumIn(List<Integer> values) {
            addCriterion("departmentperNum in", values, "departmentpernum");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumNotIn(List<Integer> values) {
            addCriterion("departmentperNum not in", values, "departmentpernum");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumBetween(Integer value1, Integer value2) {
            addCriterion("departmentperNum between", value1, value2, "departmentpernum");
            return (Criteria) this;
        }

        public Criteria andDepartmentpernumNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentperNum not between", value1, value2, "departmentpernum");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerIsNull() {
            addCriterion("departmentManager is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerIsNotNull() {
            addCriterion("departmentManager is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerEqualTo(String value) {
            addCriterion("departmentManager =", value, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerNotEqualTo(String value) {
            addCriterion("departmentManager <>", value, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerGreaterThan(String value) {
            addCriterion("departmentManager >", value, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("departmentManager >=", value, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerLessThan(String value) {
            addCriterion("departmentManager <", value, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerLessThanOrEqualTo(String value) {
            addCriterion("departmentManager <=", value, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerLike(String value) {
            addCriterion("departmentManager like", value, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerNotLike(String value) {
            addCriterion("departmentManager not like", value, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerIn(List<String> values) {
            addCriterion("departmentManager in", values, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerNotIn(List<String> values) {
            addCriterion("departmentManager not in", values, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerBetween(String value1, String value2) {
            addCriterion("departmentManager between", value1, value2, "departmentmanager");
            return (Criteria) this;
        }

        public Criteria andDepartmentmanagerNotBetween(String value1, String value2) {
            addCriterion("departmentManager not between", value1, value2, "departmentmanager");
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