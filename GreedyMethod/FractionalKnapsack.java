import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

public class FractionalKnapsack {

    public static void main(String[] args) throws IOException {
        int n = 7;
        Item[] arr = new Item[n];
        // arr[0] = new Item(60, 10);
        // arr[1] = new Item(100, 20);
        // arr[2] = new Item(120, 30);
        arr[0] = new Item(10, 2);
        arr[1] = new Item(5, 3);
        arr[2] = new Item(15, 5);
        arr[3] = new Item(7, 7);
        arr[4] = new Item(6, 1);
        arr[5] = new Item(18, 4);
        arr[6] = new Item(3, 1);
        int w = 15;
        System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
    }
}

class itemComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        double r1 = (double) (a.value) / (double) (a.weight);
        double r2 = (double) (b.value) / (double) (b.weight);
        if (r1 < r2)
            return 1;
        else if (r1 > r2)
            return -1;
        else
            return 0;
    }
}

class Solution {
    double fractionalKnapsack(int W, Item arr[], int n) {
        double ans = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr, new itemComparator());
            if (arr[i].weight + c <= W) {
                ans += arr[i].value;
                c += arr[i].weight;
            } else {
                int remain = W - c;
                ans += ((double) arr[i].value / (double) arr[i].weight) * (double) remain;
                break;

            }
        }
        return ans;
    }
}
