package Others.PlacementTraining;

import java.util.Scanner;

public class Problem52 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        BinaryTree1 tr = new BinaryTree1();
        tr.insert(50);
        tr.insert(60);
        tr.insert(30);
        tr.insert(10);
        tr.insert(70);
        tr.insert(90);
        tr.insert(40);
        tr.print();
    }
}
class Node1{
    int data;
    Node1 left;
    Node1 right;
    Node1(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree1{
    Node1 root;
    BinaryTree1(){
        root=null;
    }
    public void insert(int data){
        root  = insertTree(data,root);
    }
    public Node1 insertTree(int data,Node1 curr){
        if (curr==null){
            return new Node1(data);
        }
        if (curr.data>data){
            curr.left = insertTree(data,curr.left);
        }
        else {
            curr.right  = insertTree(data,curr.right);
        }
        return curr;
    }
    void print(){
        printInorder(root);
    }
    void printInorder(Node1 curr){
        if (curr!=null){
            System.out.print(curr.data+" ");
            printInorder(curr.left);

            printInorder(curr.right);
        }
    }
}