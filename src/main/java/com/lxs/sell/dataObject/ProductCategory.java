package com.lxs.sell.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Mr.Li
 * @date 2020/1/8 - 20:41
 */
@Entity
@Data
public class ProductCategory {

    @Id
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;


}
