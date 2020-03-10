package site.muzhi.singleton;

import java.io.Serializable;

/**
 * @author: lichuang
 * @date: 2020/03/10
 * @description: 模拟单例模式被破坏和记录防止被破坏的方法
 * 1.通过克隆方式，可以破坏单例模式
 * 处理：直接重写克隆方法，直接返回实例对象
 * 2.通过反射方式，可以破坏单例模式。
 * 通过反射方式获取单例对象，实际是获取单例类的构造器，通过获得的构造器重新创建一个单例对象
 * 处理：如果实例存在，则在构造方法中手动抛出异常
 * 3.通过序列化和反序列化
 * 处理：添加readResolve()方法，返回实例对象
 */

public class DestroySingleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 2603687999561985607L;
    /**
     * volatile关键字修饰变量
     */
    private static volatile DestroySingleton singleton;

    /**
     * 私有构造器
     */
    private DestroySingleton() {
        // 构造器中手动抛出异常
        if (singleton != null) {
            throw new RuntimeException("实例已存在");
        }
    }

    /**
     * 通过synchronized实现方法同步
     *
     * @return
     */
    public static DestroySingleton getInstance() {
        // 第一次判断
        if (singleton == null) {
            // 多个线程可能都会执行到此处
            synchronized (DestroySingleton.class) {
                // 第二次判断，一旦有一个线程创建实例对象，其他线程可以
                // 得知对象已经创建，不再执行下面的实例对象代码
                if (singleton == null) {
                    singleton = new DestroySingleton();
                }
            }
        }
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        /// 原生克隆方法
        /// return super.clone();
        // 重写克隆方法
        return singleton;
    }

    /**
     * 用于防止序列化和反序列化破坏单例
     *
     * @return
     */
    private Object readResolve() {
        return singleton;
    }
}
