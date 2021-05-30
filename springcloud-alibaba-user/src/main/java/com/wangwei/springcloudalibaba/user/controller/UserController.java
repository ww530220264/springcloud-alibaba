package com.wangwei.springcloudalibaba.user.controller;

import com.wangwei.api.order.IOrderService;
import com.wangwei.api.user.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 530220264@qq.com
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
    @DubboReference
    private IOrderService orderService;

    /**
     * @author 530220264@qq.com
     * @description TODO       
     * @Param username: 
     * @Param password: 
     * @date 2021/5/14 21:17
     * @return: boolean
     * @version 1.0
     **/
    @RequestMapping("/login")
    public boolean login(String username, String password) {
        String result = orderService.saveOrder();
        System.err.println(result);
        return userService.login(username, password);
    }
}
