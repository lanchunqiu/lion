package com.lancq.lion.tools.common;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/28
 **/
public final class Holder<T> {
    private T t;

    public Holder() {
    }

    public Holder(T t) {
        this.t = t;
    }

    public static <T> Holder<T> of(T t) {
        return new Holder<>(t);
    }

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

}
