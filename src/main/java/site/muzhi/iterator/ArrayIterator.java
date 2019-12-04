package site.muzhi.iterator;

/**
 * Author: lichuang
 * Date: Create in 15:56 2019/12/4
 * Description:
 */

public class ArrayIterator implements Iterator {

    private Object[] array;

    public ArrayIterator(Object[] array) {
        this.array = array;
    }

    /**
     * 遍历的位置
     */
    private int index = 0;

    @Override
    public boolean hasNext() {
        if (index < array.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
       if (hasNext()) {
           return array[index++];
       }
       return null;
    }
}
