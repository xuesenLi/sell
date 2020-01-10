package com.lxs.sell.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    //描述
    private String productDescription;

    //小图
    private String productIcon;

    //状态 0 正常  1 下架
    private Integer productStatus;

    //类目编号
    private Integer categoryType;

/*    private Date createTime;

    private Date updateTime;*/
}
