package com.utkarsh.OAuth.With.Google.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "Yay! you have successfully logged in : ";
    }
}
