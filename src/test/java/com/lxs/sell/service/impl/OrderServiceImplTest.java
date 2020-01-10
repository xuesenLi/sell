package com.lxs.sell.service.impl;

import com.lxs.sell.SellApplicationTests;
import com.lxs.sell.dataObject.OrderDetail;
import com.lxs.sell.dto.OrderDTO;
import com.lxs.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Mr.Li
 * @date 2020/1/9 - 15:55
 */
@Slf4j
public class OrderServiceImplTest extends SellApplicationTests {

    private final String BUYER_OPENID = "1101110";

    private final String ORDER_ID = "1578559131588854707";

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("廖师兄");
        orderDTO.setBuyerAddress("幕课网");
        orderDTO.setBuyerPhone("123456789012");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("123321123");
        o1.setProductQuantity(1);

        OrderDetail o2 = new OrderDetail();
        o2.setProductId("321321321321");
        o2.setProductQuantity(2);

        orderDetailList.add(o1);
        orderDetailList.add(o2);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
        log.info("【创建订单】result={}", result);
    }

    @Test
    public void findByOrderId(){
        OrderDTO result = orderService.findByOrderId(ORDER_ID);
        log.info("【查询单个订单】result={}", result);
        Assert.assertEquals(ORDER_ID, result.getOrderId());
    }


    @Test
    public void findList(){
        Pageable pageable = PageRequest.of(0, 2);
        Page<OrderDTO> orderDTOPage = orderService.findList(BUYER_OPENID, pageable);

        Assert.assertNotEquals(0, orderDTOPage.getTotalElements());

    }

    @Test
    public void cancel(){

        OrderDTO orderDTO = orderService.findByOrderId(ORDER_ID);
        OrderDTO result = orderService.cancel(orderDTO);

    }

    @Test
    public void finish(){

        OrderDTO orderDTO = orderService.findByOrderId(ORDER_ID);
        OrderDTO result = orderService.finish(orderDTO);

    }
}
