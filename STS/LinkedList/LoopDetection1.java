package STS.LinkedList;

public class LoopDetection1 {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void push(int d){
        Node new_node = new Node(d);
        new_node.next=head;
        head=new_node;
    }
    void detectLoop(){
        Node slow_p=head;
        Node fast_p=head;
        int flag=0;
        while(slow_p!=null&&fast_p!=null&&fast_p.next!=null){
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
            if(slow_p==fast_p){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Loop Found");
        else
            System.out.println("Loop Not Found");
    }

    public static void main(String[] args) {
        LoopDetection1 lp = new LoopDetection1();
        lp.push(5);
        lp.push(10);
        lp.push(15);
        lp.push(25);
        lp.push(35);
        lp.head.next.next.next=lp.head;
        lp.detectLoop();
    }
}
