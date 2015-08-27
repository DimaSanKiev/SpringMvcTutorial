package ua.burdyga.patterns.prototype;

public class Red extends Color {

    public Red() {
        type = "red";
    }

    @Override
    public void paint() {
        System.out.println("Inside Red::paint() method.");
    }
}
