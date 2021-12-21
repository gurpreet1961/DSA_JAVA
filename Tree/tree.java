import javafx.util.*;

import java.util.*;

// import jdk.internal.net.http.common.Pair;

public class tree {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        // System.out.println("InOrder: ");
        // inorder(root);
        // System.out.println("\nPreOrder: ");
        // preorder(root);
        // System.out.println("\nPostOrder: ");
        // postorder(root);
        // System.out.println();
        // System.out.println("Level Order");
        // LevelOrder(root);
        // System.out.println();
        // System.out.println("Level Order Case 2");
        // LevelOrder1(root);
        // System.out.println();
        // System.out.println("Level Order Case 3");
        // LevelOrder2(root);
        // System.out.println();
        // System.out.println("Level Order Case 4");
        // LevelOrder3(root);
        // System.out.println();
        // System.out.println("Zig Zag");
        // zigzag(root);
        // System.out.println();
        System.out.println("Vertical Traversal");
        vertical(root);
        System.out.println();
    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter data ");
        int data = sc.nextInt();

        if (data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter left node of " + data);
        root.left = createTree();

        System.out.println("Enter right node of " + data);
        root.right = createTree();

        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void LevelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    static void LevelOrder1(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                q.add(temp.right);
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
        }

    }

    static void LevelOrder2(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            s.push(temp.data);
            if (temp.right != null) {
                q.add(temp.right);
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    static void LevelOrder3(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            s.push(temp.data);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    static void zigzag(Node root) {
        if (root == null)
            return;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);
        while (!s1.isEmpty() || s2.isEmpty()) {
            while (!s1.empty()) {
                Node t1 = s1.pop();
                System.out.println(t1.data);
                if (t1.right != null) {
                    s2.push(t1.right);
                }
                if (t1.left != null) {
                    s2.push(t1.left);
                }
            }
            while (!s2.isEmpty()) {
                Node t1 = s2.pop();
                System.out.println(t1.data);
                if (t1.left != null) {
                    s1.push(t1.left);
                }
                if (t1.right != null) {
                    s1.push(t1.right);
                }
            }
        }

    }

    static void vertical(Node root) {
        if (root == null)
            return;

        Queue<Pair<Node, Integer>> qu = new LinkedList<>();
        qu.add(new Pair<>("hi", 0));
        System.out.println(qu);
    }

}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}