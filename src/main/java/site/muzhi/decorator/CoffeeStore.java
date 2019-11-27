package site.muzhi.decorator;

/**
 * Author: lichuang
 * Date: Create in 14:37 2019/11/27
 * Description:
 */

public class CoffeeStore {

    public static void main(String[] args) {
        //1.单点一份ShortBlack
        Drink order = new ShortBlack();
        System.out.println("order description: "+order.getDescription());
        System.out.println("order price: "+order.cost());

        //2.添加2份Chocolate
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("add a piece of chocolate..");
        System.out.println("order description: "+order.getDescription());
        System.out.println("order price: "+order.cost());

        //3.在添加一份Milk
        order = new Milk(order);
        System.out.println("add a piece of milk..");
        System.out.println("order description: "+order.getDescription());
        System.out.println("order price: "+order.cost());

        System.out.println("----------------------------------");
    }
}
