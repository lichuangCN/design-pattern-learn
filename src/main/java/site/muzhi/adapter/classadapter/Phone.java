package site.muzhi.adapter.classadapter;

/**
 * Author: lichuang
 * Date: Create in 10:51 2019/11/27
 * Description:
 */

public class Phone {

    /**
     * 充电
     */
    public void charging(IVoltage5V v) {
        if (v.output5V() == 5) {
            System.out.println("电压为5V，可以直接充电");
        } else if (v.output5V() > 5) {
            System.out.println("电压大于5V，不能直接充电");
        }
    }
}
