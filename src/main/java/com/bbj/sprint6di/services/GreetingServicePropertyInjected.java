package com.bbj.sprint6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingServiceWithCustomName")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!";
    }
}
