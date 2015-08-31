package ua.burdyga._2_spring.bean._4_di._6_required_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class OrderBeanApp {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");

        OrderBean orderBean = (OrderBean) context.getBean("orderBean");
        String name = orderBean.getName();
        System.out.println("Order Name: " + name);
    }
}
