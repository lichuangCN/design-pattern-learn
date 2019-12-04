package site.muzhi.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Author: lichuang
 * Date: Create in 13:17 2019/12/4
 * Description: 数据结构载体，管理很多人
 */

public class ObjectStructure {

    /**
     * 维护了一个集合
     */
    private List<Person> personList = new LinkedList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    /**
     * 显示测评情况
     *
     * @param action
     */
    public void display(Action action) {
        personList.forEach(p -> p.accept(action));
    }
}
