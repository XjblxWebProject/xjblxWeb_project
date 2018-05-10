package com.xjblx.po;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireCreateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionnaireCreateExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameIsNull() {
            addCriterion("questionnair_name is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameIsNotNull() {
            addCriterion("questionnair_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameEqualTo(String value) {
            addCriterion("questionnair_name =", value, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameNotEqualTo(String value) {
            addCriterion("questionnair_name <>", value, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameGreaterThan(String value) {
            addCriterion("questionnair_name >", value, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameGreaterThanOrEqualTo(String value) {
            addCriterion("questionnair_name >=", value, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameLessThan(String value) {
            addCriterion("questionnair_name <", value, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameLessThanOrEqualTo(String value) {
            addCriterion("questionnair_name <=", value, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameLike(String value) {
            addCriterion("questionnair_name like", value, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameNotLike(String value) {
            addCriterion("questionnair_name not like", value, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameIn(List<String> values) {
            addCriterion("questionnair_name in", values, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameNotIn(List<String> values) {
            addCriterion("questionnair_name not in", values, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameBetween(String value1, String value2) {
            addCriterion("questionnair_name between", value1, value2, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairNameNotBetween(String value1, String value2) {
            addCriterion("questionnair_name not between", value1, value2, "questionnairName");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionIsNull() {
            addCriterion("questionnair_question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionIsNotNull() {
            addCriterion("questionnair_question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionEqualTo(String value) {
            addCriterion("questionnair_question =", value, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionNotEqualTo(String value) {
            addCriterion("questionnair_question <>", value, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionGreaterThan(String value) {
            addCriterion("questionnair_question >", value, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("questionnair_question >=", value, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionLessThan(String value) {
            addCriterion("questionnair_question <", value, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionLessThanOrEqualTo(String value) {
            addCriterion("questionnair_question <=", value, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionLike(String value) {
            addCriterion("questionnair_question like", value, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionNotLike(String value) {
            addCriterion("questionnair_question not like", value, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionIn(List<String> values) {
            addCriterion("questionnair_question in", values, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionNotIn(List<String> values) {
            addCriterion("questionnair_question not in", values, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionBetween(String value1, String value2) {
            addCriterion("questionnair_question between", value1, value2, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairQuestionNotBetween(String value1, String value2) {
            addCriterion("questionnair_question not between", value1, value2, "questionnairQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceIsNull() {
            addCriterion("questionnair_choice is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceIsNotNull() {
            addCriterion("questionnair_choice is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceEqualTo(String value) {
            addCriterion("questionnair_choice =", value, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceNotEqualTo(String value) {
            addCriterion("questionnair_choice <>", value, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceGreaterThan(String value) {
            addCriterion("questionnair_choice >", value, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceGreaterThanOrEqualTo(String value) {
            addCriterion("questionnair_choice >=", value, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceLessThan(String value) {
            addCriterion("questionnair_choice <", value, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceLessThanOrEqualTo(String value) {
            addCriterion("questionnair_choice <=", value, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceLike(String value) {
            addCriterion("questionnair_choice like", value, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceNotLike(String value) {
            addCriterion("questionnair_choice not like", value, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceIn(List<String> values) {
            addCriterion("questionnair_choice in", values, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceNotIn(List<String> values) {
            addCriterion("questionnair_choice not in", values, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceBetween(String value1, String value2) {
            addCriterion("questionnair_choice between", value1, value2, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairChoiceNotBetween(String value1, String value2) {
            addCriterion("questionnair_choice not between", value1, value2, "questionnairChoice");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeIsNull() {
            addCriterion("questionnair_type is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeIsNotNull() {
            addCriterion("questionnair_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeEqualTo(Integer value) {
            addCriterion("questionnair_type =", value, "questionnairType");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeNotEqualTo(Integer value) {
            addCriterion("questionnair_type <>", value, "questionnairType");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeGreaterThan(Integer value) {
            addCriterion("questionnair_type >", value, "questionnairType");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionnair_type >=", value, "questionnairType");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeLessThan(Integer value) {
            addCriterion("questionnair_type <", value, "questionnairType");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeLessThanOrEqualTo(Integer value) {
            addCriterion("questionnair_type <=", value, "questionnairType");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeIn(List<Integer> values) {
            addCriterion("questionnair_type in", values, "questionnairType");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeNotIn(List<Integer> values) {
            addCriterion("questionnair_type not in", values, "questionnairType");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeBetween(Integer value1, Integer value2) {
            addCriterion("questionnair_type between", value1, value2, "questionnairType");
            return (Criteria) this;
        }

        public Criteria andQuestionnairTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("questionnair_type not between", value1, value2, "questionnairType");
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