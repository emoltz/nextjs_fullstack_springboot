package com.owlai.springboot.security;


import jakarta.servlet.Filter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

@Configuration
public class SecurityConfig extends WebSecurityConfiguration implements SecurityConfigInterface {

    @Override
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    @Bean
    public SecretKey secretKey() {
        return Keys.hmacShaKeyFor("YOUR_SECRET_KEY".getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Configure your authentication logic here, e.g. in-memory or using a custom UserDetailsService
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .addFilterAfter(new JwtTokenVerifier(secretKey()), UsernamePasswordAuthenticationFilter.class);
    }

    }
}
