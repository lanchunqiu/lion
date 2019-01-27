package com.lancq.lion.api.spi.common;

import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface CacheManagerFactory extends Factory<CacheManager> {
    static CacheManager create() {
        return SpiLoader.load(CacheManagerFactory.class).get();
    }

}
