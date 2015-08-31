package ua.burdyga._2_spring.bean._4_di._4_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollectionExampleApp {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");

        CollectionExample jc = (CollectionExample) context.getBean("collectionExample");

        jc.getExampleList();
        jc.getExampleSet();
        jc.getExampleMap();
        jc.getExampleProp();
    }
}
