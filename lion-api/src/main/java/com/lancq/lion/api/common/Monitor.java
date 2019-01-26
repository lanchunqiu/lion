package com.lancq.lion.api.common;

import java.util.concurrent.Executor;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public interface Monitor {

    void monitor(String name, Thread thread);

    void monitor(String name, Executor executor);

}
