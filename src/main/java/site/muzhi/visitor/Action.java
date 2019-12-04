package site.muzhi.visitor;

/**
 * Author: lichuang
 * Date: Create in 13:08 2019/12/4
 * Description: 作为访问者
 */

public abstract class Action {

    /**
     * 得到男性的评价
     *
     * @param man
     */
    public abstract void getManResult(Man man);

    /**
     * 得到女性的评价
     *
     * @param woman
     */
    public abstract void getWomanResult(Woman woman);
}
