package site.muzhi.factory.abstractfactory.factory;

import site.muzhi.factory.abstractfactory.pizza.LDGreekPizza;
import site.muzhi.factory.abstractfactory.pizza.Pizza;

/**
 * Author: lichuang
 * Date: Create in 15:48 2019/11/26
 * Description:
 */

public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDGreekPizza();
            pizza.setName("LD Cheese");
        } else if ("greek".equals(orderType)) {
            pizza = new LDGreekPizza();
            pizza.setName("LD Greek");
        }
        return pizza;
    }
}
