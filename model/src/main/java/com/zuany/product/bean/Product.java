package com.zuany.product.bean;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Product {
    private Long id;
    private BigDecimal price;
    private String productName;
    private int num;
}
