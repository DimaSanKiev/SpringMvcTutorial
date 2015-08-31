package ua.burdyga._2_spring.bean._4_di._4_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollectionExampleApp2 {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");

        CollectionExample2 ce = (CollectionExample2) context.getBean("collectionExample2");

        ce.getUsersList();
    }
}
