package com.example.demo;

import com.example.demo.service.Test1;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class Config1 {

    @Bean
    public Test1 test1(){
        return () -> "TEST";
    }
}
