package com.lancq.lion.tools.config.data;

import java.util.Collections;
import java.util.List;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/27
 **/
public class RedisGroup {
    public List<RedisNode> redisNodeList = Collections.emptyList();

    public RedisGroup() {
    }

    public RedisGroup(List<RedisNode> redisNodeList) {
        this.redisNodeList = redisNodeList;
    }

    @Override
    public String toString() {
        return "RedisGroup{" +
                "redisNodeList=" + redisNodeList +
                '}';
    }

}
