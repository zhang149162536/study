package com.example.study;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String queryAll(Model Model){
        List<User> userList = userService.queryUserList();
        Model.addAttribute("userList",userList);
        return "query";
    }

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    @ResponseBody
    public String insert(Model Model){
        List<User> userList = userService.queryUserList();
        Model.addAttribute("userList",userList);
        return "query";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String get(Model Model){
        User user = new User();
        user.setUsername("get");
        user.setPassword("get");
        user.setAge(1);
        Model.addAttribute("user",user);
        return "test";
    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String post(String username,String password,int age,Model Model){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        Model.addAttribute("user",user);
        return "test";
    }

    @RequestMapping(value = "/test",method = RequestMethod.DELETE)
    public String delete(Model Model){
        User user = new User();
        user.setUsername("delete");
        user.setPassword("delete");
        user.setAge(2);
        Model.addAttribute("user",user);
        return "test";
    }
}
