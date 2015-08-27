package ua.burdyga.patterns.prototype;

import java.util.Hashtable;

public class ColorCache {
    private static Hashtable<String, Color> colorMap = new Hashtable<>();

    public static Color getColor(String colorId) {
        Color cachedColor = colorMap.get(colorId);
        return (Color) cachedColor.clone();
    }

    public static void loadCache() {
        Red red = new Red();
        red.setId("1");
        colorMap.put(red.getId(), red);

        Blue blue = new Blue();
        blue.setId("1");
        colorMap.put(blue.getId(), blue);

        White white = new White();
        white.setId("1");
        colorMap.put(white.getId(), white);
    }
}
