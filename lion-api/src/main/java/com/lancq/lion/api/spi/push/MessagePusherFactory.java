package com.lancq.lion.api.spi.push;

import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface MessagePusherFactory extends Factory<MessagePusher> {
    static MessagePusher create() {
        return SpiLoader.load(MessagePusherFactory.class).get();
    }

}
