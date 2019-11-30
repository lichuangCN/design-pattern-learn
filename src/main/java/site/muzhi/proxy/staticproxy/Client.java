package site.muzhi.proxy.staticproxy;

/**
 * Author: lichuang
 * Date: Create in 16:47 2019/11/30
 * Description:
 */

public class Client {

    public static void main(String[] args) {

        // 被代理对象（目标对象）
        TeacherDaoImpl proxy = new TeacherDaoImpl();

        // 代理对象
        TeacherDaoProxy target = new TeacherDaoProxy(proxy);

        target.teach();
    }
}
