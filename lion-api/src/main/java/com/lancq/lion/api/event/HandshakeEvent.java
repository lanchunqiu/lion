package com.lancq.lion.api.event;

import com.lancq.lion.api.connection.Connection;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public final class HandshakeEvent implements Event {
    public final Connection connection;
    public final int heartbeat;

    public HandshakeEvent(Connection connection, int heartbeat) {
        this.connection = connection;
        this.heartbeat = heartbeat;
    }

}
