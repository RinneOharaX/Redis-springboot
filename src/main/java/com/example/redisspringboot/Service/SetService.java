package com.example.redisspringboot.Service;

public interface SetService {
    void addSet();

    Object getSet(String key,Long count);

    Object getdiffent(String key1,String key2);
}
