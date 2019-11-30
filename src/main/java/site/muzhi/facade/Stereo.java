package site.muzhi.facade;

/**
 * Author: lichuang
 * Date: Create in 15:03 2019/11/30
 * Description:
 */

public class Stereo {

    //
    private static Stereo instance = new Stereo();

    private Stereo() {
    }

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Stereo on ...");
    }

    public void off() {
        System.out.println("Stereo off ...");
    }

}
