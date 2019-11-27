package site.muzhi.factory.simplefactory.pizza;

/**
 * Author: lichuang
 * Date: Create in 12:59 2019/11/26
 * Description:
 */

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing for cheese pizza ...");
    }
}
