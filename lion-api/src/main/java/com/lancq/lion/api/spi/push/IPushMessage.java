package com.lancq.lion.api.spi.push;

import com.lancq.lion.api.common.Condition;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface IPushMessage {

    boolean isBroadcast();

    String getUserId();

    int getClientType();

    byte[] getContent();

    boolean isNeedAck();

    byte getFlags();

    int getTimeoutMills();

    default String getTaskId() {
        return null;
    }

    default Condition getCondition() {
        return null;
    }

    default void finalized() {

    }

}
