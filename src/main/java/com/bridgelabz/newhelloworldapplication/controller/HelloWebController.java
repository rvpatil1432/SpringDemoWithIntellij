package com.bridgelabz.newhelloworldapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//UC2 - Helloworld Spring App to display “Hello from BridgeLabz” in a Web Page
@Controller
public class HelloWebController {

    @GetMapping("/web")
    public String hello(){
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","THis is a custom message.Hello From Bridgelabz");
        return "message";
    }

}
