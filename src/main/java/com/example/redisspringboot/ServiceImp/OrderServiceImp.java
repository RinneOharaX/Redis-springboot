package com.example.redisspringboot.ServiceImp;

import com.example.redisspringboot.Service.OrderService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @PROJECT_NAME: Redis-springboot
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/2 2:25
 */
@Service
public class OrderServiceImp implements OrderService {
    @Resource
    private RedisTemplate redisTemplate;

    private static String na="ord:";
    @Override
    public void addOrder() {
        int i = ThreadLocalRandom.current().nextInt(1000) + 1;
        String num= UUID.randomUUID().toString();
        String key=na+i;
        String value="订单:"+num;
        redisTemplate.opsForValue().set(key,value);
    }

    @Override
    public Object getOrder(String id) {
        return redisTemplate.opsForValue().get(na + id);
    }
}
