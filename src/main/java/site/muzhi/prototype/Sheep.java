package site.muzhi.prototype;

/**
 * Author: lichuang
 * Date: Create in 17:36 2019/11/26
 * Description: 原型
 */

public class Sheep implements Cloneable {

    private String name;
    private Integer age;
    private Sheep friend;

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 浅克隆
     * @return
     */
    /*@Override
    protected Sheep clone() {
        Sheep clone = null;
        try {
            clone = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }*/

    /**
     * 深克隆,克隆新的friend
     *
     * @return
     */
    @Override
    protected Sheep clone() {
        Sheep clone = null;
        try {
            clone = (Sheep) super.clone();
            if (getFriend() != null) {
                clone.setFriend((getFriend().clone()));
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
