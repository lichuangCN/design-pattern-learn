package site.muzhi.strategy;

/**
 * Author: lichuang
 * Date: Create in 15:28 2019/12/6
 * Description:
 */

public class NoQuarkBehaviour implements QuarkBehaviour {

    /**
     * 不会叫的鸭子的行为
     */
    @Override
    public void quark() {
        System.out.println("这只鸭子不会叫...");
    }
}
