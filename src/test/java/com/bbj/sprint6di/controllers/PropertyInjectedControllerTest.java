package com.bbj.sprint6di.controllers;

import com.bbj.sprint6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//tell JUnit to load the Spring context
@SpringBootTest
class PropertyInjectedControllerTest {

    //as we removed setUp(), we ask Spring to inject it
    @Autowired
    PropertyInjectedController propertyInjectedController;

//as we added @Autowired in PropertyInjectedController for the property....
//we can comment this as Spring is going to do it
//    @BeforeEach
//    void setUp() {
//        propertyInjectedController = new PropertyInjectedController();
//
//        //we instantiate and inject the service using the controller property
//        propertyInjectedController.greetingService = new GreetingServiceImpl();
//    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}