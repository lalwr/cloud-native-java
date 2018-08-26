package com.example.cloudnativejava.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @PostMapping
    public  Map<String, String> index(@RequestBody Map<String, String> data){
        return data;
    }

}
