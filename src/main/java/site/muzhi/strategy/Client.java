package site.muzhi.strategy;

/**
 * Author: lichuang
 * Date: Create in 15:33 2019/12/6
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        Duck wildDuck = new WildDuck(new GoodFlyBehaviour(),new GaGaQuarkBehaviour());
        wildDuck.quark();
        wildDuck.fly();

        Duck toyDuck = new ToyDuck(new NoFlyBehaviour(), new NoQuarkBehaviour());
        toyDuck.quark();
        toyDuck.fly();
    }
}
