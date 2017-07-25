package com.sc.pojo;

import java.util.ArrayList;
import java.util.List;

public class SubjectStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectStatusExample() {
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

        public Criteria andSubjectStatusIdIsNull() {
            addCriterion("subject_status_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdIsNotNull() {
            addCriterion("subject_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdEqualTo(Integer value) {
            addCriterion("subject_status_id =", value, "subjectStatusId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdNotEqualTo(Integer value) {
            addCriterion("subject_status_id <>", value, "subjectStatusId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdGreaterThan(Integer value) {
            addCriterion("subject_status_id >", value, "subjectStatusId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_status_id >=", value, "subjectStatusId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdLessThan(Integer value) {
            addCriterion("subject_status_id <", value, "subjectStatusId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_status_id <=", value, "subjectStatusId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdIn(List<Integer> values) {
            addCriterion("subject_status_id in", values, "subjectStatusId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdNotIn(List<Integer> values) {
            addCriterion("subject_status_id not in", values, "subjectStatusId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_status_id between", value1, value2, "subjectStatusId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_status_id not between", value1, value2, "subjectStatusId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameIsNull() {
            addCriterion("subject_status_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameIsNotNull() {
            addCriterion("subject_status_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameEqualTo(String value) {
            addCriterion("subject_status_name =", value, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameNotEqualTo(String value) {
            addCriterion("subject_status_name <>", value, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameGreaterThan(String value) {
            addCriterion("subject_status_name >", value, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_status_name >=", value, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameLessThan(String value) {
            addCriterion("subject_status_name <", value, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameLessThanOrEqualTo(String value) {
            addCriterion("subject_status_name <=", value, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameLike(String value) {
            addCriterion("subject_status_name like", value, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameNotLike(String value) {
            addCriterion("subject_status_name not like", value, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameIn(List<String> values) {
            addCriterion("subject_status_name in", values, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameNotIn(List<String> values) {
            addCriterion("subject_status_name not in", values, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameBetween(String value1, String value2) {
            addCriterion("subject_status_name between", value1, value2, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNameNotBetween(String value1, String value2) {
            addCriterion("subject_status_name not between", value1, value2, "subjectStatusName");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeIsNull() {
            addCriterion("subject_status_code is null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeIsNotNull() {
            addCriterion("subject_status_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeEqualTo(String value) {
            addCriterion("subject_status_code =", value, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeNotEqualTo(String value) {
            addCriterion("subject_status_code <>", value, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeGreaterThan(String value) {
            addCriterion("subject_status_code >", value, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("subject_status_code >=", value, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeLessThan(String value) {
            addCriterion("subject_status_code <", value, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("subject_status_code <=", value, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeLike(String value) {
            addCriterion("subject_status_code like", value, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeNotLike(String value) {
            addCriterion("subject_status_code not like", value, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeIn(List<String> values) {
            addCriterion("subject_status_code in", values, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeNotIn(List<String> values) {
            addCriterion("subject_status_code not in", values, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeBetween(String value1, String value2) {
            addCriterion("subject_status_code between", value1, value2, "subjectStatusCode");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusCodeNotBetween(String value1, String value2) {
            addCriterion("subject_status_code not between", value1, value2, "subjectStatusCode");
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