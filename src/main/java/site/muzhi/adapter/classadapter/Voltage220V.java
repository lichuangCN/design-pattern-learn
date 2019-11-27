package site.muzhi.adapter.classadapter;

/**
 * Author: lichuang
 * Date: Create in 10:47 2019/11/27
 * Description: 被适配类
 */

public class Voltage220V {

    public int output220V() {
        int srcV = 220;
        System.out.println("电压是：" + srcV + "V");
        return srcV;
    }
}
