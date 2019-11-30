package site.muzhi.facade;

/**
 * Author: lichuang
 * Date: Create in 15:00 2019/11/30
 * Description:
 */

public class Popcorn {

    //
    private static Popcorn instance = new Popcorn();

    private Popcorn(){}

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Popcorn on ...");
    }

    public void off(){
        System.out.println("Popcorn off ...");
    }

    public void pop(){
        System.out.println("Popcorn is poping ...");
    }
}
