public class deleteNodeInBst{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left = this.right =null;
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
    public static Node delete(Node root,int key){
        if(root.data > key){
            root.left = delete(root.left, key);
        }else if(root.data < key){
            root.right = delete(root.right, key);
        }else{
            //case 1 both left and right are null
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 where left node is null
            if(root.left == null){
                return root.right;
            }
            //case 2 where right node is null
            if(root.right == null){
                return root.left;
            }
            //case 3 where both nodes are not null
            Node IS = search(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node search(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args){
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(12);
        inordertravels(root);
        delete(root, 5);
        System.out.println();
        inordertravels(root);


    }
}