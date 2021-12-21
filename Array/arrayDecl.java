import java.util.*;

public class arrayDecl {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array = ");
        // int size = sc.nextInt();
        sc.close();
        // java decl Method 1
        // dataType[] arrayName

        // int[] arr;
        // arrayName = new dataType[size of array]
        // arr = new int[size];

        // Method 2
        // dataType[] arrayName = new dataType[size of array]

        // int arr1[] = new int[size];

        // for (int i = 1; i<=size; i++) {
        // System.out.println("Element " + i + " : ");
        // arr[i-1] = sc.nextInt();
        // }
        // for (int i = 1; i<=size; i++) {
        // System.out.println("Element " + i + " : "+arr[i-1]);
        // }
        // for (int i = 1; i<=size; i++) {
        // System.out.println("Element " + i + " : ");
        // arr1[i-1] = sc.nextInt();
        // }
        // for (int i = 1; i<=size; i++) {
        // System.out.println("Element " + i + " : "+arr1[i-1]);
        // }

        /* Method 3rd */

        int[] arr2 = { 2, 4, 1, 4, 7 };
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
