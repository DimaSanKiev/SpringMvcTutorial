package ua.burdyga._2_spring.beans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarBeanApp {

    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("ua/burdyga/_2_spring/resources/CarBean.xml"));
        CarBean obj = (CarBean) factory.getBean("carBean");
        System.out.println("Car Make: " + obj.getMake());
    }
}
