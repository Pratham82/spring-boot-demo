package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping
    public String helloWorld(){
        return "Hello from first get Endpoint";
    }

}
