package com.naver.user.domain.request;

import com.naver.user.domain.dto.Update;

public class UpdateRequest {
    private final Integer id;
    private final String content;


    public UpdateRequest(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public Update toDto(Integer uid) {
        return new Update(id, uid, content);
    }
}
