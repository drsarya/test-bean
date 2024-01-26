package com.example.demo;

import com.example.demo.service.Test1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.Objects;

@Import(Config1.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Test1 test1;

    @Test
    void contextLoads() {
        String invoke = test1.invoke();
        System.out.println(invoke);

        Assertions.assertTrue(Objects.equals(invoke, "TEST"), "Ожидался TEST");
    }
}
