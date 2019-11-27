package site.muzhi.decorator;

/**
 * Author: lichuang
 * Date: Create in 14:36 2019/11/27
 * Description:
 */
// 具体的辅料类型
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDescription("Milk");
        setPrice(1.5F);
    }
}
