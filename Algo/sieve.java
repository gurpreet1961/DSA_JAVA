import java.util.Scanner;
import java.util.Vector;

public class sieve {
    static void fact(int n) {
        Vector<Boolean> list = new Vector<>();
        for (int i = 0; i < n; i++) {
            list.add(true);
        }
        for (int i = 2; i * i < n; i++) {
            if (list.get(i) == true) {
                for (int j = i * i; j < n; j = j + 1) {
                    list.add(j, false);
                    list.remove(size(list) - 1);
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (list.get(i) == true) {
                System.out.println(i + " ");
            }
        }
    }

    static void segmetedSieve(int n) {
        int range = floor(Math.sqrt(n));
        Vector<Integer> primeNos = new Vector<>();
        // primeNos.reserve()
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
}
