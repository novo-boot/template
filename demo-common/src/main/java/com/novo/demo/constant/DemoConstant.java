package com.novo.demo.constant;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author fuqf1
 * @description constant
 * @date 2023/9/6 11:44
 */
public class DemoConstant implements Serializable {

    private static final long serialVersionUID = -4526561303320334344L;

    private DemoConstant() {
    }

    /**
     * consumerGroup
     */
    public static final String DEMO_CONSTANT = "DEMO_CONSTANT";

    /**
     * CONSTANT_MAP
     */
    public static final ConcurrentMap<String, String> CONSTANT_MAP = new ConcurrentHashMap<>();

}
