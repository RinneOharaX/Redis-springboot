package com.example.redisspringboot.Controller;

import com.example.redisspringboot.ServiceImp.ListServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PROJECT_NAME: Redis-springboot
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/2 15:21
 */
@RestController
public class ListController {
    @Autowired
    ListServiceImp listServiceImp;

    @RequestMapping(value ="/list/push",method = RequestMethod.GET)
    public void listpsuh(){
        listServiceImp.addlist();
    }
    @RequestMapping(value = "/list/range/{key}",method = RequestMethod.GET)
    public List listRange(@PathVariable String key){
        return listServiceImp.Rangelist(key);
    }
}
