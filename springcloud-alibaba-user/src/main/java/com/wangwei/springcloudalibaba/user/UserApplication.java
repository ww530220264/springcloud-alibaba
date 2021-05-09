package com.wangwei.springcloudalibaba.user;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangwei@huixiangtech.cn
 * @version 1.0
 * @className UserApplication
 * @description TODO
 * @date 2021/4/18-21:31
 **/
@DubboComponentScan
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
