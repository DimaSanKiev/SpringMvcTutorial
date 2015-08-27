package ua.burdyga.patterns.sigleton;

public class SingletonDriver {

    public static void main(String[] args) {
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
    }
}
