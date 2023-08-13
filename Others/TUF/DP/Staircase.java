package Others.TUF.DP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>>  list = new ArrayList<>();
        stair(list,new ArrayList<>(),0,n);
        System.out.println(list);
    }
    static void stair(List<List<Integer>> list, List<Integer> li,int sum,int n){
        if(sum>n){
            return;
        }
        if (sum==n){
            list.add(new ArrayList<>(li));
            return;
        }
        li.add(1);
        stair(list,li,sum+1,n);
        li.remove(li.size()-1);
        li.add(2);
        stair(list,li,sum+2,n);
        li.remove(li.size()-1);
    }

}
