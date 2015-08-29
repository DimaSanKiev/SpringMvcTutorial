package ua.burdyga._2_spring.bean._4_di._2_setter_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ShoppingCartApp {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-example.xml");

        ShoppingCartBean shoppingCartBean = (ShoppingCartBean) context.getBean("shoppingCartBean");
        shoppingCartBean.displayCart();

        ShoppingCartBean shoppingCartBean2 = (ShoppingCartBean) context.getBean("shoppingCartBean2");
        shoppingCartBean2.displayCart();

    }
}
