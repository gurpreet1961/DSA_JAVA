import java.io.*;
import java.lang.*;
import java.util.*;

class Array_imp {
    static int root = 0;
    static String[] str = new String[10];

    public void Root(String key) {
        str[0] = key;
    }

    public void set_Left(String key, int root) {
        int t = (root * 2) + 1;

        if (str[root] != null) {
            str[t] = key;
        }
    }

    public void set_Right(String key, int root) {
        int t = (root * 2) + 2;

        if (str[root] != null) {
            str[t] = key;
        }
    }

    public void print_Tree() {
        for (int i = 0; i < 7; i++) {
            if (str[i] != null)
                System.out.print(str[i]);
            else
                System.out.print("-");
        }
    }
}

public class Arraytree {
    public static void main(String[] args) {

        Array_imp obj = new Array_imp();

        obj.Root("A");
        obj.set_Right("B", 0);
        obj.set_Left("C", 1);
        obj.set_Right("D", 1);
        obj.set_Left("F", 2);
        obj.set_Left("G", 2);
        obj.set_Right("E", 3);
        obj.set_Left("H", 3);
        obj.set_Left("J", 3);

        obj.print_Tree();
    }
}