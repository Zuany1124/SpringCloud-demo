package com.zuany.service;

import com.zuany.order.bean.Order;

public interface OrderService {
    Order createOrder(Long productId, Long userId);
}
