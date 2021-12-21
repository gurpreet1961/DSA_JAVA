import java.util.*;
import java.lang.*;
import java.io.*;

public class Matrix_Multi {
    static int MatrixChainOrder(int p[], int n) {

        int[][] dp = new int[n][n];

        for (int i = 1; i < n; i++)
            dp[i][i] = 0;

        for (int j = 1; j < n - 1; j++)
            for (int i = 1; i < n - j; i++)
                dp[i][i + j] = Math.min(dp[i + 1][i + j] + p[i - 1] * p[i] * p[i + j],
                        dp[i][i + j - 1] + p[i - 1] * p[i + j - 1] * p[i + j]);

        return dp[1][n - 1];
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        int size = arr.length;

        System.out.print("Minimum number of multiplications = " + MatrixChainOrder(arr, size));

    }

}
