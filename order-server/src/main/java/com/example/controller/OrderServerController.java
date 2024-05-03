package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-api")
public class OrderServerController {

    @GetMapping("call")
    public String callOrderServer() {
        return "Hello This Is Order Server";
    }

}
