package com.ratel.mall.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ratel.mall.constant.SystemErrorCode;
import com.ratel.mall.exception.JscksonSerializationException;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author ratel
 * @date 2020-09-28
 */
@Slf4j
public class JsonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String jsonToString(Object obj){
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("JsonUtil.jsonToString() 异常，入参类型：{}",obj == null ? null : obj.getClass());
            throw new JscksonSerializationException(SystemErrorCode.JSON_SERIALIZATION);
        }
    }

    public static <T> T parseToObject(String json,Class<T> t){
        try {
            if (json == null){
                return null;
            }
            return objectMapper.readValue(json,t);
        } catch (IOException e) {
            log.error("JsonUtil.parseToObject() 异常，入参，json:{},cls:{}",json,t);
            throw new JscksonSerializationException(SystemErrorCode.JSON_SERIALIZATION);
        }
    }
}
