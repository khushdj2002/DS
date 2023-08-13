package Others.PlacementTraining;

import java.util.ArrayList;
import java.util.List;

public class Problem78 {
    public static void main(String[] args) {
        String[] arr= {"word","good","best","good"};
        List<List<String>> list = new ArrayList<>();
        set(arr,list,new ArrayList<>());
        System.out.println(list);

    }
    static void set(String[] arr,List<List<String>> list,List<String> li){
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
