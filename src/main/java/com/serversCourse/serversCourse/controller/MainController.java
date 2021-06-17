package com.serversCourse.serversCourse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class MainController {

    @GetMapping
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name ;
    }
}
