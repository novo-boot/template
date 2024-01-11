package com.novo.demo.specification;

import com.novo.demo.entity.Demo;
import org.springframework.stereotype.Component;

/**
 * @author erwinfu
 */
@Component
public class LbSpecification {

    /**
     * isSatisfiedBy
     * @param demo demo
     * @return boolean
     */
    public boolean isSatisfiedBy(Demo demo) {
        return true;
    }

}
