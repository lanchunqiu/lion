package com.lancq.lion.api.spi.common;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface MQMessageReceiver {
    void receive(String topic, Object message);
}
