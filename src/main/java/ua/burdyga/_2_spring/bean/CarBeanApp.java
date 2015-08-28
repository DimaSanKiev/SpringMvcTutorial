package ua.burdyga._2_spring.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarBeanApp {

    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("CarBean.xml"));
        CarBean obj = (CarBean) factory.getBean("carBean");
        System.out.println("Car Make: " + obj.getMake());
    }
}
