package com.bestpay.test.domain;

import java.io.Serializable;

/**
 * Created by perdonare on 2015/12/1.
 */
public class Response<T> implements Serializable {
    private boolean success;
    private T result;

    public Response(T result) {
        this.success = true;
        this.result = result;
    }

    public Response() {
        this.success = false;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getResult() {
        return result;
    }
}
