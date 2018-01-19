package com.you.huan.domain;

import java.io.Serializable;

/**
 * user域对象
 */
public class User implements Serializable {
    private Integer id;
    private String phone;
    private String password;
    private String name;

    public User() {
    }

    public User(String phone, String password, String name) {
        this.phone = phone;
        this.password = password;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
