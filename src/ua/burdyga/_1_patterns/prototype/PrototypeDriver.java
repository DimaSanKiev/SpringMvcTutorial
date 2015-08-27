package ua.burdyga._1_patterns.prototype;

public class PrototypeDriver {

    public static void main(String[] args) {
        ColorCache.loadCache();

        Color clonedColor1 = ColorCache.getColor("1");
        System.out.println("Color: " + clonedColor1.getType());

        Color clonedColor2 = ColorCache.getColor("2");
        System.out.println("Color: " + clonedColor2.getType());

        Color clonedColor3 = ColorCache.getColor("3");
        System.out.println("Color: " + clonedColor3.getType());
    }
}
