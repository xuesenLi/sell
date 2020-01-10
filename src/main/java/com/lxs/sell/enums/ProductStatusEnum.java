package com.lxs.sell.enums;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Mr.Li
 * @date 2020/1/8 - 21:12
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1,"下架"),

    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }


}
