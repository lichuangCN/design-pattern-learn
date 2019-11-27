package site.muzhi.singleton;

/**
 * Author: lichuang
 * Date: Create in 11:20 2019/11/26
 * Description: 枚举方式
 * 可以避免多线程同步问题,而且还能防止反序列化重新创建新的对象。
 */

public enum Singleton8 {

    INSTANCE
    ;

    private Singleton8(){}
}
