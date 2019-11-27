package site.muzhi.singleton;

/**
 * Author: lichuang
 * Date: Create in 11:08 2019/11/26
 * Description: 双重检查模式 （推荐使用）
 * 可以解决多线程问题，同时也可以实现懒汉式加载，也保证了效率
 */

public class Singleton6 {

    // volatile关键字修饰变量
    private static volatile Singleton6 singleton;

    //
    private Singleton6() {
    }

    // 通过synchronized实现方法同步
    public static Singleton6 getInstance() {
        // 第一次判断
        if (singleton == null) {
            // 多个线程可能都会执行到此处
            synchronized (Singleton6.class) {
                // 第二次判断，一旦有一个线程创建实例对象，其他线程可以
                // 得知对象已经创建，不再执行下面的实例对象代码
                if (singleton == null) {
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }
}
