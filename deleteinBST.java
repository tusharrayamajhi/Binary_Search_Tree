public class deleteinBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node BULDBST(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = BULDBST(root.left, data);
        } else {
            root.right = BULDBST(root.right, data);
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
    public static Node delete(Node root,int val){
        //find the nodes first
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }else{
            //case 1 when both side are null
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 when left side is null
            if(root.left == null){
                return root.right;
            }
            //case 2 when right side is null
            if(root.right == null){
                return root.left;
            }
            //case 3 when both side is not null
            Node IS = findinordersuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }
    private static Node findinordersuccessor(Node root) {

        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        // int nodes[] = { 5,3,6,2,4,,7 };
        // Node root = null;
        // for(int i = 0; i < nodes.length;i++){
        //     root = BULDBST(root, nodes[i]);
        // }

        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(6);
        root.right.right = new Node(7);
        inordertravels(root);
        delete(root, 3);
        System.out.println();
        inordertravels(root);


    }
}
