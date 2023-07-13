package Others.PlacementTraining;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Tickets: ");
        int tickets = sc.nextInt();
        if(tickets>=5&&tickets<=40){
            System.out.println("Do you want to purchase any refreshments: ");
            String ref = sc.next();
            System.out.println("Do you have any coupons");
            String cou = sc.next();
            System.out.println("Enter the circle");
        }
        else{
            System.out.println("Minimum 5 and a maximum of 40 tickets should be purchased");
        }
    }
}
