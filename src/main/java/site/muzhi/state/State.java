package site.muzhi.state;

/**
 * Author: lichuang
 * Date: Create in 14:21 2019/12/6
 * Description: 状态抽象基类
 */

public abstract class State {

    /**
     * 扣除积分
     */
    abstract void deduceMoney();

    /**
     * 能否抽奖
     *
     * @return
     */
    abstract boolean raffle();

    /**
     * 发放奖品
     */
    abstract void dispensePrize();
}
