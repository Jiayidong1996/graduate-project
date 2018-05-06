package com.graduate.project.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffidIsNull() {
            addCriterion("staffId is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("staffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("staffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("staffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("staffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("staffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("staffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("staffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("staffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffId not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNull() {
            addCriterion("staffName is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("staffName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("staffName =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("staffName <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("staffName >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("staffName >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("staffName <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("staffName <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("staffName like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("staffName not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("staffName in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("staffName not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("staffName between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("staffName not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStafftitleIsNull() {
            addCriterion("staffTitle is null");
            return (Criteria) this;
        }

        public Criteria andStafftitleIsNotNull() {
            addCriterion("staffTitle is not null");
            return (Criteria) this;
        }

        public Criteria andStafftitleEqualTo(String value) {
            addCriterion("staffTitle =", value, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleNotEqualTo(String value) {
            addCriterion("staffTitle <>", value, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleGreaterThan(String value) {
            addCriterion("staffTitle >", value, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleGreaterThanOrEqualTo(String value) {
            addCriterion("staffTitle >=", value, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleLessThan(String value) {
            addCriterion("staffTitle <", value, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleLessThanOrEqualTo(String value) {
            addCriterion("staffTitle <=", value, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleLike(String value) {
            addCriterion("staffTitle like", value, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleNotLike(String value) {
            addCriterion("staffTitle not like", value, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleIn(List<String> values) {
            addCriterion("staffTitle in", values, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleNotIn(List<String> values) {
            addCriterion("staffTitle not in", values, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleBetween(String value1, String value2) {
            addCriterion("staffTitle between", value1, value2, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStafftitleNotBetween(String value1, String value2) {
            addCriterion("staffTitle not between", value1, value2, "stafftitle");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryIsNull() {
            addCriterion("staffSalary is null");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryIsNotNull() {
            addCriterion("staffSalary is not null");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryEqualTo(BigDecimal value) {
            addCriterion("staffSalary =", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryNotEqualTo(BigDecimal value) {
            addCriterion("staffSalary <>", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryGreaterThan(BigDecimal value) {
            addCriterion("staffSalary >", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("staffSalary >=", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryLessThan(BigDecimal value) {
            addCriterion("staffSalary <", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("staffSalary <=", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryIn(List<BigDecimal> values) {
            addCriterion("staffSalary in", values, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryNotIn(List<BigDecimal> values) {
            addCriterion("staffSalary not in", values, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("staffSalary between", value1, value2, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("staffSalary not between", value1, value2, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffaddressIsNull() {
            addCriterion("staffAddress is null");
            return (Criteria) this;
        }

        public Criteria andStaffaddressIsNotNull() {
            addCriterion("staffAddress is not null");
            return (Criteria) this;
        }

        public Criteria andStaffaddressEqualTo(String value) {
            addCriterion("staffAddress =", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotEqualTo(String value) {
            addCriterion("staffAddress <>", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressGreaterThan(String value) {
            addCriterion("staffAddress >", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressGreaterThanOrEqualTo(String value) {
            addCriterion("staffAddress >=", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressLessThan(String value) {
            addCriterion("staffAddress <", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressLessThanOrEqualTo(String value) {
            addCriterion("staffAddress <=", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressLike(String value) {
            addCriterion("staffAddress like", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotLike(String value) {
            addCriterion("staffAddress not like", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressIn(List<String> values) {
            addCriterion("staffAddress in", values, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotIn(List<String> values) {
            addCriterion("staffAddress not in", values, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressBetween(String value1, String value2) {
            addCriterion("staffAddress between", value1, value2, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotBetween(String value1, String value2) {
            addCriterion("staffAddress not between", value1, value2, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordIsNull() {
            addCriterion("staffPassword is null");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordIsNotNull() {
            addCriterion("staffPassword is not null");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordEqualTo(String value) {
            addCriterion("staffPassword =", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotEqualTo(String value) {
            addCriterion("staffPassword <>", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordGreaterThan(String value) {
            addCriterion("staffPassword >", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("staffPassword >=", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordLessThan(String value) {
            addCriterion("staffPassword <", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordLessThanOrEqualTo(String value) {
            addCriterion("staffPassword <=", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordLike(String value) {
            addCriterion("staffPassword like", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotLike(String value) {
            addCriterion("staffPassword not like", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordIn(List<String> values) {
            addCriterion("staffPassword in", values, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotIn(List<String> values) {
            addCriterion("staffPassword not in", values, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordBetween(String value1, String value2) {
            addCriterion("staffPassword between", value1, value2, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotBetween(String value1, String value2) {
            addCriterion("staffPassword not between", value1, value2, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentIsNull() {
            addCriterion("staffDepartment is null");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentIsNotNull() {
            addCriterion("staffDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentEqualTo(String value) {
            addCriterion("staffDepartment =", value, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentNotEqualTo(String value) {
            addCriterion("staffDepartment <>", value, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentGreaterThan(String value) {
            addCriterion("staffDepartment >", value, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("staffDepartment >=", value, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentLessThan(String value) {
            addCriterion("staffDepartment <", value, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentLessThanOrEqualTo(String value) {
            addCriterion("staffDepartment <=", value, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentLike(String value) {
            addCriterion("staffDepartment like", value, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentNotLike(String value) {
            addCriterion("staffDepartment not like", value, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentIn(List<String> values) {
            addCriterion("staffDepartment in", values, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentNotIn(List<String> values) {
            addCriterion("staffDepartment not in", values, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentBetween(String value1, String value2) {
            addCriterion("staffDepartment between", value1, value2, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentNotBetween(String value1, String value2) {
            addCriterion("staffDepartment not between", value1, value2, "staffdepartment");
            return (Criteria) this;
        }

        public Criteria andStaffmailIsNull() {
            addCriterion("staffMail is null");
            return (Criteria) this;
        }

        public Criteria andStaffmailIsNotNull() {
            addCriterion("staffMail is not null");
            return (Criteria) this;
        }

        public Criteria andStaffmailEqualTo(String value) {
            addCriterion("staffMail =", value, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailNotEqualTo(String value) {
            addCriterion("staffMail <>", value, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailGreaterThan(String value) {
            addCriterion("staffMail >", value, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailGreaterThanOrEqualTo(String value) {
            addCriterion("staffMail >=", value, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailLessThan(String value) {
            addCriterion("staffMail <", value, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailLessThanOrEqualTo(String value) {
            addCriterion("staffMail <=", value, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailLike(String value) {
            addCriterion("staffMail like", value, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailNotLike(String value) {
            addCriterion("staffMail not like", value, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailIn(List<String> values) {
            addCriterion("staffMail in", values, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailNotIn(List<String> values) {
            addCriterion("staffMail not in", values, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailBetween(String value1, String value2) {
            addCriterion("staffMail between", value1, value2, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffmailNotBetween(String value1, String value2) {
            addCriterion("staffMail not between", value1, value2, "staffmail");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIsNull() {
            addCriterion("staffPhone is null");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIsNotNull() {
            addCriterion("staffPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffphoneEqualTo(String value) {
            addCriterion("staffPhone =", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotEqualTo(String value) {
            addCriterion("staffPhone <>", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneGreaterThan(String value) {
            addCriterion("staffPhone >", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneGreaterThanOrEqualTo(String value) {
            addCriterion("staffPhone >=", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLessThan(String value) {
            addCriterion("staffPhone <", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLessThanOrEqualTo(String value) {
            addCriterion("staffPhone <=", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLike(String value) {
            addCriterion("staffPhone like", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotLike(String value) {
            addCriterion("staffPhone not like", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIn(List<String> values) {
            addCriterion("staffPhone in", values, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotIn(List<String> values) {
            addCriterion("staffPhone not in", values, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneBetween(String value1, String value2) {
            addCriterion("staffPhone between", value1, value2, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotBetween(String value1, String value2) {
            addCriterion("staffPhone not between", value1, value2, "staffphone");
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