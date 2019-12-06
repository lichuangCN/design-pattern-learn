package site.muzhi.memento;

import lombok.Data;

/**
 * Author: lichuang
 * Date: Create in 10:14 2019/12/6
 * Description: 备份对象
 */
@Data
public class Memento {
    /**
     * 需要备份的数据
     */
    private int atk;
    private int def;

    public Memento() {
    }

    public Memento(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }

}
