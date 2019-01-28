package com.lancq.lion.tools.common;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/28
 **/
public final class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K first() {
        return key;
    }

    public V second() {
        return value;
    }

    public static <K, V> Pair<K, V> of(K k, V v) {
        return new Pair<>(k, v);
    }
}

