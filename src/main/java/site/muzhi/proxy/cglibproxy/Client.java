package site.muzhi.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Author: lichuang
 * Date: Create in 17:17 2019/11/30
 * Description:
 */

public class Client {

    public static void main(String[] args) {

        TeacherDao target = new TeacherDao();

        TeacherDao proxy = (TeacherDao) Enhancer.create(target.getClass(),
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        System.out.println("CGlib 动态代理...");
                        return method.invoke(target);
                    }
                });
        proxy.teach();
    }
}
