package site.muzhi.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: lichuang
 * Date: Create in 11:05 2019/12/5
 * Description: 总经理实现中介者接口，处理各个部门的请求
 */

public class PresidentMediator implements Mediator {

    private Map<String,Department> map = new HashMap<>();

    @Override
    public void register(String dname, Department d) {
        map.put(dname,d);
    }

    @Override
    public void notice(String dname) {
        if (dname.equals("market")) {
            map.get("development").receiveMessage();
            map.get("development").sendMessage();
            return;
        }
        if (dname.equals("development")){
            map.get("financial").receiveMessage();
            map.get("financial").sendMessage();
            return;
        }
    }
}
