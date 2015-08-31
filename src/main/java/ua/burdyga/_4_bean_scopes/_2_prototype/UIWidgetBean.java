package ua.burdyga._4_bean_scopes._2_prototype;

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
