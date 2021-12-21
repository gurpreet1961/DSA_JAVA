import java.util.Scanner;

//check fibonacci number
public class Memoization {

    static long storage[] = new long[999];

    public static long fib(int n) {
        for (int i = 0; i < 999; i++) {
            storage[i] = 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (storage[n] != 0) {
            return storage[n];
        } else {
            storage[n] = fib(n - 1) + fib(n - 2);
            return storage[n];
        }
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        // To Print fibonacci seriers
        // for (int i = 1; i <= n; i++) {
        // System.out.println(fib(i));
        // }

        // check fibonacci number
        System.out.println(fib(n));
    }
}