package site.muzhi.state;

/**
 * Author: lichuang
 * Date: Create in 14:25 2019/12/6
 * Description: 发放奖品状态
 */

public class DispenseState extends State {

    private Activity activity;

    public DispenseState(Activity activity) {
        this.activity = activity;
    }

    @Override
    void deduceMoney() {
        System.out.println("不能扣除积分...");
    }

    @Override
    boolean raffle() {
        System.out.println("不能抽奖...");
        return false;
    }

    @Override
    void dispensePrize() {
        // 判断奖品数目是否足够
        if (activity.getCount() > 0) {
            System.out.println("正在发放奖品...");
            // 重新调整为不能抽奖状态
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品已经发放完...");
            // 重新调整为不能抽奖状态
            activity.setState(activity.getDispenseOutState());
        }
    }
}
