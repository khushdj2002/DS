package Others.PlacementTraining;

import java.util.Map;
import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();
        int x3= sc.nextInt();
        int y3= sc.nextInt();
        double result = Math.sqrt(Math.pow(Math.abs((x2-x1)),2)+Math.pow(Math.abs((y2-y1)),2))+Math.sqrt(Math.pow(Math.abs((x3-x2)),2)+Math.pow(Math.abs((y3-y2)),2))+Math.sqrt(Math.pow(Math.abs((x3-x1)),2)+Math.pow((Math.abs(y3-y1)),2));
        System.out.printf("%.2f",result);
    }
}
