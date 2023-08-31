package Others.TUF.DP;

import java.util.*;

public class StairCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        stair(n,list,new ArrayList<>());
        System.out.println(list);
    }
    static void stair(int remaningStair,List<List<Integer>> list,List<Integer> li){
        if (remaningStair<0){
            return;
        }
        if (remaningStair==0){
            list.add(new ArrayList<>(li));
            return;
        }
        li.add(1);
        stair(remaningStair-1,list,li);
        li.remove(li.size()-1);
        li.add(2);
        stair(remaningStair-2, list, li);
        li.remove(li.size()-1);
    }
}