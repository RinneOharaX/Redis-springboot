package com.example.redisspringboot.Controller;

import com.example.redisspringboot.ServiceImp.ListServiceImp;
import com.example.redisspringboot.ServiceImp.OrderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @PROJECT_NAME: Redis-springboot
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/2 2:36
 */
@RestController
public class OrderController {
    @Autowired
    OrderServiceImp orderServiceImp;
    @Autowired
    ListServiceImp listServiceImp;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addOrder(){
        orderServiceImp.addOrder();
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Object getOrder(@PathVariable String id){
      return orderServiceImp.getOrder(id);
    }


}
