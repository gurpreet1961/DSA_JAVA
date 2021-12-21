public class SubsetSum {
    static int subsetSum(int a[], int n, int sum) {
        int tab[][] = new int[n + 1][sum + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                tab[i][j] = -1;
            }
        }
        if (sum == 0)
            return 1;

        if (n <= 0)
            return 0;

        if (tab[n - 1][sum] != -1)
            return tab[n - 1][sum];

        if (a[n - 1] > sum)
            return tab[n - 1][sum] = subsetSum(a, n - 1, sum);
        else {

            if (subsetSum(a, n - 1, sum) != 0 || subsetSum(a, n - 1, sum - a[n - 1]) != 0) {
                return tab[n - 1][sum] = 1;
            } else
                return tab[n - 1][sum] = 0;
        }
    }

    public static void main(String[] args) {

        int n = 5;
        int a[] = { 1, 5, 3, 7, 4 };
        int sum = 12;

        if (subsetSum(a, n, sum) != 0) {
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
