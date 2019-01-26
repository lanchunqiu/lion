package com.lancq.lion.api.spi;

import com.lancq.lion.api.LionContext;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public interface Plugin {
    default void init(LionContext context) {

    }

    default void destroy() {

    }

}
