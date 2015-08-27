package ua.burdyga.patterns.prototype;

public class Red extends Color {

    public Red() {
        setType("Red");
    }

    @Override
    public void paint() {
        System.out.println("Inside Red::paint() method.");
    }
}
