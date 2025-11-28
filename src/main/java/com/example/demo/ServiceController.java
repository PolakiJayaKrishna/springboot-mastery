package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Autowired
    private MyService myService;

    @GetMapping("/process")
    public String process(){
        return myService.processName("Jay");
    }
}
