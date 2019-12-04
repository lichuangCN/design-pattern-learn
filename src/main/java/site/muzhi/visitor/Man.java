package site.muzhi.visitor;

/**
 * Author: lichuang
 * Date: Create in 13:10 2019/12/4
 * Description:
 */

public class Man extends Person{

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
