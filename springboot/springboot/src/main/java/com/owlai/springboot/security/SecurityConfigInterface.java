package com.owlai.springboot.security;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportAware;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.crypto.SecretKey;

public interface SecurityConfigInterface extends ImportAware, BeanClassLoaderAware {
    @Bean
    PasswordEncoder passwordEncoder();

    @Bean
    SecretKey secretKey();

    void configure(AuthenticationManagerBuilder auth) throws Exception;

    void configure(HttpSecurity http) throws Exception;
}
