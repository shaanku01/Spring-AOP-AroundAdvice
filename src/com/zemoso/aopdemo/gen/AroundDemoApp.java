package com.zemoso.aopdemo.gen;

import com.zemoso.aopdemo.dao.AccountDAO;
import com.zemoso.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AroundDemoApp {

    public static void main(String arg[]){
        //read the spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring
        TrafficFortuneService trafficFortuneService =
                context.getBean("trafficFortuneService",TrafficFortuneService.class);

        System.out.println("\n Main Program : Around Demo App");
        System.out.println("\n Calling getFortune Method");

        String data  = trafficFortuneService.getFortune();

        System.out.println("\n My fortune is :"+ data);

        System.out.println("\n Finished");




        //close the context
        context.close();
    }

}
