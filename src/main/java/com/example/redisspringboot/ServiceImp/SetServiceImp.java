package com.example.redisspringboot.ServiceImp;

import com.example.redisspringboot.Service.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @PROJECT_NAME: Redis-springboot
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/2 15:34
 */
@Service
public class SetServiceImp implements SetService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void addSet() {
        for (int i=0;i<=100;i++){
        redisTemplate.opsForSet().add("s1", ThreadLocalRandom.current().nextInt(100)+1);
    }
        for (int i=0;i<=100;i++){
            redisTemplate.opsForSet().add("s2", ThreadLocalRandom.current().nextInt(100)+1);
        }
    }

    @Override
    public Object getSet(String key,Long count) {
        if (count<=redisTemplate.opsForSet().size(key)) {
            return redisTemplate.opsForSet().pop(key, count);
        }else {
            System.out.println("数据不足");
            return null;
        }
    }

    @Override
    public Object getdiffent(String key1,String key2) {
      return  redisTemplate.opsForSet().difference(key1,key2);
    }
}
