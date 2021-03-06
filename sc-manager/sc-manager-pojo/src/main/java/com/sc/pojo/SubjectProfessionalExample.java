package com.sc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjectProfessionalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectProfessionalExample() {
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

        public Criteria andSubjectProfessionalIdIsNull() {
            addCriterion("subject_professional_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdIsNotNull() {
            addCriterion("subject_professional_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdEqualTo(Integer value) {
            addCriterion("subject_professional_id =", value, "subjectProfessionalId");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdNotEqualTo(Integer value) {
            addCriterion("subject_professional_id <>", value, "subjectProfessionalId");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdGreaterThan(Integer value) {
            addCriterion("subject_professional_id >", value, "subjectProfessionalId");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_professional_id >=", value, "subjectProfessionalId");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdLessThan(Integer value) {
            addCriterion("subject_professional_id <", value, "subjectProfessionalId");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_professional_id <=", value, "subjectProfessionalId");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdIn(List<Integer> values) {
            addCriterion("subject_professional_id in", values, "subjectProfessionalId");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdNotIn(List<Integer> values) {
            addCriterion("subject_professional_id not in", values, "subjectProfessionalId");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_professional_id between", value1, value2, "subjectProfessionalId");
            return (Criteria) this;
        }

        public Criteria andSubjectProfessionalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_professional_id not between", value1, value2, "subjectProfessionalId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdIsNull() {
            addCriterion("user_professional_id is null");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdIsNotNull() {
            addCriterion("user_professional_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdEqualTo(Integer value) {
            addCriterion("user_professional_id =", value, "userProfessionalId");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdNotEqualTo(Integer value) {
            addCriterion("user_professional_id <>", value, "userProfessionalId");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdGreaterThan(Integer value) {
            addCriterion("user_professional_id >", value, "userProfessionalId");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_professional_id >=", value, "userProfessionalId");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdLessThan(Integer value) {
            addCriterion("user_professional_id <", value, "userProfessionalId");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_professional_id <=", value, "userProfessionalId");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdIn(List<Integer> values) {
            addCriterion("user_professional_id in", values, "userProfessionalId");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdNotIn(List<Integer> values) {
            addCriterion("user_professional_id not in", values, "userProfessionalId");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdBetween(Integer value1, Integer value2) {
            addCriterion("user_professional_id between", value1, value2, "userProfessionalId");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_professional_id not between", value1, value2, "userProfessionalId");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andSuggestIsNull() {
            addCriterion("suggest is null");
            return (Criteria) this;
        }

        public Criteria andSuggestIsNotNull() {
            addCriterion("suggest is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestEqualTo(String value) {
            addCriterion("suggest =", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotEqualTo(String value) {
            addCriterion("suggest <>", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestGreaterThan(String value) {
            addCriterion("suggest >", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("suggest >=", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLessThan(String value) {
            addCriterion("suggest <", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLessThanOrEqualTo(String value) {
            addCriterion("suggest <=", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLike(String value) {
            addCriterion("suggest like", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotLike(String value) {
            addCriterion("suggest not like", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestIn(List<String> values) {
            addCriterion("suggest in", values, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotIn(List<String> values) {
            addCriterion("suggest not in", values, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestBetween(String value1, String value2) {
            addCriterion("suggest between", value1, value2, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotBetween(String value1, String value2) {
            addCriterion("suggest not between", value1, value2, "suggest");
            return (Criteria) this;
        }

        public Criteria andReviewedIsNull() {
            addCriterion("reviewed is null");
            return (Criteria) this;
        }

        public Criteria andReviewedIsNotNull() {
            addCriterion("reviewed is not null");
            return (Criteria) this;
        }

        public Criteria andReviewedEqualTo(Integer value) {
            addCriterion("reviewed =", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedNotEqualTo(Integer value) {
            addCriterion("reviewed <>", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedGreaterThan(Integer value) {
            addCriterion("reviewed >", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewed >=", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedLessThan(Integer value) {
            addCriterion("reviewed <", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedLessThanOrEqualTo(Integer value) {
            addCriterion("reviewed <=", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedIn(List<Integer> values) {
            addCriterion("reviewed in", values, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedNotIn(List<Integer> values) {
            addCriterion("reviewed not in", values, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedBetween(Integer value1, Integer value2) {
            addCriterion("reviewed between", value1, value2, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewed not between", value1, value2, "reviewed");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameIsNull() {
            addCriterion("professional_name is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameIsNotNull() {
            addCriterion("professional_name is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameEqualTo(String value) {
            addCriterion("professional_name =", value, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameNotEqualTo(String value) {
            addCriterion("professional_name <>", value, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameGreaterThan(String value) {
            addCriterion("professional_name >", value, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameGreaterThanOrEqualTo(String value) {
            addCriterion("professional_name >=", value, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameLessThan(String value) {
            addCriterion("professional_name <", value, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameLessThanOrEqualTo(String value) {
            addCriterion("professional_name <=", value, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameLike(String value) {
            addCriterion("professional_name like", value, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameNotLike(String value) {
            addCriterion("professional_name not like", value, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameIn(List<String> values) {
            addCriterion("professional_name in", values, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameNotIn(List<String> values) {
            addCriterion("professional_name not in", values, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameBetween(String value1, String value2) {
            addCriterion("professional_name between", value1, value2, "professionalName");
            return (Criteria) this;
        }

        public Criteria andProfessionalNameNotBetween(String value1, String value2) {
            addCriterion("professional_name not between", value1, value2, "professionalName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameIsNull() {
            addCriterion("orgnaization_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameIsNotNull() {
            addCriterion("orgnaization_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameEqualTo(String value) {
            addCriterion("orgnaization_name =", value, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameNotEqualTo(String value) {
            addCriterion("orgnaization_name <>", value, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameGreaterThan(String value) {
            addCriterion("orgnaization_name >", value, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameGreaterThanOrEqualTo(String value) {
            addCriterion("orgnaization_name >=", value, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameLessThan(String value) {
            addCriterion("orgnaization_name <", value, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameLessThanOrEqualTo(String value) {
            addCriterion("orgnaization_name <=", value, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameLike(String value) {
            addCriterion("orgnaization_name like", value, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameNotLike(String value) {
            addCriterion("orgnaization_name not like", value, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameIn(List<String> values) {
            addCriterion("orgnaization_name in", values, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameNotIn(List<String> values) {
            addCriterion("orgnaization_name not in", values, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameBetween(String value1, String value2) {
            addCriterion("orgnaization_name between", value1, value2, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationNameNotBetween(String value1, String value2) {
            addCriterion("orgnaization_name not between", value1, value2, "orgnaizationName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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