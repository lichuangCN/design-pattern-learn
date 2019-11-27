package site.muzhi.builder;

/**
 * Author: lichuang
 * Date: Create in 9:49 2019/11/27
 * Description: 动态的指定房子的构建流程
 */

public class HouseDirector {

    HouseBuilder builder = null;

    public HouseDirector() {
    }

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    // 将建造房子的流程交给指挥者
    // 可以调整建造流程
    public House constructHouse() {
        builder.buildBasic();
        builder.buildWalls();
        builder.roofed();
        return builder.buildHouse();
    }
}
