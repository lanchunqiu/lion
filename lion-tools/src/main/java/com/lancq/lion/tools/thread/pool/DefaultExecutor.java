package com.lancq.lion.tools.thread.pool;

import java.util.concurrent.*;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/28
 **/
public final class DefaultExecutor extends ThreadPoolExecutor {

    public DefaultExecutor(int corePoolSize, int maximumPoolSize,
                           long keepAliveTime, TimeUnit unit,
                           BlockingQueue<Runnable> workQueue,
                           ThreadFactory threadFactory,
                           RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }

}
