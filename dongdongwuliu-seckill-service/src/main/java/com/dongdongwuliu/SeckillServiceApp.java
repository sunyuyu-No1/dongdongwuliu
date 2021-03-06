package com.dongdongwuliu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SeckillServiceApp
 * @Deacription TODO
 * @Author gao jie
 * @Date 2021/1/30 9:38
 * @Version 1.0
 **/
@EnableSwagger2 //Swagger 文档
@SpringBootApplication //启动
@EnableDiscoveryClient //注册与发现 注册中心
@EnableFeignClients  //需要声明式feign的客户端
@EnableCircuitBreaker //熔断
@MapperScan("com.dongdongwuliu.dao") //扫描mapper
public class SeckillServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(SeckillServiceApp.class,args);
    }
}

 

