package com.naver.user.domain.dto;

public class Todo {
    private Integer id;
    private String content;
    private String createAt;
    private boolean checked;
    private  Integer userID;
    private Integer heart;


    // 전체 생성자, getter

    public Todo(Integer id, String content, String createAt, boolean checked, Integer userID, Integer heart) {
        this.id = id;
        this.content = content;
        this.createAt = createAt;
        this.checked = checked;
        this.userID = userID;
        this.heart = heart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getHeart() {
        return heart;
    }

    public void setHeart(Integer heart) {
        this.heart = heart;
    }
}
