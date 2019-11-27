package site.muzhi.singleton;

/**
 * Author: lichuang
 * Date: Create in 11:06 2019/11/26
 * Description:懒汉式（同步代码块）
 */

public class Singleton5 {
    //
    private static Singleton5 singleton;

    //
    private Singleton5() {
    }

    // 通过synchronized实现方法同步
    public static Singleton5 getInstance() {
        // 懒汉式创建,即需要时才创建单例对象
        if (singleton == null) {
            // 无法解决线程安全问题，开发中不可用
            synchronized (Singleton5.class) {
                singleton = new Singleton5();
            }
        }
        return singleton;
    }
}
