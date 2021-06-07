package com.wangwei.springcloudalibaba.order.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.checkerframework.checker.units.qual.A;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 530220264@qq.com
 * @version 1.0
 * @className Order
 * @description TODO
 * @date 2021/6/7-23:07
 **/
@Data
@ToString
@AllArgsConstructor
@Document(indexName = "order", shards = 1, replicas = 0)
public class Order implements Serializable {
    @Id
    Long orderNo;
    @Field(type = FieldType.Date,format= DateFormat.custom,pattern = "yyyy-MM-dd HH:mm:ss", store = true)
    Date orderTime;
    @Field(type = FieldType.Keyword, store = true)
    String receiverName;
    @Field(type = FieldType.Keyword, store = true)
    String receiverAddress;
    @Field(type = FieldType.Keyword, store = true)
    String receiverProvince;
    @Field(type = FieldType.Keyword, store = true)
    String receiverCity;
    @Field(type = FieldType.Keyword, store = true)
    String receiverArea;
    @Field(type = FieldType.Keyword, store = true)
    String receiverPhone;
    @Field(type = FieldType.Keyword, store = true)
    Double orderPrice;
    @Field(type = FieldType.Keyword, index = false, store = true)
    String imageUrl;
    @Field(type = FieldType.Integer, store = true)
    Integer status;
}
