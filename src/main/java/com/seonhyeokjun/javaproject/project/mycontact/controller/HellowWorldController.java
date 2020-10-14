package com.seonhyeokjun.javaproject.project.mycontact.controller;

import com.seonhyeokjun.javaproject.project.mycontact.exception.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {

    @GetMapping(value = "/api/helloworld")
    public String helloworld(){
        return "Helloworld";
    }

    @GetMapping(value = "/api/helloException")
    public String helloException(){
        throw new RuntimeException("Hello RuntimeException");
    }

}
