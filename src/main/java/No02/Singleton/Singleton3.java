package No02.Singleton;

/**
 * @author rancho
 * @date 2019-09-05
 *
 * 在静态代码块中实例化对象
 */
public class Singleton3 {

    private static Singleton3 instance;

    static {
        instance = new Singleton3();
    }

    private Singleton3() {

    }

    public static Singleton3 getSingleton() {
        return instance;
    }

}
