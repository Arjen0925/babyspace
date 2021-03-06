package com.jyinit.babyspace.space;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author AJ ajin0369@outlook.com
 */

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.jyinit.babyspace.space.dao"})
public class SpaceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpaceApplication.class, args);
    }
}

