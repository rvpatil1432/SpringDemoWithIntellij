package com.bridgelabz.newhelloworldapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//UC1 - Helloworld Spring App to display “Hello from BridgeLabz” using intellij
@SpringBootApplication
public class NewHelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("Hello from Bridgelabz..");
        SpringApplication.run(NewHelloWorldApplication.class, args);
    }

}
