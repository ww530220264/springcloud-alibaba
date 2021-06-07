package com.wangwei.springcloudalibaba.order.repository;

import com.wangwei.springcloudalibaba.order.pojo.Order;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 530220264@qq.com
 * @version 1.0
 * @className OrderRepository
 * @description TODO
 * @date 2021/6/7-23:22
 **/
@Repository
public interface OrderRepository extends ElasticsearchRepository<Order,Long> {
}
