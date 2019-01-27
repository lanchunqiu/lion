package com.lancq.lion.api.protocol;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public enum Command {
    HEARTBEAT(1), // 心跳
    HANDSHAKE(2), // 握手
    LOGIN(3), // 登录
    LOGOUT(4), // 登出
    BIND(5), // 绑定
    UNBIND(6), // 解绑
    FAST_CONNECT(7),
    PAUSE(8),
    RESUME(9),
    ERROR(10),
    OK(11),
    HTTP_PROXY(12),
    KICK(13),
    GATEWAY_KICK(14),
    PUSH(15),
    GATEWAY_PUSH(16),
    NOTIFICATION(17),
    GATEWAY_NOTIFICATION(18),
    CHAT(19),
    GATEWAY_CHAT(20),
    GROUP(21),
    GATEWAY_GROUP(22),
    ACK(23),
    NACK(24),
    UNKNOWN(-1);

    Command(int cmd) {
        this.cmd = (byte) cmd;
    }

    public final byte cmd;

    public static Command toCMD(byte b) {
        Command[] values = values();
        if (b > 0 && b < values.length) return values[b - 1];
        return UNKNOWN;
    }

}
