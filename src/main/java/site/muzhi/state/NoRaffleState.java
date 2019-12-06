package site.muzhi.state;

/**
 * Author: lichuang
 * Date: Create in 14:24 2019/12/6
 * Description: 不可抽奖状态
 */

public class NoRaffleState extends State {

    private Activity activity;

    public NoRaffleState(Activity activity) {
        this.activity = activity;
    }

    /**
     * 当前状态可以扣积分，扣完积分后将状态转为可以抽奖状态
     */
    @Override
    void deduceMoney() {
        System.out.println("扣完积分，可以抽奖...");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    boolean raffle() {
        System.out.println("先扣除积分才能抽奖...");
        return false;
    }

    @Override
    void dispensePrize() {
        System.out.println("先抽奖才能发放奖品...");
    }
}
