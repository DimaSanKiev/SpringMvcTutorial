package ua.burdyga._1_patterns.sigleton;

public class EagerSingleton {

    private static volatile EagerSingleton instance = null;

    // private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {

        if (instance == null) {
            synchronized (EagerSingleton.class) {
                if (instance == null) {
                    instance = new EagerSingleton();
                }
            }
        }
        return instance;
    }
}
