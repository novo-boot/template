package com.novo.demo.exception;

import lombok.Data;

/**
 * 业务异常 用于在处理业务逻辑时，进行抛出的异常。
 *
 * @author fuqf1
 */
@Data
public class DemoBizException extends RuntimeException {

    /**
     * 异常编码
     */
    private final int code;

    private static final long serialVersionUID = -3843907364558373817L;

    public DemoBizException(String message) {
        super(message);
        this.code = 404;
    }

    public DemoBizException(int code, String message) {
        super(message);
        this.code = code;
    }

    public DemoBizException(int code, String message, Object... args) {
        super(message);
        this.code = code;

    }

    /**
     * 实例化异常
     * @param code 自定义异常编码
     * @param message 自定义异常消息
     * @param args 已定义异常参数
     * @return
     */
    public static DemoBizException wrap(int code, String message, Object... args) {
        return new DemoBizException(code, message, args);
    }

    public static DemoBizException wrap(String message, Object... args) {
        return new DemoBizException(-1, message, args);
    }

    public static DemoBizException validFail(String message, Object... args) {
        return new DemoBizException(-9, message, args);
    }

}
