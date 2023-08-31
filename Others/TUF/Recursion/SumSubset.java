package Others.TUF.Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SumSubset {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int total = sc.nextInt();
        int[] band = new int[n];
        int[] req = new int[n];
        for (int i = 0; i < band.length; i++) {
            band[i]=sc.nextInt();
        }
        for (int i = 0; i < band.length; i++) {
            req[i]=sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        sets(list,0,0,total);
    }
   static void sets(List<Integer> list,int index,int sum,int total){

    }

}
