package com.lancq.lion.api.router;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public interface Router<T> {
    T getRouteValue();

    RouterType getRouteType();

    enum RouterType {
        LOCAL, REMOTE
    }

}
