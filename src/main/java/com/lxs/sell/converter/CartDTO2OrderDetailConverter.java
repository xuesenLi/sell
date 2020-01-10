package com.lxs.sell.converter;

import com.lxs.sell.dataObject.OrderDetail;
import com.lxs.sell.dto.CartDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mr.Li
 * @date 2020/1/9 - 21:24
 */
public class CartDTO2OrderDetailConverter {
    public static OrderDetail convert(CartDTO cartDTO){
        OrderDetail orderDetail = new OrderDetail();
        BeanUtils.copyProperties(cartDTO, orderDetail);
        return orderDetail;
    }

    public static List<OrderDetail> convert(List<CartDTO> cartDTOList){

        return cartDTOList.stream()
                .map(e -> convert(e))
                .collect(Collectors.toList());
    }
}
