package site.muzhi.visitor;

/**
 * Author: lichuang
 * Date: Create in 13:11 2019/12/4
 * Description:
 */

public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男性的评价是失败的");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女性的评价是失败的");
    }
}
