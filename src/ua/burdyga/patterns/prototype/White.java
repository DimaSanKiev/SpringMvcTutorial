package ua.burdyga.patterns.prototype;

public class White extends Color {

    public White() {
        type = "white";
    }

    @Override
    public void paint() {
        System.out.println("Inside White::paint() method.");
    }
}
