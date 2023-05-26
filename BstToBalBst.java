import java.util.*;

public class BstToBalBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }

    }
    public static void inordersequence(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inordersequence(root.left, arr);
        arr.add(root.data);
        inordersequence(root.right, arr);
    }
    public static Node creatBst(ArrayList<Integer> arr, int start,int end){
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        Node left = creatBst(arr, start, mid-1);
        Node right = creatBst(arr, mid+1, end);
        root.right = right;
        root.left = left;
        return root;

    }
    public static void postordersequence(Node root){
        if(root == null){
            return;
        }
        postordersequence(root.left);
        postordersequence(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(12);
        root.right.right.right =  new Node(14);

        ArrayList<Integer> arr = new ArrayList<>();
        inordersequence(root, arr);
        for(int i = 0;i < arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
        root = creatBst(arr, 0, arr.size()-1);
        System.out.println();
        postordersequence(root);
        
    }
}
