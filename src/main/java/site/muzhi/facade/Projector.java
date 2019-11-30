package site.muzhi.facade;

/**
 * Author: lichuang
 * Date: Create in 15:01 2019/11/30
 * Description:
 */

public class Projector {

    //
    private static Projector instance = new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector on ...");
    }

    public void off() {
        System.out.println("Projector off ...");
    }

    public void focus() {
        System.out.println("Projector focus ...");
    }
}
