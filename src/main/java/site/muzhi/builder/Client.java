package site.muzhi.builder;

/**
 * Author: lichuang
 * Date: Create in 9:52 2019/11/27
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        // CommonHouse
        CommonHouse commonHouse = new CommonHouse();
        House common = new HouseDirector(commonHouse).constructHouse();
        System.out.println(common);

        // HighHouse
        HighHouse highHouse = new HighHouse();
        House high = new HouseDirector(highHouse).constructHouse();
        System.out.println(high);
    }
}
