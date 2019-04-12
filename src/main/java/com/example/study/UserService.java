package com.example.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<User> queryUserList(){

        return userDao.queryUserList();
    }

    public void insert(String username,String password,int age){
        userDao.insert(username,password,age);
    }
}
