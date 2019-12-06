package site.muzhi.memento;

/**
 * Author: lichuang
 * Date: Create in 10:23 2019/12/6
 * Description:
 */

public class Client {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        GameRole role1 = new GameRole(12, 12);
        GameRole role2 = new GameRole(23, 14);
        System.out.println("--初始化角色，并保存角色信息--");
        System.out.println(role1.toString());
        System.out.println(role2.toString());
        // 保存角色信息
        careTaker.setMemento("role1", role1.saveMemento());
        careTaker.setMemento("role2", role2.saveMemento());

        System.out.println("--角色状态发生变化--");
        role1.setAtk(24);
        role1.setDef(32);
        role2.setAtk(22);
        role2.setDef(13);
        System.out.println(role1.toString());
        System.out.println(role2.toString());

        System.out.println("--恢复初始状态--");
        role1.getMemento(careTaker.getMemento("role1"));
        role2.getMemento(careTaker.getMemento("role2"));
        System.out.println(role1.toString());
        System.out.println(role2.toString());
    }
}
