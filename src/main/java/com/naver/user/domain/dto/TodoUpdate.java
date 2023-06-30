package com.naver.user.domain.dto;

public class Update {
    private Integer id;
    private Integer uid;
    private String content;

    public Update(Integer id, Integer uid, String content) {
        this.id = id;
        this.uid = uid;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
