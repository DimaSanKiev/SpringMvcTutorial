package ua.burdyga._2_spring.bean;

public class FooBean {

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void myInitMethod() throws Exception {
        System.out.println("Init method after properties are set: " + message);
    }

    public void myDestroyMethod() throws Exception {
        System.out.println("Spring Container is destroyed. Clean up.");
    }
}
