package site.muzhi.mediator;

/**
 * Author: lichuang
 * Date: Create in 10:04 2019/12/5
 * Description: 定义抽象类同事
 */

public abstract class Department {

    /**
     * 发送本部门消息
     */
    public abstract void sendMessage();

    /**
     * 收到的消息
     */
    public abstract void receiveMessage();

}
