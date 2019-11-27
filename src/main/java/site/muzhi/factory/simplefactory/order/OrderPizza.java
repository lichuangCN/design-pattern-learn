package site.muzhi.factory.simplefactory.order;

import site.muzhi.factory.simplefactory.SimpleFactory;
import site.muzhi.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: lichuang
 * Date: Create in 13:05 2019/11/26
 * Description:
 */

public class OrderPizza {

    private SimpleFactory factory;

    public OrderPizza(SimpleFactory factory) {
        this.factory = factory;
        Pizza pizza = null;
        do {
            pizza = factory.createPizza(getType());
            // 制作流程
           if (pizza!=null){
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
