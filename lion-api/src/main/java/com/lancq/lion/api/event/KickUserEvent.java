package com.lancq.lion.api.event;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public final class KickUserEvent implements Event {
    public final String userId;
    public final String deviceId;
    public final String fromServer;

    public KickUserEvent(String userId, String deviceId, String fromServer) {
        this.userId = userId;
        this.deviceId = deviceId;
        this.fromServer = fromServer;
    }

}
