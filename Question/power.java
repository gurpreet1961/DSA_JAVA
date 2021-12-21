import java.util.*;

public class power {
    static int pow(int x, int y) {
        int res = 1;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = res * x;
            }
            y = y >> 1;
            x = x * x;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = s.nextInt();
        System.out.println("Enter 2nd Number: ");
        int y = s.nextInt();

        System.out.println("Power is " + pow(x, y));
    }
}
