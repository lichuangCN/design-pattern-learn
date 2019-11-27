package site.muzhi.factory.abstractfactory.factory;

import site.muzhi.factory.abstractfactory.pizza.BJCheesePizza;
import site.muzhi.factory.abstractfactory.pizza.BJGreekPizza;
import site.muzhi.factory.abstractfactory.pizza.Pizza;

/**
 * Author: lichuang
 * Date: Create in 15:48 2019/11/26
 * Description:
 */

public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
            pizza.setName("BJ Cheese");
        } else if ("greek".equals(orderType)) {
            pizza = new BJGreekPizza();
            pizza.setName("BJ Greek");
        }
        return pizza;
    }
}
