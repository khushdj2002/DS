package Others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChoclateDistribution2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numberOfChildren = sc.nextInt();
        int numberOfChoclate= sc.nextInt();
        int maxChoclate = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        distribution(numberOfChildren,numberOfChoclate,maxChoclate,new ArrayList<>(),list);
        System.out.println(list);
    }
    static void distribution(int remainingChildren,int remainingChoclate, int maxChoclate,List<Integer> li,List<List<Integer>> list){
        if (remainingChildren==0){
            if (remainingChoclate==0){
                list.add(new ArrayList<>(li));
            }
            return;
        }
        for (int i = 0; i <=maxChoclate ; i++) {
            if (i<=remainingChoclate){
                li.add(i);
                distribution(remainingChildren-1,remainingChoclate-i,maxChoclate,li,list);
                li.remove(li.size()-1);
            }
        }
    }
}
