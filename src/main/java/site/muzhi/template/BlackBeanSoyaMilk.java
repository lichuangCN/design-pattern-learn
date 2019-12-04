package site.muzhi.template;

/**
 * Author: lichuang
 * Date: Create in 9:28 2019/12/4
 * Description:
 */

public class BlackBeanSoyaMilk extends SoyaMilk {

    /**
     * 重写豆子的选择方法
     */
    @Override
    public void select() {
        System.out.println("选择黑豆...");
    }

    /**
     * 重写钩子方法
     * @return
     */
    @Override
    boolean isNeedSugar() {
        return false;
    }
}
