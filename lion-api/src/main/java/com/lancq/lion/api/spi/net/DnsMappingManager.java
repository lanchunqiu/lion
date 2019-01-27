package com.lancq.lion.api.spi.net;

import com.lancq.lion.api.service.Service;
import com.lancq.lion.api.spi.SpiLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface DnsMappingManager extends Service {
    static DnsMappingManager create() {
        return SpiLoader.load(DnsMappingManager.class);
    }

    DnsMapping lookup(String origin);

}
