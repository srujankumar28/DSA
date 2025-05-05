import java.util.*;

public class C_Diameter1 {  // O(n2)

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

    public static int diameter2(Node root){
        if(root==null){
            return 0;
        }

        int leftDia= diameter2(root.left);
        int rightDia=diameter2(root.right);
        int leftHeight=Height(root.left);
        int rightHeight=Height(root.right);

        int SelfDia= leftHeight+ rightHeight+1;
        return Math.max( SelfDia,Math.max(rightDia,leftDia));
    }
 
// DIAMETER APPROACH 2 - O(N)
    static class Info{

        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam= diam;
            this.ht=ht;
        }

    }

    public static Info diameter(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo= diameter(root.left);
        Info righInfo= diameter(root.right);
        int diam= Math.max(Math.max(leftInfo.diam,righInfo.diam),leftInfo.ht+righInfo.ht+1);
        int ht=Math.max(leftInfo.ht,righInfo.ht)+1;
        return new Info(diam, ht);
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
        // System.out.println(Sum(root));

        // System.out.println(diameter(root));
        System.out.println(diameter(root).diam);

    }

}
