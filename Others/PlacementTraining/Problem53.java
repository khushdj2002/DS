package Others.PlacementTraining;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();
        list.add(sc.next());
        int j=0;
        for (int i = 1; i < n; i++) {
            String s = sc.next();
            if (!list.get(j).equals(s)){
                list.add(s);
                j++;
            }
        }
        int red=0;
        int white=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("red")){
                red++;
            }
            else {
                white++;
            }
        }
        System.out.println(Math.min(red,white)+1);
    }
}
