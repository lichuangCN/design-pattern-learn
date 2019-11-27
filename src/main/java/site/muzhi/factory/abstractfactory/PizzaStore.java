package site.muzhi.factory.abstractfactory;

import site.muzhi.factory.abstractfactory.factory.BJFactory;
import site.muzhi.factory.abstractfactory.order.OrderPizza;

/**
 * Author: lichuang
 * Date: Create in 16:52 2019/11/26
 * Description:
 */

public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
