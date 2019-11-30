package site.muzhi.facade;

/**
 * Author: lichuang
 * Date: Create in 14:57 2019/11/30
 * Description:
 */

public class DVDPlayer {

    //
    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer(){}

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD on ...");
    }

    public void off(){
        System.out.println("DVD off ...");
    }

    public void play(){
        System.out.println("DVD play ...");
    }

    public void pause(){
        System.out.println("DVD pause ...");
    }
}
