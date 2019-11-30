package site.muzhi.composite;

/**
 * Author: lichuang
 * Date: Create in 13:37 2019/11/30
 * Description:
 */

public class Department extends OrganizationComponent {

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        System.out.println(getName());
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
