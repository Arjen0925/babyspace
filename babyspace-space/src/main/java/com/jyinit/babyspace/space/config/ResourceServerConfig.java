package com.jyinit.babyspace.space.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author AJ ajin0369@outlook.com
 */
@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login").permitAll()
                //验证所有请求
                .anyRequest()
                .authenticated();
//                .antMatchers("/").hasAnyAuthority("SystemContent")
//                .antMatchers("/view/**").hasAnyAuthority("SystemContentView")
//                .antMatchers("/insert/**").hasAnyAuthority("SystemContentInsert");




    }
}
