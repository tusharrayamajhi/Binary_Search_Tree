public class buildBST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node BUildBST(Node root,int n){
       if(root == null){
        return new Node(n);
       }
       if(root.data < n){
        root.right = BUildBST(root.right, n);
       }else{
        root.left = BUildBST(root.left, n);
       }
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
    public static void main(String[] args) {
        int nodes[] = {5,1,3,4,2,6};
        Node root = null;
        for(int i =0;i<nodes.length;i++){
            root = BUildBST(root,nodes[i]);
        }
        //inordertravels(root);
        System.out.println(root.right.data);
    }
}