package site.muzhi.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: lichuang
 * Date: Create in 13:34 2019/11/30
 * Description:
 */

public class College extends OrganizationComponent {

    // 存放的Department
    List<OrganizationComponent> componentList = new ArrayList<OrganizationComponent>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(OrganizationComponent component) {
        componentList.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        componentList.remove(component);
    }

    @Override
    public void print() {
        System.out.println("---------------" + getName() + "-----------");
        // 遍历输出
        componentList.forEach(component -> component.print());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }
}
