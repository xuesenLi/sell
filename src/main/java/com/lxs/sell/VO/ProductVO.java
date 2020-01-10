package com.lxs.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品（包含类目）
 *
 * @author Mr.Li
 * @date 2020/1/9 - 9:57
 */
@Data
public class ProductVO {

    @JsonProperty("name") //返回给前端的属性
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
