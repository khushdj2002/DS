package Others.PlacementTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem82 {
    public static void main(String[] args) {
        String s = "a good   example";
        String [] words = s.trim().split(" +");
        System.out.println(Arrays.toString(words));
        Collections.reverse(Arrays.asList(words));
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(" ",words));
    }
}
