package site.muzhi.decorator;

/**
 * Author: lichuang
 * Date: Create in 14:28 2019/11/27
 * Description:
 */

public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
