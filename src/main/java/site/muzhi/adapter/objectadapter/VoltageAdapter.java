package site.muzhi.adapter.objectadapter;

import site.muzhi.adapter.classadapter.IVoltage5V;

/**
 * Author: lichuang
 * Date: Create in 10:48 2019/11/27
 * Description: 适配接口
 */

public class VoltageAdapter implements IVoltage5V {
    // 被适配类的对象的实例
    private Voltage220V v;

    // 通过构造器传入实例对象
    public VoltageAdapter(Voltage220V v) {
        this.v = v;
    }

    /**
     * 做适配处理
     *
     * @return
     */
    @Override
    public int output5V() {
        int srcV = v.output220V();
        int detV = srcV / 44;
        return detV;
    }
}
