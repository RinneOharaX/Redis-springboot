package com.example.redisspringboot.Controller;

import com.example.redisspringboot.ServiceImp.HashServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: Redis-springboot
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/2 16:36
 */
@RestController
public class HashController {
    @Autowired
    HashServiceImp hashServiceImp;
    @RequestMapping(value = "/add/hash/{key}",method = RequestMethod.POST)
    public void  hashadd(@PathVariable String key){
        hashServiceImp.addhash(key);
    }

    @RequestMapping("/get/hash/{key}/{field}")
    public Object getHash(@PathVariable String key,
                         @PathVariable String field){
       return hashServiceImp.gethashbyfield(key,field);
    }
}
