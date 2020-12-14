package com.jyinit.babyspace.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * @author AJin ajin0369@outlook.com
 */
@Configuration
@EnableAuthorizationServer

public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.checkTokenAccess("permitAll()");
    }


    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                    .withClient("space")
                    .secret(passwordEncoder.encode("space1234"))
                    .autoApprove(false)
                    .redirectUris("http://localhost:8088/space/login")
                    .scopes("app")
                    .accessTokenValiditySeconds(7200)
                    .authorizedGrantTypes("authorization_code")
                .and()
                    .withClient("client2")
                    .secret(passwordEncoder.encode("test1234"))
                    .autoApprove(false)
                    .redirectUris("http://localhost:9999/test/login")
                    .scopes("app")
                    .accessTokenValiditySeconds(7200)
                    .authorizedGrantTypes("authorization_code");

    }
}
