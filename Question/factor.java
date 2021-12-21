import java.util.*;

public class factor {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            ArrayList<Integer> al = new ArrayList<>();
            int count = 0;

            for (int i = 1; i * i <= a; i++) {
                if (a % i == 0) {
                    count++;
                    al.add(i);
                    if ((a / i != i)) {

                        count++;
                        al.add(a / i);
                    }
                }
            }
            Collections.sort(al);
            System.out.println(count);
            for (int e : al) {
                System.out.print(e + " ");
            }

        } catch (Exception e) {
        }
        // your code goes here
    }

}
