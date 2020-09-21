package com.ratel.mall.annotation;

import org.springframework.core.annotation.AliasFor;

/**
 * @author ratel
 * @date 2020-09-21
 */
public @interface ApiLog {
    @AliasFor("value")
    String tag();

    String value();

}
