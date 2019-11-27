package site.muzhi.bridge;

/**
 * Author: lichuang
 * Date: Create in 13:25 2019/11/27
 * Description:
 */

public class VivoBrand implements IBrand {

    @Override
    public void open() {
        System.out.println("Vivo 手机开机");
    }

    @Override
    public void call() {
        System.out.println("Vivo 手机打电话");
    }

    @Override
    public void close() {
        System.out.println("Vivo 手机关机");
    }
}
