package com.environment.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TEquipmentProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEquipmentProjectExample() {
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

        public Criteria andV_project_nameIsNull() {
            addCriterion("v_project_name is null");
            return (Criteria) this;
        }

        public Criteria andV_project_nameIsNotNull() {
            addCriterion("v_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andV_project_nameEqualTo(String value) {
            addCriterion("v_project_name =", value, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameNotEqualTo(String value) {
            addCriterion("v_project_name <>", value, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameGreaterThan(String value) {
            addCriterion("v_project_name >", value, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameGreaterThanOrEqualTo(String value) {
            addCriterion("v_project_name >=", value, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameLessThan(String value) {
            addCriterion("v_project_name <", value, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameLessThanOrEqualTo(String value) {
            addCriterion("v_project_name <=", value, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameLike(String value) {
            addCriterion("v_project_name like", value, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameNotLike(String value) {
            addCriterion("v_project_name not like", value, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameIn(List<String> values) {
            addCriterion("v_project_name in", values, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameNotIn(List<String> values) {
            addCriterion("v_project_name not in", values, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameBetween(String value1, String value2) {
            addCriterion("v_project_name between", value1, value2, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_project_nameNotBetween(String value1, String value2) {
            addCriterion("v_project_name not between", value1, value2, "v_project_name");
            return (Criteria) this;
        }

        public Criteria andV_urlIsNull() {
            addCriterion("v_url is null");
            return (Criteria) this;
        }

        public Criteria andV_urlIsNotNull() {
            addCriterion("v_url is not null");
            return (Criteria) this;
        }

        public Criteria andV_urlEqualTo(String value) {
            addCriterion("v_url =", value, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlNotEqualTo(String value) {
            addCriterion("v_url <>", value, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlGreaterThan(String value) {
            addCriterion("v_url >", value, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlGreaterThanOrEqualTo(String value) {
            addCriterion("v_url >=", value, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlLessThan(String value) {
            addCriterion("v_url <", value, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlLessThanOrEqualTo(String value) {
            addCriterion("v_url <=", value, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlLike(String value) {
            addCriterion("v_url like", value, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlNotLike(String value) {
            addCriterion("v_url not like", value, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlIn(List<String> values) {
            addCriterion("v_url in", values, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlNotIn(List<String> values) {
            addCriterion("v_url not in", values, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlBetween(String value1, String value2) {
            addCriterion("v_url between", value1, value2, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_urlNotBetween(String value1, String value2) {
            addCriterion("v_url not between", value1, value2, "v_url");
            return (Criteria) this;
        }

        public Criteria andV_systemIsNull() {
            addCriterion("v_system is null");
            return (Criteria) this;
        }

        public Criteria andV_systemIsNotNull() {
            addCriterion("v_system is not null");
            return (Criteria) this;
        }

        public Criteria andV_systemEqualTo(String value) {
            addCriterion("v_system =", value, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemNotEqualTo(String value) {
            addCriterion("v_system <>", value, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemGreaterThan(String value) {
            addCriterion("v_system >", value, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemGreaterThanOrEqualTo(String value) {
            addCriterion("v_system >=", value, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemLessThan(String value) {
            addCriterion("v_system <", value, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemLessThanOrEqualTo(String value) {
            addCriterion("v_system <=", value, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemLike(String value) {
            addCriterion("v_system like", value, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemNotLike(String value) {
            addCriterion("v_system not like", value, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemIn(List<String> values) {
            addCriterion("v_system in", values, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemNotIn(List<String> values) {
            addCriterion("v_system not in", values, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemBetween(String value1, String value2) {
            addCriterion("v_system between", value1, value2, "v_system");
            return (Criteria) this;
        }

        public Criteria andV_systemNotBetween(String value1, String value2) {
            addCriterion("v_system not between", value1, value2, "v_system");
            return (Criteria) this;
        }

        public Criteria andDtm_addIsNull() {
            addCriterion("dtm_add is null");
            return (Criteria) this;
        }

        public Criteria andDtm_addIsNotNull() {
            addCriterion("dtm_add is not null");
            return (Criteria) this;
        }

        public Criteria andDtm_addEqualTo(Date value) {
            addCriterion("dtm_add =", value, "dtm_add");
            return (Criteria) this;
        }

        public Criteria andDtm_addNotEqualTo(Date value) {
            addCriterion("dtm_add <>", value, "dtm_add");
            return (Criteria) this;
        }

        public Criteria andDtm_addGreaterThan(Date value) {
            addCriterion("dtm_add >", value, "dtm_add");
            return (Criteria) this;
        }

        public Criteria andDtm_addGreaterThanOrEqualTo(Date value) {
            addCriterion("dtm_add >=", value, "dtm_add");
            return (Criteria) this;
        }

        public Criteria andDtm_addLessThan(Date value) {
            addCriterion("dtm_add <", value, "dtm_add");
            return (Criteria) this;
        }

        public Criteria andDtm_addLessThanOrEqualTo(Date value) {
            addCriterion("dtm_add <=", value, "dtm_add");
            return (Criteria) this;
        }

        public Criteria andDtm_addIn(List<Date> values) {
            addCriterion("dtm_add in", values, "dtm_add");
            return (Criteria) this;
        }

        public Criteria andDtm_addNotIn(List<Date> values) {
            addCriterion("dtm_add not in", values, "dtm_add");
            return (Criteria) this;
        }

        public Criteria andDtm_addBetween(Date value1, Date value2) {
            addCriterion("dtm_add between", value1, value2, "dtm_add");
            return (Criteria) this;
        }

        public Criteria andDtm_addNotBetween(Date value1, Date value2) {
            addCriterion("dtm_add not between", value1, value2, "dtm_add");
            return (Criteria) this;
        }

        public Criteria andI_system_idIsNull() {
            addCriterion("i_system_id is null");
            return (Criteria) this;
        }

        public Criteria andI_system_idIsNotNull() {
            addCriterion("i_system_id is not null");
            return (Criteria) this;
        }

        public Criteria andI_system_idEqualTo(Integer value) {
            addCriterion("i_system_id =", value, "i_system_id");
            return (Criteria) this;
        }

        public Criteria andI_system_idNotEqualTo(Integer value) {
            addCriterion("i_system_id <>", value, "i_system_id");
            return (Criteria) this;
        }

        public Criteria andI_system_idGreaterThan(Integer value) {
            addCriterion("i_system_id >", value, "i_system_id");
            return (Criteria) this;
        }

        public Criteria andI_system_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_system_id >=", value, "i_system_id");
            return (Criteria) this;
        }

        public Criteria andI_system_idLessThan(Integer value) {
            addCriterion("i_system_id <", value, "i_system_id");
            return (Criteria) this;
        }

        public Criteria andI_system_idLessThanOrEqualTo(Integer value) {
            addCriterion("i_system_id <=", value, "i_system_id");
            return (Criteria) this;
        }

        public Criteria andI_system_idIn(List<Integer> values) {
            addCriterion("i_system_id in", values, "i_system_id");
            return (Criteria) this;
        }

        public Criteria andI_system_idNotIn(List<Integer> values) {
            addCriterion("i_system_id not in", values, "i_system_id");
            return (Criteria) this;
        }

        public Criteria andI_system_idBetween(Integer value1, Integer value2) {
            addCriterion("i_system_id between", value1, value2, "i_system_id");
            return (Criteria) this;
        }

        public Criteria andI_system_idNotBetween(Integer value1, Integer value2) {
            addCriterion("i_system_id not between", value1, value2, "i_system_id");
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