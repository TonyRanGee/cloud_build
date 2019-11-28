package com.qzr.qzr_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.qzr.*")
public class QzrServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(QzrServiceApplication.class, args);
    }

}
