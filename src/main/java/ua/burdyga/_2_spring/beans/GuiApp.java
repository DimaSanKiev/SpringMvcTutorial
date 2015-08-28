package ua.burdyga._2_spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class GuiApp {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");
        UIWidgetBean objA = (UIWidgetBean) context.getBean("uiWidgetBean");
        objA.paintWidget();
        objA.setMessage("Changed message on ObjectA.");

        UIWidgetBean objB = (UIWidgetBean) context.getBean("uiWidgetBean");
        objB.paintWidget();
        objB.setMessage("Prototype. New message on ObjectB.");
        objB.paintWidget();
    }
}
