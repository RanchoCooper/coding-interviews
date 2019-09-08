package No02.Singleton;

/**
 * @author rancho
 * @date 2019-09-05
 *
 * 静态内部类(推荐)
 */
public class Singleton6 {

    private static class SingletonHolder {
        private static Singleton6 instance = new Singleton6();
    }

    public static Singleton6 getSingleton() {
        return SingletonHolder.instance;
    }

    private Singleton6() {

    }

}
