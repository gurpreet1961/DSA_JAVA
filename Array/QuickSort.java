class QuickSort {
    public int partition(int[] a, int i, int j) {
        int pivot = a[i];
        while (i <= j) {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i <= j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    public void recursiveQuickSort(int[] a, int i, int j) {
        int idx = partition(a, i, j);
        if (i < idx - 1) {
            recursiveQuickSort(a, i, idx - 1);
        }
        if (j > idx) {
            recursiveQuickSort(a, idx, j);
        }
    }

    

    public static void main(String[] args) {
        int arr[] = new int[] { 5, 8, 1, 3, 7, 9, 2 };
        QuickSort ob = new QuickSort();
        ob.recursiveQuickSort(arr, 0, arr.length - 1);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
        System.out.println(arr[i] + " ");
        }
    }
}


// // class Quick_Sort {
// //     void swap(int[] a, int i, int j) {
// //         int temp = a[i];
// //         a[i] = a[j];
// //         a[j] = temp;
// //     }

// //     int partition(int[] a, int l, int h) {
// //         int pivot = a[l];
// //         int i = l;
// //         int j = h;
// //         while (i < j) {
// //             while (a[i] < pivot && i < a.length){
// //                 i++;
// //             }
// //             while (a[j] > pivot){
// //                 j--;
// //             }
// //             if (i < j) {
// //                 swap(a, i, j);
// //             }

// //         }
// //         swap(a, j, l);

// //         return j;
// //     }

// //     void Quick(int[] a, int l, int h) {
// //         if (l < h) {
// //             int pivot = partition(a, l, h);
// //             Quick(a, l, pivot - 1);
// //             Quick(a, pivot + 1, h);
// //         }
// //     }
// // }

// public class QuickSort {

//     static void swap(int[] a, int i, int j) {
//         int temp = a[i];
//         a[i] = a[j];
//         a[j] = temp;
//     }

//     static int partition(int[] a, int l, int h) {
//         int pivot = a[l];
//         int i = l;
//         int j = h;
//         while (i < j) {
//             while (a[i] < pivot && i < a.length) {
//                 i++;
//             }
//             while (a[j] > pivot) {
//                 j--;
//             }
//             if (i < j) {
//                 swap(a, i, j);
//             }

//         }
//         swap(a, j, l);

//         return j;
//     }

//     static void Quick(int[] a, int l, int h) {
//         if (l < h) {
//             int pivot = partition(a, l, h);
//             Quick(a, l, pivot - 1);
//             Quick(a, pivot + 1, h);
//         }
//     }

//     public static void main(String[] args) {

//         int[] a = { 1, 2, 1, 4, 1, 5, 2, 7, 4, 6 };
//         Quick(a, 0, a.length - 1);

//         for(int ele: a) {
//         System.out.println(ele);
//         }

//     }
// }

