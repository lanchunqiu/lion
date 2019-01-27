package com.lancq.lion.api.spi.push;

import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface PushListenerFactory<M extends IPushMessage> extends Factory<PushListener<M>> {
    static <M extends IPushMessage> PushListener<M> create() {
        return (PushListener<M>) SpiLoader.load(PushListenerFactory.class).get();
    }

}
