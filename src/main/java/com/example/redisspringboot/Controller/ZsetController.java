package com.example.redisspringboot.Controller;

import com.example.redisspringboot.ServiceImp.ZsetServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: Redis-springboot
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/2 16:19
 */
@RestController
public class ZsetController {
    @Autowired
    ZsetServiceImp zsetServiceImp;

    @RequestMapping(value = "/add/zset/{key}",method = RequestMethod.POST)
    public void addZset(@PathVariable String key){
        zsetServiceImp.add(key);
    }

    @RequestMapping(value = "/getrank/zset/{key}/{value}",method = RequestMethod.GET)
    public Object getrank(@PathVariable String key,
                          @PathVariable String value){
        return zsetServiceImp.getrank(key,value);
    }

    @RequestMapping(value = "/get/zset/{key}",method = RequestMethod.GET)
    public  Object getZset(@PathVariable String key){
        return zsetServiceImp.getzset(key);
    }
}
