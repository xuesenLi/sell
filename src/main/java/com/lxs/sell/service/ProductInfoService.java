package com.lxs.sell.service;

import com.lxs.sell.dataObject.ProductInfo;
import com.lxs.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Mr.Li
 * @date 2020/1/8 - 21:06
 */
public interface ProductInfoService {

    ProductInfo findByProductId(String productId);


    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    Page<ProductInfo> page(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
   // ProductInfo onSale(String productId);

    //下架
   // ProductInfo offSale(String productId);

}
