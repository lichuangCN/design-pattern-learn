package site.muzhi.flyweight;

/**
 * Author: lichuang
 * Date: Create in 15:54 2019/11/30
 * Description:
 */

public class ConcreteWebSite extends WebSite {

    // 网站发布类型
    // 共享部分/内部状态
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    /**
     * user 就是外部状态
     * @param user
     */
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type + ", " + user.getName() + "在使用这种...");
    }
}
