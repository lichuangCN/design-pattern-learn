package site.muzhi.iterator;

import java.util.List;

/**
 * Author: lichuang
 * Date: Create in 16:10 2019/12/4
 * Description:
 */

public class ListIterator implements Iterator {

    private List list;

    private int index = 0;

    public ListIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return list.get(index++);
        }
        return null;
    }
}
