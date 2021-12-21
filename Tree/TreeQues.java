import java.util.*;

public class TreeQues {

    static Scanner sc = null;
    static boolean check = false;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        int rootData = root.data;
        System.out.println("Enter The Node You Want To Check");
        int findNode = sc.nextInt();
        inorder(root, findNode, rootData);
        printKNode(root, 2);
        System.out.println();
        System.out.println(printHeight(root));
    }

    static void inorder(Node root, int data, int rootData) {
        if (root == null)
            return;
        inorder(root.left, data, rootData);
        if (rootData == root.data) {
            check = true;
        }
        if (data == root.data) {
            if (check) {
                System.out.println("right");
            } else {
                System.out.println("left");
            }
            return;
        }
        inorder(root.right, data, rootData);
    }

    static void printKNode(Node root, int k) {
        if (root == null || k < 0)
            return;
        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }
        printKNode(root.left, k - 1);
        printKNode(root.right, k - 1);

    }

    static int printHeight(Node root) {
        if (root == null)
            return 0;
        int l = printHeight(root.left);
        int r = printHeight(root.right);

        return (Math.max(l, r) + 1);
    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter data ");
        int data = sc.nextInt();

        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter left data of " + data);
        root.left = createTree();
        System.out.println("Enter right data of " + data);
        root.right = createTree();
        return root;
    }

    }

    static Node insert(Node root, int data) {
        root = new Node(data);
        if (root.left == null) {

        }
    }

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}
