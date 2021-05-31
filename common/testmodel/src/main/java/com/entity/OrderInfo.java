package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
public class OrderInfo implements Serializable {
    private String provinceDeptCode;

    private String thirdPartyOrderId;

    private String promiseDate;

    private String promiseTimeRange;

    private String reservedDateStr;

    private String reservedTimeRange;

    private BigDecimal totalPriceWithMember;

    private String openId;
 
}
