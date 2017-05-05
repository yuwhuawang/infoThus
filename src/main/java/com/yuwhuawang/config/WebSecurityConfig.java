package com.yuwhuawang.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.servlet.http.HttpServlet;

/**
 * Created by yuwhuawang on 17/5/5.
 */
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    public final static String SESSION_KEY = "test";
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll().and()
                .logout().permitAll();
    }
}
