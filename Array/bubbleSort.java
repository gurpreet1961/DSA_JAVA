
/**
 * {2,1,4,2,4}..................................................................
 * 1. Check the adjusent element if the next elemnt is smaller then swap 1 is
 * smaller then 2 (swap)........................................................
 * {1,2,4,2,4}..................................................................
 * 2 < 4 (No-swap)..............................................................
 * 4 > 2 (swap).................................................................
 * {1,2,2,4,4}..................................................................
 * 4 = 4(NoSwap)..............................................................
 
 
 */

import java.util.Scanner;

class bubble {

    void bubbleSort(int[] a) {
        boolean check = true;
        int temp;
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    check = false;

                }
            }
            if (check)
                break;

        }
        System.out.println("After Sorting \n");
        for (int ele : a) {
            System.out.println(ele + " ");
        }
    }

}

class bubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.printf("Enter" + n + " number of elements:\n");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        bubble ob = new bubble();
        ob.bubbleSort(a);

    }
}