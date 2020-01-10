package com.lxs.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lxs.sell.dataObject.OrderDetail;
import com.lxs.sell.dto.CartDTO;
import com.lxs.sell.dto.OrderDTO;
import com.lxs.sell.enums.ResultEnum;
import com.lxs.sell.exception.SellException;
import com.lxs.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.Li
 * @date 2020/1/9 - 20:47
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {
        //Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        // CartDTOList  转换->> OrderDetailList
        List<OrderDetail> orderDetailList = CartDTO2OrderDetailConverter.convert(orderForm.getItems());

        //BeanUtils.copyProperties();
        /*try {
            //google  json  转换工具
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误, string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }*/
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }

}
