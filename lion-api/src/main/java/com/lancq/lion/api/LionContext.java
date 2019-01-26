package com.lancq.lion.api;

import javax.imageio.spi.ServiceRegistry;
import javax.management.monitor.Monitor;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public interface LionContext {
    Monitor getMonitor();

    //ServiceDiscovery getDiscovery();

    ServiceRegistry getRegistry();

    //CacheManager getCacheManager();

    //MQClient getMQClient();

}
