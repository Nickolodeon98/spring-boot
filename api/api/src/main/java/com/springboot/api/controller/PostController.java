package com.springboot.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/get-api")
public class PostController {

    @RequestMapping(value="/domain", method= RequestMethod.POST)
    public String postExample() {
        return "Hello POST Api";
    }
}
