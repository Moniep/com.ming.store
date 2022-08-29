package com.ming.store.mapper;

import com.ming.store.entity.Order;
import com.ming.store.entity.OrderItem;

/**
 * @author: zheming
 * @data 2022/6/8 23:52
 */
public interface OrderMapper {
    Integer insertOrder(Order order);
    Integer insertOrderItem(OrderItem orderItem);
}
