package com.bbj.sprint6di.services;

import com.bbj.sprint6di.services.GreetingService;
import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey I am setting a Greeting!!!";
    }
}
