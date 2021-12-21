import java.util.*;

public class top3 {

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 3, 7, 4, 9, 1, 4, 5 };
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {

            int peek = pq.peek();
            if (peek < arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            } else {
                continue;
            }
        }
        ArrayList<Integer> al = new ArrayList<>(pq);
        Collections.sort(al, Collections.reverseOrder());
        for (int el : al) {
            System.out.println(el + " ");
        }
    }
}
