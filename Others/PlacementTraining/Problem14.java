package Others.PlacementTraining;

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int pizza = 100;
        int puff = 20;
        int drink=10;
        System.out.print("Enter the number of pizzas purchased: ");
        int p = sc.nextInt();
        System.out.print("\nThe number of puffs purchased: ");
        int pu = sc.nextInt();
        System.out.print("\nThe number of cold drink: ");
        int c= sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("Number of Pizzas: "+p);
        System.out.println("The Number of puffs: "+pu);
        System.out.println("The number of cold drink: "+c);
        System.out.println("Total Price="+(p*pizza+pu*puff+c*drink));
        System.out.println("Enjoy the Show!!!");
    }
}
