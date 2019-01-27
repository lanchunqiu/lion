package com.lancq.lion.api.event;

import com.lancq.lion.api.connection.Connection;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public final class ConnectionCloseEvent implements Event {
    public final Connection connection;


    public ConnectionCloseEvent(Connection connection) {
        this.connection = connection;
    }

}
