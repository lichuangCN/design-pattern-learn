package site.muzhi.singleton;

/**
 * Author: lichuang
 * Date: Create in 10:58 2019/11/26
 * Description: 懒汉式(线程安全，同步方法实现)
 */

public class Singleton4 {
    //
    private static Singleton4 singleton;

    //
    private Singleton4() {
    }

    // 通过synchronized实现方法同步
    // 每个线程在获取实例对象时，必须要先获得锁，效率太低，不推荐使用
    public static synchronized Singleton4 getInstance() {
        // 懒汉式创建,即需要时才创建单例对象
        if (singleton == null) {
            singleton = new Singleton4();
        }
        return singleton;
    }
}
