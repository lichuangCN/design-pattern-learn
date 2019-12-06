package site.muzhi.state;

/**
 * Author: lichuang
 * Date: Create in 14:57 2019/12/6
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        Activity activity = new Activity();
        for (int i = 0; i < 20; i++) {
            System.out.println("-----第" + i + "次抽奖-----");
            // 1.扣几分
            activity.deduceMoney();

            // 2. 抽奖
            activity.raffle();
        }
    }
}
