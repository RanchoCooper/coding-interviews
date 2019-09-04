package singleton;

/**
 * @author rancho
 * @date 2019-09-05
 *
 * 线程安全, 加锁耗时
 */
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {

    }

    public synchronized static Singleton4 getSingleton() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

}
