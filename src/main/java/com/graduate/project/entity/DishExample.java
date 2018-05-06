package com.graduate.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishExample() {
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

        public Criteria andDishnameIsNull() {
            addCriterion("dishName is null");
            return (Criteria) this;
        }

        public Criteria andDishnameIsNotNull() {
            addCriterion("dishName is not null");
            return (Criteria) this;
        }

        public Criteria andDishnameEqualTo(String value) {
            addCriterion("dishName =", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotEqualTo(String value) {
            addCriterion("dishName <>", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameGreaterThan(String value) {
            addCriterion("dishName >", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameGreaterThanOrEqualTo(String value) {
            addCriterion("dishName >=", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameLessThan(String value) {
            addCriterion("dishName <", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameLessThanOrEqualTo(String value) {
            addCriterion("dishName <=", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameLike(String value) {
            addCriterion("dishName like", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotLike(String value) {
            addCriterion("dishName not like", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameIn(List<String> values) {
            addCriterion("dishName in", values, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotIn(List<String> values) {
            addCriterion("dishName not in", values, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameBetween(String value1, String value2) {
            addCriterion("dishName between", value1, value2, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotBetween(String value1, String value2) {
            addCriterion("dishName not between", value1, value2, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishpriceIsNull() {
            addCriterion("dishPrice is null");
            return (Criteria) this;
        }

        public Criteria andDishpriceIsNotNull() {
            addCriterion("dishPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDishpriceEqualTo(BigDecimal value) {
            addCriterion("dishPrice =", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceNotEqualTo(BigDecimal value) {
            addCriterion("dishPrice <>", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceGreaterThan(BigDecimal value) {
            addCriterion("dishPrice >", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dishPrice >=", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceLessThan(BigDecimal value) {
            addCriterion("dishPrice <", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dishPrice <=", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceIn(List<BigDecimal> values) {
            addCriterion("dishPrice in", values, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceNotIn(List<BigDecimal> values) {
            addCriterion("dishPrice not in", values, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dishPrice between", value1, value2, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dishPrice not between", value1, value2, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishstyleIsNull() {
            addCriterion("dishStyle is null");
            return (Criteria) this;
        }

        public Criteria andDishstyleIsNotNull() {
            addCriterion("dishStyle is not null");
            return (Criteria) this;
        }

        public Criteria andDishstyleEqualTo(String value) {
            addCriterion("dishStyle =", value, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleNotEqualTo(String value) {
            addCriterion("dishStyle <>", value, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleGreaterThan(String value) {
            addCriterion("dishStyle >", value, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleGreaterThanOrEqualTo(String value) {
            addCriterion("dishStyle >=", value, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleLessThan(String value) {
            addCriterion("dishStyle <", value, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleLessThanOrEqualTo(String value) {
            addCriterion("dishStyle <=", value, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleLike(String value) {
            addCriterion("dishStyle like", value, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleNotLike(String value) {
            addCriterion("dishStyle not like", value, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleIn(List<String> values) {
            addCriterion("dishStyle in", values, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleNotIn(List<String> values) {
            addCriterion("dishStyle not in", values, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleBetween(String value1, String value2) {
            addCriterion("dishStyle between", value1, value2, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishstyleNotBetween(String value1, String value2) {
            addCriterion("dishStyle not between", value1, value2, "dishstyle");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteIsNull() {
            addCriterion("dishPictureRoute is null");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteIsNotNull() {
            addCriterion("dishPictureRoute is not null");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteEqualTo(String value) {
            addCriterion("dishPictureRoute =", value, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteNotEqualTo(String value) {
            addCriterion("dishPictureRoute <>", value, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteGreaterThan(String value) {
            addCriterion("dishPictureRoute >", value, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteGreaterThanOrEqualTo(String value) {
            addCriterion("dishPictureRoute >=", value, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteLessThan(String value) {
            addCriterion("dishPictureRoute <", value, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteLessThanOrEqualTo(String value) {
            addCriterion("dishPictureRoute <=", value, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteLike(String value) {
            addCriterion("dishPictureRoute like", value, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteNotLike(String value) {
            addCriterion("dishPictureRoute not like", value, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteIn(List<String> values) {
            addCriterion("dishPictureRoute in", values, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteNotIn(List<String> values) {
            addCriterion("dishPictureRoute not in", values, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteBetween(String value1, String value2) {
            addCriterion("dishPictureRoute between", value1, value2, "dishpictureroute");
            return (Criteria) this;
        }

        public Criteria andDishpicturerouteNotBetween(String value1, String value2) {
            addCriterion("dishPictureRoute not between", value1, value2, "dishpictureroute");
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