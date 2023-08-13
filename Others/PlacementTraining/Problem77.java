package Others.PlacementTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem77 {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        set(arr,list,new ArrayList<>());
        System.out.println(list);

    }
    static void set(int[] arr,List<List<Integer>> list,List<Integer> li){
        if (li.size()== arr.length){
            list.add(new ArrayList<>(li));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(li.contains(arr[i])){
                continue;
            }
            li.add(arr[i]);
            set(arr,list,li);
            li.remove(li.size()-1);
        }


    }
}
