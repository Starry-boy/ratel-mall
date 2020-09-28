package com.ratel.mall.api;

import com.ratel.mall.constant.CommonResultCode;
import com.ratel.mall.constant.ErrorCode;
import lombok.Data;

/**
 * @author ratel
 * @date 2020-09-21
 */
@Data
public class R<T> {
    private String code;
    private String msg;
    private T data;

    private R(){
    }

    public static <T> R<T> ok(ErrorCode code,T t){
        R<T> r = new R();
        r.setCode(code == null ? CommonResultCode.SUCCESS.getCode() : code.getCode());
        r.setMsg(code == null ? CommonResultCode.SUCCESS.getMsg() : code.getMsg());
        r.setData(t == null ? null : t);
        return r;
    }

    public static <T> R<T> ok(T t){
        return ok(null,t);
    }

    public static <T> R<T> ok(){
        return ok(null,null);
    }
}
