package com.example.redisspringboot.ServiceImp;

import com.example.redisspringboot.Service.ZsetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @PROJECT_NAME: Redis-springboot
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/2 16:04
 */
@Service
public class ZsetServiceImp implements ZsetService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void add(String key) {
        for (int i = 0; i < 10; i++) {
            long score = ThreadLocalRandom.current().nextLong(100) + 1;
            Object value="value"+ThreadLocalRandom.current().nextLong(100);
            redisTemplate.opsForZSet().add(key,value,score);
        }
    }

    @Override
    public Object getrank(String key,String value) {
        return redisTemplate.opsForZSet().rank(key, value);
    }

    @Override
    public Object getzset(String key) {
        return redisTemplate.opsForZSet().range(key,0,-1);
    }
}
