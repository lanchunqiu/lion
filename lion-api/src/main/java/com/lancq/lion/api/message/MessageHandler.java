package com.lancq.lion.api.message;

import com.lancq.lion.api.connection.Connection;
import com.lancq.lion.api.protocol.Packet;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface MessageHandler {
    void handle(Packet packet, Connection connection);
}
