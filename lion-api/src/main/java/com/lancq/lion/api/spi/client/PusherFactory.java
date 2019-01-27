package com.lancq.lion.api.spi.client;

import com.lancq.lion.api.push.PushSender;
import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface PusherFactory extends Factory<PushSender> {
    static PushSender create() {
        return SpiLoader.load(PusherFactory.class).get();
    }

}
