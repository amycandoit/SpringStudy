package com.test.dao;

import com.test.domain.dto.UserUpdate;
import com.test.domain.entity.User;
import com.test.domain.request.LoginRequest;
import com.test.domain.request.SignupRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> user();

    Integer update(UserUpdate update);

    User findByUserSeq(int user_seq);

    int delete(int user_seq);

    User login(LoginRequest loginRequest);

    Integer signup(SignupRequest signupRequest);
}
