package com.seonhyeokjun.javaproject.project.mycontact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {

    @GetMapping(value = "/api/helloworld")
    public String helloworld(){
        return "Helloworld";
    }
}
