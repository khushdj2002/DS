package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ticket2 {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(maxTickets(list));

    }
    static int maxTickets(List<Integer> tickets){
        Collections.sort(tickets);
        int count = 1;
        int max = 1;
        for (int i = 1; i < tickets.size(); i++) {
            if (tickets.get(i)-tickets.get(i-1)<2){
                count++;
            }
            else {
                count=1;
            }
            if (max<count){
                max=count;
            }
        }
        return max;
    }
}
