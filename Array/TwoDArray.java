public class TwoDArray {
    public static void main(String[] args) {
        // int [][] array = new int[3][2];
        int[][] a = { { 2, 3, 4 }, { 3, 5, 22 }, { 1, 2, 3 } };
        int[][] b = { { 2, 3, 4 }, { 3, 5, 22 }, { 1, 2, 3 } };
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multipication");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println(a[0][3]);
        // System.out.println(a[1][3]);
        // System.out.println(a[2][3]);
        // System.out.println(a[1][1]);

        /* Additon of 2D-Arrays */
        System.out.println("Addition");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }

        /* Multiplication in 2D-Arrays */

    }
}
