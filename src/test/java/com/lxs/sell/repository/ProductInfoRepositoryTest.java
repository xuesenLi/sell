package com.lxs.sell.repository;

import com.lxs.sell.SellApplicationTests;
import com.lxs.sell.dataObject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Mr.Li
 * @date 2020/1/8 - 20:55
 */
@Slf4j
public class ProductInfoRepositoryTest extends SellApplicationTests {

    @Autowired
    private ProductInfoRepository repository;


    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123321123");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductDescription("很好喝");
        productInfo.setProductPrice(new BigDecimal(3.44));
        productInfo.setProductStock(100);
        productInfo.setProductIcon("xuesenli.top.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = repository.save(productInfo);

        Assert.assertNotNull(result);

        log.info("------{}", result.toString());

    }



    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        System.out.println(productInfoList.size());
    }
}
