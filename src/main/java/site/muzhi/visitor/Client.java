package site.muzhi.visitor;

/**
 * Author: lichuang
 * Date: Create in 13:21 2019/12/4
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());
        structure.attach(new Man());

        // 成功
        Success success = new Success();
        structure.display(success);

        // 失败
        Fail fail = new Fail();
        structure.display(fail);
    }
}
