package com.ratel.mall.constant;

/**
 * @author ratel
 * @date 2020-09-21
 */
public enum CommonResultCode implements ErrorCode {
    SUCCESS("200", "操作成功"),
    FAILED("500", "操作失败"),
    VALIDATE_FAILED("400", "参数检验失败"),
    UNAUTHORIZED("401", "暂未登录或token已经过期"),
    FORBIDDEN("403", "没有相关权限");


    private String code;
    private String msg;

    CommonResultCode(String code, String msg) {
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
