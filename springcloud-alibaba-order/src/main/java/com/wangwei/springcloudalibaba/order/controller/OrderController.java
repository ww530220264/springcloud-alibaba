package com.wangwei.springcloudalibaba.order.controller;

import com.wangwei.api.user.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangwei@huixiangtech.cn
 * @version 1.0
 * @className OrderController
 * @description TODO
 * @date 2021/5/9-18:02
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @DubboReference
    private IUserService userService;

    @GetMapping("/checkUser")
    public boolean checkUser(String username, String password) {
        RpcContext.getContext().setAttachment("mark", username);
        logger.info("before: " + RpcContext.getContext().getAttachment("mark"));
        boolean login = userService.login(username, password);
        logger.info("after: " + RpcContext.getContext().getAttachment("mark"));
        return login;
    }
}
