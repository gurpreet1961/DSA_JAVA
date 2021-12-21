import java.util.List;

// import java.util.ArrayList;

import java.util.*;

public class arrList {
    public static void main(String[] args) {
        // // ArrayList fruits = new ArrayList();
        // ArrayList<String> fruits = new ArrayList<String>();
        // fruits.add("apple");
        // fruits.add("Orange");
        // ArrayList<Integer> marks = new ArrayList<>();
        // marks.add(2);
        // System.out.print(fruits);

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");

        System.out.println(fruits.size());
        System.out.println(fruits);

        Pair<String, Integer> p1 = new Pair<>("Gurpreet Singh", 20);
        p1.getDescription();

    }
}
