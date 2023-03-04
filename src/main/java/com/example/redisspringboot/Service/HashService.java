package com.example.redisspringboot.Service;

import org.springframework.stereotype.Service;

@Service
public interface HashService {
    void  addhash(String key);

    Object gethashbyfield(String key, String field);


}
