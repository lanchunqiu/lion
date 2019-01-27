package com.lancq.lion.api.spi.common;

import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;
import com.lancq.lion.api.srd.ServiceRegistry;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface ServiceRegistryFactory extends Factory<ServiceRegistry> {
    static ServiceRegistry create() {
        return SpiLoader.load(ServiceRegistryFactory.class).get();
    }

}
