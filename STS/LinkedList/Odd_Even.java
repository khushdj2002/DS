package STS.LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}

public class Odd_Even {
    public static void printList(Node head){
        Node ptr = head;
        while (ptr!=null){
            System.out.println(ptr.data+" -> ");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
    public static Node rearrangeEvenOdd(Node head){
        Node odd = null,oddTail = null;
        Node even = null,evenTail = null;
        Node curr = head;
//        while (curr!=null){
//            if ()
//        }
        return odd;
    }
    public static void main(String[] args) {



    }
}
