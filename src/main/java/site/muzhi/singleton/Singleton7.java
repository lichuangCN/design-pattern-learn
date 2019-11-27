package site.muzhi.singleton;

/**
 * Author: lichuang
 * Date: Create in 11:13 2019/11/26
 * Description: 静态内部类方式 （推荐使用）
 */

public class Singleton7 {

    private Singleton7(){}

    // 1.静态内部类，在类Singleton7装载时，静态内部类不会立即被装载
    private static class SingletonInstance{
        // 静态属性，单例对象
        private static final Singleton7 singleton = new Singleton7();
    }
    // 2.在调用一下方法时，会装载静态内部类，并且只装载一次，并且不存在线程问题
    // 静态内部类在装载时，完成对单例对象的实例化
    public static Singleton7 getInstance() {
        return SingletonInstance.singleton;
    }
}
