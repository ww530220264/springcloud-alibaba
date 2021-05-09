package com.wangwei.springcloudalibaba.user.controller;

import com.wangwei.api.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangwei@huixiangtech.cn
 * @version 1.0
 * @className UserController
 * @description TODO
 * @date 2021/4/18-21:50
 **/
@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public boolean login(String username, String password) {
        return userService.login(username, password);
    }
}
