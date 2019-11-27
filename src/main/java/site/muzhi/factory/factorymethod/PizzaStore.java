package site.muzhi.factory.factorymethod;

import site.muzhi.factory.factorymethod.order.BJOrderPizza;
import site.muzhi.factory.factorymethod.order.LDOrderPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: lichuang
 * Date: Create in 14:10 2019/11/26
 * Description:
 */

public class PizzaStore {

    public static void main(String[] args) {

        String loc = getLocation();
        if (loc.equals("BJ")) {
            new BJOrderPizza();
        } else if (loc.equals("LD")) {
            new LDOrderPizza();
        }
    }

    // 获取输入的pizza种类
    private static String getLocation() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter pizza location: ");
            String s = br.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
