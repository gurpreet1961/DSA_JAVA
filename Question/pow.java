/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pow {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        try {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            while (t > 0) {
                int m = s.nextInt();
                int n = s.nextInt();
                int k = s.nextInt();
                if (n * k < m) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                t--;

            }
        } catch (Exception e) {
        }

    }
}
