package com.blz.restapi.controller;

import com.blz.restapi.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestController1 {
    @GetMapping("/getdata")
    public String message() {
        return "Hello";
    }

    @GetMapping("/query")
    public String name(@RequestParam String firstName) {
        User user = new User();
        user.setFirstName(firstName);
        return user.getFirstName();
    }
}
