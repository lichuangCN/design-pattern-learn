package site.muzhi.factory.abstractfactory.pizza;

/**
 * Author: lichuang
 * Date: Create in 14:00 2019/11/26
 * Description:
 */

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing for LDCheesePizza...");
    }
}
