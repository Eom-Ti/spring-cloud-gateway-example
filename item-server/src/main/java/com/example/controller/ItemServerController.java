package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item-api")
public class ItemServerController {

    @GetMapping("call")
    public String callItemServer() {
        return "Hello This Is Item Server";
    }

}
