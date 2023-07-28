package com.example.superheroes.practice;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @PostConstruct
    public void init() {
        System.out.println("Calculator Object is created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Calculator Object was destroyed");
    }

    public int add(int a, int b) {
        return a+b;
    }
}
