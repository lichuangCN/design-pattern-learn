package site.muzhi.factory.abstractfactory.factory;

import site.muzhi.factory.abstractfactory.pizza.Pizza;

/**
 * Author: lichuang
 * Date: Create in 15:46 2019/11/26
 * Description: 抽象工厂模式的抽象层(接口)
 */

public interface AbsFactory {

    /**
     * 由具体的工厂子类决定实例化对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType);
}
