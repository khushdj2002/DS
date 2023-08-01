package Others.PlacementTraining;

import java.util.*;

public class Problem54 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(),a=1,b=0,j=0;
        LinkedList<String> list = new LinkedList<>();
        list.add(sc.next());
        for (int i = 1; i <n ; i++) {
            String s = sc.next();
            if (!list.get(j).equals(s)){
                list.add(s);
                if (j%2==0)
                    b++;
                else
                    a++;
                j++;
            }
        }
        System.out.println(Math.min(a,b)+1);
    }
}
