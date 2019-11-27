package site.muzhi.singleton;

/**
 * Author: lichuang
 * Date: Create in 10:49 2019/11/26
 * Description:饿汉式（静态代码块）
 * 效果和静态常量一样
 */

public class Singleton2 {

    //
    private static Singleton2 singleton;

    // 静态代码块中创建单例对象
    static {
        singleton = new Singleton2();
    }

    //
    private Singleton2(){}

    public static Singleton2 getInstance(){
        return singleton;
    }
}
