import java.util.Scanner;

public class bitwiseAdd {
    public static void main(String[] args) {
        int a, b, carry = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println(a);
    }
}
