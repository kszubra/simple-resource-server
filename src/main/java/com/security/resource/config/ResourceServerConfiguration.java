package com.security.resource.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.httpBasic().disable()
                //.requestMatchers().antMatchers("/api/**")
                //.and().authorizeRequests()
                //.antMatchers("/api/**").access("hasRole('ADMIN') or hasRole('USER')")
                //.and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
                .anonymous().and().authorizeRequests().antMatchers("/user/**").authenticated()
                .antMatchers("/public/**").permitAll();
    }
}
