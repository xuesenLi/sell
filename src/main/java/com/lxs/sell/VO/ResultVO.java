package com.lxs.sell.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lxs.sell.enums.ResultEnum;
import lombok.Data;

/**
 * @author Mr.Li
 * @date 2020/1/9 - 9:54
 */
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL) //为空的不返回
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

    public ResultVO(){

    }

    private ResultVO(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    private ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> ResultVO<T> success(){
        return new ResultVO<T> (ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg());
    }

    public static <T> ResultVO<T> success(T data){
        return new ResultVO<T> (ResultEnum.SUCCESS.getCode(), data);
    }

    public static <T> ResultVO<T> error(ResultEnum resultEnum){
        return new ResultVO<T> (resultEnum.getCode(), resultEnum.getMsg());
    }
}
