# SpringCloud-Simple-Demo

这是一个 Spring Cloud 的简单学习 Demo 项目。

## 项目结构

本项目是一个多模块的 Maven 项目，结构如下：

-   `model`: 通用模块，存放一些实体类，如 `Order`、`Product` 等。
-   `services`: 微服务模块
    -   `service-product`: 商品服务
    -   `service-order`: 订单服务

## 技术栈

-   Spring Boot
-   Spring Cloud
-   Spring Cloud Alibaba
-   Maven

## 如何运行

1.  启动 Nacos 服务
2.  分别启动 `service-product` 和 `service-order` 服务
3.  ...