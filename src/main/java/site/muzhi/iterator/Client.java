package site.muzhi.iterator;

/**
 * Author: lichuang
 * Date: Create in 16:17 2019/12/4
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        ArrayContainer arrayContainer = new ArrayContainer();
        Iterator arrayIterator = arrayContainer.getIterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next() + " ");
        }

        ListContainer listContainer = new ListContainer();
        Iterator listIterator = listContainer.getIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + " ");
        }
    }
}
