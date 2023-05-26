public class SizeOfLargestBstinBst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inordertravels(Node root){
        if(root == null){
            return;
        }
        inordertravels(root.left);
        System.out.print(root.data + " ");
        inordertravels(root.right);
    }
    static class Info{
        boolean isbst;
        int size;
        int min;
        int max;
        Info(boolean isbst,int size,int min,int max){
            this.isbst = isbst;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }
    public static Info largestbst(Node root){
        Info left = largestbst(root.left);
        Info right = largestbst(root.right);
        
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        
        inordertravels(root);

    }
}
