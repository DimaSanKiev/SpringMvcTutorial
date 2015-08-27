package ua.burdyga.patterns.prototype;

public class Blue extends Color {

    public Blue() {
        type = "blue";
    }

    @Override
    public void paint() {
        System.out.println("Inside Blue::paint() method.");
    }
}
