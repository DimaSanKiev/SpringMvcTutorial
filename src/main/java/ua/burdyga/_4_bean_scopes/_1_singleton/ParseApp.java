package ua.burdyga._4_bean_scopes._1_singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ParseApp {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");
        CustomParserBean objA = (CustomParserBean) context.getBean("customParserBean");
        objA.parsingFile();
        objA.setMessage("Changed message on ObjectA.");

        CustomParserBean objB = (CustomParserBean) context.getBean("customParserBean");
        objB.parsingFile();
        objB.setMessage("Cool Singleton. New message on ObjectB");
        objB.parsingFile();

    }
}
