package site.muzhi.facade;

/**
 * Author: lichuang
 * Date: Create in 15:02 2019/11/30
 * Description:
 */

public class Screen {

    //
    private static Screen instance = new Screen();

    private Screen() {
    }

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Screen up ...");
    }

    public void down() {
        System.out.println("Screen down ...");
    }

}
