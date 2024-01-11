package com.novo.demo.configuration;

import com.novo.redis.DynamicRedisProvider;
import com.novo.redis.Jackson2JsonRedisSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

/**
 * @author fuqf1
 */
@Configuration
public class DemoRedisConfig {

    /**
     * dynamicRedisProvider
     */
    @Resource
    private DynamicRedisProvider dynamicRedisProvider;

    /**
     * redisTemplateMaster
     * @return redisTemplateMaster
     */
    @Bean(name = "redisTemplate")
    public StringRedisTemplate redisTemplateMaster() {
        StringRedisTemplate template = new StringRedisTemplate(
                dynamicRedisProvider.getConnectionFactories().get("master"));
        Jackson2JsonRedisSerializer.setJacksonSerializer(template);
        return template;
    }

}
