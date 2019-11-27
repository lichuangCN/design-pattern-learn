package site.muzhi.factory.factorymethod.pizza;

/**
 * Author: lichuang
 * Date: Create in 13:59 2019/11/26
 * Description:
 */

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing for BJCheesePizza...");
    }
}
