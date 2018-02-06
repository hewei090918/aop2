package com.aop.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlaneModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaneModelExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumIsNull() {
            addCriterion("saloon_seat_maximum is null");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumIsNotNull() {
            addCriterion("saloon_seat_maximum is not null");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumEqualTo(Integer value) {
            addCriterion("saloon_seat_maximum =", value, "saloonSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumNotEqualTo(Integer value) {
            addCriterion("saloon_seat_maximum <>", value, "saloonSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumGreaterThan(Integer value) {
            addCriterion("saloon_seat_maximum >", value, "saloonSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumGreaterThanOrEqualTo(Integer value) {
            addCriterion("saloon_seat_maximum >=", value, "saloonSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumLessThan(Integer value) {
            addCriterion("saloon_seat_maximum <", value, "saloonSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumLessThanOrEqualTo(Integer value) {
            addCriterion("saloon_seat_maximum <=", value, "saloonSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumIn(List<Integer> values) {
            addCriterion("saloon_seat_maximum in", values, "saloonSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumNotIn(List<Integer> values) {
            addCriterion("saloon_seat_maximum not in", values, "saloonSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumBetween(Integer value1, Integer value2) {
            addCriterion("saloon_seat_maximum between", value1, value2, "saloonSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andSaloonSeatMaximumNotBetween(Integer value1, Integer value2) {
            addCriterion("saloon_seat_maximum not between", value1, value2, "saloonSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumIsNull() {
            addCriterion("business_seat_maximum is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumIsNotNull() {
            addCriterion("business_seat_maximum is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumEqualTo(Integer value) {
            addCriterion("business_seat_maximum =", value, "businessSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumNotEqualTo(Integer value) {
            addCriterion("business_seat_maximum <>", value, "businessSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumGreaterThan(Integer value) {
            addCriterion("business_seat_maximum >", value, "businessSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_seat_maximum >=", value, "businessSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumLessThan(Integer value) {
            addCriterion("business_seat_maximum <", value, "businessSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumLessThanOrEqualTo(Integer value) {
            addCriterion("business_seat_maximum <=", value, "businessSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumIn(List<Integer> values) {
            addCriterion("business_seat_maximum in", values, "businessSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumNotIn(List<Integer> values) {
            addCriterion("business_seat_maximum not in", values, "businessSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumBetween(Integer value1, Integer value2) {
            addCriterion("business_seat_maximum between", value1, value2, "businessSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatMaximumNotBetween(Integer value1, Integer value2) {
            addCriterion("business_seat_maximum not between", value1, value2, "businessSeatMaximum");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumIsNull() {
            addCriterion("economy_seat_maximum is null");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumIsNotNull() {
            addCriterion("economy_seat_maximum is not null");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumEqualTo(Integer value) {
            addCriterion("economy_seat_maximum =", value, "economySeatMaximum");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumNotEqualTo(Integer value) {
            addCriterion("economy_seat_maximum <>", value, "economySeatMaximum");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumGreaterThan(Integer value) {
            addCriterion("economy_seat_maximum >", value, "economySeatMaximum");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumGreaterThanOrEqualTo(Integer value) {
            addCriterion("economy_seat_maximum >=", value, "economySeatMaximum");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumLessThan(Integer value) {
            addCriterion("economy_seat_maximum <", value, "economySeatMaximum");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumLessThanOrEqualTo(Integer value) {
            addCriterion("economy_seat_maximum <=", value, "economySeatMaximum");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumIn(List<Integer> values) {
            addCriterion("economy_seat_maximum in", values, "economySeatMaximum");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumNotIn(List<Integer> values) {
            addCriterion("economy_seat_maximum not in", values, "economySeatMaximum");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumBetween(Integer value1, Integer value2) {
            addCriterion("economy_seat_maximum between", value1, value2, "economySeatMaximum");
            return (Criteria) this;
        }

        public Criteria andEconomySeatMaximumNotBetween(Integer value1, Integer value2) {
            addCriterion("economy_seat_maximum not between", value1, value2, "economySeatMaximum");
            return (Criteria) this;
        }

        public Criteria andVoyageIsNull() {
            addCriterion("voyage is null");
            return (Criteria) this;
        }

        public Criteria andVoyageIsNotNull() {
            addCriterion("voyage is not null");
            return (Criteria) this;
        }

        public Criteria andVoyageEqualTo(Long value) {
            addCriterion("voyage =", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotEqualTo(Long value) {
            addCriterion("voyage <>", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageGreaterThan(Long value) {
            addCriterion("voyage >", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageGreaterThanOrEqualTo(Long value) {
            addCriterion("voyage >=", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLessThan(Long value) {
            addCriterion("voyage <", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLessThanOrEqualTo(Long value) {
            addCriterion("voyage <=", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageIn(List<Long> values) {
            addCriterion("voyage in", values, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotIn(List<Long> values) {
            addCriterion("voyage not in", values, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageBetween(Long value1, Long value2) {
            addCriterion("voyage between", value1, value2, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotBetween(Long value1, Long value2) {
            addCriterion("voyage not between", value1, value2, "voyage");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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