package com.ming.store.service;

import com.ming.store.entity.Product;

import java.util.List;

/**
 * @author: zheming
 * @data 2022/6/8 19:56
 */
public interface IProductService {
    List<Product> findHotList();

    Product findById(Integer id);
}
