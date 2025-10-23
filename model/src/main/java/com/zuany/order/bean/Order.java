package com.zuany.order.bean;

import java.math.BigDecimal;
import java.util.List;

import com.zuany.product.bean.Product;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Order {
    private Long id;
    private BigDecimal totalAmount;
    private Long userId;
    private String nickname;
    private String address;
    private List<Product> productList;
}