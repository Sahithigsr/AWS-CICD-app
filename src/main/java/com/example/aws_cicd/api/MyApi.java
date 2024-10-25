package com.example.aws_cicd.api;

import org.springframework.web.bind.annotation.GetMapping;

public class MyApi {

    @GetMapping
    public String sayHello()
    {
        return "Hello World!";
    }
}
