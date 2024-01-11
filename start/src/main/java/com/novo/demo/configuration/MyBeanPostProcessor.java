package com.novo.demo.configuration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * 配置类
 *
 * @author erwinfu
 */
@Component
public class MyBeanPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        HashMap<String, Class<?>> beans = BeanNamesClass.getBeans();
        beans.forEach((key, value) -> {
            // 先移除原来的bean定义
            beanDefinitionRegistry.removeBeanDefinition(key);
            // 注册我们自己的bean定义
            BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(value);
            // 将Bean 的定义注册到Spring环境
            beanDefinitionRegistry.registerBeanDefinition(key, beanDefinitionBuilder.getBeanDefinition());
        });

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)
            throws BeansException {

    }

}
