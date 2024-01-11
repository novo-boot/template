
package com.novo.demo.configuration;

import com.novo.demo.config.DemoProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * RunnerConfig
 *
 * @author fuqf1
 */
@Slf4j
@Order(2)
@Configuration
@EnableConfigurationProperties({ DemoProperties.class })
public class DemoBeanRegisterConfig {

}
