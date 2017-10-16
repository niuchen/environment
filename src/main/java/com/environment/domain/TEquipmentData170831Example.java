package com.environment.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TEquipmentData170831Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEquipmentData170831Example() {
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

        public Criteria andP001IsNull() {
            addCriterion("p001 is null");
            return (Criteria) this;
        }

        public Criteria andP001IsNotNull() {
            addCriterion("p001 is not null");
            return (Criteria) this;
        }

        public Criteria andP001EqualTo(Double value) {
            addCriterion("p001 =", value, "p001");
            return (Criteria) this;
        }

        public Criteria andP001NotEqualTo(Double value) {
            addCriterion("p001 <>", value, "p001");
            return (Criteria) this;
        }

        public Criteria andP001GreaterThan(Double value) {
            addCriterion("p001 >", value, "p001");
            return (Criteria) this;
        }

        public Criteria andP001GreaterThanOrEqualTo(Double value) {
            addCriterion("p001 >=", value, "p001");
            return (Criteria) this;
        }

        public Criteria andP001LessThan(Double value) {
            addCriterion("p001 <", value, "p001");
            return (Criteria) this;
        }

        public Criteria andP001LessThanOrEqualTo(Double value) {
            addCriterion("p001 <=", value, "p001");
            return (Criteria) this;
        }

        public Criteria andP001In(List<Double> values) {
            addCriterion("p001 in", values, "p001");
            return (Criteria) this;
        }

        public Criteria andP001NotIn(List<Double> values) {
            addCriterion("p001 not in", values, "p001");
            return (Criteria) this;
        }

        public Criteria andP001Between(Double value1, Double value2) {
            addCriterion("p001 between", value1, value2, "p001");
            return (Criteria) this;
        }

        public Criteria andP001NotBetween(Double value1, Double value2) {
            addCriterion("p001 not between", value1, value2, "p001");
            return (Criteria) this;
        }

        public Criteria andP002IsNull() {
            addCriterion("p002 is null");
            return (Criteria) this;
        }

        public Criteria andP002IsNotNull() {
            addCriterion("p002 is not null");
            return (Criteria) this;
        }

        public Criteria andP002EqualTo(Double value) {
            addCriterion("p002 =", value, "p002");
            return (Criteria) this;
        }

        public Criteria andP002NotEqualTo(Double value) {
            addCriterion("p002 <>", value, "p002");
            return (Criteria) this;
        }

        public Criteria andP002GreaterThan(Double value) {
            addCriterion("p002 >", value, "p002");
            return (Criteria) this;
        }

        public Criteria andP002GreaterThanOrEqualTo(Double value) {
            addCriterion("p002 >=", value, "p002");
            return (Criteria) this;
        }

        public Criteria andP002LessThan(Double value) {
            addCriterion("p002 <", value, "p002");
            return (Criteria) this;
        }

        public Criteria andP002LessThanOrEqualTo(Double value) {
            addCriterion("p002 <=", value, "p002");
            return (Criteria) this;
        }

        public Criteria andP002In(List<Double> values) {
            addCriterion("p002 in", values, "p002");
            return (Criteria) this;
        }

        public Criteria andP002NotIn(List<Double> values) {
            addCriterion("p002 not in", values, "p002");
            return (Criteria) this;
        }

        public Criteria andP002Between(Double value1, Double value2) {
            addCriterion("p002 between", value1, value2, "p002");
            return (Criteria) this;
        }

        public Criteria andP002NotBetween(Double value1, Double value2) {
            addCriterion("p002 not between", value1, value2, "p002");
            return (Criteria) this;
        }

        public Criteria andP003IsNull() {
            addCriterion("p003 is null");
            return (Criteria) this;
        }

        public Criteria andP003IsNotNull() {
            addCriterion("p003 is not null");
            return (Criteria) this;
        }

        public Criteria andP003EqualTo(Double value) {
            addCriterion("p003 =", value, "p003");
            return (Criteria) this;
        }

        public Criteria andP003NotEqualTo(Double value) {
            addCriterion("p003 <>", value, "p003");
            return (Criteria) this;
        }

        public Criteria andP003GreaterThan(Double value) {
            addCriterion("p003 >", value, "p003");
            return (Criteria) this;
        }

        public Criteria andP003GreaterThanOrEqualTo(Double value) {
            addCriterion("p003 >=", value, "p003");
            return (Criteria) this;
        }

        public Criteria andP003LessThan(Double value) {
            addCriterion("p003 <", value, "p003");
            return (Criteria) this;
        }

        public Criteria andP003LessThanOrEqualTo(Double value) {
            addCriterion("p003 <=", value, "p003");
            return (Criteria) this;
        }

        public Criteria andP003In(List<Double> values) {
            addCriterion("p003 in", values, "p003");
            return (Criteria) this;
        }

        public Criteria andP003NotIn(List<Double> values) {
            addCriterion("p003 not in", values, "p003");
            return (Criteria) this;
        }

        public Criteria andP003Between(Double value1, Double value2) {
            addCriterion("p003 between", value1, value2, "p003");
            return (Criteria) this;
        }

        public Criteria andP003NotBetween(Double value1, Double value2) {
            addCriterion("p003 not between", value1, value2, "p003");
            return (Criteria) this;
        }

        public Criteria andP004IsNull() {
            addCriterion("p004 is null");
            return (Criteria) this;
        }

        public Criteria andP004IsNotNull() {
            addCriterion("p004 is not null");
            return (Criteria) this;
        }

        public Criteria andP004EqualTo(Double value) {
            addCriterion("p004 =", value, "p004");
            return (Criteria) this;
        }

        public Criteria andP004NotEqualTo(Double value) {
            addCriterion("p004 <>", value, "p004");
            return (Criteria) this;
        }

        public Criteria andP004GreaterThan(Double value) {
            addCriterion("p004 >", value, "p004");
            return (Criteria) this;
        }

        public Criteria andP004GreaterThanOrEqualTo(Double value) {
            addCriterion("p004 >=", value, "p004");
            return (Criteria) this;
        }

        public Criteria andP004LessThan(Double value) {
            addCriterion("p004 <", value, "p004");
            return (Criteria) this;
        }

        public Criteria andP004LessThanOrEqualTo(Double value) {
            addCriterion("p004 <=", value, "p004");
            return (Criteria) this;
        }

        public Criteria andP004In(List<Double> values) {
            addCriterion("p004 in", values, "p004");
            return (Criteria) this;
        }

        public Criteria andP004NotIn(List<Double> values) {
            addCriterion("p004 not in", values, "p004");
            return (Criteria) this;
        }

        public Criteria andP004Between(Double value1, Double value2) {
            addCriterion("p004 between", value1, value2, "p004");
            return (Criteria) this;
        }

        public Criteria andP004NotBetween(Double value1, Double value2) {
            addCriterion("p004 not between", value1, value2, "p004");
            return (Criteria) this;
        }

        public Criteria andP005IsNull() {
            addCriterion("p005 is null");
            return (Criteria) this;
        }

        public Criteria andP005IsNotNull() {
            addCriterion("p005 is not null");
            return (Criteria) this;
        }

        public Criteria andP005EqualTo(Double value) {
            addCriterion("p005 =", value, "p005");
            return (Criteria) this;
        }

        public Criteria andP005NotEqualTo(Double value) {
            addCriterion("p005 <>", value, "p005");
            return (Criteria) this;
        }

        public Criteria andP005GreaterThan(Double value) {
            addCriterion("p005 >", value, "p005");
            return (Criteria) this;
        }

        public Criteria andP005GreaterThanOrEqualTo(Double value) {
            addCriterion("p005 >=", value, "p005");
            return (Criteria) this;
        }

        public Criteria andP005LessThan(Double value) {
            addCriterion("p005 <", value, "p005");
            return (Criteria) this;
        }

        public Criteria andP005LessThanOrEqualTo(Double value) {
            addCriterion("p005 <=", value, "p005");
            return (Criteria) this;
        }

        public Criteria andP005In(List<Double> values) {
            addCriterion("p005 in", values, "p005");
            return (Criteria) this;
        }

        public Criteria andP005NotIn(List<Double> values) {
            addCriterion("p005 not in", values, "p005");
            return (Criteria) this;
        }

        public Criteria andP005Between(Double value1, Double value2) {
            addCriterion("p005 between", value1, value2, "p005");
            return (Criteria) this;
        }

        public Criteria andP005NotBetween(Double value1, Double value2) {
            addCriterion("p005 not between", value1, value2, "p005");
            return (Criteria) this;
        }

        public Criteria andP006IsNull() {
            addCriterion("p006 is null");
            return (Criteria) this;
        }

        public Criteria andP006IsNotNull() {
            addCriterion("p006 is not null");
            return (Criteria) this;
        }

        public Criteria andP006EqualTo(Double value) {
            addCriterion("p006 =", value, "p006");
            return (Criteria) this;
        }

        public Criteria andP006NotEqualTo(Double value) {
            addCriterion("p006 <>", value, "p006");
            return (Criteria) this;
        }

        public Criteria andP006GreaterThan(Double value) {
            addCriterion("p006 >", value, "p006");
            return (Criteria) this;
        }

        public Criteria andP006GreaterThanOrEqualTo(Double value) {
            addCriterion("p006 >=", value, "p006");
            return (Criteria) this;
        }

        public Criteria andP006LessThan(Double value) {
            addCriterion("p006 <", value, "p006");
            return (Criteria) this;
        }

        public Criteria andP006LessThanOrEqualTo(Double value) {
            addCriterion("p006 <=", value, "p006");
            return (Criteria) this;
        }

        public Criteria andP006In(List<Double> values) {
            addCriterion("p006 in", values, "p006");
            return (Criteria) this;
        }

        public Criteria andP006NotIn(List<Double> values) {
            addCriterion("p006 not in", values, "p006");
            return (Criteria) this;
        }

        public Criteria andP006Between(Double value1, Double value2) {
            addCriterion("p006 between", value1, value2, "p006");
            return (Criteria) this;
        }

        public Criteria andP006NotBetween(Double value1, Double value2) {
            addCriterion("p006 not between", value1, value2, "p006");
            return (Criteria) this;
        }

        public Criteria andP007IsNull() {
            addCriterion("p007 is null");
            return (Criteria) this;
        }

        public Criteria andP007IsNotNull() {
            addCriterion("p007 is not null");
            return (Criteria) this;
        }

        public Criteria andP007EqualTo(Double value) {
            addCriterion("p007 =", value, "p007");
            return (Criteria) this;
        }

        public Criteria andP007NotEqualTo(Double value) {
            addCriterion("p007 <>", value, "p007");
            return (Criteria) this;
        }

        public Criteria andP007GreaterThan(Double value) {
            addCriterion("p007 >", value, "p007");
            return (Criteria) this;
        }

        public Criteria andP007GreaterThanOrEqualTo(Double value) {
            addCriterion("p007 >=", value, "p007");
            return (Criteria) this;
        }

        public Criteria andP007LessThan(Double value) {
            addCriterion("p007 <", value, "p007");
            return (Criteria) this;
        }

        public Criteria andP007LessThanOrEqualTo(Double value) {
            addCriterion("p007 <=", value, "p007");
            return (Criteria) this;
        }

        public Criteria andP007In(List<Double> values) {
            addCriterion("p007 in", values, "p007");
            return (Criteria) this;
        }

        public Criteria andP007NotIn(List<Double> values) {
            addCriterion("p007 not in", values, "p007");
            return (Criteria) this;
        }

        public Criteria andP007Between(Double value1, Double value2) {
            addCriterion("p007 between", value1, value2, "p007");
            return (Criteria) this;
        }

        public Criteria andP007NotBetween(Double value1, Double value2) {
            addCriterion("p007 not between", value1, value2, "p007");
            return (Criteria) this;
        }

        public Criteria andP008IsNull() {
            addCriterion("p008 is null");
            return (Criteria) this;
        }

        public Criteria andP008IsNotNull() {
            addCriterion("p008 is not null");
            return (Criteria) this;
        }

        public Criteria andP008EqualTo(Double value) {
            addCriterion("p008 =", value, "p008");
            return (Criteria) this;
        }

        public Criteria andP008NotEqualTo(Double value) {
            addCriterion("p008 <>", value, "p008");
            return (Criteria) this;
        }

        public Criteria andP008GreaterThan(Double value) {
            addCriterion("p008 >", value, "p008");
            return (Criteria) this;
        }

        public Criteria andP008GreaterThanOrEqualTo(Double value) {
            addCriterion("p008 >=", value, "p008");
            return (Criteria) this;
        }

        public Criteria andP008LessThan(Double value) {
            addCriterion("p008 <", value, "p008");
            return (Criteria) this;
        }

        public Criteria andP008LessThanOrEqualTo(Double value) {
            addCriterion("p008 <=", value, "p008");
            return (Criteria) this;
        }

        public Criteria andP008In(List<Double> values) {
            addCriterion("p008 in", values, "p008");
            return (Criteria) this;
        }

        public Criteria andP008NotIn(List<Double> values) {
            addCriterion("p008 not in", values, "p008");
            return (Criteria) this;
        }

        public Criteria andP008Between(Double value1, Double value2) {
            addCriterion("p008 between", value1, value2, "p008");
            return (Criteria) this;
        }

        public Criteria andP008NotBetween(Double value1, Double value2) {
            addCriterion("p008 not between", value1, value2, "p008");
            return (Criteria) this;
        }

        public Criteria andP009IsNull() {
            addCriterion("p009 is null");
            return (Criteria) this;
        }

        public Criteria andP009IsNotNull() {
            addCriterion("p009 is not null");
            return (Criteria) this;
        }

        public Criteria andP009EqualTo(Double value) {
            addCriterion("p009 =", value, "p009");
            return (Criteria) this;
        }

        public Criteria andP009NotEqualTo(Double value) {
            addCriterion("p009 <>", value, "p009");
            return (Criteria) this;
        }

        public Criteria andP009GreaterThan(Double value) {
            addCriterion("p009 >", value, "p009");
            return (Criteria) this;
        }

        public Criteria andP009GreaterThanOrEqualTo(Double value) {
            addCriterion("p009 >=", value, "p009");
            return (Criteria) this;
        }

        public Criteria andP009LessThan(Double value) {
            addCriterion("p009 <", value, "p009");
            return (Criteria) this;
        }

        public Criteria andP009LessThanOrEqualTo(Double value) {
            addCriterion("p009 <=", value, "p009");
            return (Criteria) this;
        }

        public Criteria andP009In(List<Double> values) {
            addCriterion("p009 in", values, "p009");
            return (Criteria) this;
        }

        public Criteria andP009NotIn(List<Double> values) {
            addCriterion("p009 not in", values, "p009");
            return (Criteria) this;
        }

        public Criteria andP009Between(Double value1, Double value2) {
            addCriterion("p009 between", value1, value2, "p009");
            return (Criteria) this;
        }

        public Criteria andP009NotBetween(Double value1, Double value2) {
            addCriterion("p009 not between", value1, value2, "p009");
            return (Criteria) this;
        }

        public Criteria andP010IsNull() {
            addCriterion("p010 is null");
            return (Criteria) this;
        }

        public Criteria andP010IsNotNull() {
            addCriterion("p010 is not null");
            return (Criteria) this;
        }

        public Criteria andP010EqualTo(Double value) {
            addCriterion("p010 =", value, "p010");
            return (Criteria) this;
        }

        public Criteria andP010NotEqualTo(Double value) {
            addCriterion("p010 <>", value, "p010");
            return (Criteria) this;
        }

        public Criteria andP010GreaterThan(Double value) {
            addCriterion("p010 >", value, "p010");
            return (Criteria) this;
        }

        public Criteria andP010GreaterThanOrEqualTo(Double value) {
            addCriterion("p010 >=", value, "p010");
            return (Criteria) this;
        }

        public Criteria andP010LessThan(Double value) {
            addCriterion("p010 <", value, "p010");
            return (Criteria) this;
        }

        public Criteria andP010LessThanOrEqualTo(Double value) {
            addCriterion("p010 <=", value, "p010");
            return (Criteria) this;
        }

        public Criteria andP010In(List<Double> values) {
            addCriterion("p010 in", values, "p010");
            return (Criteria) this;
        }

        public Criteria andP010NotIn(List<Double> values) {
            addCriterion("p010 not in", values, "p010");
            return (Criteria) this;
        }

        public Criteria andP010Between(Double value1, Double value2) {
            addCriterion("p010 between", value1, value2, "p010");
            return (Criteria) this;
        }

        public Criteria andP010NotBetween(Double value1, Double value2) {
            addCriterion("p010 not between", value1, value2, "p010");
            return (Criteria) this;
        }

        public Criteria andP011IsNull() {
            addCriterion("p011 is null");
            return (Criteria) this;
        }

        public Criteria andP011IsNotNull() {
            addCriterion("p011 is not null");
            return (Criteria) this;
        }

        public Criteria andP011EqualTo(Double value) {
            addCriterion("p011 =", value, "p011");
            return (Criteria) this;
        }

        public Criteria andP011NotEqualTo(Double value) {
            addCriterion("p011 <>", value, "p011");
            return (Criteria) this;
        }

        public Criteria andP011GreaterThan(Double value) {
            addCriterion("p011 >", value, "p011");
            return (Criteria) this;
        }

        public Criteria andP011GreaterThanOrEqualTo(Double value) {
            addCriterion("p011 >=", value, "p011");
            return (Criteria) this;
        }

        public Criteria andP011LessThan(Double value) {
            addCriterion("p011 <", value, "p011");
            return (Criteria) this;
        }

        public Criteria andP011LessThanOrEqualTo(Double value) {
            addCriterion("p011 <=", value, "p011");
            return (Criteria) this;
        }

        public Criteria andP011In(List<Double> values) {
            addCriterion("p011 in", values, "p011");
            return (Criteria) this;
        }

        public Criteria andP011NotIn(List<Double> values) {
            addCriterion("p011 not in", values, "p011");
            return (Criteria) this;
        }

        public Criteria andP011Between(Double value1, Double value2) {
            addCriterion("p011 between", value1, value2, "p011");
            return (Criteria) this;
        }

        public Criteria andP011NotBetween(Double value1, Double value2) {
            addCriterion("p011 not between", value1, value2, "p011");
            return (Criteria) this;
        }

        public Criteria andP012IsNull() {
            addCriterion("p012 is null");
            return (Criteria) this;
        }

        public Criteria andP012IsNotNull() {
            addCriterion("p012 is not null");
            return (Criteria) this;
        }

        public Criteria andP012EqualTo(Double value) {
            addCriterion("p012 =", value, "p012");
            return (Criteria) this;
        }

        public Criteria andP012NotEqualTo(Double value) {
            addCriterion("p012 <>", value, "p012");
            return (Criteria) this;
        }

        public Criteria andP012GreaterThan(Double value) {
            addCriterion("p012 >", value, "p012");
            return (Criteria) this;
        }

        public Criteria andP012GreaterThanOrEqualTo(Double value) {
            addCriterion("p012 >=", value, "p012");
            return (Criteria) this;
        }

        public Criteria andP012LessThan(Double value) {
            addCriterion("p012 <", value, "p012");
            return (Criteria) this;
        }

        public Criteria andP012LessThanOrEqualTo(Double value) {
            addCriterion("p012 <=", value, "p012");
            return (Criteria) this;
        }

        public Criteria andP012In(List<Double> values) {
            addCriterion("p012 in", values, "p012");
            return (Criteria) this;
        }

        public Criteria andP012NotIn(List<Double> values) {
            addCriterion("p012 not in", values, "p012");
            return (Criteria) this;
        }

        public Criteria andP012Between(Double value1, Double value2) {
            addCriterion("p012 between", value1, value2, "p012");
            return (Criteria) this;
        }

        public Criteria andP012NotBetween(Double value1, Double value2) {
            addCriterion("p012 not between", value1, value2, "p012");
            return (Criteria) this;
        }

        public Criteria andP013IsNull() {
            addCriterion("p013 is null");
            return (Criteria) this;
        }

        public Criteria andP013IsNotNull() {
            addCriterion("p013 is not null");
            return (Criteria) this;
        }

        public Criteria andP013EqualTo(Double value) {
            addCriterion("p013 =", value, "p013");
            return (Criteria) this;
        }

        public Criteria andP013NotEqualTo(Double value) {
            addCriterion("p013 <>", value, "p013");
            return (Criteria) this;
        }

        public Criteria andP013GreaterThan(Double value) {
            addCriterion("p013 >", value, "p013");
            return (Criteria) this;
        }

        public Criteria andP013GreaterThanOrEqualTo(Double value) {
            addCriterion("p013 >=", value, "p013");
            return (Criteria) this;
        }

        public Criteria andP013LessThan(Double value) {
            addCriterion("p013 <", value, "p013");
            return (Criteria) this;
        }

        public Criteria andP013LessThanOrEqualTo(Double value) {
            addCriterion("p013 <=", value, "p013");
            return (Criteria) this;
        }

        public Criteria andP013In(List<Double> values) {
            addCriterion("p013 in", values, "p013");
            return (Criteria) this;
        }

        public Criteria andP013NotIn(List<Double> values) {
            addCriterion("p013 not in", values, "p013");
            return (Criteria) this;
        }

        public Criteria andP013Between(Double value1, Double value2) {
            addCriterion("p013 between", value1, value2, "p013");
            return (Criteria) this;
        }

        public Criteria andP013NotBetween(Double value1, Double value2) {
            addCriterion("p013 not between", value1, value2, "p013");
            return (Criteria) this;
        }

        public Criteria andP014IsNull() {
            addCriterion("p014 is null");
            return (Criteria) this;
        }

        public Criteria andP014IsNotNull() {
            addCriterion("p014 is not null");
            return (Criteria) this;
        }

        public Criteria andP014EqualTo(Double value) {
            addCriterion("p014 =", value, "p014");
            return (Criteria) this;
        }

        public Criteria andP014NotEqualTo(Double value) {
            addCriterion("p014 <>", value, "p014");
            return (Criteria) this;
        }

        public Criteria andP014GreaterThan(Double value) {
            addCriterion("p014 >", value, "p014");
            return (Criteria) this;
        }

        public Criteria andP014GreaterThanOrEqualTo(Double value) {
            addCriterion("p014 >=", value, "p014");
            return (Criteria) this;
        }

        public Criteria andP014LessThan(Double value) {
            addCriterion("p014 <", value, "p014");
            return (Criteria) this;
        }

        public Criteria andP014LessThanOrEqualTo(Double value) {
            addCriterion("p014 <=", value, "p014");
            return (Criteria) this;
        }

        public Criteria andP014In(List<Double> values) {
            addCriterion("p014 in", values, "p014");
            return (Criteria) this;
        }

        public Criteria andP014NotIn(List<Double> values) {
            addCriterion("p014 not in", values, "p014");
            return (Criteria) this;
        }

        public Criteria andP014Between(Double value1, Double value2) {
            addCriterion("p014 between", value1, value2, "p014");
            return (Criteria) this;
        }

        public Criteria andP014NotBetween(Double value1, Double value2) {
            addCriterion("p014 not between", value1, value2, "p014");
            return (Criteria) this;
        }

        public Criteria andP015IsNull() {
            addCriterion("p015 is null");
            return (Criteria) this;
        }

        public Criteria andP015IsNotNull() {
            addCriterion("p015 is not null");
            return (Criteria) this;
        }

        public Criteria andP015EqualTo(Double value) {
            addCriterion("p015 =", value, "p015");
            return (Criteria) this;
        }

        public Criteria andP015NotEqualTo(Double value) {
            addCriterion("p015 <>", value, "p015");
            return (Criteria) this;
        }

        public Criteria andP015GreaterThan(Double value) {
            addCriterion("p015 >", value, "p015");
            return (Criteria) this;
        }

        public Criteria andP015GreaterThanOrEqualTo(Double value) {
            addCriterion("p015 >=", value, "p015");
            return (Criteria) this;
        }

        public Criteria andP015LessThan(Double value) {
            addCriterion("p015 <", value, "p015");
            return (Criteria) this;
        }

        public Criteria andP015LessThanOrEqualTo(Double value) {
            addCriterion("p015 <=", value, "p015");
            return (Criteria) this;
        }

        public Criteria andP015In(List<Double> values) {
            addCriterion("p015 in", values, "p015");
            return (Criteria) this;
        }

        public Criteria andP015NotIn(List<Double> values) {
            addCriterion("p015 not in", values, "p015");
            return (Criteria) this;
        }

        public Criteria andP015Between(Double value1, Double value2) {
            addCriterion("p015 between", value1, value2, "p015");
            return (Criteria) this;
        }

        public Criteria andP015NotBetween(Double value1, Double value2) {
            addCriterion("p015 not between", value1, value2, "p015");
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