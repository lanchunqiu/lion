package com.lancq.lion.api.service;

import java.util.concurrent.CompletableFuture;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface Service {

    void start(Listener listener);

    void stop(Listener listener);

    CompletableFuture<Boolean> start();

    CompletableFuture<Boolean> stop();

    boolean syncStart();

    boolean syncStop();

    void init();

    boolean isRunning();

}
