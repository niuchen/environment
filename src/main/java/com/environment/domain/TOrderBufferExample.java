package com.environment.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOrderBufferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderBufferExample() {
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

        public Criteria andI_idIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andI_idIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andI_idEqualTo(Long value) {
            addCriterion("i_id =", value, "i_id");
            return (Criteria) this;
        }

        public Criteria andI_idNotEqualTo(Long value) {
            addCriterion("i_id <>", value, "i_id");
            return (Criteria) this;
        }

        public Criteria andI_idGreaterThan(Long value) {
            addCriterion("i_id >", value, "i_id");
            return (Criteria) this;
        }

        public Criteria andI_idGreaterThanOrEqualTo(Long value) {
            addCriterion("i_id >=", value, "i_id");
            return (Criteria) this;
        }

        public Criteria andI_idLessThan(Long value) {
            addCriterion("i_id <", value, "i_id");
            return (Criteria) this;
        }

        public Criteria andI_idLessThanOrEqualTo(Long value) {
            addCriterion("i_id <=", value, "i_id");
            return (Criteria) this;
        }

        public Criteria andI_idIn(List<Long> values) {
            addCriterion("i_id in", values, "i_id");
            return (Criteria) this;
        }

        public Criteria andI_idNotIn(List<Long> values) {
            addCriterion("i_id not in", values, "i_id");
            return (Criteria) this;
        }

        public Criteria andI_idBetween(Long value1, Long value2) {
            addCriterion("i_id between", value1, value2, "i_id");
            return (Criteria) this;
        }

        public Criteria andI_idNotBetween(Long value1, Long value2) {
            addCriterion("i_id not between", value1, value2, "i_id");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameIsNull() {
            addCriterion("v_equipment_name is null");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameIsNotNull() {
            addCriterion("v_equipment_name is not null");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameEqualTo(String value) {
            addCriterion("v_equipment_name =", value, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameNotEqualTo(String value) {
            addCriterion("v_equipment_name <>", value, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameGreaterThan(String value) {
            addCriterion("v_equipment_name >", value, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameGreaterThanOrEqualTo(String value) {
            addCriterion("v_equipment_name >=", value, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameLessThan(String value) {
            addCriterion("v_equipment_name <", value, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameLessThanOrEqualTo(String value) {
            addCriterion("v_equipment_name <=", value, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameLike(String value) {
            addCriterion("v_equipment_name like", value, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameNotLike(String value) {
            addCriterion("v_equipment_name not like", value, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameIn(List<String> values) {
            addCriterion("v_equipment_name in", values, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameNotIn(List<String> values) {
            addCriterion("v_equipment_name not in", values, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameBetween(String value1, String value2) {
            addCriterion("v_equipment_name between", value1, value2, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_equipment_nameNotBetween(String value1, String value2) {
            addCriterion("v_equipment_name not between", value1, value2, "v_equipment_name");
            return (Criteria) this;
        }

        public Criteria andV_order_contentIsNull() {
            addCriterion("v_order_content is null");
            return (Criteria) this;
        }

        public Criteria andV_order_contentIsNotNull() {
            addCriterion("v_order_content is not null");
            return (Criteria) this;
        }

        public Criteria andV_order_contentEqualTo(String value) {
            addCriterion("v_order_content =", value, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentNotEqualTo(String value) {
            addCriterion("v_order_content <>", value, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentGreaterThan(String value) {
            addCriterion("v_order_content >", value, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentGreaterThanOrEqualTo(String value) {
            addCriterion("v_order_content >=", value, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentLessThan(String value) {
            addCriterion("v_order_content <", value, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentLessThanOrEqualTo(String value) {
            addCriterion("v_order_content <=", value, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentLike(String value) {
            addCriterion("v_order_content like", value, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentNotLike(String value) {
            addCriterion("v_order_content not like", value, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentIn(List<String> values) {
            addCriterion("v_order_content in", values, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentNotIn(List<String> values) {
            addCriterion("v_order_content not in", values, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentBetween(String value1, String value2) {
            addCriterion("v_order_content between", value1, value2, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andV_order_contentNotBetween(String value1, String value2) {
            addCriterion("v_order_content not between", value1, value2, "v_order_content");
            return (Criteria) this;
        }

        public Criteria andI_send_flagIsNull() {
            addCriterion("i_send_flag is null");
            return (Criteria) this;
        }

        public Criteria andI_send_flagIsNotNull() {
            addCriterion("i_send_flag is not null");
            return (Criteria) this;
        }

        public Criteria andI_send_flagEqualTo(Integer value) {
            addCriterion("i_send_flag =", value, "i_send_flag");
            return (Criteria) this;
        }

        public Criteria andI_send_flagNotEqualTo(Integer value) {
            addCriterion("i_send_flag <>", value, "i_send_flag");
            return (Criteria) this;
        }

        public Criteria andI_send_flagGreaterThan(Integer value) {
            addCriterion("i_send_flag >", value, "i_send_flag");
            return (Criteria) this;
        }

        public Criteria andI_send_flagGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_send_flag >=", value, "i_send_flag");
            return (Criteria) this;
        }

        public Criteria andI_send_flagLessThan(Integer value) {
            addCriterion("i_send_flag <", value, "i_send_flag");
            return (Criteria) this;
        }

        public Criteria andI_send_flagLessThanOrEqualTo(Integer value) {
            addCriterion("i_send_flag <=", value, "i_send_flag");
            return (Criteria) this;
        }

        public Criteria andI_send_flagIn(List<Integer> values) {
            addCriterion("i_send_flag in", values, "i_send_flag");
            return (Criteria) this;
        }

        public Criteria andI_send_flagNotIn(List<Integer> values) {
            addCriterion("i_send_flag not in", values, "i_send_flag");
            return (Criteria) this;
        }

        public Criteria andI_send_flagBetween(Integer value1, Integer value2) {
            addCriterion("i_send_flag between", value1, value2, "i_send_flag");
            return (Criteria) this;
        }

        public Criteria andI_send_flagNotBetween(Integer value1, Integer value2) {
            addCriterion("i_send_flag not between", value1, value2, "i_send_flag");
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