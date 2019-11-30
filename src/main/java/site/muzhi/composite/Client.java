package site.muzhi.composite;

/**
 * Author: lichuang
 * Date: Create in 13:38 2019/11/30
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("清华", "一流大学");

        OrganizationComponent computerCollege = new College("计算机学院", "一流学院");
        OrganizationComponent softwareCollege = new College("软件学院", "一流学院");

        computerCollege.add(new Department("计算机科学与技术","一级学科"));
        computerCollege.add(new Department("软件工程","被削了"));

        softwareCollege.add(new Department("网络工程","学科没了"));

        university.add(computerCollege);
        university.add(softwareCollege);

        university.print();

        computerCollege.print();
        softwareCollege.print();
    }
}
