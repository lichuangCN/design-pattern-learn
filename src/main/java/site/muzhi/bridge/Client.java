package site.muzhi.bridge;

/**
 * Author: lichuang
 * Date: Create in 13:38 2019/11/27
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new VivoBrand());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}
