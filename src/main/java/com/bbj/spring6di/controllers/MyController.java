package com.bbj.spring6di.controllers;

import com.bbj.spring6di.services.GreetingService;
import com.bbj.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/*
    @Controller: Spring will create it as a Spring Bean

 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    /**
     * Here we do not use DI, and instantiate GreetingServiceImpl directly using new
     * PB: we are creating a dependency in the controller to a specific implementation of the service
     *     if we have another implementation => cannot be used
     *     if we want to test/mock the GreetingService, we cannot
     */
    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("MyController.sayHello()");
        return greetingService.sayGreeting();
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
