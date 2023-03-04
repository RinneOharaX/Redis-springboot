package com.example.redisspringboot.Service;

import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void addOrder();

    Object getOrder(String id);
}
