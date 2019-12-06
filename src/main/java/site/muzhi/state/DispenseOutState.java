package site.muzhi.state;

/**
 * Author: lichuang
 * Date: Create in 14:25 2019/12/6
 * Description: 奖品发放完毕，所有都不能参加
 */

public class DispenseOutState extends State {

    private Activity activity;

    public DispenseOutState(Activity activity) {
        this.activity = activity;
    }

    @Override
    void deduceMoney() {
        System.out.println("抽奖结束，请下次参加...");
    }

    @Override
    boolean raffle() {
        System.out.println("抽奖结束，请下次参加...");
        return false;
    }

    @Override
    void dispensePrize() {
        System.out.println("抽奖结束，请下次参加...");
    }
}
