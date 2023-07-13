package com.test.service;

import com.test.dao.UserMapper;
import com.test.domain.dto.UserUpdate;
import com.test.domain.entity.User;
import com.test.domain.request.LoginRequest;
import com.test.domain.request.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public List<User> user() {
        return userMapper.user();
    }

    public Integer update(UserUpdate update) {
        return userMapper.update(update);
    }

    public User findByUserSeq(int user_seq) {
        return userMapper.findByUserSeq(user_seq);
    }
    public int delete (int user_seq) {
        return userMapper.delete(user_seq);
    }

    public User login(LoginRequest loginRequest) {
        return userMapper.login(loginRequest);
    }

    public boolean signup(SignupRequest signupRequest) {
        return userMapper.signup(signupRequest) !=0;
    }
}


