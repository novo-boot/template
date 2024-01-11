package com.novo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DefaultApplication
 *
 * @author fuqf1
 */
@SpringBootApplication
public class DefaultApplication {

    public static void main(String[] args) {
        System.setProperty("nacos.logging.default.config.enabled", "false");
        System.setProperty("rocketmq.client.logUseSlf4j", "true");
        SpringApplication.run(DefaultApplication.class, args);
    }

}
