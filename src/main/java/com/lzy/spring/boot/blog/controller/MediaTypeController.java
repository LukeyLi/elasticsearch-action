package com.lzy.spring.boot.blog.controller;

import com.lzy.spring.boot.blog.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediaTypeController {

    @RequestMapping("/user")
    public User getUser(){
        return new User("lzy","84@qq.com");
    }
}
