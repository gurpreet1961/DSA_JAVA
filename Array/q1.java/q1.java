import java.util.Scanner;

class q1 {
    static int GCD_19bcs1971(int a, int b) {
        if (b == 0)
            return a;
        return GCD_19bcs1971(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + GCD_19bcs1971(a, b));
    }
}
