package com.lxs.sell.service;


import com.lxs.sell.dataObject.ProductCategory;

import java.util.List;

/**
 * @author Mr.Li
 * @date 2020/1/7 - 9:53
 */
public interface ProductCategoryService {

    ProductCategory findByCategoryId(Integer categoryId);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    List<ProductCategory> findAll();

    ProductCategory save(ProductCategory productCategory);



}
