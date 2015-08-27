package ua.burdyga._1_patterns.sigleton;

public class SingletonDriver {

    public static void main(String[] args) {
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
    }
}
