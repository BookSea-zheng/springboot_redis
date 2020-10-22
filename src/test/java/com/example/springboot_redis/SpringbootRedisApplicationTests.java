package com.example.springboot_redis;

import com.example.springboot_redis.entity.Days;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootRedisApplicationTests {
    @Autowired
    private RedisTemplate<String, Days> redisTemplate;
    private Days d;
    @BeforeEach
    public void before(){
        d=new Days();
        d.setDate("123");
        d.setDaysId("456");
        d.setItemNumber(123);
        d.setOpenId("dawda");
        d.setTitle("title");
    }
    @Test
    void test() {
        this.redisTemplate.opsForValue().set("days",d);
        System.out.println((redisTemplate.opsForValue().get("days")));

    }
}