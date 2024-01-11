package com.novo.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author fuqf1
 */
@Data
@ConfigurationProperties(prefix = DemoProperties.PREFIX)
public class DemoProperties implements Serializable {

    private static final long serialVersionUID = 8812624328024856343L;

    /**
     * PREFIX
     */
    protected static final String PREFIX = "demo.data";

}
