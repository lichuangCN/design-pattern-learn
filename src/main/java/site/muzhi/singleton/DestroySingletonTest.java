package site.muzhi.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author: lichuang
 * @date: 2020/03/10
 * @description: 破解单例模式：克隆，反射，反序列化
 * 以双重校验实现单例模式为破解例子
 */

public class DestroySingletonTest {

    public static void main(String[] args) throws Exception {
        // 通过单例类对外提供的接口
        DestroySingleton singleton = DestroySingleton.getInstance();
        System.out.println("singleton的hashCode:" + singleton.hashCode());

        // 通过克隆
        DestroySingleton clone = (DestroySingleton) DestroySingleton.getInstance().clone();
        System.out.println("clone的hashCode:" + clone.hashCode());

        // 通过序列化与反序列化
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(DestroySingleton.getInstance());
        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        DestroySingleton serialize = (DestroySingleton) ois.readObject();
        System.out.println("serialize的hashCode:" + serialize.hashCode());
        if (bos != null) {
            bos.close();
        }
        if (oos != null) {
            oos.close();
        }
        if (bis != null) {
            bis.close();
        }
        if (ois != null) {
            ois.close();
        }

        // 通过反射
        Constructor<DestroySingleton> constructor = DestroySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        DestroySingleton reflex = constructor.newInstance();
        System.out.println("reflex的hashCode:" + reflex.hashCode());

    }
}
