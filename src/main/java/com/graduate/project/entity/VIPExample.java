package com.graduate.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VIPExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VIPExample() {
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

        public Criteria andVipnameIsNull() {
            addCriterion("vipName is null");
            return (Criteria) this;
        }

        public Criteria andVipnameIsNotNull() {
            addCriterion("vipName is not null");
            return (Criteria) this;
        }

        public Criteria andVipnameEqualTo(String value) {
            addCriterion("vipName =", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotEqualTo(String value) {
            addCriterion("vipName <>", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameGreaterThan(String value) {
            addCriterion("vipName >", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameGreaterThanOrEqualTo(String value) {
            addCriterion("vipName >=", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLessThan(String value) {
            addCriterion("vipName <", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLessThanOrEqualTo(String value) {
            addCriterion("vipName <=", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLike(String value) {
            addCriterion("vipName like", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotLike(String value) {
            addCriterion("vipName not like", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameIn(List<String> values) {
            addCriterion("vipName in", values, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotIn(List<String> values) {
            addCriterion("vipName not in", values, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameBetween(String value1, String value2) {
            addCriterion("vipName between", value1, value2, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotBetween(String value1, String value2) {
            addCriterion("vipName not between", value1, value2, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipphoneIsNull() {
            addCriterion("vipPhone is null");
            return (Criteria) this;
        }

        public Criteria andVipphoneIsNotNull() {
            addCriterion("vipPhone is not null");
            return (Criteria) this;
        }

        public Criteria andVipphoneEqualTo(Integer value) {
            addCriterion("vipPhone =", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotEqualTo(Integer value) {
            addCriterion("vipPhone <>", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneGreaterThan(Integer value) {
            addCriterion("vipPhone >", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipPhone >=", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneLessThan(Integer value) {
            addCriterion("vipPhone <", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneLessThanOrEqualTo(Integer value) {
            addCriterion("vipPhone <=", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneIn(List<Integer> values) {
            addCriterion("vipPhone in", values, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotIn(List<Integer> values) {
            addCriterion("vipPhone not in", values, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneBetween(Integer value1, Integer value2) {
            addCriterion("vipPhone between", value1, value2, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("vipPhone not between", value1, value2, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipbalanceIsNull() {
            addCriterion("vipBalance is null");
            return (Criteria) this;
        }

        public Criteria andVipbalanceIsNotNull() {
            addCriterion("vipBalance is not null");
            return (Criteria) this;
        }

        public Criteria andVipbalanceEqualTo(BigDecimal value) {
            addCriterion("vipBalance =", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceNotEqualTo(BigDecimal value) {
            addCriterion("vipBalance <>", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceGreaterThan(BigDecimal value) {
            addCriterion("vipBalance >", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vipBalance >=", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceLessThan(BigDecimal value) {
            addCriterion("vipBalance <", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vipBalance <=", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceIn(List<BigDecimal> values) {
            addCriterion("vipBalance in", values, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceNotIn(List<BigDecimal> values) {
            addCriterion("vipBalance not in", values, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vipBalance between", value1, value2, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vipBalance not between", value1, value2, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipdiscountIsNull() {
            addCriterion("vipDiscount is null");
            return (Criteria) this;
        }

        public Criteria andVipdiscountIsNotNull() {
            addCriterion("vipDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andVipdiscountEqualTo(BigDecimal value) {
            addCriterion("vipDiscount =", value, "vipdiscount");
            return (Criteria) this;
        }

        public Criteria andVipdiscountNotEqualTo(BigDecimal value) {
            addCriterion("vipDiscount <>", value, "vipdiscount");
            return (Criteria) this;
        }

        public Criteria andVipdiscountGreaterThan(BigDecimal value) {
            addCriterion("vipDiscount >", value, "vipdiscount");
            return (Criteria) this;
        }

        public Criteria andVipdiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vipDiscount >=", value, "vipdiscount");
            return (Criteria) this;
        }

        public Criteria andVipdiscountLessThan(BigDecimal value) {
            addCriterion("vipDiscount <", value, "vipdiscount");
            return (Criteria) this;
        }

        public Criteria andVipdiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vipDiscount <=", value, "vipdiscount");
            return (Criteria) this;
        }

        public Criteria andVipdiscountIn(List<BigDecimal> values) {
            addCriterion("vipDiscount in", values, "vipdiscount");
            return (Criteria) this;
        }

        public Criteria andVipdiscountNotIn(List<BigDecimal> values) {
            addCriterion("vipDiscount not in", values, "vipdiscount");
            return (Criteria) this;
        }

        public Criteria andVipdiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vipDiscount between", value1, value2, "vipdiscount");
            return (Criteria) this;
        }

        public Criteria andVipdiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vipDiscount not between", value1, value2, "vipdiscount");
            return (Criteria) this;
        }

        public Criteria andVipbirthIsNull() {
            addCriterion("vipBirth is null");
            return (Criteria) this;
        }

        public Criteria andVipbirthIsNotNull() {
            addCriterion("vipBirth is not null");
            return (Criteria) this;
        }

        public Criteria andVipbirthEqualTo(String value) {
            addCriterion("vipBirth =", value, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthNotEqualTo(String value) {
            addCriterion("vipBirth <>", value, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthGreaterThan(String value) {
            addCriterion("vipBirth >", value, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthGreaterThanOrEqualTo(String value) {
            addCriterion("vipBirth >=", value, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthLessThan(String value) {
            addCriterion("vipBirth <", value, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthLessThanOrEqualTo(String value) {
            addCriterion("vipBirth <=", value, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthLike(String value) {
            addCriterion("vipBirth like", value, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthNotLike(String value) {
            addCriterion("vipBirth not like", value, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthIn(List<String> values) {
            addCriterion("vipBirth in", values, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthNotIn(List<String> values) {
            addCriterion("vipBirth not in", values, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthBetween(String value1, String value2) {
            addCriterion("vipBirth between", value1, value2, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipbirthNotBetween(String value1, String value2) {
            addCriterion("vipBirth not between", value1, value2, "vipbirth");
            return (Criteria) this;
        }

        public Criteria andVipaddressIsNull() {
            addCriterion("vipAddress is null");
            return (Criteria) this;
        }

        public Criteria andVipaddressIsNotNull() {
            addCriterion("vipAddress is not null");
            return (Criteria) this;
        }

        public Criteria andVipaddressEqualTo(String value) {
            addCriterion("vipAddress =", value, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressNotEqualTo(String value) {
            addCriterion("vipAddress <>", value, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressGreaterThan(String value) {
            addCriterion("vipAddress >", value, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressGreaterThanOrEqualTo(String value) {
            addCriterion("vipAddress >=", value, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressLessThan(String value) {
            addCriterion("vipAddress <", value, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressLessThanOrEqualTo(String value) {
            addCriterion("vipAddress <=", value, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressLike(String value) {
            addCriterion("vipAddress like", value, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressNotLike(String value) {
            addCriterion("vipAddress not like", value, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressIn(List<String> values) {
            addCriterion("vipAddress in", values, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressNotIn(List<String> values) {
            addCriterion("vipAddress not in", values, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressBetween(String value1, String value2) {
            addCriterion("vipAddress between", value1, value2, "vipaddress");
            return (Criteria) this;
        }

        public Criteria andVipaddressNotBetween(String value1, String value2) {
            addCriterion("vipAddress not between", value1, value2, "vipaddress");
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