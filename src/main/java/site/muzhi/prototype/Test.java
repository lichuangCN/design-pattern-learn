package site.muzhi.prototype;

import jdk.nashorn.internal.runtime.SharedPropertyMap;

/**
 * Author: lichuang
 * Date: Create in 17:41 2019/11/26
 * Description:
 */

public class Test {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("Doli",1);
        sheep.setFriend(new Sheep("friend",2));
        Sheep clone1 = sheep.clone();
        Sheep clone2 = sheep.clone();
        System.out.println("sheep.friend hashCode(): " + sheep.getFriend().hashCode());
        System.out.println("clone1.friend hashCode(): " + clone1.getFriend().hashCode());
        System.out.println("clone2.friend hashCode(): " + clone2.getFriend().hashCode());
    }
}
