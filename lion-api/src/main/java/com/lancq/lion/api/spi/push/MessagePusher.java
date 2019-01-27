package com.lancq.lion.api.spi.push;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface MessagePusher {
    void push(IPushMessage message);
}
