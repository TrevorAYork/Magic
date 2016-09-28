package com.TrevorAYork.Magic;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main (String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext.xml" });

        Controller controller = (Controller)context.getBean("controller");

        SpringApplication.run(Main.class, args);
    }
}
