package com.jcapellan.personalapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping(value = "init")
    public String init() {
        return "Hello World";
    }
}
