package com.bbj.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public String publicFoo;
    private String privateFoo;

    @Override
    public String sayGreeting() {
        return "Hello Everyone from GreetingServiceImpl";
    }

    public String getPrivateFoo() {
        return privateFoo;
    }

    public void setPrivateFoo(String privateFoo) {
        this.privateFoo = privateFoo;
    }
}
