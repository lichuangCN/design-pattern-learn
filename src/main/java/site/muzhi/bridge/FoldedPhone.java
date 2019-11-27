package site.muzhi.bridge;

/**
 * Author: lichuang
 * Date: Create in 13:32 2019/11/27
 * Description:
 */

public class FoldedPhone extends Phone {

    public FoldedPhone(IBrand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠式手机...");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠式手机...");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠式手机...");
    }
}
