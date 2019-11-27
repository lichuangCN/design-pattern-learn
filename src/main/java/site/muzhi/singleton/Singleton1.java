package site.muzhi.singleton;

/**
 * Author: lichuang
 * Date: Create in 10:39 2019/11/26
 * Description: 饿汉式（静态常量）
 * 优点：
 *      写法简单，在类装载的时候完成实例化。避免多线程同步的问题。
 * 缺点：
 *      在装载的时候就完成实例化，没有达到懒加载的效果，始终没有使用时会造成内存的浪费。
 */
public class Singleton1 {

    // 创建对象实例
    private final static Singleton1 singleton = new Singleton1();

    // 私有化构造方法
    private Singleton1(){}

    // 返回实例对象
    public static Singleton1 getInstance() {
        return singleton;
    }
}