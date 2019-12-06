package site.muzhi.strategy;

/**
 * Author: lichuang
 * Date: Create in 15:31 2019/12/6
 * Description:
 */

public class ToyDuck extends Duck {

    private FlyBehaviour flyBehaviour;

    private QuarkBehaviour quarkBehaviour;

    public ToyDuck(FlyBehaviour flyBehaviour, QuarkBehaviour quarkBehaviour) {
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
