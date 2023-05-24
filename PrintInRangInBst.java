import java.io.PipedInputStream;

import javax.swing.RootPaneContainer;

public class PrintInRangInBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void inordertravesl(Node root){
        if(root == null){
            return;
        }
        inordertravesl(root.left);
        System.out.print(root.data + " ");
        inordertravesl(root.right);
    }
    public static void printinrange(Node root,int start,int end){
        if(root == null){
            return;
        }
        if(root.data >= start && root.data <= end){
            printinrange(root.left, start, end);
            System.out.print(root.data+" ");
            printinrange(root.right, start, end);
        }else if(root.data > start){
            printinrange(root.left, start, end);
            
        } else{
            printinrange(root.right, start, end);
            
        }
    }

    public static void main(String[] args){
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(12);

        //inordertravesl(root);
        System.out.println();
        printinrange(root, 5, 10);
        System.out.println();
        printinrange(root, 3, 8);
        System.out.println();
        printinrange(root, 3, 6);
        System.out.println();
        printinrange(root, 9, 12);

    }
}
