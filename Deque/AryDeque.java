import java.util.*;

public class AryDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(4);
        ad.addLast(3);
        ad.addFirst(1);
        ad.push(3);
        // ad.addAll(c)

        System.out.println(ad);

        ad.pop();
        System.out.println(ad);
        System.out.println(ad.peek());

        // we can use function of stack, linkedlist, queue
        /*
         * this is faster then stack because ArrayDeque is implement by vector class and
         * we know vector are thread safe
         */
        // we can also use linkedlist to implement using linkedlist
    }
}
