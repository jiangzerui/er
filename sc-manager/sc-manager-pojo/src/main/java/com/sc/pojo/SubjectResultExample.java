package com.sc.pojo;

import java.util.ArrayList;
import java.util.List;

public class SubjectResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectResultExample() {
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

        public Criteria andSubjectResultIdIsNull() {
            addCriterion("subject_result_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdIsNotNull() {
            addCriterion("subject_result_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdEqualTo(Integer value) {
            addCriterion("subject_result_id =", value, "subjectResultId");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdNotEqualTo(Integer value) {
            addCriterion("subject_result_id <>", value, "subjectResultId");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdGreaterThan(Integer value) {
            addCriterion("subject_result_id >", value, "subjectResultId");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_result_id >=", value, "subjectResultId");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdLessThan(Integer value) {
            addCriterion("subject_result_id <", value, "subjectResultId");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_result_id <=", value, "subjectResultId");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdIn(List<Integer> values) {
            addCriterion("subject_result_id in", values, "subjectResultId");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdNotIn(List<Integer> values) {
            addCriterion("subject_result_id not in", values, "subjectResultId");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_result_id between", value1, value2, "subjectResultId");
            return (Criteria) this;
        }

        public Criteria andSubjectResultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_result_id not between", value1, value2, "subjectResultId");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameIsNull() {
            addCriterion("subject_result_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameIsNotNull() {
            addCriterion("subject_result_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameEqualTo(String value) {
            addCriterion("subject_result_name =", value, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameNotEqualTo(String value) {
            addCriterion("subject_result_name <>", value, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameGreaterThan(String value) {
            addCriterion("subject_result_name >", value, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_result_name >=", value, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameLessThan(String value) {
            addCriterion("subject_result_name <", value, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameLessThanOrEqualTo(String value) {
            addCriterion("subject_result_name <=", value, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameLike(String value) {
            addCriterion("subject_result_name like", value, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameNotLike(String value) {
            addCriterion("subject_result_name not like", value, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameIn(List<String> values) {
            addCriterion("subject_result_name in", values, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameNotIn(List<String> values) {
            addCriterion("subject_result_name not in", values, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameBetween(String value1, String value2) {
            addCriterion("subject_result_name between", value1, value2, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNameNotBetween(String value1, String value2) {
            addCriterion("subject_result_name not between", value1, value2, "subjectResultName");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlIsNull() {
            addCriterion("subject-result_url is null");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlIsNotNull() {
            addCriterion("subject-result_url is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlEqualTo(String value) {
            addCriterion("subject-result_url =", value, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlNotEqualTo(String value) {
            addCriterion("subject-result_url <>", value, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlGreaterThan(String value) {
            addCriterion("subject-result_url >", value, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlGreaterThanOrEqualTo(String value) {
            addCriterion("subject-result_url >=", value, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlLessThan(String value) {
            addCriterion("subject-result_url <", value, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlLessThanOrEqualTo(String value) {
            addCriterion("subject-result_url <=", value, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlLike(String value) {
            addCriterion("subject-result_url like", value, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlNotLike(String value) {
            addCriterion("subject-result_url not like", value, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlIn(List<String> values) {
            addCriterion("subject-result_url in", values, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlNotIn(List<String> values) {
            addCriterion("subject-result_url not in", values, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlBetween(String value1, String value2) {
            addCriterion("subject-result_url between", value1, value2, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultUrlNotBetween(String value1, String value2) {
            addCriterion("subject-result_url not between", value1, value2, "subjectResultUrl");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteIsNull() {
            addCriterion("subject_result_note is null");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteIsNotNull() {
            addCriterion("subject_result_note is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteEqualTo(String value) {
            addCriterion("subject_result_note =", value, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteNotEqualTo(String value) {
            addCriterion("subject_result_note <>", value, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteGreaterThan(String value) {
            addCriterion("subject_result_note >", value, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteGreaterThanOrEqualTo(String value) {
            addCriterion("subject_result_note >=", value, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteLessThan(String value) {
            addCriterion("subject_result_note <", value, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteLessThanOrEqualTo(String value) {
            addCriterion("subject_result_note <=", value, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteLike(String value) {
            addCriterion("subject_result_note like", value, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteNotLike(String value) {
            addCriterion("subject_result_note not like", value, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteIn(List<String> values) {
            addCriterion("subject_result_note in", values, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteNotIn(List<String> values) {
            addCriterion("subject_result_note not in", values, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteBetween(String value1, String value2) {
            addCriterion("subject_result_note between", value1, value2, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultNoteNotBetween(String value1, String value2) {
            addCriterion("subject_result_note not between", value1, value2, "subjectResultNote");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeIsNull() {
            addCriterion("subject_result_code is null");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeIsNotNull() {
            addCriterion("subject_result_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeEqualTo(String value) {
            addCriterion("subject_result_code =", value, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeNotEqualTo(String value) {
            addCriterion("subject_result_code <>", value, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeGreaterThan(String value) {
            addCriterion("subject_result_code >", value, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("subject_result_code >=", value, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeLessThan(String value) {
            addCriterion("subject_result_code <", value, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeLessThanOrEqualTo(String value) {
            addCriterion("subject_result_code <=", value, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeLike(String value) {
            addCriterion("subject_result_code like", value, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeNotLike(String value) {
            addCriterion("subject_result_code not like", value, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeIn(List<String> values) {
            addCriterion("subject_result_code in", values, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeNotIn(List<String> values) {
            addCriterion("subject_result_code not in", values, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeBetween(String value1, String value2) {
            addCriterion("subject_result_code between", value1, value2, "subjectResultCode");
            return (Criteria) this;
        }

        public Criteria andSubjectResultCodeNotBetween(String value1, String value2) {
            addCriterion("subject_result_code not between", value1, value2, "subjectResultCode");
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