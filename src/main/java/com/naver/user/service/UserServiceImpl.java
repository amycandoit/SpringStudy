package com.naver.user.service;

import com.naver.user.dao.UserDao;
import com.naver.user.dao.UserMapper;
import com.naver.user.domain.entity.User;
import com.naver.user.domain.request.LoginRequest;
import com.naver.user.domain.request.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> users = new ArrayList<>();

//    @Autowired
    public UserServiceImpl(UserDao userDao, UserMapper userMapper) {
        this.userDao = userDao;
        this.userMapper = userMapper;
    }

    //    public UserServiceImpl() {
//        users.add(new User("id","123"));
//        users.add(new User("id1","123"));
//    }
    private UserDao userDao;

    private UserMapper userMapper;
    @Override
    public User login(LoginRequest request) {
        try {
//            return userDao.login(request.getId(), request.getPassword());
            return userMapper.login(request);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public boolean signup(SignupRequest request) {
        return userDao.signup(request) != 0;
    }
}
