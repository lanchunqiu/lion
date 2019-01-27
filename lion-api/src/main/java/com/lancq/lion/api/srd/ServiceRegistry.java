package com.lancq.lion.api.srd;

import com.lancq.lion.api.service.Service;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface ServiceRegistry extends Service {
    void register(ServiceNode node);

    void deregister(ServiceNode node);

}
