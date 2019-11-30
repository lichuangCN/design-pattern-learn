package site.muzhi.facade;

/**
 * Author: lichuang
 * Date: Create in 15:05 2019/11/30
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.ready();
        facade.play();
        facade.pause();
        facade.end();
    }
}
