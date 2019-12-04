package site.muzhi.visitor;

/**
 * Author: lichuang
 * Date: Create in 13:10 2019/12/4
 * Description: 作为抽象的数据元素
 */

public abstract class Person {

    /**
     * 提供一个方法，让访问者可以访问
     *
     * @param action
     */
    public abstract void accept(Action action);

}
