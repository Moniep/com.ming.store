package com.ming.store.service;

import com.ming.store.entity.Order;

/**
 * @author: zheming
 * @data 2022/6/8 23:58
 */
public interface IOrderService {
    Order create(Integer aid, Integer[] cids, Integer uid, String username);
}
