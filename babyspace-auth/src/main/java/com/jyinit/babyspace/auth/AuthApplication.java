package com.jyinit.babyspace.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author AJ ajin0369@outlook.com
 */

@SpringBootApplication(scanBasePackages = "com.jyinit.babyspace.auth")
//@EnableEurekaClient
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
