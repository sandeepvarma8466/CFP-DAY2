package com.blz.restapi.controller;

import com.blz.restapi.dto.User;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/param/{name}")
    public String path(@PathVariable String name) {
        return name;
    }

    @PostMapping("/post")
    public String post(@RequestBody User user) {
        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        return user.toString();
    }
}
