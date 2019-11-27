package site.muzhi.bridge;

/**
 * Author: lichuang
 * Date: Create in 13:35 2019/11/27
 * Description:
 */

public class UpRightPhone extends Phone {

    public UpRightPhone(IBrand brand) {
        super(brand);
    }
    @Override
    public void open() {
        super.open();
        System.out.println("直板手机...");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("直板手机...");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("直板手机...");
    }
}
