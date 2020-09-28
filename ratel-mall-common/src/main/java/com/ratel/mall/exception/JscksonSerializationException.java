package com.ratel.mall.exception;

import com.ratel.mall.constant.ErrorCode;

/**
 * @author ratel
 * @date 2020-09-28
 */
public class JscksonSerializationException extends BaseRuntionException{

    public JscksonSerializationException(ErrorCode errorCode) {
        super(errorCode);
    }
}
