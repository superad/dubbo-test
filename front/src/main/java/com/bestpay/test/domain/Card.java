package com.bestpay.test.domain;

import java.io.Serializable;

/**
 * Created by perdonare on 2015/12/1.
 */
public class Card implements Serializable{
    private String id;

    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
