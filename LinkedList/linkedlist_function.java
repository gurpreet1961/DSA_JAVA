
// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist_function {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(12);
        ll.add(31);
        ll.add(14);
        ll.add(15);
        ll.add(2, 11);
        System.out.println(ll);
    }
}
// add, addAll, get, set, remove, clear, size, contains, isEmpty, toArray
// System.out.println(ll.get(0));

// List<Integer> ll = new LinkedList<>();
// List<Integer> al = new ArrayList<>();
// getTimeDiff(ll);
// getTimeDiff(al);
// System.out.println("So For insertion at end we use arraylist");
// System.out.println("So For insertion at a specific index we use linkedlist");
// }

// static void getTimeDiff(List<Integer> list) {
// long start = System.currentTimeMillis();
// for (int i = 0; i < 1000000; i++) {
// list.add(i);
// }
// long end = System.currentTimeMillis();

// System.out.println(list.getClass().getName() + " = " + (end - start));

// start = System.currentTimeMillis();
// for (int i = 0; i < 100000; i++) {
// list.add(0, i);
// }
// end = System.currentTimeMillis();

// System.out.println(list.getClass().getName() + " = " + (end - start));
// }
// }
