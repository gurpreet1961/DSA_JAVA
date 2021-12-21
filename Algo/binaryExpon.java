import java.util.Scanner;

public class binaryExpon {

    static int MOD = 1000000007;

    public static long power(long a, long n) {
        long answer = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                answer = (answer * a) % MOD;
            }
            a = (a * a) % MOD;
            n = n >> 1;
        }
        return answer;
    }

    public static long RecPower(long a, long n) {
        if (n == 0)
            return 1;
        long p = (RecPower(a, n / 2) % MOD);
        if ((n & 1) != 0) {
            return (((p * p) % MOD) * a) % MOD;
        } else {
            return (p * p) % MOD;
        }
    }

    public static void main(String[] args) {
        long a, n;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        n = sc.nextLong();
        sc.close();
        a %= MOD;

        // System.out.print(power(a, n));
        System.out.print(RecPower(a, n));
    }
}
