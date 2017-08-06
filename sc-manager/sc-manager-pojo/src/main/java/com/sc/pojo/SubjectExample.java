package com.sc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectExample() {
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

        public Criteria andSubjectCodeIsNull() {
            addCriterion("subject_code is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeIsNotNull() {
            addCriterion("subject_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeEqualTo(String value) {
            addCriterion("subject_code =", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotEqualTo(String value) {
            addCriterion("subject_code <>", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeGreaterThan(String value) {
            addCriterion("subject_code >", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("subject_code >=", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLessThan(String value) {
            addCriterion("subject_code <", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLessThanOrEqualTo(String value) {
            addCriterion("subject_code <=", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLike(String value) {
            addCriterion("subject_code like", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotLike(String value) {
            addCriterion("subject_code not like", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeIn(List<String> values) {
            addCriterion("subject_code in", values, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotIn(List<String> values) {
            addCriterion("subject_code not in", values, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeBetween(String value1, String value2) {
            addCriterion("subject_code between", value1, value2, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotBetween(String value1, String value2) {
            addCriterion("subject_code not between", value1, value2, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIsNull() {
            addCriterion("subject_status is null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIsNotNull() {
            addCriterion("subject_status is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusEqualTo(Integer value) {
            addCriterion("subject_status =", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNotEqualTo(Integer value) {
            addCriterion("subject_status <>", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusGreaterThan(Integer value) {
            addCriterion("subject_status >", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_status >=", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusLessThan(Integer value) {
            addCriterion("subject_status <", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusLessThanOrEqualTo(Integer value) {
            addCriterion("subject_status <=", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIn(List<Integer> values) {
            addCriterion("subject_status in", values, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNotIn(List<Integer> values) {
            addCriterion("subject_status not in", values, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusBetween(Integer value1, Integer value2) {
            addCriterion("subject_status between", value1, value2, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_status not between", value1, value2, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNull() {
            addCriterion("pm_id is null");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNotNull() {
            addCriterion("pm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPmIdEqualTo(Integer value) {
            addCriterion("pm_id =", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotEqualTo(Integer value) {
            addCriterion("pm_id <>", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThan(Integer value) {
            addCriterion("pm_id >", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_id >=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThan(Integer value) {
            addCriterion("pm_id <", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThanOrEqualTo(Integer value) {
            addCriterion("pm_id <=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdIn(List<Integer> values) {
            addCriterion("pm_id in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotIn(List<Integer> values) {
            addCriterion("pm_id not in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdBetween(Integer value1, Integer value2) {
            addCriterion("pm_id between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_id not between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmSuggestIsNull() {
            addCriterion("pm_suggest is null");
            return (Criteria) this;
        }

        public Criteria andPmSuggestIsNotNull() {
            addCriterion("pm_suggest is not null");
            return (Criteria) this;
        }

        public Criteria andPmSuggestEqualTo(String value) {
            addCriterion("pm_suggest =", value, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestNotEqualTo(String value) {
            addCriterion("pm_suggest <>", value, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestGreaterThan(String value) {
            addCriterion("pm_suggest >", value, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("pm_suggest >=", value, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestLessThan(String value) {
            addCriterion("pm_suggest <", value, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestLessThanOrEqualTo(String value) {
            addCriterion("pm_suggest <=", value, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestLike(String value) {
            addCriterion("pm_suggest like", value, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestNotLike(String value) {
            addCriterion("pm_suggest not like", value, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestIn(List<String> values) {
            addCriterion("pm_suggest in", values, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestNotIn(List<String> values) {
            addCriterion("pm_suggest not in", values, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestBetween(String value1, String value2) {
            addCriterion("pm_suggest between", value1, value2, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andPmSuggestNotBetween(String value1, String value2) {
            addCriterion("pm_suggest not between", value1, value2, "pmSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdIsNull() {
            addCriterion("professional_id is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdIsNotNull() {
            addCriterion("professional_id is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdEqualTo(Integer value) {
            addCriterion("professional_id =", value, "professionalId");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdNotEqualTo(Integer value) {
            addCriterion("professional_id <>", value, "professionalId");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdGreaterThan(Integer value) {
            addCriterion("professional_id >", value, "professionalId");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("professional_id >=", value, "professionalId");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdLessThan(Integer value) {
            addCriterion("professional_id <", value, "professionalId");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdLessThanOrEqualTo(Integer value) {
            addCriterion("professional_id <=", value, "professionalId");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdIn(List<Integer> values) {
            addCriterion("professional_id in", values, "professionalId");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdNotIn(List<Integer> values) {
            addCriterion("professional_id not in", values, "professionalId");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdBetween(Integer value1, Integer value2) {
            addCriterion("professional_id between", value1, value2, "professionalId");
            return (Criteria) this;
        }

        public Criteria andProfessionalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("professional_id not between", value1, value2, "professionalId");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestIsNull() {
            addCriterion("professional_suggest is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestIsNotNull() {
            addCriterion("professional_suggest is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestEqualTo(String value) {
            addCriterion("professional_suggest =", value, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestNotEqualTo(String value) {
            addCriterion("professional_suggest <>", value, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestGreaterThan(String value) {
            addCriterion("professional_suggest >", value, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("professional_suggest >=", value, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestLessThan(String value) {
            addCriterion("professional_suggest <", value, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestLessThanOrEqualTo(String value) {
            addCriterion("professional_suggest <=", value, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestLike(String value) {
            addCriterion("professional_suggest like", value, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestNotLike(String value) {
            addCriterion("professional_suggest not like", value, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestIn(List<String> values) {
            addCriterion("professional_suggest in", values, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestNotIn(List<String> values) {
            addCriterion("professional_suggest not in", values, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestBetween(String value1, String value2) {
            addCriterion("professional_suggest between", value1, value2, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andProfessionalSuggestNotBetween(String value1, String value2) {
            addCriterion("professional_suggest not between", value1, value2, "professionalSuggest");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andSubjectFileIsNull() {
            addCriterion("subject_file is null");
            return (Criteria) this;
        }

        public Criteria andSubjectFileIsNotNull() {
            addCriterion("subject_file is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectFileEqualTo(String value) {
            addCriterion("subject_file =", value, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileNotEqualTo(String value) {
            addCriterion("subject_file <>", value, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileGreaterThan(String value) {
            addCriterion("subject_file >", value, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileGreaterThanOrEqualTo(String value) {
            addCriterion("subject_file >=", value, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileLessThan(String value) {
            addCriterion("subject_file <", value, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileLessThanOrEqualTo(String value) {
            addCriterion("subject_file <=", value, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileLike(String value) {
            addCriterion("subject_file like", value, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileNotLike(String value) {
            addCriterion("subject_file not like", value, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileIn(List<String> values) {
            addCriterion("subject_file in", values, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileNotIn(List<String> values) {
            addCriterion("subject_file not in", values, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileBetween(String value1, String value2) {
            addCriterion("subject_file between", value1, value2, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andSubjectFileNotBetween(String value1, String value2) {
            addCriterion("subject_file not between", value1, value2, "subjectFile");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusIsNull() {
            addCriterion("pm_check_status is null");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusIsNotNull() {
            addCriterion("pm_check_status is not null");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusEqualTo(Integer value) {
            addCriterion("pm_check_status =", value, "pmCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusNotEqualTo(Integer value) {
            addCriterion("pm_check_status <>", value, "pmCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusGreaterThan(Integer value) {
            addCriterion("pm_check_status >", value, "pmCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_check_status >=", value, "pmCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusLessThan(Integer value) {
            addCriterion("pm_check_status <", value, "pmCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pm_check_status <=", value, "pmCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusIn(List<Integer> values) {
            addCriterion("pm_check_status in", values, "pmCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusNotIn(List<Integer> values) {
            addCriterion("pm_check_status not in", values, "pmCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("pm_check_status between", value1, value2, "pmCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPmCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_check_status not between", value1, value2, "pmCheckStatus");
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