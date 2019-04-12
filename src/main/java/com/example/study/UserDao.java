package com.example.study;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    @Select("select * from user")
    List<User> queryUserList();
    @Insert("insert into user(username,password,age) values(#{username},#{password},#{age})")
    void insert(@Param("username")String username,@Param("password")String password,@Param("age")int age);

}