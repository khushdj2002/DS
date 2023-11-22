package Others;

import java.util.HashMap;

public class Simplr {
    public static void main(String[] args) {
        add(65,2);
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(1,2);
        System.out.println(hmap.put(1,3));


    }
    static int add(int a,int b){
        return a+b;
    }
}
