package com.example.redisspringboot.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ListService {
    void addlist();

    List Rangelist(String key);
}
