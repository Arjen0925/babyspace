package com.jyinit.babyspace.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author AJ ajin0369@outlook.com
 */
@SpringBootApplication
@EnableEurekaServer
public class BSEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(BSEurekaApplication.class, args);
    }
}
