package com.neu.his.model;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public MedicalRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
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

        public Criteria andMedicalregistidIsNull() {
            addCriterion("medicalRegistID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidIsNotNull() {
            addCriterion("medicalRegistID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidEqualTo(Integer value) {
            addCriterion("medicalRegistID =", value, "medicalregistid");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidNotEqualTo(Integer value) {
            addCriterion("medicalRegistID <>", value, "medicalregistid");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidGreaterThan(Integer value) {
            addCriterion("medicalRegistID >", value, "medicalregistid");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRegistID >=", value, "medicalregistid");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidLessThan(Integer value) {
            addCriterion("medicalRegistID <", value, "medicalregistid");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRegistID <=", value, "medicalregistid");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidIn(List<Integer> values) {
            addCriterion("medicalRegistID in", values, "medicalregistid");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidNotIn(List<Integer> values) {
            addCriterion("medicalRegistID not in", values, "medicalregistid");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidBetween(Integer value1, Integer value2) {
            addCriterion("medicalRegistID between", value1, value2, "medicalregistid");
            return (Criteria) this;
        }

        public Criteria andMedicalregistidNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRegistID not between", value1, value2, "medicalregistid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateIsNull() {
            addCriterion("medicalRecordState is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateIsNotNull() {
            addCriterion("medicalRecordState is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateEqualTo(String value) {
            addCriterion("medicalRecordState =", value, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateNotEqualTo(String value) {
            addCriterion("medicalRecordState <>", value, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateGreaterThan(String value) {
            addCriterion("medicalRecordState >", value, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateGreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecordState >=", value, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateLessThan(String value) {
            addCriterion("medicalRecordState <", value, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateLessThanOrEqualTo(String value) {
            addCriterion("medicalRecordState <=", value, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateLike(String value) {
            addCriterion("medicalRecordState like", value, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateNotLike(String value) {
            addCriterion("medicalRecordState not like", value, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateIn(List<String> values) {
            addCriterion("medicalRecordState in", values, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateNotIn(List<String> values) {
            addCriterion("medicalRecordState not in", values, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateBetween(String value1, String value2) {
            addCriterion("medicalRecordState between", value1, value2, "medicalrecordstate");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordstateNotBetween(String value1, String value2) {
            addCriterion("medicalRecordState not between", value1, value2, "medicalrecordstate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table medical_record
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 22 15:20:08 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table medical_record
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
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