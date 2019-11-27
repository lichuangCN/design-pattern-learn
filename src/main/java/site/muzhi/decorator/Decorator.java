package site.muzhi.decorator;

/**
 * Author: lichuang
 * Date: Create in 14:31 2019/11/27
 * Description:
 */

public class Decorator extends Drink {

    private Drink drink;

    // 组合
    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // getPrice() 是辅料自己的价格
        return getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + "&&" + super.getDescription();
    }
}
