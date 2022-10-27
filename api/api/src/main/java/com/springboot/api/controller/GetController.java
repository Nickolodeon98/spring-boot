package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    //http://localhost:8081/api/v1/get-api/hello
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    @GetMapping(value="/variable1/{variable}")
    public String getWithParameter(@PathVariable("variable") String parameter) {
        return parameter;
    }

    @GetMapping(value = "/request1")
    public String getWithQueryParam(@RequestParam String name, @RequestParam String email, @RequestParam String organisation) {
        return String.format("Your name: %s\nYour email: %s\nYour organisation: %s\n", name, email, organisation);
    }
}
