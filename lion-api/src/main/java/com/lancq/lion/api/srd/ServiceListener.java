package com.lancq.lion.api.srd;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface ServiceListener {
    void onServiceAdded(String path, ServiceNode node);

    void onServiceUpdated(String path, ServiceNode node);

    void onServiceRemoved(String path, ServiceNode node);

}
