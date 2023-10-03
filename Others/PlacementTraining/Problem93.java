package Others.PlacementTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Problem93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> layers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            layers.add(sc.nextInt());
        }
        int m = sc.nextInt();
        List<Integer> energy = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            energy.add(sc.nextInt());
        }
        int k = sc.nextInt();
        System.out.println(getNumPoints(layers,energy,k));
    }
    static List<Integer> getNumPoints(List<Integer> layers, List<Integer> energy ,int k){
        List<Integer> li = new ArrayList<>();
        int count=0;
        for (int i = 0; i < layers.size(); i++) {
            li.add(count);
                int k1 = k;
                count=0;
            for (int j = i; j < layers.size(); j++) {
                if (k1>=layers.get(j)&&k1>= energy.get(j)){
                    k1=k1- layers.get(j);
                    count++;
                }
//                if(k1>=layers.get(j)){
//                    k1 = k1- layers.get(j);
//                    if (k1>= energy.get(j)){
//                        count++;
//                    }
//                    else {
//                        break;
//                    }
//                }
                else {
                    break;
                }
            }
        }
        li.remove(0);
        li.add(count);
        return li;  //5,1,5   //9,3,5
    }
}
