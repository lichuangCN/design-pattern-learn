package site.muzhi.proxy.staticproxy;

/**
 * Author: lichuang
 * Date: Create in 16:43 2019/11/30
 * Description: 目标对象
 */

public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao proxy;

    public TeacherDaoProxy(ITeacherDao proxy) {
        this.proxy = proxy;
    }

    @Override
    public void teach() {
        System.out.println("开始静态代理...");
        proxy.teach();
        System.out.println("提交....");
    }
}
