package site.muzhi.bridge;

/**
 * Author: lichuang
 * Date: Create in 13:26 2019/11/27
 * Description:
 */

public class XiaoMiBrand implements IBrand {

    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }
}
