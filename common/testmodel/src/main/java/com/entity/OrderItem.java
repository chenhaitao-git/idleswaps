package com.entity;


import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * order_item
 * 订单项信息
 */
@Data
public class OrderItem {

    private String provinceInfo;

    private String orderId;

    private String subOrderId;

    private String orderItemId;

    private String shopId;

    private String shopName;

    private String spuId;

    private String spuUniqueId;

    private String spuName;

    private String spuSaleCat;

    private String skuId;

    private String skuUniqueId;


}
