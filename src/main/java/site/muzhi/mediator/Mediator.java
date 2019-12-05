package site.muzhi.mediator;

/**
 * Author: lichuang
 * Date: Create in 10:04 2019/12/5
 * Description: 定义中介接口
 */

public interface Mediator {

    void register(String dname, Department d);

    /**
     *
     * @param dname 指的是谁发出的消息
     */
    void notice(String dname);
}
