class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Traverse {
    Node root;

    Traverse(){
        root=null;
    }
    void postorder(Node node){
        if(node==null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+"->");
    }
    void inorder(Node node){
        if (node==null)
            return;
        inorder(node.left);
        System.out.print(node.data+"->");
        inorder(node.right);
    }
    void preorder(Node node){
        if (node==null)
            return;
        System.out.print(node.data+"->");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        Traverse tree = new Traverse();
        tree.root = new Node(1);
        tree.root.left=new Node(12);
        tree.root.right=new Node(9);
        tree.root.left.left=new Node(5);
        tree.root.left.right=new Node(6);
        System.out.println("Inorder transversal");
        tree.inorder(tree.root);
        System.out.println("\nPreorder transversal");
        tree.preorder(tree.root);
        System.out.println("\nPostorder transversal");
        tree.postorder(tree.root);
    }
}
