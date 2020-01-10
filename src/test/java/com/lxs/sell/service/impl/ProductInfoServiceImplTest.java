package com.lxs.sell.service.impl;

import com.lxs.sell.SellApplicationTests;
import com.lxs.sell.dataObject.ProductInfo;
import org.junit.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;

import static org.junit.Assert.*;

/**
 * @author Mr.Li
 * @date 2020/1/8 - 21:20
 */
public class ProductInfoServiceImplTest extends SellApplicationTests {


    @Test
    public void page() {
        ProductInfo productInfo = new ProductInfo();
        ExampleMatcher matcher =ExampleMatcher.matching().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<ProductInfo> example =Example.of(productInfo, matcher);

        return ;
    }
}
