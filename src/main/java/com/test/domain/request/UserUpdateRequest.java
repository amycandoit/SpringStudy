package com.test.domain.request;

import com.test.domain.dto.UserUpdate;

public class UserUpdateRequest {
    private String id;
    private String password;
    private String name;
    private String address;
    private String phone;

    public UserUpdateRequest(String id, String password, String name, String address, String phone) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }


}
