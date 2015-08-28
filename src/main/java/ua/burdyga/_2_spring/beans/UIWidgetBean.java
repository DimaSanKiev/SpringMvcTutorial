package ua.burdyga._2_spring.beans;

public class UIWidgetBean {

    private String message;

    public void paintWidget() {
        System.out.println("Painting UIWidget: " + message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
