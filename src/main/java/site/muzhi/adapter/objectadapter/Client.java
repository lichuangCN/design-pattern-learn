package site.muzhi.adapter.objectadapter;

/**
 * Author: lichuang
 * Date: Create in 10:53 2019/11/27
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        // 类适配器模式
        Phone phone = new Phone();
        Voltage220V v = new Voltage220V();
        phone.charging(new VoltageAdapter(v));
    }
}
