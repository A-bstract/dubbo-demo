package com.example.providerfail;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.example.providerfail.service")
public class ProviderFailApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderFailApplication.class, args);
    }

}
