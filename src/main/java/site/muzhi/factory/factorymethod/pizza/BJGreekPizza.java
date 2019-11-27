package site.muzhi.factory.factorymethod.pizza;

/**
 * Author: lichuang
 * Date: Create in 14:00 2019/11/26
 * Description:
 */

public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing for BJGreekPizza...");
    }
}
