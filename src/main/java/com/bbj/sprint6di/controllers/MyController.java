package com.bbj.sprint6di.controllers;

import org.springframework.stereotype.Controller;

/*
    @Controller: Spring will create it as a Spring Bean

 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("MyController.sayHello()");
        return "Hello everyone!";
    }
}
