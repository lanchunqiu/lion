package com.lancq.lion.api.spi.common;

import com.lancq.lion.api.spi.SpiLoader;

import java.util.concurrent.Executor;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface ExecutorFactory {
    String PUSH_CLIENT = "push-client";
    String PUSH_TASK = "push-task";
    String ACK_TIMER = "ack-timer";
    String EVENT_BUS = "event-bus";
    String MQ = "mq";

    Executor get(String name);

    static ExecutorFactory create() {
        return SpiLoader.load(ExecutorFactory.class);
    }

}
