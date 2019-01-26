package com.lancq.lion.api.spi.router;

import com.lancq.lion.api.router.ClientClassifier;
import com.lancq.lion.api.spi.Factory;
import com.lancq.lion.api.spi.SpiLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public interface ClientClassifierFactory extends Factory<ClientClassifier> {
    static ClientClassifier create() {
        return SpiLoader.load(ClientClassifierFactory.class).get();
    }

}
