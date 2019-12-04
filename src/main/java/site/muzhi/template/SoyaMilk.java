package site.muzhi.template;

/**
 * Author: lichuang
 * Date: Create in 9:14 2019/12/4
 * Description: 此类中定义了执行它的方法的模板
 */

public abstract class SoyaMilk {

    /**
     * 模板方法 final 不让子类重写
     */
    public final void make(){
        select();
        add();
        soak();
        beat();
        // 通过钩子方法决定模板方法中的某些方法是某要执行
        if (isNeedSugar()) {
            addSugar();
        }
        System.out.println("-------------");
    }

    /**
     * 有子类具体实现，选择相应的豆子
     */
    public abstract void select();

    public void add() {
        System.out.println("加入选择好的豆子...");
    }

    public void soak() {
        System.out.println("将豆子进行浸泡...");
    }

    public void beat() {
        System.out.println("将浸泡过的豆子打成豆浆...");
    }

    /**
     * 钩子方法
     */
    boolean isNeedSugar() {
        return true;
    }

    public void addSugar() {
        System.out.println("加入糖...");
    }
}
