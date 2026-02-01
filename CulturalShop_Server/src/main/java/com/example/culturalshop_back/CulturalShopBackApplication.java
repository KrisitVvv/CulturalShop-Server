package com.example.culturalshop_back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.example.culturalshop_back.mapper")
public class CulturalShopBackApplication {
    public static void main(String[] args) {
        SpringApplication.run(CulturalShopBackApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

