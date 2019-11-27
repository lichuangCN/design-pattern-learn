package site.muzhi.factory.factorymethod.pizza;

/**
 * Author: lichuang
 * Date: Create in 14:01 2019/11/26
 * Description:
 */

public class LDGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing for LDGreekPizza...");
    }
}
