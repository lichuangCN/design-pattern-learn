package site.muzhi.mediator;

/**
 * Author: lichuang
 * Date: Create in 11:09 2019/12/5
 * Description:
 */

public class Market extends Department {

    private Mediator mediator;

    public Market(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("market", this);
    }

    @Override
    public void sendMessage() {
        System.out.println("市场部：我们中标项目，需要技术部的支持...");
        mediator.notice("market");
    }

    @Override
    public void receiveMessage() {
        System.out.println("市场部收到消息...");
    }
}
