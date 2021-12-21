import java.util.PriorityQueue;

public class PriQueue {
    public static void main(String[] args) {
        // PriorityQueue<String> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(13);
        pq.add(21);
        pq.add(15);
        pq.add(11);
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        // pq.add("Kiwi");
        // pq.add("Apple");
        // pq.add("Mango");
        // pq.add("Banana");

        // System.out.println(pq);
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
    }
}
