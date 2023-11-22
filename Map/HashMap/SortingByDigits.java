package Map.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByDigits {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Comparator<Integer> com = SortingByDigits::compare;

//        Comparator is the interface...
        list.add(43);
        list.add(31);
        list.add(72);
        list.add(29);
        Collections.sort(list,com);
//        Collections.sort(list);
        System.out.println(list);
    }

    private static int compare(Integer i, Integer j) {
        if (i % 10 > j % 10) {
            return 1;
        } else {
            return -1;
        }
    }
}
