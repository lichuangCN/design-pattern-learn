package site.muzhi.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: lichuang
 * Date: Create in 13:30 2019/11/30
 * Description:
 */

public class University extends OrganizationComponent {

    // 存放的college
    List<OrganizationComponent> componentList = new ArrayList<OrganizationComponent>();

    public University(String name, String desc) {
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
        for (OrganizationComponent component : componentList) {
            component.print();
        }
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
