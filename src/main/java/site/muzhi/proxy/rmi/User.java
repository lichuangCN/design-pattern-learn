package site.muzhi.proxy.rmi;

import java.io.Serializable;

/**
 * @author: lichuang
 * @date: 2020/03/14
 * @description:
 */

public class User implements Serializable {

    // 序列化
    private static final long serialVersionUID = -6203021027094059755L;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
