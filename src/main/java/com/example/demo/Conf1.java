package com.example.demo;

import com.example.demo.service.Test1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf1 {

    @Bean
    public Test1 test1() {
        return () -> "REAL";
    }
}
