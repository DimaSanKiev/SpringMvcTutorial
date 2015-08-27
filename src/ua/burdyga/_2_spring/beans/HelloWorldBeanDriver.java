package ua.burdyga._2_spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldBeanDriver {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("resources/spring-example.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorldBean");
        obj.sayHelloWorld();
    }
}
