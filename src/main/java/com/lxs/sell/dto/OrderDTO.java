package com.lxs.sell.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lxs.sell.dataObject.OrderDetail;
import com.lxs.sell.utils.serializer.Timestamp2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /** 订单id. */
    private String orderId;

    /** 买家名字. */
    private String buyerName;

    /** 买家手机号. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家微信Openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为0新下单. */
    private Integer orderStatus;

    /** 支付状态, 默认为0未支付. */
    private Integer payStatus;

    /** 创建时间. */
    @JsonSerialize(using = Timestamp2LongSerializer.class)
    private Timestamp createTime;

    /** 更新时间. */
    @JsonSerialize(using = Timestamp2LongSerializer.class)
    private Timestamp updateTime;

    List<OrderDetail> orderDetailList;

}
