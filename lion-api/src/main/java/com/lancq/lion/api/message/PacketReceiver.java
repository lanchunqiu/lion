package com.lancq.lion.api.message;

import com.lancq.lion.api.connection.Connection;
import com.lancq.lion.api.protocol.Packet;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface PacketReceiver {
    void onReceive(Packet packet, Connection connection);
}
