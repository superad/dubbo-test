package com.bestpay.test.domain;

import java.io.Serializable;

/**
 * Created by perdonare on 2015/12/1.
 */
public class User implements Serializable {
    private String id;

    private String name;

    private String password;

    private int age;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
