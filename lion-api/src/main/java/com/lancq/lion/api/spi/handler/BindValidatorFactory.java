package com.lancq.lion.api.spi.handler;

import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface BindValidatorFactory extends Factory<BindValidator> {
    static BindValidator create() {
        return SpiLoader.load(BindValidatorFactory.class).get();
    }

}
