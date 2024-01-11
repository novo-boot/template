package com.novo.demo.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fuqf1
 */
@Slf4j
public class AuthInterceptor extends HandlerInterceptorAdapter {

    /**
     * redis服务
     */
    public StringRedisTemplate redisTemplate;

    /**
     * redis服务
     * @param request current HTTP request
     * @param response current HTTP response
     * @param handler chosen handler to execute, for type and/or instance evaluation
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // TODO document why this method is empty
        return false;
    }

}
