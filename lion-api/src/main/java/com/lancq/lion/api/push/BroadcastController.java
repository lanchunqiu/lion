package com.lancq.lion.api.push;

import java.util.List;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface BroadcastController {
    String taskId();

    int qps();

    void updateQps(int qps);

    boolean isDone();

    int sendCount();

    void cancel();

    boolean isCancelled();

    int incSendCount(int count);

    void success(String... userIds);

    List<String> successUserIds();

}
