package com.example.redisspringboot.Service;

import org.springframework.stereotype.Service;

@Service
public interface ZsetService {
    void add(String key);

    Object getrank(String key,String value);

    Object getzset(String key);

}


