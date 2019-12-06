package site.muzhi.memento;

import lombok.Data;

/**
 * Author: lichuang
 * Date: Create in 10:13 2019/12/6
 * Description: 被保存状态的对象
 */
@Data
public class GameRole {

    private int atk;
    private int def;

    public GameRole(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }

    /**
     * 生成备份
     *
     * @return
     */
    public Memento saveMemento() {
        return new Memento(atk, def);
    }

    /**
     * 回档，恢复数据
     *
     * @param memento
     */
    public void getMemento(Memento memento) {
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }
}
