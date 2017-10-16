package com.environment.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TEquipmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEquipmentInfoExample() {
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

        public Criteria andI_equipment_idIsNull() {
            addCriterion("i_equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idIsNotNull() {
            addCriterion("i_equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idEqualTo(Integer value) {
            addCriterion("i_equipment_id =", value, "i_equipment_id");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idNotEqualTo(Integer value) {
            addCriterion("i_equipment_id <>", value, "i_equipment_id");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idGreaterThan(Integer value) {
            addCriterion("i_equipment_id >", value, "i_equipment_id");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_equipment_id >=", value, "i_equipment_id");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idLessThan(Integer value) {
            addCriterion("i_equipment_id <", value, "i_equipment_id");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idLessThanOrEqualTo(Integer value) {
            addCriterion("i_equipment_id <=", value, "i_equipment_id");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idIn(List<Integer> values) {
            addCriterion("i_equipment_id in", values, "i_equipment_id");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idNotIn(List<Integer> values) {
            addCriterion("i_equipment_id not in", values, "i_equipment_id");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idBetween(Integer value1, Integer value2) {
            addCriterion("i_equipment_id between", value1, value2, "i_equipment_id");
            return (Criteria) this;
        }

        public Criteria andI_equipment_idNotBetween(Integer value1, Integer value2) {
            addCriterion("i_equipment_id not between", value1, value2, "i_equipment_id");
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

        public Criteria andV_equipment_typeIsNull() {
            addCriterion("v_equipment_type is null");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeIsNotNull() {
            addCriterion("v_equipment_type is not null");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeEqualTo(String value) {
            addCriterion("v_equipment_type =", value, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeNotEqualTo(String value) {
            addCriterion("v_equipment_type <>", value, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeGreaterThan(String value) {
            addCriterion("v_equipment_type >", value, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeGreaterThanOrEqualTo(String value) {
            addCriterion("v_equipment_type >=", value, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeLessThan(String value) {
            addCriterion("v_equipment_type <", value, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeLessThanOrEqualTo(String value) {
            addCriterion("v_equipment_type <=", value, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeLike(String value) {
            addCriterion("v_equipment_type like", value, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeNotLike(String value) {
            addCriterion("v_equipment_type not like", value, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeIn(List<String> values) {
            addCriterion("v_equipment_type in", values, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeNotIn(List<String> values) {
            addCriterion("v_equipment_type not in", values, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeBetween(String value1, String value2) {
            addCriterion("v_equipment_type between", value1, value2, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andV_equipment_typeNotBetween(String value1, String value2) {
            addCriterion("v_equipment_type not between", value1, value2, "v_equipment_type");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idIsNull() {
            addCriterion("i_euiqpment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idIsNotNull() {
            addCriterion("i_euiqpment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idEqualTo(Integer value) {
            addCriterion("i_euiqpment_type_id =", value, "i_euiqpment_type_id");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idNotEqualTo(Integer value) {
            addCriterion("i_euiqpment_type_id <>", value, "i_euiqpment_type_id");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idGreaterThan(Integer value) {
            addCriterion("i_euiqpment_type_id >", value, "i_euiqpment_type_id");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_euiqpment_type_id >=", value, "i_euiqpment_type_id");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idLessThan(Integer value) {
            addCriterion("i_euiqpment_type_id <", value, "i_euiqpment_type_id");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idLessThanOrEqualTo(Integer value) {
            addCriterion("i_euiqpment_type_id <=", value, "i_euiqpment_type_id");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idIn(List<Integer> values) {
            addCriterion("i_euiqpment_type_id in", values, "i_euiqpment_type_id");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idNotIn(List<Integer> values) {
            addCriterion("i_euiqpment_type_id not in", values, "i_euiqpment_type_id");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idBetween(Integer value1, Integer value2) {
            addCriterion("i_euiqpment_type_id between", value1, value2, "i_euiqpment_type_id");
            return (Criteria) this;
        }

        public Criteria andI_euiqpment_type_idNotBetween(Integer value1, Integer value2) {
            addCriterion("i_euiqpment_type_id not between", value1, value2, "i_euiqpment_type_id");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeIsNull() {
            addCriterion("v_equipment_check_code is null");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeIsNotNull() {
            addCriterion("v_equipment_check_code is not null");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeEqualTo(String value) {
            addCriterion("v_equipment_check_code =", value, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeNotEqualTo(String value) {
            addCriterion("v_equipment_check_code <>", value, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeGreaterThan(String value) {
            addCriterion("v_equipment_check_code >", value, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeGreaterThanOrEqualTo(String value) {
            addCriterion("v_equipment_check_code >=", value, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeLessThan(String value) {
            addCriterion("v_equipment_check_code <", value, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeLessThanOrEqualTo(String value) {
            addCriterion("v_equipment_check_code <=", value, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeLike(String value) {
            addCriterion("v_equipment_check_code like", value, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeNotLike(String value) {
            addCriterion("v_equipment_check_code not like", value, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeIn(List<String> values) {
            addCriterion("v_equipment_check_code in", values, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeNotIn(List<String> values) {
            addCriterion("v_equipment_check_code not in", values, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeBetween(String value1, String value2) {
            addCriterion("v_equipment_check_code between", value1, value2, "v_equipment_check_code");
            return (Criteria) this;
        }

        public Criteria andV_equipment_check_codeNotBetween(String value1, String value2) {
            addCriterion("v_equipment_check_code not between", value1, value2, "v_equipment_check_code");
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

        public Criteria andV_companyIsNull() {
            addCriterion("v_company is null");
            return (Criteria) this;
        }

        public Criteria andV_companyIsNotNull() {
            addCriterion("v_company is not null");
            return (Criteria) this;
        }

        public Criteria andV_companyEqualTo(String value) {
            addCriterion("v_company =", value, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyNotEqualTo(String value) {
            addCriterion("v_company <>", value, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyGreaterThan(String value) {
            addCriterion("v_company >", value, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyGreaterThanOrEqualTo(String value) {
            addCriterion("v_company >=", value, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyLessThan(String value) {
            addCriterion("v_company <", value, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyLessThanOrEqualTo(String value) {
            addCriterion("v_company <=", value, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyLike(String value) {
            addCriterion("v_company like", value, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyNotLike(String value) {
            addCriterion("v_company not like", value, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyIn(List<String> values) {
            addCriterion("v_company in", values, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyNotIn(List<String> values) {
            addCriterion("v_company not in", values, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyBetween(String value1, String value2) {
            addCriterion("v_company between", value1, value2, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_companyNotBetween(String value1, String value2) {
            addCriterion("v_company not between", value1, value2, "v_company");
            return (Criteria) this;
        }

        public Criteria andV_phoneIsNull() {
            addCriterion("v_phone is null");
            return (Criteria) this;
        }

        public Criteria andV_phoneIsNotNull() {
            addCriterion("v_phone is not null");
            return (Criteria) this;
        }

        public Criteria andV_phoneEqualTo(String value) {
            addCriterion("v_phone =", value, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneNotEqualTo(String value) {
            addCriterion("v_phone <>", value, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneGreaterThan(String value) {
            addCriterion("v_phone >", value, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("v_phone >=", value, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneLessThan(String value) {
            addCriterion("v_phone <", value, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneLessThanOrEqualTo(String value) {
            addCriterion("v_phone <=", value, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneLike(String value) {
            addCriterion("v_phone like", value, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneNotLike(String value) {
            addCriterion("v_phone not like", value, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneIn(List<String> values) {
            addCriterion("v_phone in", values, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneNotIn(List<String> values) {
            addCriterion("v_phone not in", values, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneBetween(String value1, String value2) {
            addCriterion("v_phone between", value1, value2, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_phoneNotBetween(String value1, String value2) {
            addCriterion("v_phone not between", value1, value2, "v_phone");
            return (Criteria) this;
        }

        public Criteria andV_addressIsNull() {
            addCriterion("v_address is null");
            return (Criteria) this;
        }

        public Criteria andV_addressIsNotNull() {
            addCriterion("v_address is not null");
            return (Criteria) this;
        }

        public Criteria andV_addressEqualTo(String value) {
            addCriterion("v_address =", value, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressNotEqualTo(String value) {
            addCriterion("v_address <>", value, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressGreaterThan(String value) {
            addCriterion("v_address >", value, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressGreaterThanOrEqualTo(String value) {
            addCriterion("v_address >=", value, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressLessThan(String value) {
            addCriterion("v_address <", value, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressLessThanOrEqualTo(String value) {
            addCriterion("v_address <=", value, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressLike(String value) {
            addCriterion("v_address like", value, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressNotLike(String value) {
            addCriterion("v_address not like", value, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressIn(List<String> values) {
            addCriterion("v_address in", values, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressNotIn(List<String> values) {
            addCriterion("v_address not in", values, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressBetween(String value1, String value2) {
            addCriterion("v_address between", value1, value2, "v_address");
            return (Criteria) this;
        }

        public Criteria andV_addressNotBetween(String value1, String value2) {
            addCriterion("v_address not between", value1, value2, "v_address");
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