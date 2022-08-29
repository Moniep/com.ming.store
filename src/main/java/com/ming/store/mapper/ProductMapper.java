package com.ming.store.mapper;

import com.ming.store.entity.Product;

import java.util.List;

/**
 * @author: zheming
 * @data 2022/6/8 19:53
 */
public interface ProductMapper {
    List<Product> findHotList();

    Product findById(Integer id);

}
