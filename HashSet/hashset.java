import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(20);
        hs.add(1);

        System.out.println(hs);
        if (hs.contains(10)) {
            System.out.println("Present");

        } else {
            System.out.println("Not Present");
        }
        hs.remove(10);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());

        hs.clear();
    }
}
