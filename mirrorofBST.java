import javax.sound.midi.MidiChannel;

public class mirrorofBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right =null;
        }
    }
    public static void inordertarvels(Node root){
        if(root == null){
            return;
        }
        inordertarvels(root.left);
        System.out.print(root.data + " ");
        inordertarvels(root.right);
    }
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
       Node left = mirror(root.left);
       Node right = mirror(root.right);
       root.right = left;
       root.left = right;
       return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(12);
        inordertarvels(root);
        root = mirror(root);
        System.out.println();
        inordertarvels(root);

    }
}
