package com.novo.demo.constant;

import java.io.Serializable;

/**
 * @author fuqf1
 * @description redis keys
 * @date
 */
public class DemoRedisKesConstant implements Serializable {

    private static final long serialVersionUID = 1258460125014932138L;

    private DemoRedisKesConstant() {
    }

    /**
     * 缓存时间 (单位：分钟) start
     */
    public static long CACHE_EXPIRE_DAY = 1440;

    /**
     * DEMO_KEY
     */
    public static String DEMO_KEY = "inside:get_platform_by_id|id:%s";

}
