package com.lxs.sell.repository;

import com.lxs.sell.dataObject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Mr.Li
 * @date 2020/1/8 - 20:53
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);


    ProductInfo findByProductId(String productId);
}
