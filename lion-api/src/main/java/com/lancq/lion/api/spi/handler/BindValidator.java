package com.lancq.lion.api.spi.handler;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public interface BindValidator {
    boolean validate(String userId, String data);
}
