package singleton;

public class Singleton {

    private volatile static Singleton instance;

    // 외부에서 new 할 수 없다.
    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }

        return instance;
    }
}
