package com.bbj.spring6di;

import com.bbj.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    //Tells Spring to inject a context for us
    @Autowired
    ApplicationContext applicationContext;

    //Spring will inject myController directly, so we do not need to use ctx.getBean()
    @Autowired
    MyController myController;

    @Test
    void testGetControllerFromCtx() {
        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println(myController.sayHello());
        /**
         * MyController.sayHello()
         * Hello everyone!
         */
    }

    @Test
    void testAutowire() {
        //thanks to the @Autowired, myController value is injected at startup
        myController.sayHello();
    }

    @Test
    void contextLoads() {
    }

}
