package STS.LinkedList;
import  java.util.*;

public class LoopDetection{
    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    static void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    static boolean detectLoop(Node h){
        HashSet<Node> s = new HashSet<>();
        while (h!=null){
            if (s.contains(h)){
                return true;
            }
            s.add(h);
            h=h.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LoopDetection lp = new LoopDetection();
        lp.push(20);
        lp.push(4);
        lp.push(15);
        lp.push(10);

        lp.head.next.next.next=lp.head;

        if (detectLoop(head)){
            System.out.println("Loop Exists");
        }
        else {
            System.out.println("Loop doesn't detection");
        }

    }
}