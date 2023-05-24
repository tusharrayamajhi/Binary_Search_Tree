import java.util.*;

public class PrintPathInBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
        public static void pritnpath(Node root,ArrayList<Integer> path){
            if(root == null){
                return;
            }
        path.add(root.data);
        if(root.left == null && root.right == null){
            for(int i = 0;i < path.size();i++){
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        }
        pritnpath(root.left,path);
        pritnpath(root.right,path);
        path.remove(path.size()-1);
    
    }
    

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(12);
        root.right.right.right = new Node(14);
        ArrayList<Integer> path = new ArrayList<>();
        pritnpath(root,path);
        
    }
}
