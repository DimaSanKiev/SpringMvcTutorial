package ua.burdyga.patterns.sigleton;

public class SingletonDispenser {

    private static class ThreadLocalSingleton extends ThreadLocal {
        @Override
        protected Object initialValue() {
            return Singleton.getInstance();
        }
    }

    private static ThreadLocalSingleton conn = new ThreadLocalSingleton();

    public static Singleton getThreadLocalSingleton() {
        return (Singleton) conn.get();
    }
}
