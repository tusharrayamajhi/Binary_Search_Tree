import java.util.*;

public class sortedarraytobst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.left = null;
        }
    }

    public static Node AToBst(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = AToBst(arr, start, mid - 1);
        root.right = AToBst(arr, mid + 1, end);
        return root;

    }
    public static void inordertravels(Node root){
        if(root == null){
            return;
        }
        inordertravels(root.left);
        System.out.print(root.data + " ");
        inordertravels(root.right);
    }
    public static void preordertravels(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preordertravels(root.left);
        preordertravels(root.right);
    }

    public static void main(String[] args) {
        int node[] = { 3,5,6,8,10,11,12 };
        Node root = AToBst(node, 0, node.length-1);
        preordertravels(root);

    }
}
