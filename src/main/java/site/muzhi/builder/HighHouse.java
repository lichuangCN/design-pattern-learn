package site.muzhi.builder;

/**
 * Author: lichuang
 * Date: Create in 9:48 2019/11/27
 * Description:
 */

public class HighHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("高楼打地基...");
        house.setBasic("高楼地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙...");
        house.setWall("高楼的墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖屋顶...");
        house.setRoofed("高楼的屋顶");
    }
}
