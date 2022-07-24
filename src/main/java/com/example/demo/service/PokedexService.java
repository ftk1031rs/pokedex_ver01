package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.PokedexMapper;

public class PokedexService {
    /**
     * ポケモン図鑑 Service
     */
    @Autowired
    private PokedexMapper userMapper;
}
