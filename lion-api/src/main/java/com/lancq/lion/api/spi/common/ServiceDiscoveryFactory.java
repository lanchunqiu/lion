package com.lancq.lion.api.spi.common;

import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;
import com.lancq.lion.api.srd.ServiceDiscovery;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface ServiceDiscoveryFactory extends Factory<ServiceDiscovery> {
    static ServiceDiscovery create() {
        return SpiLoader.load(ServiceDiscoveryFactory.class).get();
    }

}
