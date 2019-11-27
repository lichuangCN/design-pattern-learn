package site.muzhi.factory.factorymethod.order;

import site.muzhi.factory.factorymethod.pizza.LDCheesePizza;
import site.muzhi.factory.factorymethod.pizza.LDGreekPizza;
import site.muzhi.factory.factorymethod.pizza.Pizza;

/**
 * Author: lichuang
 * Date: Create in 14:09 2019/11/26
 * Description:
 */

public class LDOrderPizza extends OrderPizza {

    /**
     * 由子类决定要实例化的对象
     *
     * @param orderType
     * @return
     */
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
            pizza.setName("BJ Cheese");
        } else if ("greek".equals(orderType)) {
            pizza = new LDGreekPizza();
            pizza.setName("BJ Greek");
        }
        return pizza;
    }
}
