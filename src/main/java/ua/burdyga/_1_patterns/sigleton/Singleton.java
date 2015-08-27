package ua.burdyga._1_patterns.sigleton;

public class Singleton {

    private Singleton() {
        System.out.println("Creating new instance");
    }

    public void printSingleton() {
        System.out.println("Inside print Singleton");
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
