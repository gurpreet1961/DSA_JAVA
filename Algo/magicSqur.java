import java.util.*;

public class magicSqur {

    static void magicSquare(int n) {
        int[][] matrix = new int[n][n];

        int i = n / 2;
        int j = n - 1;

        for (int num = 1; num <= n * n;) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n)
                    j = 0;

                if (i < 0)
                    i = n - 1;
            }

            if (matrix[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else
                matrix[i][j] = num++;

            j++;
            i--;
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        System.out.println("Sum  = " + n * (n * n + 1) / 2);
    }

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        n = sc.nextInt();
        sc.close();

        if ((n & 1) == 0) {
            System.out.println("Plz Enter an odd number");
            return;
        }

        magicSquare(n);
    }
}
