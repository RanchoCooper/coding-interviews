package singleton;

/**
 * @author rancho
 * @date 2019-09-05
 *
 * 创建static final的对象引用
 */
public class Singleton2 {

    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getSingleton() {
        return instance;
    }

}
