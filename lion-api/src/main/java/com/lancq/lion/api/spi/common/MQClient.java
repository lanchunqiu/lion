package com.lancq.lion.api.spi.common;

import com.lancq.lion.api.spi.Plugin;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface MQClient extends Plugin {
    void subscribe(String topic, MQMessageReceiver receiver);

    void publish(String topic, Object message);

}
