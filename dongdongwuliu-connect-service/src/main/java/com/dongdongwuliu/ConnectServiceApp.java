package com.dongdongwuliu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2     // Swagger 文档
@SpringBootApplication  // springboot 启动类
@EnableDiscoveryClient  // 注册与发现 注册中心 nacos
@EnableFeignClients     // 需要声明式feign的客户端
@EnableCircuitBreaker   // 熔断
public class ConnectServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ConnectServiceApp.class, args);
    }
}
