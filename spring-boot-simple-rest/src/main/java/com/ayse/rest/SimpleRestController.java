package com.ayse.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @Value("${custom.world}")
    private String customValue;

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!!!";
    }

    @GetMapping("/goodbye")
    public String goodByeWorld(){
        return "Good Bye World!!!";
    }

    @GetMapping("/goodmorning")
    public String goodMorningWorld(){
        return "Good Morning World!!!";
    }

    @GetMapping("/custom")
    public String customWorld(){
        return "Hello " + customValue;
    }
}
