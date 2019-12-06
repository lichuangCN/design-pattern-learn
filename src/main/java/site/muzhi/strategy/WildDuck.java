package site.muzhi.strategy;

/**
 * Author: lichuang
 * Date: Create in 15:32 2019/12/6
 * Description:
 */

public class WildDuck extends Duck {

    private FlyBehaviour flyBehaviour;

    private QuarkBehaviour quarkBehaviour;

    public WildDuck(FlyBehaviour flyBehaviour, QuarkBehaviour quarkBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quarkBehaviour = quarkBehaviour;
    }

    @Override
    void quark() {
        quarkBehaviour.quark();
    }

    @Override
    void fly() {
        flyBehaviour.fly();
    }
}
