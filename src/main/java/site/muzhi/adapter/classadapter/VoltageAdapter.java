package site.muzhi.adapter.classadapter;

/**
 * Author: lichuang
 * Date: Create in 10:48 2019/11/27
 * Description: 适配接口
 */

public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    /**
     * 做适配处理
     *
     * @return
     */
    @Override
    public int output5V() {
        int srcV = output220V();
        int detV = srcV / 44;
        return detV;
    }
}
