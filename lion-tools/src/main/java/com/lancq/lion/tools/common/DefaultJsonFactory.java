package com.lancq.lion.tools.common;

import com.lancq.lion.api.spi.Spi;
import com.lancq.lion.api.spi.common.Json;
import com.lancq.lion.api.spi.common.JsonFactory;
import com.lancq.lion.tools.Jsons;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/28
 **/
@Spi
public final class DefaultJsonFactory implements JsonFactory, Json {
    @Override
    public <T> T fromJson(String json, Class<T> clazz) {
        return Jsons.fromJson(json, clazz);
    }

    @Override
    public String toJson(Object json) {
        return Jsons.toJson(json);
    }

    @Override
    public Json get() {
        return this;
    }

}
