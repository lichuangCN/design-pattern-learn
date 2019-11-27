package site.muzhi.factory.abstractfactory.pizza;

/**
 * Author: lichuang
 * Date: Create in 12:57 2019/11/26
 * Description:
 */

public abstract class Pizza {
    private String name;

    // 准备pizza
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " Pizza is baking ...");
    }

    public void cut() {
        System.out.println(name + " Pizza is cutting ...");
    }

    public void box() {
        System.out.println(name + " Pizza is boxing ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
