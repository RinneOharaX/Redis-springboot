package com.example.redisspringboot.ServiceImp;

import com.example.redisspringboot.Service.HashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: Redis-springboot
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/2 16:33
 */
@Service
public class HashServiceImp implements HashService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public void addhash(String key) {
        redisTemplate.opsForHash().put(key,"f1","v1");

    }

    @Override
    public Object gethashbyfield(String key, String field) {
   return   redisTemplate.opsForHash().get(key,field);

    }
}
