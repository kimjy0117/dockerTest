package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerTestController {

    @GetMapping("/")
    public String testPage(){
        return "docker test page";
    }
}
