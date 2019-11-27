package site.muzhi.adapter.classadapter;

import site.muzhi.adapter.classadapter.Phone;
import site.muzhi.adapter.classadapter.VoltageAdapter;

/**
 * Author: lichuang
 * Date: Create in 10:53 2019/11/27
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        // 类适配器模式
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
