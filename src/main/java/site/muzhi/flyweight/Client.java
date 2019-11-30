package site.muzhi.flyweight;

/**
 * Author: lichuang
 * Date: Create in 16:00 2019/11/30
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        // 创建一个工厂
        WebSiteFactory factory = new WebSiteFactory();
        //
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("Tom"));
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("Jerry"));
        WebSite webSite3 = factory.getWebSiteCategory("新闻");
        webSite3.use(new User("Foo"));
        System.out.println("factory count: " + factory.getWebSiteCount());
    }
}
