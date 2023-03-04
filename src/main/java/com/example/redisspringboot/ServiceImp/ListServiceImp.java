package com.example.redisspringboot.ServiceImp;

import com.example.redisspringboot.Service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PROJECT_NAME: Redis-springboot
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/2 15:00
 */
@Service
public class ListServiceImp implements ListService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void addlist() {
        for (int i = 0; i < 10; i++) {
           redisTemplate.opsForList().leftPush("l1",i);
        }
    }

    @Override
    public List Rangelist(String key) {
       return  redisTemplate.opsForList().range(key, 0, -1);
    }
}
