package Others.PlacementTraining;

import java.util.LinkedList;

public class Problem58 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <=10 ; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.remove(1);
        
        System.out.println(list);
    }
}
