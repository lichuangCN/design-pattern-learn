package site.muzhi.mediator;

/**
 * Author: lichuang
 * Date: Create in 11:11 2019/12/5
 * Description:
 */

public class Financial extends Department {

    private Mediator mediator;

    public Financial(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("financial", this);
    }

    @Override
    public void sendMessage() {
        System.out.println("财务部：我们已经拨款...");
        mediator.notice("financial");
    }

    @Override
    public void receiveMessage() {
        System.out.println("财务部收到消息...");
    }
}
