package site.muzhi.decorator;

/**
 * Author: lichuang
 * Date: Create in 14:35 2019/11/27
 * Description:
 */
// 具体的辅料类型
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDescription("Chocolate");
        setPrice(2.0F);
    }
}
