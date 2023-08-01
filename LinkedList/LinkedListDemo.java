package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList1 ls = new LinkedList1();
        ls.insertAtHead(1);
        ls.insertAtHead(2);
        ls.insertAtHead(3);
        ls.insertAtHead(4);
        ls.insertAtHead(5);
        ls.insertAtHead(6);
        ls.insertAtLast(10);
        ls.insertAtLast(11);
        ls.insertAtLast(12);
        ls.insertLoc(23,5);
        ls.insertLoc(25,3);
        ls.deleteHead();
        ls.deleteTail();
        ls.deleteLoc(3);
        System.out.println(ls.length());
        ls.printList();
    }
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList1{
    Node head;
    LinkedList1(){
        head=null;
    }
    void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void insertAtLast(int data){
        Node newNode = new Node(data);
        Node curr = head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next = newNode;
    }
    void insertLoc(int data,int loc){
        Node newNode = new Node(data);
        int h=0;
        Node curr = head;
        while (h!=loc){
            h++;
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    void deleteHead(){
        head=head.next;
    }
    void deleteTail(){
        Node curr=head;
        while (curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }
    void deleteLoc(int loc){
        int h=0;
        Node curr = head;
        while (h!=loc){
            h++;
            curr=curr.next;
        }
        curr.next=curr.next.next;
    }
    void printList(){
        Node curr = head;
        while(curr!=null){
            if (curr.next!=null) {
                System.out.print(curr.data + " -> ");
            }
            else{
                System.out.println(curr.data);
                break;
            }
            curr=curr.next;
        }
    }
    int length(){
        int height=0;
        Node curr =head;
        while (curr!=null){
            height++;
            curr=curr.next;
        }
        return height;
    }
}
