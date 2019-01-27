package com.lancq.lion.api.service;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public class ServiceException extends RuntimeException {
    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}
