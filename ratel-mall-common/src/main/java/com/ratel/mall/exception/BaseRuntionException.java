package com.ratel.mall.exception;

import com.ratel.mall.constant.ErrorCode;

/**
 * @author ratel
 * @date 2020-09-28
 */
public class BaseRuntionException extends RuntimeException{
    private ErrorCode errorCode;

    public BaseRuntionException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
