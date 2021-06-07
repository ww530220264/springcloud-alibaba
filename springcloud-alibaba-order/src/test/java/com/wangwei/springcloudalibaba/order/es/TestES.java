package com.wangwei.springcloudalibaba.order.es;

import com.wangwei.springcloudalibaba.order.OrderApplication;
import com.wangwei.springcloudalibaba.order.pojo.Order;
import com.wangwei.springcloudalibaba.order.repository.OrderRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.IndexOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author 530220264@qq.com
 * @version 1.0
 * @className TestES
 * @description TODO
 * @date 2021/6/7-23:25
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication.class)
public class TestES {

    @Autowired
    private ElasticsearchRestTemplate esTemplate;
    @Autowired
    private OrderRepository orderRepository;

    @Before
    public void createIndex(){
        IndexOperations indexOperations = esTemplate.indexOps(Order.class);
        indexOperations.createMapping(Order.class);
    }

    @After
    public void deleteIndex(){
        IndexOperations indexOperations = esTemplate.indexOps(Order.class);
        indexOperations.delete();
    }

    @Test
    public void test(){
        orderRepository.save(new Order(
                111L,
                new Date(),
                "wangwei",
                "湖北省武汉市",
        "湖北省",
                "武汉市",
                "洪山区",
                "17671782693",
                99.9,
                "http://www.baidu.com",
                1));

    }

}
