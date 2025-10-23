package com.zuany.service.Impl;

import com.zuany.product.bean.Product;
import com.zuany.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProductById(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setPrice(new BigDecimal("99"));
        product.setProductName("apple-" + id);
        product.setNum(2);

        // TimeUnit.SECONDS.sleep(100);

        return product;
    }
}
