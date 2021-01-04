package com.jyinit.babyspace.space;

import com.jyinit.babyspace.common.exception.BSExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author AJ ajin0369@outlook.com
 */

@SpringBootApplication
@EnableEurekaClient
public class SpaceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpaceApplication.class, args);
    }
}

