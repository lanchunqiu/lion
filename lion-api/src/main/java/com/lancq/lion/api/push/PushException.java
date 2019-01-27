package com.lancq.lion.api.push;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public class PushException extends RuntimeException {

    public PushException(Throwable cause) {
        super(cause);
    }

    public PushException(String message) {
        super(message);
    }

    public PushException(String message, Throwable cause) {
        super(message, cause);
    }

}
