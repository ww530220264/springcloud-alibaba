package com.wangwei.springcloudalibaba.order.service.impl;

import com.wangwei.api.order.IOrderService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author 530220264@qq.com
 * @version 1.0
 * @className OrderServiceImpl
 * @description TODO
 * @date 2021/5/14-22:59
 **/
@DubboService
public class OrderServiceImpl implements IOrderService {

    @Override
    public String saveOrder(){
        System.err.println("saved order...");
        return "order saved...";
    }
}
