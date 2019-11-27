package site.muzhi.builder;

/**
 * Author: lichuang
 * Date: Create in 9:41 2019/11/27
 * Description:
 *  抽象的建造者，规定建造流程
 */

public abstract class HouseBuilder {
    protected House house = new House();

    // 规定建造流程
    // 具体的实现交给具体的子类实现
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse(){
        return house;
    }
}
