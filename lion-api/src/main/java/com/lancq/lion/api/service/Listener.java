package com.lancq.lion.api.service;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface Listener {
    void onSuccess(Object... args);

    void onFailure(Throwable cause);

}
