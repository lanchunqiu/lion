package com.lancq.lion.api.spi.common;

import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface MQClientFactory extends Factory<MQClient> {
    static MQClient create() {
        return SpiLoader.load(MQClientFactory.class).get();
    }

}
