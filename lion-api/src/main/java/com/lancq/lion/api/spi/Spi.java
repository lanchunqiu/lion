package com.lancq.lion.api.spi;

import java.lang.annotation.*;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Spi {

    /**
     * SPI name
     *
     * @return name
     */
    String value() default "";

    /**
     * 排序顺序
     *
     * @return sortNo
     */
    int order() default 0;

}
