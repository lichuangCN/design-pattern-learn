package site.muzhi.factory.simplefactory;

import site.muzhi.factory.simplefactory.pizza.CheesePizza;
import site.muzhi.factory.simplefactory.pizza.GreekPizza;
import site.muzhi.factory.simplefactory.pizza.Pizza;

/**
 * Author: lichuang
 * Date: Create in 13:29 2019/11/26
 * Description:
 */

public class SimpleFactory {

    /**
     * 对象创建方法(工厂创建对象)
     * 也可定义为静态方法，作为静态工厂创建对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("Greek");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("Cheese");
        }
        return pizza;
    }
}
