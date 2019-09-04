package singleton;

/**
 * @author rancho
 * @date 2019-09-05
 *
 * 私有构造函数 + 私有静态属性 + 共有方法内部控制
 * 缺点: 线程不安全
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
        // 私有构造函数
    }

    public Singleton1 getSingleton() {
        // 在public方法中控制单例类的创建
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

}
