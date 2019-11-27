package site.muzhi.singleton;

/**
 * Author: lichuang
 * Date: Create in 10:53 2019/11/26
 * Description: 懒汉式(线程不安全)
 * 存在风险，开发时不可使用
 */

public class Singleton3 {
    //
    private static Singleton3 singleton;

    //
    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        // 懒汉式创建,即需要时才创建单例对象
        if (singleton == null) {
            // 第一次初始化时,当多个线程执行到这一步时,可能会出现多个实例对象
            singleton = new Singleton3();
        }
        return singleton;
    }
}
