package site.muzhi.bridge;

/**
 * Author: lichuang
 * Date: Create in 13:30 2019/11/27
 * Description:
 */

public abstract class Phone {

    // 操作
    private IBrand brand;

    public Phone(IBrand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void call() {
        brand.call();
    }

    public void close() {
        brand.close();
    }
}
