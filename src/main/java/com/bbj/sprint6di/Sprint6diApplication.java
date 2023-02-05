package com.bbj.sprint6di;

import com.bbj.sprint6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sprint6diApplication {

    /**
     * At startup, Spring Boot is doing an annotation scan of classes in the current package tree
     * and instantiate them in the "Spring context", as Spring Beans.
     */
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Sprint6diApplication.class, args);
        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In main()...");

        System.out.println(controller.sayHello());

        /*
        In main()...
        MyController.sayHello()
        Hello everyone!
         */
    }

}
