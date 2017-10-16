package com.environment.domain;

import java.util.ArrayList;
import java.util.List;

public class TWindDirectDicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWindDirectDicExample() {
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

        public Criteria andI_wind_direct_idIsNull() {
            addCriterion("i_wind_direct_id is null");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idIsNotNull() {
            addCriterion("i_wind_direct_id is not null");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idEqualTo(Integer value) {
            addCriterion("i_wind_direct_id =", value, "i_wind_direct_id");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idNotEqualTo(Integer value) {
            addCriterion("i_wind_direct_id <>", value, "i_wind_direct_id");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idGreaterThan(Integer value) {
            addCriterion("i_wind_direct_id >", value, "i_wind_direct_id");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_wind_direct_id >=", value, "i_wind_direct_id");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idLessThan(Integer value) {
            addCriterion("i_wind_direct_id <", value, "i_wind_direct_id");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idLessThanOrEqualTo(Integer value) {
            addCriterion("i_wind_direct_id <=", value, "i_wind_direct_id");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idIn(List<Integer> values) {
            addCriterion("i_wind_direct_id in", values, "i_wind_direct_id");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idNotIn(List<Integer> values) {
            addCriterion("i_wind_direct_id not in", values, "i_wind_direct_id");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idBetween(Integer value1, Integer value2) {
            addCriterion("i_wind_direct_id between", value1, value2, "i_wind_direct_id");
            return (Criteria) this;
        }

        public Criteria andI_wind_direct_idNotBetween(Integer value1, Integer value2) {
            addCriterion("i_wind_direct_id not between", value1, value2, "i_wind_direct_id");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameIsNull() {
            addCriterion("v_wind_direct_name is null");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameIsNotNull() {
            addCriterion("v_wind_direct_name is not null");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameEqualTo(String value) {
            addCriterion("v_wind_direct_name =", value, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameNotEqualTo(String value) {
            addCriterion("v_wind_direct_name <>", value, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameGreaterThan(String value) {
            addCriterion("v_wind_direct_name >", value, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameGreaterThanOrEqualTo(String value) {
            addCriterion("v_wind_direct_name >=", value, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameLessThan(String value) {
            addCriterion("v_wind_direct_name <", value, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameLessThanOrEqualTo(String value) {
            addCriterion("v_wind_direct_name <=", value, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameLike(String value) {
            addCriterion("v_wind_direct_name like", value, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameNotLike(String value) {
            addCriterion("v_wind_direct_name not like", value, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameIn(List<String> values) {
            addCriterion("v_wind_direct_name in", values, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameNotIn(List<String> values) {
            addCriterion("v_wind_direct_name not in", values, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameBetween(String value1, String value2) {
            addCriterion("v_wind_direct_name between", value1, value2, "v_wind_direct_name");
            return (Criteria) this;
        }

        public Criteria andV_wind_direct_nameNotBetween(String value1, String value2) {
            addCriterion("v_wind_direct_name not between", value1, value2, "v_wind_direct_name");
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