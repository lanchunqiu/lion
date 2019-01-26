package com.lancq.lion.api.common;


import com.lancq.lion.api.event.*;
import com.lancq.lion.api.spi.Plugin;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public interface ServerEventListener extends Plugin {
    /**
     * 该事件通过guava EventBus发出，实现接口的方法必须增加
     *
     * <code>@Subscribe 和 @AllowConcurrentEvents</code>注解，
     * 并在构造函数调用EventBus.register(this);
     */
    default void on(ServerStartupEvent event) {
    }

    /**
     * 该事件通过guava EventBus发出，实现接口的方法必须增加
     *
     * <code>@Subscribe 和 @AllowConcurrentEvents</code>注解，
     * 并在构造函数调用EventBus.register(this);
     */
    default void on(ServerShutdownEvent server) {
    }

    /**
     * 该事件通过guava EventBus发出，实现接口的方法必须增加
     *
     * <code>@Subscribe 和 @AllowConcurrentEvents</code>注解，
     * 并在构造函数调用EventBus.register(this);
     */
    default void on(RouterChangeEvent event) {
    }

    /**
     * 该事件通过guava EventBus发出，实现接口的方法必须增加
     *
     * <code>@Subscribe 和 @AllowConcurrentEvents</code>注解，
     * 并在构造函数调用EventBus.register(this);
     */
    default void on(KickUserEvent event) {
    }

    /**
     * 该事件通过guava EventBus发出，实现接口的方法必须增加
     *
     * <code>@Subscribe 和 @AllowConcurrentEvents</code>注解，
     * 并在构造函数调用EventBus.register(this);
     */
    default void on(UserOnlineEvent event) {
    }

    /**
     * 该事件通过guava EventBus发出，实现接口的方法必须增加
     *
     * <code>@Subscribe 和 @AllowConcurrentEvents</code>注解，
     * 并在构造函数调用EventBus.register(this);
     */
    default void on(UserOfflineEvent event) {
    }

}
