package com.lancq.lion.api.event;

import com.lancq.lion.api.router.Router;

/**
 * @Author lancq
 * @Description
 * @Date 2019/1/26
 **/
public class RouterChangeEvent implements Event {
    public final String userId;
    public final Router<?> router;

    public RouterChangeEvent(String userId, Router<?> router) {
        this.userId = userId;
        this.router = router;
    }

}
