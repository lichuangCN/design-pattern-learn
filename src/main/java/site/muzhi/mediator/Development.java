package site.muzhi.mediator;

/**
 * Author: lichuang
 * Date: Create in 11:07 2019/12/5
 * Description:
 */

public class Development extends Department {

    private Mediator mediator;

    public Development(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("development", this);
    }

    @Override
    public void sendMessage() {
        System.out.println("研发部：我们需要开发资金...");
        mediator.notice("development");
    }

    @Override
    public void receiveMessage() {
        System.out.println("研发部收到消息...");
    }
}
