package site.muzhi.decorator;

import lombok.Data;

/**
 * Author: lichuang
 * Date: Create in 14:26 2019/11/27
 * Description:
 */
@Data
public abstract class Drink {

    // 咖啡或是辅料的名称
    private String description;

    // 咖啡或是辅料的价格
    private float price = 0.0F;

    /**
     * 计算费用的抽象方法
     * 由具体子类实现, 如果是咖啡对象，返回的是单体咖啡的价格
     * 如果是辅料对象，返回的是咖啡（加过或未加过辅料）+辅料的价格
     * @return
     */
    public abstract float cost();
}
