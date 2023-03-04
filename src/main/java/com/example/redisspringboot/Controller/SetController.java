package com.example.redisspringboot.Controller;

import com.example.redisspringboot.ServiceImp.SetServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: Redis-springboot
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/2 15:46
 */
@RestController
public class SetController {
    @Autowired
    private  SetServiceImp setServiceImp;

    @RequestMapping(value = "/set/add",method = RequestMethod.POST)
    public void  setAdd(){
        setServiceImp.addSet();
    }

    @RequestMapping(value = "/set/get/{key}/{count}",method = RequestMethod.GET)
    public Object getSet(@PathVariable String key,
                         @PathVariable Long count){
        return setServiceImp.getSet(key, count);
    }
    @RequestMapping(value = "/set/getdiff/{key1}/{key2}")
    public Object getDifferent(@PathVariable String key1,
                               @PathVariable String key2){
        return setServiceImp.getdiffent(key1,key2);
    }

}
