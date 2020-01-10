package com.lxs.sell.repository;

import com.lxs.sell.dataObject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Mr.Li
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    ProductCategory findByCategoryId(Integer categoryId);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);


}
