package com.utkarsh.OAuth.With.Google.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity httpSecurity){
        try {
            httpSecurity
                    .antMatcher("/**").authorizeRequests()
                    .antMatchers("/").permitAll()//
                    .anyRequest().authenticated()
                    .and()
                    .oauth2Login();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
