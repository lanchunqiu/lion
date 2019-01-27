package com.lancq.lion.api.spi.handler;

import com.lancq.lion.api.message.MessageHandler;
import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface PushHandlerFactory extends Factory<MessageHandler> {
    static MessageHandler create() {
        return SpiLoader.load(PushHandlerFactory.class).get();
    }

}
