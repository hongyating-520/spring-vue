package com.example.springweb.jasypt.proyx.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author mima0000
 * @Date 2021/7/26 4:22 下午
 */
@Configuration
@ConfigurationProperties(prefix = "myservice.test")
public class MyConfigClass {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
