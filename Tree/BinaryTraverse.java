public class BinaryTraverse {
    Node root;
    BinaryTraverse(int data){
        root = new Node(data);
    }
    BinaryTraverse(){
        root=null;
    }
    void traversePostOrder(Node node){
        if (node!=null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }
    void traverseInorder(Node node){
        if (node!=null){
            traverseInorder(node.left);
            System.out.print(" "+node.data);
            traverseInorder(node.right);
        }
    }
    void traversePreOrder(Node node){
        if (node!=null){
            System.out.print(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTraverse Btree = new BinaryTraverse();
        Btree.root=new Node(1);
        Btree.root.left = new Node(2);
        Btree.root.right = new Node(3);
        Btree.root.left.left = new Node(4);

        System.out.println("Pre Order Transversal");
        Btree.traversePreOrder(Btree.root);
        System.out.println("\nIn Order Transversal");
        Btree.traverseInorder(Btree.root);
        System.out.println("\nPost Order Transversal");
        Btree.traversePostOrder(Btree.root);
    }
}
