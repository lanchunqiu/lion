package com.lancq.lion.api.spi.core;

import com.lancq.lion.api.connection.Cipher;
import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface RsaCipherFactory extends Factory<Cipher> {
    static Cipher create() {
        return SpiLoader.load(RsaCipherFactory.class).get();
    }

}
