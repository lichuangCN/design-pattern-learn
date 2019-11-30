package site.muzhi.composite;

import lombok.Data;

/**
 * Author: lichuang
 * Date: Create in 13:27 2019/11/30
 * Description:
 */
@Data
public abstract class OrganizationComponent {

    private String name;
    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * 由于部分组件不需要某些方法，在这里做成默认实现，有具体子类选择重写
     * @param component
     */
    public void add(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }
    public void remove(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
