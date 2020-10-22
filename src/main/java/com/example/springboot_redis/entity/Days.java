package com.example.springboot_redis.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Days implements Serializable {   //这里不实现序列化感觉也没什么问题
    private String openId;
    private String daysId;
    //每天的标题
    private String title;
    //代办事项的数量
    private int itemNumber;
    //日程
    private String date;
}
