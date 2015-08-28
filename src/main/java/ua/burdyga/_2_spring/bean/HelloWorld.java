package ua.burdyga._2_spring.bean;

public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHelloWorld() {
        System.out.println("Hello World! Welcome " + name);
    }
}
