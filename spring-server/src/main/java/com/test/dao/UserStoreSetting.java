package com.test.dao;

import com.alibaba.fastjson.JSONArray;

import java.io.Serializable;

/**
 * user_store_setting
 * @author
 */
public class UserStoreSetting implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 店铺id
     */
    private Long storeId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 是否管理店铺所有商品
     */
    private Boolean autoPullAllProduct;

    /**
     * 同步订单设置Import all unsynced orders[1_yes,0_no]
     */
    private Boolean autoPullAllOrder;

    /**
     * 是否自动刷新token
     */
    private Boolean isRefreshToken;

    /**
     * 是否创建webhook
     */
    private Boolean isCreateWebhook;

    /**
     * 物流方式[1->最便宜的，2->最快的]
     */
    private Integer deliverySettings;

    /**
     * 自定义物流等级排序
     */
    private String lgSort;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getAutoPullAllProduct() {
        return autoPullAllProduct;
    }

    public void setAutoPullAllProduct(Boolean autoPullAllProduct) {
        this.autoPullAllProduct = autoPullAllProduct;
    }

    public Boolean getAutoPullAllOrder() {
        return autoPullAllOrder;
    }

    public void setAutoPullAllOrder(Boolean autoPullAllOrder) {
        this.autoPullAllOrder = autoPullAllOrder;
    }

    public Boolean getRefreshToken() {
        return isRefreshToken;
    }

    public void setRefreshToken(Boolean refreshToken) {
        isRefreshToken = refreshToken;
    }

    public Boolean getCreateWebhook() {
        return isCreateWebhook;
    }

    public void setCreateWebhook(Boolean createWebhook) {
        isCreateWebhook = createWebhook;
    }

    public Integer getDeliverySettings() {
        return deliverySettings;
    }

    public void setDeliverySettings(Integer deliverySettings) {
        this.deliverySettings = deliverySettings;
    }

    public String getLgSort() {
        return lgSort;
    }

    public void setLgSort(String lgSort) {
        this.lgSort = lgSort;
    }


}
