package site.muzhi.state;

/**
 * Author: lichuang
 * Date: Create in 14:24 2019/12/6
 * Description: 能够抽奖状态
 */

public class CanRaffleState extends State {

    private Activity activity;

    public CanRaffleState(Activity activity) {
        this.activity = activity;
    }

    @Override
    void deduceMoney() {
        System.out.println("已扣除积分，可以抽奖的状态...");
    }

    @Override
    boolean raffle() {
        System.out.println("正在抽奖...");

        // 中奖率为80%
        if (Math.random() > 0.8) {
            System.out.println("很遗憾未中奖，请继续...");
            activity.setState(activity.getNoRaffleState());
            return false;
        } else {
            System.out.println("恭喜中奖...");
            activity.setState(activity.getDispenseState());
            return true;
        }
    }

    @Override
    void dispensePrize() {
        System.out.println("未中奖，不能发放奖品");
    }
}
