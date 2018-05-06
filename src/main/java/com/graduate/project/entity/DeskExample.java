package com.graduate.project.entity;

import java.util.ArrayList;
import java.util.List;

public class DeskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeskExample() {
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

        public Criteria andDesknameIsNull() {
            addCriterion("deskName is null");
            return (Criteria) this;
        }

        public Criteria andDesknameIsNotNull() {
            addCriterion("deskName is not null");
            return (Criteria) this;
        }

        public Criteria andDesknameEqualTo(String value) {
            addCriterion("deskName =", value, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameNotEqualTo(String value) {
            addCriterion("deskName <>", value, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameGreaterThan(String value) {
            addCriterion("deskName >", value, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameGreaterThanOrEqualTo(String value) {
            addCriterion("deskName >=", value, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameLessThan(String value) {
            addCriterion("deskName <", value, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameLessThanOrEqualTo(String value) {
            addCriterion("deskName <=", value, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameLike(String value) {
            addCriterion("deskName like", value, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameNotLike(String value) {
            addCriterion("deskName not like", value, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameIn(List<String> values) {
            addCriterion("deskName in", values, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameNotIn(List<String> values) {
            addCriterion("deskName not in", values, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameBetween(String value1, String value2) {
            addCriterion("deskName between", value1, value2, "deskname");
            return (Criteria) this;
        }

        public Criteria andDesknameNotBetween(String value1, String value2) {
            addCriterion("deskName not between", value1, value2, "deskname");
            return (Criteria) this;
        }

        public Criteria andDeskstateIsNull() {
            addCriterion("deskState is null");
            return (Criteria) this;
        }

        public Criteria andDeskstateIsNotNull() {
            addCriterion("deskState is not null");
            return (Criteria) this;
        }

        public Criteria andDeskstateEqualTo(String value) {
            addCriterion("deskState =", value, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateNotEqualTo(String value) {
            addCriterion("deskState <>", value, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateGreaterThan(String value) {
            addCriterion("deskState >", value, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateGreaterThanOrEqualTo(String value) {
            addCriterion("deskState >=", value, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateLessThan(String value) {
            addCriterion("deskState <", value, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateLessThanOrEqualTo(String value) {
            addCriterion("deskState <=", value, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateLike(String value) {
            addCriterion("deskState like", value, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateNotLike(String value) {
            addCriterion("deskState not like", value, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateIn(List<String> values) {
            addCriterion("deskState in", values, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateNotIn(List<String> values) {
            addCriterion("deskState not in", values, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateBetween(String value1, String value2) {
            addCriterion("deskState between", value1, value2, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskstateNotBetween(String value1, String value2) {
            addCriterion("deskState not between", value1, value2, "deskstate");
            return (Criteria) this;
        }

        public Criteria andDeskremarkIsNull() {
            addCriterion("deskRemark is null");
            return (Criteria) this;
        }

        public Criteria andDeskremarkIsNotNull() {
            addCriterion("deskRemark is not null");
            return (Criteria) this;
        }

        public Criteria andDeskremarkEqualTo(String value) {
            addCriterion("deskRemark =", value, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkNotEqualTo(String value) {
            addCriterion("deskRemark <>", value, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkGreaterThan(String value) {
            addCriterion("deskRemark >", value, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkGreaterThanOrEqualTo(String value) {
            addCriterion("deskRemark >=", value, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkLessThan(String value) {
            addCriterion("deskRemark <", value, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkLessThanOrEqualTo(String value) {
            addCriterion("deskRemark <=", value, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkLike(String value) {
            addCriterion("deskRemark like", value, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkNotLike(String value) {
            addCriterion("deskRemark not like", value, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkIn(List<String> values) {
            addCriterion("deskRemark in", values, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkNotIn(List<String> values) {
            addCriterion("deskRemark not in", values, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkBetween(String value1, String value2) {
            addCriterion("deskRemark between", value1, value2, "deskremark");
            return (Criteria) this;
        }

        public Criteria andDeskremarkNotBetween(String value1, String value2) {
            addCriterion("deskRemark not between", value1, value2, "deskremark");
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