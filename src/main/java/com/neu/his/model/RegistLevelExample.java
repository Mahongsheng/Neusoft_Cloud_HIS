package com.neu.his.model;

import java.util.ArrayList;
import java.util.List;

public class RegistLevelExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public RegistLevelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
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
     * This method corresponds to the database table regist_level
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
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
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
     * This class corresponds to the database table regist_level
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

        public Criteria andRegistlevelidIsNull() {
            addCriterion("registLevelID is null");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidIsNotNull() {
            addCriterion("registLevelID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidEqualTo(Boolean value) {
            addCriterion("registLevelID =", value, "registlevelid");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidNotEqualTo(Boolean value) {
            addCriterion("registLevelID <>", value, "registlevelid");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidGreaterThan(Boolean value) {
            addCriterion("registLevelID >", value, "registlevelid");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("registLevelID >=", value, "registlevelid");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidLessThan(Boolean value) {
            addCriterion("registLevelID <", value, "registlevelid");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidLessThanOrEqualTo(Boolean value) {
            addCriterion("registLevelID <=", value, "registlevelid");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidIn(List<Boolean> values) {
            addCriterion("registLevelID in", values, "registlevelid");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidNotIn(List<Boolean> values) {
            addCriterion("registLevelID not in", values, "registlevelid");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidBetween(Boolean value1, Boolean value2) {
            addCriterion("registLevelID between", value1, value2, "registlevelid");
            return (Criteria) this;
        }

        public Criteria andRegistlevelidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("registLevelID not between", value1, value2, "registlevelid");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeIsNull() {
            addCriterion("registLevelCode is null");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeIsNotNull() {
            addCriterion("registLevelCode is not null");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeEqualTo(String value) {
            addCriterion("registLevelCode =", value, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeNotEqualTo(String value) {
            addCriterion("registLevelCode <>", value, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeGreaterThan(String value) {
            addCriterion("registLevelCode >", value, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeGreaterThanOrEqualTo(String value) {
            addCriterion("registLevelCode >=", value, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeLessThan(String value) {
            addCriterion("registLevelCode <", value, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeLessThanOrEqualTo(String value) {
            addCriterion("registLevelCode <=", value, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeLike(String value) {
            addCriterion("registLevelCode like", value, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeNotLike(String value) {
            addCriterion("registLevelCode not like", value, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeIn(List<String> values) {
            addCriterion("registLevelCode in", values, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeNotIn(List<String> values) {
            addCriterion("registLevelCode not in", values, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeBetween(String value1, String value2) {
            addCriterion("registLevelCode between", value1, value2, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelcodeNotBetween(String value1, String value2) {
            addCriterion("registLevelCode not between", value1, value2, "registlevelcode");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameIsNull() {
            addCriterion("registLevelName is null");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameIsNotNull() {
            addCriterion("registLevelName is not null");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameEqualTo(String value) {
            addCriterion("registLevelName =", value, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameNotEqualTo(String value) {
            addCriterion("registLevelName <>", value, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameGreaterThan(String value) {
            addCriterion("registLevelName >", value, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameGreaterThanOrEqualTo(String value) {
            addCriterion("registLevelName >=", value, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameLessThan(String value) {
            addCriterion("registLevelName <", value, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameLessThanOrEqualTo(String value) {
            addCriterion("registLevelName <=", value, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameLike(String value) {
            addCriterion("registLevelName like", value, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameNotLike(String value) {
            addCriterion("registLevelName not like", value, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameIn(List<String> values) {
            addCriterion("registLevelName in", values, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameNotIn(List<String> values) {
            addCriterion("registLevelName not in", values, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameBetween(String value1, String value2) {
            addCriterion("registLevelName between", value1, value2, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelnameNotBetween(String value1, String value2) {
            addCriterion("registLevelName not between", value1, value2, "registlevelname");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqIsNull() {
            addCriterion("registLevelSeq is null");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqIsNotNull() {
            addCriterion("registLevelSeq is not null");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqEqualTo(String value) {
            addCriterion("registLevelSeq =", value, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqNotEqualTo(String value) {
            addCriterion("registLevelSeq <>", value, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqGreaterThan(String value) {
            addCriterion("registLevelSeq >", value, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqGreaterThanOrEqualTo(String value) {
            addCriterion("registLevelSeq >=", value, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqLessThan(String value) {
            addCriterion("registLevelSeq <", value, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqLessThanOrEqualTo(String value) {
            addCriterion("registLevelSeq <=", value, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqLike(String value) {
            addCriterion("registLevelSeq like", value, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqNotLike(String value) {
            addCriterion("registLevelSeq not like", value, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqIn(List<String> values) {
            addCriterion("registLevelSeq in", values, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqNotIn(List<String> values) {
            addCriterion("registLevelSeq not in", values, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqBetween(String value1, String value2) {
            addCriterion("registLevelSeq between", value1, value2, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelseqNotBetween(String value1, String value2) {
            addCriterion("registLevelSeq not between", value1, value2, "registlevelseq");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceIsNull() {
            addCriterion("registLevelPrice is null");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceIsNotNull() {
            addCriterion("registLevelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceEqualTo(Byte value) {
            addCriterion("registLevelPrice =", value, "registlevelprice");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceNotEqualTo(Byte value) {
            addCriterion("registLevelPrice <>", value, "registlevelprice");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceGreaterThan(Byte value) {
            addCriterion("registLevelPrice >", value, "registlevelprice");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceGreaterThanOrEqualTo(Byte value) {
            addCriterion("registLevelPrice >=", value, "registlevelprice");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceLessThan(Byte value) {
            addCriterion("registLevelPrice <", value, "registlevelprice");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceLessThanOrEqualTo(Byte value) {
            addCriterion("registLevelPrice <=", value, "registlevelprice");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceIn(List<Byte> values) {
            addCriterion("registLevelPrice in", values, "registlevelprice");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceNotIn(List<Byte> values) {
            addCriterion("registLevelPrice not in", values, "registlevelprice");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceBetween(Byte value1, Byte value2) {
            addCriterion("registLevelPrice between", value1, value2, "registlevelprice");
            return (Criteria) this;
        }

        public Criteria andRegistlevelpriceNotBetween(Byte value1, Byte value2) {
            addCriterion("registLevelPrice not between", value1, value2, "registlevelprice");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitIsNull() {
            addCriterion("registLevelLimit is null");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitIsNotNull() {
            addCriterion("registLevelLimit is not null");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitEqualTo(Byte value) {
            addCriterion("registLevelLimit =", value, "registlevellimit");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitNotEqualTo(Byte value) {
            addCriterion("registLevelLimit <>", value, "registlevellimit");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitGreaterThan(Byte value) {
            addCriterion("registLevelLimit >", value, "registlevellimit");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("registLevelLimit >=", value, "registlevellimit");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitLessThan(Byte value) {
            addCriterion("registLevelLimit <", value, "registlevellimit");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitLessThanOrEqualTo(Byte value) {
            addCriterion("registLevelLimit <=", value, "registlevellimit");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitIn(List<Byte> values) {
            addCriterion("registLevelLimit in", values, "registlevellimit");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitNotIn(List<Byte> values) {
            addCriterion("registLevelLimit not in", values, "registlevellimit");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitBetween(Byte value1, Byte value2) {
            addCriterion("registLevelLimit between", value1, value2, "registlevellimit");
            return (Criteria) this;
        }

        public Criteria andRegistlevellimitNotBetween(Byte value1, Byte value2) {
            addCriterion("registLevelLimit not between", value1, value2, "registlevellimit");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table regist_level
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
     * This class corresponds to the database table regist_level
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