package site.muzhi.strategy;

/**
 * Author: lichuang
 * Date: Create in 15:29 2019/12/6
 * Description:
 */

public class NoFlyBehaviour implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("这只鸭子不会飞...");
    }
}
