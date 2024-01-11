package com.novo.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author fuqf1
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class DemoWebSecurityConfig {

    /**
     * 放行白名单路径
     */
    @Value("${demo.web.ws.ignore.whites.all}")
    private String allWhites;

    /**
     * 放行白名单路径
     */
    @Value("${demo.web.ws.ignore.whites.custom}")
    private String customWhites;

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        String[] whiteUrls = allWhites.split(",");
        return (web) -> web.ignoring().antMatchers(whiteUrls);
    }

    /**
     * 配置设置
     * @param http http
     */
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        String[] whiteUrls = customWhites.split(",");
        http.authorizeHttpRequests(author -> author.antMatchers(whiteUrls).permitAll().anyRequest().authenticated());
        // 关闭session
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // 关闭cors
        http.cors().disable();
        // 关闭csrf
        http.csrf().disable();

        return http.build();
    }

}
