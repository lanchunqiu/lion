package com.lancq.lion.api.srd;

import com.lancq.lion.api.service.Service;

import java.util.List;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface ServiceDiscovery extends Service {
    List<ServiceNode> lookup(String path);

    void subscribe(String path, ServiceListener listener);

    void unsubscribe(String path, ServiceListener listener);

}
