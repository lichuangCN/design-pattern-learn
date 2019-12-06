package site.muzhi.state;

import lombok.Data;

/**
 * Author: lichuang
 * Date: Create in 14:20 2019/12/6
 * Description:
 */

@Data
public class Activity {

    /**
     * 活动的状态
     */
    private State state;

    /**
     * 奖品数目
     */
    private int count;

    private State canRaffleState = new CanRaffleState(this);

    private State noRaffleState = new NoRaffleState(this);

    private State dispenseOutState = new DispenseOutState(this);

    private State dispenseState = new DispenseState(this);

    public Activity() {
        // 初始化为不可抽奖状态
        setState(noRaffleState);
        count = 10;
    }

    /**
     * 活动扣几分环节
     */
    public void deduceMoney() {
        state.deduceMoney();
    }

    public void raffle() {
        if (state.raffle()) {
            // 抽奖成功，领取奖品
            state.dispensePrize();
        }
    }

    /**
     * 每领取一次奖品，奖品数据-1
     *
     * @return
     */
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }
}
