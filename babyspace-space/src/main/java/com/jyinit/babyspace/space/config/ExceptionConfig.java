package com.jyinit.babyspace.space.config;

import com.jyinit.babyspace.common.exception.BSExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author AJ ajin0369@outlook.com
 */
@Configuration
public class ExceptionConfig {

    @Bean
    public BSExceptionHandler bsExceptionHandler(){
        return new BSExceptionHandler();
    }
}
