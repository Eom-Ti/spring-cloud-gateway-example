package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-api")
public class UserServerController {

    @GetMapping("call")
    public String callUserServer() {
        return "Hello This Is User Server";
    }
}
