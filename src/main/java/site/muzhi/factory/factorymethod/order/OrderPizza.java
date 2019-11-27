package site.muzhi.factory.factorymethod.order;

import site.muzhi.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: lichuang
 * Date: Create in 14:02 2019/11/26
 * Description:
 */

public abstract class OrderPizza {

    /**
     * 工厂方法模式将对象的实例化推迟到子类
     *
     * @return
     */
    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {

        Pizza pizza = null;
        do {
            pizza = createPizza(getType());
            // 制作流程
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("Order failed ...");
            }
        } while (true);
    }

    // 获取输入的pizza种类
    private String getType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter pizza type: ");
            String s = br.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
