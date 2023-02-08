package com.bbj.spring6di.controllers;

import com.bbj.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    /**
     * @Autowired: can be done, but not recommended, constructor wiring of private attributes is preferred
     * @Qualifier("propertyGreetingServiceWithCustomName"): we specify the bean by its custom name
     */

    @Qualifier("propertyGreetingServiceWithCustomName")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
