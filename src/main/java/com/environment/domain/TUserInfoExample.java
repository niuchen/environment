package com.environment.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserInfoExample() {
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

        public Criteria andI_user_idIsNull() {
            addCriterion("i_user_id is null");
            return (Criteria) this;
        }

        public Criteria andI_user_idIsNotNull() {
            addCriterion("i_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andI_user_idEqualTo(Integer value) {
            addCriterion("i_user_id =", value, "i_user_id");
            return (Criteria) this;
        }

        public Criteria andI_user_idNotEqualTo(Integer value) {
            addCriterion("i_user_id <>", value, "i_user_id");
            return (Criteria) this;
        }

        public Criteria andI_user_idGreaterThan(Integer value) {
            addCriterion("i_user_id >", value, "i_user_id");
            return (Criteria) this;
        }

        public Criteria andI_user_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_user_id >=", value, "i_user_id");
            return (Criteria) this;
        }

        public Criteria andI_user_idLessThan(Integer value) {
            addCriterion("i_user_id <", value, "i_user_id");
            return (Criteria) this;
        }

        public Criteria andI_user_idLessThanOrEqualTo(Integer value) {
            addCriterion("i_user_id <=", value, "i_user_id");
            return (Criteria) this;
        }

        public Criteria andI_user_idIn(List<Integer> values) {
            addCriterion("i_user_id in", values, "i_user_id");
            return (Criteria) this;
        }

        public Criteria andI_user_idNotIn(List<Integer> values) {
            addCriterion("i_user_id not in", values, "i_user_id");
            return (Criteria) this;
        }

        public Criteria andI_user_idBetween(Integer value1, Integer value2) {
            addCriterion("i_user_id between", value1, value2, "i_user_id");
            return (Criteria) this;
        }

        public Criteria andI_user_idNotBetween(Integer value1, Integer value2) {
            addCriterion("i_user_id not between", value1, value2, "i_user_id");
            return (Criteria) this;
        }

        public Criteria andV_user_nameIsNull() {
            addCriterion("v_user_name is null");
            return (Criteria) this;
        }

        public Criteria andV_user_nameIsNotNull() {
            addCriterion("v_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andV_user_nameEqualTo(String value) {
            addCriterion("v_user_name =", value, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameNotEqualTo(String value) {
            addCriterion("v_user_name <>", value, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameGreaterThan(String value) {
            addCriterion("v_user_name >", value, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameGreaterThanOrEqualTo(String value) {
            addCriterion("v_user_name >=", value, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameLessThan(String value) {
            addCriterion("v_user_name <", value, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameLessThanOrEqualTo(String value) {
            addCriterion("v_user_name <=", value, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameLike(String value) {
            addCriterion("v_user_name like", value, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameNotLike(String value) {
            addCriterion("v_user_name not like", value, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameIn(List<String> values) {
            addCriterion("v_user_name in", values, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameNotIn(List<String> values) {
            addCriterion("v_user_name not in", values, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameBetween(String value1, String value2) {
            addCriterion("v_user_name between", value1, value2, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_user_nameNotBetween(String value1, String value2) {
            addCriterion("v_user_name not between", value1, value2, "v_user_name");
            return (Criteria) this;
        }

        public Criteria andV_passwordIsNull() {
            addCriterion("v_password is null");
            return (Criteria) this;
        }

        public Criteria andV_passwordIsNotNull() {
            addCriterion("v_password is not null");
            return (Criteria) this;
        }

        public Criteria andV_passwordEqualTo(String value) {
            addCriterion("v_password =", value, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordNotEqualTo(String value) {
            addCriterion("v_password <>", value, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordGreaterThan(String value) {
            addCriterion("v_password >", value, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("v_password >=", value, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordLessThan(String value) {
            addCriterion("v_password <", value, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordLessThanOrEqualTo(String value) {
            addCriterion("v_password <=", value, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordLike(String value) {
            addCriterion("v_password like", value, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordNotLike(String value) {
            addCriterion("v_password not like", value, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordIn(List<String> values) {
            addCriterion("v_password in", values, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordNotIn(List<String> values) {
            addCriterion("v_password not in", values, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordBetween(String value1, String value2) {
            addCriterion("v_password between", value1, value2, "v_password");
            return (Criteria) this;
        }

        public Criteria andV_passwordNotBetween(String value1, String value2) {
            addCriterion("v_password not between", value1, value2, "v_password");
            return (Criteria) this;
        }

        public Criteria andDtm_createIsNull() {
            addCriterion("dtm_create is null");
            return (Criteria) this;
        }

        public Criteria andDtm_createIsNotNull() {
            addCriterion("dtm_create is not null");
            return (Criteria) this;
        }

        public Criteria andDtm_createEqualTo(Date value) {
            addCriterion("dtm_create =", value, "dtm_create");
            return (Criteria) this;
        }

        public Criteria andDtm_createNotEqualTo(Date value) {
            addCriterion("dtm_create <>", value, "dtm_create");
            return (Criteria) this;
        }

        public Criteria andDtm_createGreaterThan(Date value) {
            addCriterion("dtm_create >", value, "dtm_create");
            return (Criteria) this;
        }

        public Criteria andDtm_createGreaterThanOrEqualTo(Date value) {
            addCriterion("dtm_create >=", value, "dtm_create");
            return (Criteria) this;
        }

        public Criteria andDtm_createLessThan(Date value) {
            addCriterion("dtm_create <", value, "dtm_create");
            return (Criteria) this;
        }

        public Criteria andDtm_createLessThanOrEqualTo(Date value) {
            addCriterion("dtm_create <=", value, "dtm_create");
            return (Criteria) this;
        }

        public Criteria andDtm_createIn(List<Date> values) {
            addCriterion("dtm_create in", values, "dtm_create");
            return (Criteria) this;
        }

        public Criteria andDtm_createNotIn(List<Date> values) {
            addCriterion("dtm_create not in", values, "dtm_create");
            return (Criteria) this;
        }

        public Criteria andDtm_createBetween(Date value1, Date value2) {
            addCriterion("dtm_create between", value1, value2, "dtm_create");
            return (Criteria) this;
        }

        public Criteria andDtm_createNotBetween(Date value1, Date value2) {
            addCriterion("dtm_create not between", value1, value2, "dtm_create");
            return (Criteria) this;
        }

        public Criteria andI_adminIsNull() {
            addCriterion("i_admin is null");
            return (Criteria) this;
        }

        public Criteria andI_adminIsNotNull() {
            addCriterion("i_admin is not null");
            return (Criteria) this;
        }

        public Criteria andI_adminEqualTo(Integer value) {
            addCriterion("i_admin =", value, "i_admin");
            return (Criteria) this;
        }

        public Criteria andI_adminNotEqualTo(Integer value) {
            addCriterion("i_admin <>", value, "i_admin");
            return (Criteria) this;
        }

        public Criteria andI_adminGreaterThan(Integer value) {
            addCriterion("i_admin >", value, "i_admin");
            return (Criteria) this;
        }

        public Criteria andI_adminGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_admin >=", value, "i_admin");
            return (Criteria) this;
        }

        public Criteria andI_adminLessThan(Integer value) {
            addCriterion("i_admin <", value, "i_admin");
            return (Criteria) this;
        }

        public Criteria andI_adminLessThanOrEqualTo(Integer value) {
            addCriterion("i_admin <=", value, "i_admin");
            return (Criteria) this;
        }

        public Criteria andI_adminIn(List<Integer> values) {
            addCriterion("i_admin in", values, "i_admin");
            return (Criteria) this;
        }

        public Criteria andI_adminNotIn(List<Integer> values) {
            addCriterion("i_admin not in", values, "i_admin");
            return (Criteria) this;
        }

        public Criteria andI_adminBetween(Integer value1, Integer value2) {
            addCriterion("i_admin between", value1, value2, "i_admin");
            return (Criteria) this;
        }

        public Criteria andI_adminNotBetween(Integer value1, Integer value2) {
            addCriterion("i_admin not between", value1, value2, "i_admin");
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