public class build {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node BUILD(Node root, int n){
        if(root == null){
            return new Node(n);
        }
        if(n<root.data){
            root.left = BUILD(root.left, n);
        }else{
            root.right = BUILD(root.right, n);
        }
        return root;
        

    }
    public static void main(String[] args) {
        int nodes[] = {5,1,3,4,2,6};
        Node root = null;
        for(int i = 0; i<nodes.length;i++){
            root = BUILD(root, nodes[i]);
        }
        System.out.println(root.right.data);
    }
}
