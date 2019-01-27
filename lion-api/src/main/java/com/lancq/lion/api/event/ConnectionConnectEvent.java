package com.lancq.lion.api.event;

import com.lancq.lion.api.connection.Connection;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public final class ConnectionConnectEvent implements Event {
    public final Connection connection;

    public ConnectionConnectEvent(Connection connection) {
        this.connection = connection;
    }

}
