package com.ratel.mall.constant;

/**
 * @author ratel
 * @date 2020-09-28
 */
public enum SystemErrorCode implements ErrorCode {
    JSON_SERIALIZATION("json 序列化异常", "50001");

    private final String code;
    private final String msg;

    SystemErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public String getCode() {
        return code;
    }
}
