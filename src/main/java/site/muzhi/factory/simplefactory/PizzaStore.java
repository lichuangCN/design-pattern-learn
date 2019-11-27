package site.muzhi.factory.simplefactory;

import site.muzhi.factory.simplefactory.order.OrderPizza;

/**
 * Author: lichuang
 * Date: Create in 13:15 2019/11/26
 * Description: 相当于客户端，发出订单
 */

public class PizzaStore {

    public static void main(String[] args) {
        // 启动pizza订单
        new OrderPizza(new SimpleFactory());
    }
}
