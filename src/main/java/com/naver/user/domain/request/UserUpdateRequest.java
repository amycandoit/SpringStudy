package com.naver.user.domain.request;

public class UserUpdate {
    private String password;
    private String name;

    public UserUpdate(String password, String name) {
        this.password = password;
        this.name = name;
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
