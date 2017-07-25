package com.sc.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrgnaizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgnaizationExample() {
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

        public Criteria andOrgnaizationIdIsNull() {
            addCriterion("orgnaization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdIsNotNull() {
            addCriterion("orgnaization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdEqualTo(Integer value) {
            addCriterion("orgnaization_id =", value, "orgnaizationId");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdNotEqualTo(Integer value) {
            addCriterion("orgnaization_id <>", value, "orgnaizationId");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdGreaterThan(Integer value) {
            addCriterion("orgnaization_id >", value, "orgnaizationId");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgnaization_id >=", value, "orgnaizationId");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdLessThan(Integer value) {
            addCriterion("orgnaization_id <", value, "orgnaizationId");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdLessThanOrEqualTo(Integer value) {
            addCriterion("orgnaization_id <=", value, "orgnaizationId");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdIn(List<Integer> values) {
            addCriterion("orgnaization_id in", values, "orgnaizationId");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdNotIn(List<Integer> values) {
            addCriterion("orgnaization_id not in", values, "orgnaizationId");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdBetween(Integer value1, Integer value2) {
            addCriterion("orgnaization_id between", value1, value2, "orgnaizationId");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orgnaization_id not between", value1, value2, "orgnaizationId");
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

        public Criteria andOrgnaizationCodeIsNull() {
            addCriterion("orgnaization_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeIsNotNull() {
            addCriterion("orgnaization_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeEqualTo(String value) {
            addCriterion("orgnaization_code =", value, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeNotEqualTo(String value) {
            addCriterion("orgnaization_code <>", value, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeGreaterThan(String value) {
            addCriterion("orgnaization_code >", value, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("orgnaization_code >=", value, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeLessThan(String value) {
            addCriterion("orgnaization_code <", value, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeLessThanOrEqualTo(String value) {
            addCriterion("orgnaization_code <=", value, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeLike(String value) {
            addCriterion("orgnaization_code like", value, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeNotLike(String value) {
            addCriterion("orgnaization_code not like", value, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeIn(List<String> values) {
            addCriterion("orgnaization_code in", values, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeNotIn(List<String> values) {
            addCriterion("orgnaization_code not in", values, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeBetween(String value1, String value2) {
            addCriterion("orgnaization_code between", value1, value2, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationCodeNotBetween(String value1, String value2) {
            addCriterion("orgnaization_code not between", value1, value2, "orgnaizationCode");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeIsNull() {
            addCriterion("orgnaization_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeIsNotNull() {
            addCriterion("orgnaization_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeEqualTo(Integer value) {
            addCriterion("orgnaization_type =", value, "orgnaizationType");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeNotEqualTo(Integer value) {
            addCriterion("orgnaization_type <>", value, "orgnaizationType");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeGreaterThan(Integer value) {
            addCriterion("orgnaization_type >", value, "orgnaizationType");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgnaization_type >=", value, "orgnaizationType");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeLessThan(Integer value) {
            addCriterion("orgnaization_type <", value, "orgnaizationType");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("orgnaization_type <=", value, "orgnaizationType");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeIn(List<Integer> values) {
            addCriterion("orgnaization_type in", values, "orgnaizationType");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeNotIn(List<Integer> values) {
            addCriterion("orgnaization_type not in", values, "orgnaizationType");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeBetween(Integer value1, Integer value2) {
            addCriterion("orgnaization_type between", value1, value2, "orgnaizationType");
            return (Criteria) this;
        }

        public Criteria andOrgnaizationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orgnaization_type not between", value1, value2, "orgnaizationType");
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