package site.muzhi.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: lichuang
 * Date: Create in 15:56 2019/11/30
 * Description:
 */

// 网站工厂类,根据需求返回一个网站
public class WebSiteFactory {

    Map<String, WebSite> pool = new HashMap<>();

    /**
     * 根据网站类型返回一个网站，如果不存在，创建一个返回，并放入池中
     *
     * @param type
     * @return
     */
    public WebSite getWebSiteCategory(String type) {

        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    /**
     * 获取池中网站的数目
     *
     * @return
     */
    public int getWebSiteCount() {
        return pool.size();
    }
}
