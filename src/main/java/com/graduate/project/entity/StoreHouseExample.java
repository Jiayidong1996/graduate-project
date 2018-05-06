package com.graduate.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StoreHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreHouseExample() {
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

        public Criteria andMaterialidIsNull() {
            addCriterion("materialId is null");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNotNull() {
            addCriterion("materialId is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialidEqualTo(Integer value) {
            addCriterion("materialId =", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotEqualTo(Integer value) {
            addCriterion("materialId <>", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThan(Integer value) {
            addCriterion("materialId >", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThanOrEqualTo(Integer value) {
            addCriterion("materialId >=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThan(Integer value) {
            addCriterion("materialId <", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThanOrEqualTo(Integer value) {
            addCriterion("materialId <=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidIn(List<Integer> values) {
            addCriterion("materialId in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotIn(List<Integer> values) {
            addCriterion("materialId not in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidBetween(Integer value1, Integer value2) {
            addCriterion("materialId between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotBetween(Integer value1, Integer value2) {
            addCriterion("materialId not between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNull() {
            addCriterion("materialName is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNotNull() {
            addCriterion("materialName is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameEqualTo(String value) {
            addCriterion("materialName =", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotEqualTo(String value) {
            addCriterion("materialName <>", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThan(String value) {
            addCriterion("materialName >", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThanOrEqualTo(String value) {
            addCriterion("materialName >=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThan(String value) {
            addCriterion("materialName <", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThanOrEqualTo(String value) {
            addCriterion("materialName <=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLike(String value) {
            addCriterion("materialName like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotLike(String value) {
            addCriterion("materialName not like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIn(List<String> values) {
            addCriterion("materialName in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotIn(List<String> values) {
            addCriterion("materialName not in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameBetween(String value1, String value2) {
            addCriterion("materialName between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotBetween(String value1, String value2) {
            addCriterion("materialName not between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusIsNull() {
            addCriterion("materialSurplus is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusIsNotNull() {
            addCriterion("materialSurplus is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusEqualTo(BigDecimal value) {
            addCriterion("materialSurplus =", value, "materialsurplus");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusNotEqualTo(BigDecimal value) {
            addCriterion("materialSurplus <>", value, "materialsurplus");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusGreaterThan(BigDecimal value) {
            addCriterion("materialSurplus >", value, "materialsurplus");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("materialSurplus >=", value, "materialsurplus");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusLessThan(BigDecimal value) {
            addCriterion("materialSurplus <", value, "materialsurplus");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("materialSurplus <=", value, "materialsurplus");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusIn(List<BigDecimal> values) {
            addCriterion("materialSurplus in", values, "materialsurplus");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusNotIn(List<BigDecimal> values) {
            addCriterion("materialSurplus not in", values, "materialsurplus");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("materialSurplus between", value1, value2, "materialsurplus");
            return (Criteria) this;
        }

        public Criteria andMaterialsurplusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("materialSurplus not between", value1, value2, "materialsurplus");
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