import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();

        q.add(1);
        q.add(12);
        q.offer(13);
        q.offer(14);

        System.out.println(q);

        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.element());
        System.out.println(q.peek());

    }
}
