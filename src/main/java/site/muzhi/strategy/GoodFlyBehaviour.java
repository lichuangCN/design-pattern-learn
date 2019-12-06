package site.muzhi.strategy;

/**
 * Author: lichuang
 * Date: Create in 15:30 2019/12/6
 * Description:
 */

public class GoodFlyBehaviour implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("这只鸭子飞行技术很不错...");
    }
}
