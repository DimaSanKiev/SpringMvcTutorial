package ua.burdyga._5_di._8_qualifier_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class OnlineCustomerApp {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");
        OnlineCustomer onlineCustomer = (OnlineCustomer) context.getBean("onlineCustomer");

        System.out.println("OnlineCustomer: " + onlineCustomer);
    }
}
