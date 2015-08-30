package ua.burdyga._2_spring.bean._4_di._3_inner_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AirplaneBeanApp {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");

        AirplaneBean airplaneBean = (AirplaneBean) context.getBean("airplaneBean");
        System.out.println(airplaneBean);

        AirplaneBean airplaneBean2 = (AirplaneBean) context.getBean("airplaneBean2");
        System.out.println(airplaneBean2);
    }
}
