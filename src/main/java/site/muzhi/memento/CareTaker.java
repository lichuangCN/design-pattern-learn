package site.muzhi.memento;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: lichuang
 * Date: Create in 10:19 2019/12/6
 * Description:
 */
@Data
public class CareTaker {

    private Memento memento;

    /**
     * 存储备份的数据
     * （角色名,备份数据）
     */
    private Map<String, Memento> rolesMementoMap = new HashMap<>();

    /**
     * 保存角色状态
     *
     * @param name    角色名
     * @param memento 角色状态
     */
    public void setMemento(String name, Memento memento) {
        rolesMementoMap.put(name, memento);
    }

    /**
     * 根据角色名，获取保存时的角色状态
     *
     * @param name 角色名
     * @return
     */
    public Memento getMemento(String name) {
        return rolesMementoMap.get(name);
    }

}
