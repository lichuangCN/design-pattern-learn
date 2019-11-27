package site.muzhi.builder;

/**
 * Author: lichuang
 * Date: Create in 9:45 2019/11/27
 * Description:
 */

public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基...");
        house.setBasic("普通房子地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙...");
        house.setWall("普通房子的墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶...");
        house.setRoofed("普通房子的屋顶");
    }
}
