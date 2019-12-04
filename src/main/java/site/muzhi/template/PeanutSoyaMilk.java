package site.muzhi.template;

/**
 * Author: lichuang
 * Date: Create in 9:29 2019/12/4
 * Description:
 */

public class PeanutSoyaMilk extends SoyaMilk {

    /**
     * 重写
     */
    @Override
    public void select() {
        System.out.println("选择黄豆和花生...");
    }
}
