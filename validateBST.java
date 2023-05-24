public class validateBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static boolean isvalid(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }
        return isvalid(root.left, min, root) && isvalid(root.right, root, max);
        
  
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right = new Node(8);
        root.right.right = new Node(10);
        System.out.println(isvalid(root, null, null));

    }
}
