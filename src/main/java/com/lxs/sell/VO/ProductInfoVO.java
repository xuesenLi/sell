package com.lxs.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品详情
 * @author Mr.Li
 * @date 2020/1/9 - 10:00
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("description")
    private BigDecimal productPrice;

    @JsonProperty("icon")
    private String productIcon;

}
