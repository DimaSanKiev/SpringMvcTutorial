package ua.burdyga._2_spring.bean._4_di._7_autowired_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BookBeanApp {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");
        BookBean book = (BookBean) context.getBean("bookBean");

        book.getPublisherInfo();
    }
}
