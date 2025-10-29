package com.zuany.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "order")
public class OrderProperties {

    String timeout;

    String autoConfirm;

    String dbUrl;
}

