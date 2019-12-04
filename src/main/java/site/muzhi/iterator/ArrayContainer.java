package site.muzhi.iterator;

/**
 * Author: lichuang
 * Date: Create in 16:14 2019/12/4
 * Description:
 */

public class ArrayContainer implements Container {

    String[] name = {"Tom", "Jerry", "Kitty", "Donald"};

    @Override
    public Iterator getIterator() {
        return new ArrayIterator(name);
    }
}
