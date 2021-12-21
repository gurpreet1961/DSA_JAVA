import java.util.Scanner;

public class primeNumber {

    public static boolean checkBool(int n) {
        // for (int i = 2; i <= n - 1; i++) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(checkBool(n));
    }
}
