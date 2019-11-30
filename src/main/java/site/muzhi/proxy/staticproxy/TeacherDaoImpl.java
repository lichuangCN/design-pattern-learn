package site.muzhi.proxy.staticproxy;

/**
 * Author: lichuang
 * Date: Create in 16:42 2019/11/30
 * Description: 代理对象
 */

public class TeacherDaoImpl implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师讲课中...");
    }
}
