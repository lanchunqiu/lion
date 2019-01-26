package com.lancq.lion.api.event;

import com.lancq.lion.api.connection.Connection;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public class UserOfflineEvent implements Event {
    private final Connection connection;
    private final String userId;

    public UserOfflineEvent(Connection connection, String userId) {
        this.connection = connection;
        this.userId = userId;
    }

    public Connection getConnection() {
        return connection;
    }

    public String getUserId() {
        return userId;
    }

}
