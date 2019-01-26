package com.lancq.lion.api.connection;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public interface Cipher {

    byte[] decrypt(byte[] data);

    byte[] encrypt(byte[] data);

}
