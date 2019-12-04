package site.muzhi.visitor;

/**
 * Author: lichuang
 * Date: Create in 13:10 2019/12/4
 * Description:
 */

public class Success extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男性的评价是成功的");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女性的评价是成功的");
    }
}
