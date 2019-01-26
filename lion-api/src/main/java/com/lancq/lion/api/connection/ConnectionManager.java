package com.lancq.lion.api.connection;

import io.netty.channel.Channel;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public interface ConnectionManager {

    Connection get(Channel channel);

    Connection removeAndClose(Channel channel);

    void add(Connection connection);

    int getConnNum();

    void init();

    void destroy();

}
