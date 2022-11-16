package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

        ft.createAccount();

        //PartTimeMentor pt = container.getBean("p2",PartTimeMentor.class);  // using name to call the object
        PartTimeMentor pt = container.getBean(PartTimeMentor.class); //using @Primary annotation for default bean or object
        // when you have more than two beans from the same Config class

        pt.createAccount();

        String str = container.getBean(String.class);

        System.out.println(str);

        Integer num = container.getBean(Integer.class);

        System.out.println(num);

    }
}
