package site.muzhi.factory.simplefactory.pizza;

/**
 * Author: lichuang
 * Date: Create in 13:00 2019/11/26
 * Description:
 */

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing for greek pizza ...");
    }
}
