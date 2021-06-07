package com.wangwei.springcloudalibaba.order.service.impl;

import com.wangwei.api.order.IOrderService;
import com.wangwei.springcloudalibaba.order.pojo.Order;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

/**
 * @author 530220264@qq.com
 * @version 1.0
 * @className OrderServiceImpl
 * @description TODO
 * @date 2021/5/14-22:59
 **/
@DubboService
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private ElasticsearchRestTemplate restClient;

    @Override
    public String saveOrder(){
        return "order saved...";
    }
}
