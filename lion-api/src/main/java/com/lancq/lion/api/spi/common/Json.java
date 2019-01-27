package com.lancq.lion.api.spi.common;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface Json {
    Json JSON = JsonFactory.create();

    <T> T fromJson(String json, Class<T> clazz);

    String toJson(Object json);

}
