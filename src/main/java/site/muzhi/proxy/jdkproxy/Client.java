package site.muzhi.proxy.jdkproxy;

import site.muzhi.proxy.staticproxy.ITeacherDao;
import site.muzhi.proxy.staticproxy.TeacherDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author: lichuang
 * Date: Create in 16:54 2019/11/30
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        // 被代理对象（目标对象）
        ITeacherDao target = new TeacherDaoImpl();

        ITeacherDao proxyInstance = (ITeacherDao) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK动态代理...");
                        // 调用目标对象 target
                        Object result = method.invoke(target, args);
                        return result;
                    }
                });
        proxyInstance.teach();
    }
}
