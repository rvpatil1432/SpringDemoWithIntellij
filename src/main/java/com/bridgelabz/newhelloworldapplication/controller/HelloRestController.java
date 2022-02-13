package com.bridgelabz.newhelloworldapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//UC4 - Helloworld Spring App to display “Hello from BridgeLabz” in REST Call
@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello From Bridgelabz";
    }

}
