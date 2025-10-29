package com.zuany.controller;

import com.zuany.properties.OrderProperties;
import com.zuany.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.zuany.order.bean.Order;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderProperties orderProperties;

    @GetMapping("/config")
    public String config() {
        return "order timeout: " + orderProperties.getTimeout()
                + " auto-confirm: " + orderProperties.getAutoConfirm()
                + " db-url: " + orderProperties.getDbUrl();
    }
    @GetMapping("/create")
    public Order createOrder(@RequestParam("userId") Long userId,
                             @RequestParam("productId") Long productId) {
        return orderService.createOrder(productId, userId);
    }
}
