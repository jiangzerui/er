package com.sc.pojo;

import java.util.ArrayList;
import java.util.List;

public class GuideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuideExample() {
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

        public Criteria andGuideIdIsNull() {
            addCriterion("guide_id is null");
            return (Criteria) this;
        }

        public Criteria andGuideIdIsNotNull() {
            addCriterion("guide_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuideIdEqualTo(Integer value) {
            addCriterion("guide_id =", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotEqualTo(Integer value) {
            addCriterion("guide_id <>", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThan(Integer value) {
            addCriterion("guide_id >", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guide_id >=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThan(Integer value) {
            addCriterion("guide_id <", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThanOrEqualTo(Integer value) {
            addCriterion("guide_id <=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdIn(List<Integer> values) {
            addCriterion("guide_id in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotIn(List<Integer> values) {
            addCriterion("guide_id not in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdBetween(Integer value1, Integer value2) {
            addCriterion("guide_id between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guide_id not between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideNameIsNull() {
            addCriterion("guide_name is null");
            return (Criteria) this;
        }

        public Criteria andGuideNameIsNotNull() {
            addCriterion("guide_name is not null");
            return (Criteria) this;
        }

        public Criteria andGuideNameEqualTo(String value) {
            addCriterion("guide_name =", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotEqualTo(String value) {
            addCriterion("guide_name <>", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameGreaterThan(String value) {
            addCriterion("guide_name >", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameGreaterThanOrEqualTo(String value) {
            addCriterion("guide_name >=", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameLessThan(String value) {
            addCriterion("guide_name <", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameLessThanOrEqualTo(String value) {
            addCriterion("guide_name <=", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameLike(String value) {
            addCriterion("guide_name like", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotLike(String value) {
            addCriterion("guide_name not like", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameIn(List<String> values) {
            addCriterion("guide_name in", values, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotIn(List<String> values) {
            addCriterion("guide_name not in", values, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameBetween(String value1, String value2) {
            addCriterion("guide_name between", value1, value2, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotBetween(String value1, String value2) {
            addCriterion("guide_name not between", value1, value2, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideUrlIsNull() {
            addCriterion("guide_url is null");
            return (Criteria) this;
        }

        public Criteria andGuideUrlIsNotNull() {
            addCriterion("guide_url is not null");
            return (Criteria) this;
        }

        public Criteria andGuideUrlEqualTo(String value) {
            addCriterion("guide_url =", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlNotEqualTo(String value) {
            addCriterion("guide_url <>", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlGreaterThan(String value) {
            addCriterion("guide_url >", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlGreaterThanOrEqualTo(String value) {
            addCriterion("guide_url >=", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlLessThan(String value) {
            addCriterion("guide_url <", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlLessThanOrEqualTo(String value) {
            addCriterion("guide_url <=", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlLike(String value) {
            addCriterion("guide_url like", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlNotLike(String value) {
            addCriterion("guide_url not like", value, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlIn(List<String> values) {
            addCriterion("guide_url in", values, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlNotIn(List<String> values) {
            addCriterion("guide_url not in", values, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlBetween(String value1, String value2) {
            addCriterion("guide_url between", value1, value2, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideUrlNotBetween(String value1, String value2) {
            addCriterion("guide_url not between", value1, value2, "guideUrl");
            return (Criteria) this;
        }

        public Criteria andGuideCodeIsNull() {
            addCriterion("guide_code is null");
            return (Criteria) this;
        }

        public Criteria andGuideCodeIsNotNull() {
            addCriterion("guide_code is not null");
            return (Criteria) this;
        }

        public Criteria andGuideCodeEqualTo(String value) {
            addCriterion("guide_code =", value, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeNotEqualTo(String value) {
            addCriterion("guide_code <>", value, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeGreaterThan(String value) {
            addCriterion("guide_code >", value, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeGreaterThanOrEqualTo(String value) {
            addCriterion("guide_code >=", value, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeLessThan(String value) {
            addCriterion("guide_code <", value, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeLessThanOrEqualTo(String value) {
            addCriterion("guide_code <=", value, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeLike(String value) {
            addCriterion("guide_code like", value, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeNotLike(String value) {
            addCriterion("guide_code not like", value, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeIn(List<String> values) {
            addCriterion("guide_code in", values, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeNotIn(List<String> values) {
            addCriterion("guide_code not in", values, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeBetween(String value1, String value2) {
            addCriterion("guide_code between", value1, value2, "guideCode");
            return (Criteria) this;
        }

        public Criteria andGuideCodeNotBetween(String value1, String value2) {
            addCriterion("guide_code not between", value1, value2, "guideCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("project_code is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("project_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("project_code =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("project_code <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("project_code >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("project_code >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("project_code <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("project_code <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("project_code like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("project_code not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("project_code in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("project_code not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("project_code between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("project_code not between", value1, value2, "projectCode");
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