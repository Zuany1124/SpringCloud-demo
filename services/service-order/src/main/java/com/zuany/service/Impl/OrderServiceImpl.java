package com.zuany.service.Impl;
import java.math.BigDecimal;
import java.util.List;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import com.zuany.feign.ProductFeignClient;
import com.zuany.order.bean.Order;
import com.zuany.product.bean.Product;
import com.zuany.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private ProductFeignClient productFeignClient;
    @Override
    @SentinelResource(value = "createOrder", blockHandler = "createOrderFallback")
    public Order createOrder(Long productId, Long userId) {
        Order order = new Order();
        order.setId(0L);
        Product product = productFeignClient.getProductById(productId);
        BigDecimal totalAmount = product.getPrice().multiply(new BigDecimal(product.getNum()));
        order.setTotalAmount(totalAmount);
        order.setUserId(0L);
        order.setNickname("zuany");
        order.setAddress("shenzhen");
        order.setProductList(List.of(product));
        return order;
    }
}
