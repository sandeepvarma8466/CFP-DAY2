package com.blz.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestController1 {
    @GetMapping("/getdata")
    public String message() {
        return "Hello";
    }
}
