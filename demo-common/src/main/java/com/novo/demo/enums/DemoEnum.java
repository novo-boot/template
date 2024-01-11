package com.novo.demo.enums;

import lombok.Getter;

/**
 *
 * @author fuqf
 */
@Getter
public enum DemoEnum {

    /**
     * CREATE
     */
    CREATE("CREATE", "创建"),

    ;

    private final String code;

    private final String msg;

    DemoEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
