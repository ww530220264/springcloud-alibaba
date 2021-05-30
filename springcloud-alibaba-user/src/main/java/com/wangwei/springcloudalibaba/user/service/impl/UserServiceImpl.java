package com.wangwei.springcloudalibaba.user.service.impl;

import com.wangwei.api.user.IUserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;


/**
 * @author 530220264@qq.com
 * @version 1.0
 * @className UserServiceImpl
 * @description TODO
 * @date 2021/4/18-21:50
 **/
@DubboService
public class UserServiceImpl implements IUserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Value("${server.port}")
    private String serverPort;

    @Override
    public boolean login(String username, String password) {
        String mark = RpcContext.getContext().getAttachment("mark");
        logger.info(String.format("serverPort: %s, username: %s, password: %s, attachment-mark: %s !",
                serverPort, username, username, mark));
        return "wangwei".equals(username);
    }
}
