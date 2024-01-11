package com.novo.demo.util;

import com.novo.demo.exception.DemoBizException;

/**
 * 断言
 *
 * @author fuqf1
 */
public class DemoBizAssert {

    private DemoBizAssert() {
    }

    /**
     * @param code code
     * @param message message
     */
    public static void fail(int code, String message) {
        throw new DemoBizException(code, message);
    }

}
