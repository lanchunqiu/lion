package com.lancq.lion.api.srd;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface ServiceNode {
    String serviceName();

    String nodeId();

    String getHost();

    int getPort();

    default <T> T getAttr(String name) {
        return null;
    }

    default boolean isPersistent() {
        return false;
    }

    default String hostAndPort() {
        return getHost() + ":" + getPort();
    }

    default String nodePath() {
        return serviceName() + '/' + nodeId();
    }

}
