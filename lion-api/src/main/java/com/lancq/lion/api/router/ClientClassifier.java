package com.lancq.lion.api.router;

import com.lancq.lion.api.spi.router.ClientClassifierFactory;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public interface ClientClassifier {
    ClientClassifier I = ClientClassifierFactory.create();

    int getClientType(String osName);

}
