package site.muzhi.mediator;

/**
 * Author: lichuang
 * Date: Create in 11:18 2019/12/5
 * Description:
 */

public class Client {
    public static void main(String[] args) {

        /**
         * 流程：
         * 1.市场部中标后需要技术部支持，向总经办提出要求
         * 2.技术部收到消息需要资金支持,向总经办提出要求
         * 以上步骤都交给总经办（中介者处理），各部门只负责提出自己的需要，不负责其他事情。
         */

        Mediator mediator = new PresidentMediator();
        Market market = new Market(mediator);
        Development development = new Development(mediator);
        Financial financial = new Financial(mediator);

        market.sendMessage();
    }
}
