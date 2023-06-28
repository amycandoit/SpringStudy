package com.naver.user.dao;

import com.naver.user.domain.entity.TodoJoinUser;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //bean에 올릴려고 쓰는 것
public class TodoMapper {
    private final SqlSessionTemplate SessionTemplate;

    public TodoMapper(SqlSessionTemplate sqlSessionTemplate) {
        this.SessionTemplate = sqlSessionTemplate;
    }

    public List<TodoJoinUser> findAll() {
        return SessionTemplate.selectList("todo.findAll");
    }
}
