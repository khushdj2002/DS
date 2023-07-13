package Others.PlacementTraining;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        while (true){
            int a = sc.nextInt();
            if (a==-1){
                break;
            }
            list.add(a);
        }
        System.out.println(list);
    }
}
