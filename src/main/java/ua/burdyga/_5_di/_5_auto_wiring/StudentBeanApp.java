package ua.burdyga._5_di._5_auto_wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentBeanApp {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");
        StudentBean student = (StudentBean) context.getBean("studentBean");
        System.out.println(student);
    }
}
