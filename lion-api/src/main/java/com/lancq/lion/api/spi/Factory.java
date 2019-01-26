package com.lancq.lion.api.spi;

import java.util.function.Supplier;
/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
@FunctionalInterface
public interface Factory<T> extends Supplier<T> {
}
