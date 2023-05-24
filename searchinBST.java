public class searchinBST {
    static class Node{
        int data;
        Node left , right;
        Node(int data){
            this.data =data;
            this.left = this.right = null;
        }
    }
    //this finction takes the root and data and set according if data is less then root set in left part else set in right part.
    public static Node buildtree(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left = buildtree(root.left, data);
        }else{
            root.right = buildtree( root.right, data);
        }
        return root;

    }
    //this find is inorder travel function which first pring left and print root then right of the tree. in binary search tree inordr travels is always in ascending order.
    public static void inordertravel(Node root){
        if(root == null){
            return;
        }

        inordertravel(root.left);
        System.out.print(root.data+" ");
        inordertravel(root.right);
    }
    public static boolean searchnode(Node root,int key){//this function takes root and key value and check the if it lies i tree or not if lies return true else false.
        if(root == null){//if root is empty then their is not a key so return false.
            return false;
        }
        if(root.data == key){//if key is equal to root data the key exist so return true
            return true;
        }
        if(key < root.data){//if key not found in root then we search in its left and right node of data if data id less search in left is not search in right if found return true else return false and recurcively.
            return searchnode(root.left, key);
        }else{
            return searchnode(root.right, key);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {8,5,6,9,10,2,4,11,12,7,3};
        Node root = null;
        for(int i = 0;i<nodes.length;i++){//send turn by turn data to buildtree function and it add the data in it position and retrun root.
            root = buildtree(root, nodes[i]);
        }
        inordertravel(root);
        if(searchnode(root, 2)){//check the codition and return if the key exist or not
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
