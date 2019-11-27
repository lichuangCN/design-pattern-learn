package site.muzhi.adapter.interadapter;

/**
 * Author: lichuang
 * Date: Create in 11:29 2019/11/27
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        new AbsAdapter() {
            @Override
            public void fun1() {
                System.out.println("重写fun1()...");
            }
        }.fun1();
    }
}
