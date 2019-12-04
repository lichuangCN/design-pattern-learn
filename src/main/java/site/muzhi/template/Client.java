package site.muzhi.template;

/**
 * Author: lichuang
 * Date: Create in 9:31 2019/12/4
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        BlackBeanSoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
        blackBeanSoyaMilk.make();

        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
