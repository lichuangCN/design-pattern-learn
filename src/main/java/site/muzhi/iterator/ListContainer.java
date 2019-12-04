package site.muzhi.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * Author: lichuang
 * Date: Create in 16:15 2019/12/4
 * Description:
 */

public class ListContainer implements Container {

    List<Integer> age = Arrays.asList(22, 23, 21, 24);

    @Override
    public Iterator getIterator() {
        return new ListIterator(age);
    }
}
