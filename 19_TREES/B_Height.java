import java.util.*;

public class B_Height {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    // HEIGHT

    public static int Height(Node root) {

        if (root == null) {
            return 0;
        }

        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh, rh) + 1;

    }

    // COUNT

    public static int Count(Node root) {

        if (root == null) {
            return 0;
        }

        int lh = Count(root.left);
        int rh = Count(root.right);
        return lh + rh + 1;

    }

    // sum

    public static int Sum(Node root) {

        if (root == null) {
            return 0;
        }

        int lh = Sum(root.left);
        int rh = Sum(root.right);
        return lh + rh + root.data;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // System.out.println(Height(root));
        // System.out.println(Count(root));
        System.out.println(Sum(root));

    }

}
