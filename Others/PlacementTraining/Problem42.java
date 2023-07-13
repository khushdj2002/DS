package Others.PlacementTraining;

import java.util.Scanner;

public class Problem42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.print();
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right = null;
    }
}
class BinaryTree{
    Node root;
    BinaryTree(){
        root = null;
    }
    void insert(int data){
        root = insertTree(root,data);
    }
    Node insertTree(Node curr,int data){
        if (curr==null){
            return new Node(data);
        }
        if (curr.data<data){
            curr.right = insertTree(curr.right,data);
        }
        else {
            curr.left = insertTree(curr.left,data);
        }
        return curr;
    }
    void print(){
        System.out.println("The below priont is inorder");
        printInorder(root);
        System.out.println("The below Print is pre order");
        printPreorder(root);
        System.out.println("The below print is post order");
        printPostorder(root);
    }
    void printInorder(Node curr){
        if (curr!=null){
            printInorder(curr.left);
            System.out.print(curr.data+" ");
            printInorder(curr.right);
        }
    }
    void printPreorder(Node curr){
        if (curr!=null){
            System.out.print(curr.data+" ");
            printInorder(curr.left);
            printInorder(curr.right);
        }
    }
    void printPostorder(Node curr){
        if (curr!=null){
            printInorder(curr.left);
            printInorder(curr.right);
            System.out.print(curr.data+" ");
        }
    }
}