package com.test.dao;

import java.util.ArrayList;
import java.util.List;

public class UserStoreSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserStoreSettingExample() {
        oredCriteria = new ArrayList<>();
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductIsNull() {
            addCriterion("auto_pull_all_product is null");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductIsNotNull() {
            addCriterion("auto_pull_all_product is not null");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductEqualTo(Boolean value) {
            addCriterion("auto_pull_all_product =", value, "autoPullAllProduct");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductNotEqualTo(Boolean value) {
            addCriterion("auto_pull_all_product <>", value, "autoPullAllProduct");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductGreaterThan(Boolean value) {
            addCriterion("auto_pull_all_product >", value, "autoPullAllProduct");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductGreaterThanOrEqualTo(Boolean value) {
            addCriterion("auto_pull_all_product >=", value, "autoPullAllProduct");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductLessThan(Boolean value) {
            addCriterion("auto_pull_all_product <", value, "autoPullAllProduct");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductLessThanOrEqualTo(Boolean value) {
            addCriterion("auto_pull_all_product <=", value, "autoPullAllProduct");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductIn(List<Boolean> values) {
            addCriterion("auto_pull_all_product in", values, "autoPullAllProduct");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductNotIn(List<Boolean> values) {
            addCriterion("auto_pull_all_product not in", values, "autoPullAllProduct");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_pull_all_product between", value1, value2, "autoPullAllProduct");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllProductNotBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_pull_all_product not between", value1, value2, "autoPullAllProduct");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderIsNull() {
            addCriterion("auto_pull_all_order is null");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderIsNotNull() {
            addCriterion("auto_pull_all_order is not null");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderEqualTo(Boolean value) {
            addCriterion("auto_pull_all_order =", value, "autoPullAllOrder");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderNotEqualTo(Boolean value) {
            addCriterion("auto_pull_all_order <>", value, "autoPullAllOrder");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderGreaterThan(Boolean value) {
            addCriterion("auto_pull_all_order >", value, "autoPullAllOrder");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("auto_pull_all_order >=", value, "autoPullAllOrder");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderLessThan(Boolean value) {
            addCriterion("auto_pull_all_order <", value, "autoPullAllOrder");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderLessThanOrEqualTo(Boolean value) {
            addCriterion("auto_pull_all_order <=", value, "autoPullAllOrder");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderIn(List<Boolean> values) {
            addCriterion("auto_pull_all_order in", values, "autoPullAllOrder");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderNotIn(List<Boolean> values) {
            addCriterion("auto_pull_all_order not in", values, "autoPullAllOrder");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_pull_all_order between", value1, value2, "autoPullAllOrder");
            return (Criteria) this;
        }

        public Criteria andAutoPullAllOrderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_pull_all_order not between", value1, value2, "autoPullAllOrder");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenIsNull() {
            addCriterion("is_refresh_token is null");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenIsNotNull() {
            addCriterion("is_refresh_token is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenEqualTo(Boolean value) {
            addCriterion("is_refresh_token =", value, "isRefreshToken");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenNotEqualTo(Boolean value) {
            addCriterion("is_refresh_token <>", value, "isRefreshToken");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenGreaterThan(Boolean value) {
            addCriterion("is_refresh_token >", value, "isRefreshToken");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_refresh_token >=", value, "isRefreshToken");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenLessThan(Boolean value) {
            addCriterion("is_refresh_token <", value, "isRefreshToken");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenLessThanOrEqualTo(Boolean value) {
            addCriterion("is_refresh_token <=", value, "isRefreshToken");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenIn(List<Boolean> values) {
            addCriterion("is_refresh_token in", values, "isRefreshToken");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenNotIn(List<Boolean> values) {
            addCriterion("is_refresh_token not in", values, "isRefreshToken");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenBetween(Boolean value1, Boolean value2) {
            addCriterion("is_refresh_token between", value1, value2, "isRefreshToken");
            return (Criteria) this;
        }

        public Criteria andIsRefreshTokenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_refresh_token not between", value1, value2, "isRefreshToken");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookIsNull() {
            addCriterion("is_create_webhook is null");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookIsNotNull() {
            addCriterion("is_create_webhook is not null");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookEqualTo(Boolean value) {
            addCriterion("is_create_webhook =", value, "isCreateWebhook");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookNotEqualTo(Boolean value) {
            addCriterion("is_create_webhook <>", value, "isCreateWebhook");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookGreaterThan(Boolean value) {
            addCriterion("is_create_webhook >", value, "isCreateWebhook");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_create_webhook >=", value, "isCreateWebhook");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookLessThan(Boolean value) {
            addCriterion("is_create_webhook <", value, "isCreateWebhook");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookLessThanOrEqualTo(Boolean value) {
            addCriterion("is_create_webhook <=", value, "isCreateWebhook");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookIn(List<Boolean> values) {
            addCriterion("is_create_webhook in", values, "isCreateWebhook");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookNotIn(List<Boolean> values) {
            addCriterion("is_create_webhook not in", values, "isCreateWebhook");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookBetween(Boolean value1, Boolean value2) {
            addCriterion("is_create_webhook between", value1, value2, "isCreateWebhook");
            return (Criteria) this;
        }

        public Criteria andIsCreateWebhookNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_create_webhook not between", value1, value2, "isCreateWebhook");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsIsNull() {
            addCriterion("delivery_settings is null");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsIsNotNull() {
            addCriterion("delivery_settings is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsEqualTo(Byte value) {
            addCriterion("delivery_settings =", value, "deliverySettings");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsNotEqualTo(Byte value) {
            addCriterion("delivery_settings <>", value, "deliverySettings");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsGreaterThan(Byte value) {
            addCriterion("delivery_settings >", value, "deliverySettings");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsGreaterThanOrEqualTo(Byte value) {
            addCriterion("delivery_settings >=", value, "deliverySettings");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsLessThan(Byte value) {
            addCriterion("delivery_settings <", value, "deliverySettings");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsLessThanOrEqualTo(Byte value) {
            addCriterion("delivery_settings <=", value, "deliverySettings");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsIn(List<Byte> values) {
            addCriterion("delivery_settings in", values, "deliverySettings");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsNotIn(List<Byte> values) {
            addCriterion("delivery_settings not in", values, "deliverySettings");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsBetween(Byte value1, Byte value2) {
            addCriterion("delivery_settings between", value1, value2, "deliverySettings");
            return (Criteria) this;
        }

        public Criteria andDeliverySettingsNotBetween(Byte value1, Byte value2) {
            addCriterion("delivery_settings not between", value1, value2, "deliverySettings");
            return (Criteria) this;
        }

        public Criteria andLgSortIsNull() {
            addCriterion("lg_sort is null");
            return (Criteria) this;
        }

        public Criteria andLgSortIsNotNull() {
            addCriterion("lg_sort is not null");
            return (Criteria) this;
        }

        public Criteria andLgSortEqualTo(String value) {
            addCriterion("lg_sort =", value, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortNotEqualTo(String value) {
            addCriterion("lg_sort <>", value, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortGreaterThan(String value) {
            addCriterion("lg_sort >", value, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortGreaterThanOrEqualTo(String value) {
            addCriterion("lg_sort >=", value, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortLessThan(String value) {
            addCriterion("lg_sort <", value, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortLessThanOrEqualTo(String value) {
            addCriterion("lg_sort <=", value, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortLike(String value) {
            addCriterion("lg_sort like", value, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortNotLike(String value) {
            addCriterion("lg_sort not like", value, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortIn(List<String> values) {
            addCriterion("lg_sort in", values, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortNotIn(List<String> values) {
            addCriterion("lg_sort not in", values, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortBetween(String value1, String value2) {
            addCriterion("lg_sort between", value1, value2, "lgSort");
            return (Criteria) this;
        }

        public Criteria andLgSortNotBetween(String value1, String value2) {
            addCriterion("lg_sort not between", value1, value2, "lgSort");
            return (Criteria) this;
        }
    }

    /**
     */
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
