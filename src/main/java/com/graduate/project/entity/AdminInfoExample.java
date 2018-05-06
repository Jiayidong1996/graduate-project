package com.graduate.project.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminInfoExample() {
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

        public Criteria andAdminidIsNull() {
            addCriterion("adminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminId not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminpassIsNull() {
            addCriterion("adminPass is null");
            return (Criteria) this;
        }

        public Criteria andAdminpassIsNotNull() {
            addCriterion("adminPass is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpassEqualTo(String value) {
            addCriterion("adminPass =", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotEqualTo(String value) {
            addCriterion("adminPass <>", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassGreaterThan(String value) {
            addCriterion("adminPass >", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassGreaterThanOrEqualTo(String value) {
            addCriterion("adminPass >=", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassLessThan(String value) {
            addCriterion("adminPass <", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassLessThanOrEqualTo(String value) {
            addCriterion("adminPass <=", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassLike(String value) {
            addCriterion("adminPass like", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotLike(String value) {
            addCriterion("adminPass not like", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassIn(List<String> values) {
            addCriterion("adminPass in", values, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotIn(List<String> values) {
            addCriterion("adminPass not in", values, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassBetween(String value1, String value2) {
            addCriterion("adminPass between", value1, value2, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotBetween(String value1, String value2) {
            addCriterion("adminPass not between", value1, value2, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("adminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("adminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("adminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("adminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("adminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("adminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("adminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("adminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("adminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("adminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("adminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("adminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("adminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("adminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNull() {
            addCriterion("trueName is null");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNotNull() {
            addCriterion("trueName is not null");
            return (Criteria) this;
        }

        public Criteria andTruenameEqualTo(String value) {
            addCriterion("trueName =", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotEqualTo(String value) {
            addCriterion("trueName <>", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThan(String value) {
            addCriterion("trueName >", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("trueName >=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThan(String value) {
            addCriterion("trueName <", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThanOrEqualTo(String value) {
            addCriterion("trueName <=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLike(String value) {
            addCriterion("trueName like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotLike(String value) {
            addCriterion("trueName not like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameIn(List<String> values) {
            addCriterion("trueName in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotIn(List<String> values) {
            addCriterion("trueName not in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameBetween(String value1, String value2) {
            addCriterion("trueName between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotBetween(String value1, String value2) {
            addCriterion("trueName not between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIsNull() {
            addCriterion("adminPhone is null");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIsNotNull() {
            addCriterion("adminPhone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminphoneEqualTo(Integer value) {
            addCriterion("adminPhone =", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotEqualTo(Integer value) {
            addCriterion("adminPhone <>", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneGreaterThan(Integer value) {
            addCriterion("adminPhone >", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminPhone >=", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLessThan(Integer value) {
            addCriterion("adminPhone <", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLessThanOrEqualTo(Integer value) {
            addCriterion("adminPhone <=", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIn(List<Integer> values) {
            addCriterion("adminPhone in", values, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotIn(List<Integer> values) {
            addCriterion("adminPhone not in", values, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneBetween(Integer value1, Integer value2) {
            addCriterion("adminPhone between", value1, value2, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("adminPhone not between", value1, value2, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminmailIsNull() {
            addCriterion("adminMail is null");
            return (Criteria) this;
        }

        public Criteria andAdminmailIsNotNull() {
            addCriterion("adminMail is not null");
            return (Criteria) this;
        }

        public Criteria andAdminmailEqualTo(String value) {
            addCriterion("adminMail =", value, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailNotEqualTo(String value) {
            addCriterion("adminMail <>", value, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailGreaterThan(String value) {
            addCriterion("adminMail >", value, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailGreaterThanOrEqualTo(String value) {
            addCriterion("adminMail >=", value, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailLessThan(String value) {
            addCriterion("adminMail <", value, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailLessThanOrEqualTo(String value) {
            addCriterion("adminMail <=", value, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailLike(String value) {
            addCriterion("adminMail like", value, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailNotLike(String value) {
            addCriterion("adminMail not like", value, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailIn(List<String> values) {
            addCriterion("adminMail in", values, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailNotIn(List<String> values) {
            addCriterion("adminMail not in", values, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailBetween(String value1, String value2) {
            addCriterion("adminMail between", value1, value2, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminmailNotBetween(String value1, String value2) {
            addCriterion("adminMail not between", value1, value2, "adminmail");
            return (Criteria) this;
        }

        public Criteria andAdminaddressIsNull() {
            addCriterion("adminAddress is null");
            return (Criteria) this;
        }

        public Criteria andAdminaddressIsNotNull() {
            addCriterion("adminAddress is not null");
            return (Criteria) this;
        }

        public Criteria andAdminaddressEqualTo(String value) {
            addCriterion("adminAddress =", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressNotEqualTo(String value) {
            addCriterion("adminAddress <>", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressGreaterThan(String value) {
            addCriterion("adminAddress >", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressGreaterThanOrEqualTo(String value) {
            addCriterion("adminAddress >=", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressLessThan(String value) {
            addCriterion("adminAddress <", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressLessThanOrEqualTo(String value) {
            addCriterion("adminAddress <=", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressLike(String value) {
            addCriterion("adminAddress like", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressNotLike(String value) {
            addCriterion("adminAddress not like", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressIn(List<String> values) {
            addCriterion("adminAddress in", values, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressNotIn(List<String> values) {
            addCriterion("adminAddress not in", values, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressBetween(String value1, String value2) {
            addCriterion("adminAddress between", value1, value2, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressNotBetween(String value1, String value2) {
            addCriterion("adminAddress not between", value1, value2, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryIsNull() {
            addCriterion("adminSalary is null");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryIsNotNull() {
            addCriterion("adminSalary is not null");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryEqualTo(Integer value) {
            addCriterion("adminSalary =", value, "adminsalary");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryNotEqualTo(Integer value) {
            addCriterion("adminSalary <>", value, "adminsalary");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryGreaterThan(Integer value) {
            addCriterion("adminSalary >", value, "adminsalary");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminSalary >=", value, "adminsalary");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryLessThan(Integer value) {
            addCriterion("adminSalary <", value, "adminsalary");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryLessThanOrEqualTo(Integer value) {
            addCriterion("adminSalary <=", value, "adminsalary");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryIn(List<Integer> values) {
            addCriterion("adminSalary in", values, "adminsalary");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryNotIn(List<Integer> values) {
            addCriterion("adminSalary not in", values, "adminsalary");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryBetween(Integer value1, Integer value2) {
            addCriterion("adminSalary between", value1, value2, "adminsalary");
            return (Criteria) this;
        }

        public Criteria andAdminsalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("adminSalary not between", value1, value2, "adminsalary");
            return (Criteria) this;
        }

        public Criteria andLimitsIsNull() {
            addCriterion("limits is null");
            return (Criteria) this;
        }

        public Criteria andLimitsIsNotNull() {
            addCriterion("limits is not null");
            return (Criteria) this;
        }

        public Criteria andLimitsEqualTo(String value) {
            addCriterion("limits =", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsNotEqualTo(String value) {
            addCriterion("limits <>", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsGreaterThan(String value) {
            addCriterion("limits >", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsGreaterThanOrEqualTo(String value) {
            addCriterion("limits >=", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsLessThan(String value) {
            addCriterion("limits <", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsLessThanOrEqualTo(String value) {
            addCriterion("limits <=", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsLike(String value) {
            addCriterion("limits like", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsNotLike(String value) {
            addCriterion("limits not like", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsIn(List<String> values) {
            addCriterion("limits in", values, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsNotIn(List<String> values) {
            addCriterion("limits not in", values, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsBetween(String value1, String value2) {
            addCriterion("limits between", value1, value2, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsNotBetween(String value1, String value2) {
            addCriterion("limits not between", value1, value2, "limits");
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