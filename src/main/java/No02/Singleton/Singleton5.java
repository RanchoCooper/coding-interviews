package No02.Singleton;

/**
 * @author rancho
 * @date 2019-09-05
 *
 * 双重检查锁
 */
public class Singleton5 {

    private static Singleton5 instance;

    private Singleton5() {

    }

    public static Singleton5 getSingleton() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

}
