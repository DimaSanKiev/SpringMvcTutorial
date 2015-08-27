package ua.burdyga.patterns.prototype;

public class White extends Color {

    public White() {
        setType("White");
    }

    @Override
    public void paint() {
        System.out.println("Inside White::paint() method.");
    }
}
