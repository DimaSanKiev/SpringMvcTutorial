package ua.burdyga._2_spring.bean._4_di._9_jsr250_annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class JsrBeanApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");
        JsrBean jsrBean = (JsrBean) context.getBean("jsrBean");
        System.out.println(jsrBean);
        context.registerShutdownHook();
    }
}
