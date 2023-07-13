package Others.PlacementTraining;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> even = new LinkedList<>();
        LinkedList<Integer> odd = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                even.add(sc.nextInt());
            }
            else {
                odd.add(sc.nextInt());
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.print("Sorted even array: ");
        for (int i = 0; i < even.size(); i++) {
            System.out.print(even.get(i)+" ");
        }
        System.out.print("\nSorted odd array: ");
        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i)+" ");
        }
        System.out.println("\nSecond Largest Element in Even List is: "+even.get(1));
        System.out.println("Second Largest Element in Odd List is: "+odd.get(1));
        System.out.println("Sum of Second Largesrt Element of Odd and Even List: "+(even.get(1)+odd.get(1)));
    }
}
